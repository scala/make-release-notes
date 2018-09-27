import java.util.Date
import java.text._

import java.io.BufferedReader
import scala.io.Source

object MakeReleaseNotes {

  def main(args: Array[String]): Unit =
    args match {
      case Array(prevVersion, version, release) =>
        genPR(prevVersion, version, release)
      case Array(prevVersion, version, release, gitDir) =>
        genPR(prevVersion, version, release, gitDir)
    }

  def genPR(prevVersion: String, version: String, release: String, gitDir: String = s"${sys.env("HOME")}/git/scala") = {
    val date = new SimpleDateFormat("yyyy/MM/dd").parse(release)
    new MakeDownloadPage(version, date).write()
    MakeReleaseNotes(new java.io.File(gitDir), version, s"v$prevVersion", s"v$version", MarkDown, date)
  }

  def write(page: String, version: String, releaseDate: Date, ext: String) = {
    def format(fmt: String) = new SimpleDateFormat(fmt).format(releaseDate)

    require(!version.startsWith("v"), "version should *not* start with 'v'")
    val fileName = s"${format("yyyy-MM-dd")}-release-notes-$version.$ext"
    IO.write(new java.io.File(fileName), page)

    println("# generated " + fileName)

    if (ext == "md") {
      println(s"cp $fileName ../scala-lang/_posts/")
      println(s"# don't forget to\n${scala.util.Properties.envOrElse("EDITOR", "mate")} ../scala-lang/download/index.md ../scala-lang/documentation/api.md ../scala-lang/_config.yml")
      println("# and, to prepare and sanity check your scala-lang PR:")
      println(s"maruku --html $fileName")
    }
  }

  def apply(scalaDir: String, version: String, previousTag: String, currentTag: String, releaseDate: Date) {
    Seq(Html, MarkDown).foreach(fmt => apply(new java.io.File(scalaDir), version, previousTag, currentTag, fmt, releaseDate))
  }
  def apply(scalaDir: java.io.File, version: String, previousTag: String, currentTag: String, targetLanguage: TargetLanguage = MarkDown, releaseDate: Date = new Date()): Unit = {
    val out = targetLanguage match {
      case Html => new java.io.File("release-notes.html")
      case MarkDown => new java.io.File(s"release-notes-${currentTag}.md")
    }
    val notes = makeReleaseNotes(scalaDir, version, previousTag, currentTag)(targetLanguage)
    write(notes, currentTag.dropWhile(_ == 'v'), releaseDate, targetLanguage.ext)
  }

  private def parseHandWrittenNotes(file: java.io.File = new java.io.File("hand-written.md")): String = {
    import org.pegdown._
    val parser = new PegDownProcessor

    val in = new java.io.BufferedReader(new java.io.FileReader(file))
    def read(buf: StringBuffer): String =
      in.readLine match {
        case null => buf.toString
        case line =>
          buf append s"${line}\n"
          read(buf)
      }
    val content =
      try read(new StringBuffer)
      finally in.close()

    parser markdownToHtml content
  }

  private def stripTripleDashedHtmlComments(s: String): String =
    s.replaceAll("""(?ims)<!---.*?-->""", "")

  private def makeReleaseNotes(scalaDir: java.io.File, version: String, previousTag: String, currentTag: String)(implicit targetLanguage: TargetLanguage): String = {
    def rawHandWrittenNotes(file: java.io.File = new java.io.File(s"hand-written.md")): String = {
      val lines: List[String] = if (file.exists) {
        val src = Source.fromFile(file)
        src.getLines.toList
      } else Nil
      // if you don't have the next line, sub-bullets would be screwed!
      // please take this case into account and comment out 2 next lines and uncomment the line after!
      val newLines = lines.map(x => if (x.startsWith("    *")) "\n" + x.stripPrefix("  ") else x)
      val bulletFixed = newLines.mkString("\n")
      val commentsStripped = stripTripleDashedHtmlComments(bulletFixed)
      commentsStripped.replaceAll("\\$version", version)
    }
    val info = new GitInfo(scalaDir, previousTag, currentTag)
    // val communityProjects = CommunityProjects.loadHtmlFromFile()
    import info.{ currentTag => _, _ }
    // <h3> Known issues </h3>
    // ${JiraIssues.makeOpenIssuesString}

    targetLanguage match {
      case Html => s"""<html>
      <head>
        <meta charset="UTF-8">
        <title>${currentTag} - Release notes</title>
        <link rel="stylesheet" type="text/css" href="http://www.scala-lang.org/resources/css/bootstrap.css"/>
      </head>
      <body>
        <div class="container"/>
          <h3>Scala ${currentTag drop 1} is now available!</h3>
          ${parseHandWrittenNotes()}
          <br/><br/>
          ${renderCommitterList}
          ${renderFixedIssues}
          ${renderCommitList}
        </div>
      </body>
    </html>"""
      case MarkDown => s"""---
category: announcement
permalink: /news/$version
title: "Scala ${currentTag drop 1} is now available!"
---
${rawHandWrittenNotes()}
"""
    }

  }
}
