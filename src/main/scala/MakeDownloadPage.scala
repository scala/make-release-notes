import java.util.Date
import java.text._
import scala.concurrent._
import scala.concurrent.duration._
import ExecutionContext.Implicits.global

class MakeDownloadPage(version: String, releaseDate: Date = new Date()) {
  def write() = {
    require(!version.startsWith("v"), "version should *not* start with 'v'")
    val fileName = s"${format("yyyy-MM-dd")}-$version.md"
    IO.write(new java.io.File(fileName), page)
    println(s"cp $fileName ../scala-lang/download/_posts/")
    println("# to prepare your scala-lang PR")
  }

  // get size of `url` without actually downloading it
  def humanSize(url: String): Future[String] = Future {
    import scala.sys.process._
    println("## fetching size of "+ url)
    scala.util.Try {
      val responseHeader = Process(s"curl -m 5 --silent -D - -X HEAD $url").lineStream
      val contentLength = responseHeader.find(_.startsWith("Content-Length"))
      val bytes = contentLength.map(_.split(":",2)(1).trim.toInt)
      bytes map (b => (responseHeader.head, b))
    }.toOption.flatten.map { case (status, bytes) => (status, bytes match {
        case meh if meh < 1024                        => ""
        case kilo if kilo < 1024*1024                 => f"${bytes.toDouble/1024}%.0fK"
        case big                                      => f"${bytes.toDouble/(1024*1024)}%.2fM"
      })} match {
      case Some((status, humanSize)) if status.contains("200 OK") || status.contains("302 Found") =>
        humanSize
      case _ =>
        println(s"## warning: could not fetch $url")
        ""
    }
  }

  def resourceArchive(cls: String, name: String, ext: String, desc: String): Future[String] = {
    val fileName = s"$name-$version.$ext"
    val fullUrl = s"https://downloads.lightbend.com/scala/$version/$fileName"
    resource(cls, fileName, desc, fullUrl, fullUrl)
  }

  def resource(cls: String, fileName: String, desc: String, fullUrl: String, urlForSize: String): Future[String] = {
    humanSize(urlForSize) map (size => s"""[$cls, "$fileName", "$fullUrl", "$desc", "$size"]""")
  }

  def defaultClass = """"-non-main-sys""""
  def unixClass    = """"-main-unixsys""""
  def windowsClass = """"-main-windows""""

  def format(fmt: String) = new SimpleDateFormat(fmt).format(releaseDate)

  // maybe we wouldn't need both of these if I knew the right magic `curl` invocation,
  // but just adding `-L` doesn't do it, we get the redirect info but not the size
  // at the redirect location. this will be prone to breakage if GitHub moves
  // this stuff around again
  def ghSourceUrl     = s"https://github.com/scala/scala/archive/v$version.tar.gz"
  def ghSourceSizeUrl = s"https://codeload.github.com/scala/scala/tar.gz/v$version"

  def resources: String = Await.result(
    Future.sequence(Seq(
        resourceArchive(unixClass,       "scala",                "tgz",    "Mac OS X, Unix, Cygwin"   ),
        resourceArchive(windowsClass,    "scala",                "msi",    "Windows (msi installer)"  ),
        resourceArchive(defaultClass,    "scala",                "zip",    "Windows"                  ),
        resourceArchive(defaultClass,    "scala",                "deb",    "Debian"                   ),
        resourceArchive(defaultClass,    "scala",                "rpm",    "RPM package"              ),
        resourceArchive(defaultClass,    "scala-docs",           "txz",    "API docs"                 ),
        resourceArchive(defaultClass,    "scala-docs",           "zip",    "API docs"                 ),
        resource       (defaultClass,    s"scala-sources-$version.tar.gz", "Sources", ghSourceUrl, ghSourceSizeUrl)
      )).map(_.mkString(",\n  ")), 30.seconds)

  // note: first and last lines must be exactly "---"
  def page: String = {
s"""---
title: Scala $version
start: ${format("dd MMMM yyyy")}
layout: downloadpage
release_version: $version
release_date: "${format("MMMM dd, yyyy")}"
show_resources: "true"
permalink: /download/$version.html
requirements: "This Scala software distribution can be installed on any Unix-like or Windows system. It requires the Java runtime version 1.8 or later, which can be downloaded <a href='http://www.java.com/'>here</a>."
resources: [
  $resources
]
---
"""
  }
}
