import java.util.Date
import java.text._

class MakeDownloadPage(version: String, releaseDate: Date = new Date()) {
  def write() = {
    require(!version.startsWith("v"), "version should *not* start with 'v'")
    val fileName = s"${format("yyyy-MM-dd")}-$version.md"
    IO.write(new java.io.File(fileName), page)
    println("generated " + fileName)
  }

  def humanSize(url: String) = {
    import scala.sys.process._
    println(url)
    val tmpFile = java.io.File.createTempFile("download", ".tmp")
    val res = s"curl --fail --silent --output ${tmpFile.getAbsolutePath} $url".!
    val dfOutput = s"du -h ${tmpFile.getAbsolutePath}".!!
    val output = dfOutput.trim.split("\t").head
    if (output == "0B") {
      println(s"warning: could not fetch $url")
      ""
    } else output
  }

  def resourceArchive(cls: String, name: String, ext: String, desc: String) = {
    val fileName = s"$name-$version.$ext"
    val relUrl = s"/files/archive/$fileName"
    val fullUrl = s"http://www.scala-lang.org$relUrl"
    resource(cls, fileName, desc, relUrl, fullUrl)
  }

  def resource(cls: String, fileName: String, desc: String, relUrl: String, fullUrl: String) = {
    s"""[$cls, "$fileName", "$relUrl", "$desc", "${humanSize(fullUrl)}"]"""
  }

  def defaultClass = "-non-main-sys"

  def format(fmt: String) = new SimpleDateFormat(fmt).format(releaseDate)

  def ghSourceUrl = s"https://github.com/scala/scala/archive/v$version.tar.gz"

  def page: String = {

s"""
---
title: Scala $version
start: ${format("dd MMMM yyyy")}
layout: downloadpage
release_version: $version
release_date: "${format("MMMM dd, yyyy")}"
show_resources: "true"
permalink: /download/$version.html
requirements: "This Scala software distribution can be installed on any Unix-like or Windows system. It requires the Java runtime version 1.6 or later, which can be downloaded <a href='http://www.java.com/'>here</a>."
resources: [
  ${resourceArchive("-main-unixsys", "scala",               "tgz",  "Max OS X, Unix, Cygwin"   )}
  ${resourceArchive("-main-windows", "scala",               "msi",  "Windows (msi installer)"  )},
  ${resourceArchive(defaultClass,    "scala",               "zip",  "Windows"                  )},
  ${resourceArchive(defaultClass,    "scala-docs",          "txz",  "API docs"                 )},
  ${resourceArchive(defaultClass,    "scala-docs",          "zip",  "API docs"                 )},
  ${resource       (defaultClass,    s"scala-sources-$version.zip", "sources", ghSourceUrl, ghSourceUrl)},
  ${resourceArchive(defaultClass,    "scala-tool-support",  "tgz",  "Scala Tool Support (tgz)")},
  ${resourceArchive(defaultClass,    "scala-tool-support",  "zip",  "Scala Tool Support (zip)")}
]
---


"""
  }
}