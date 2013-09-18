

import java.io.BufferedReader
import scala.io.Source
object MakeReleaseNotes {

  def apply(scalaDir: java.io.File, previousTag: String, currentTag: String)(implicit targetLanguage: TargetLanguage = Html): Unit = {
    val out = targetLanguage match {
      case Html => new java.io.File("release-notes.html")
      case MarkDown => new java.io.File(s"release-notes-${currentTag}.md")
    }
    val buf = new java.io.BufferedWriter(new java.io.FileWriter(out))
    try buf.write(makeReleaseNotes(scalaDir, previousTag, currentTag))
    finally buf.close()
  }

  def parseHandWrittenNotes(file: java.io.File = new java.io.File("hand-written.md")): String = {
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

  def makeReleaseNotes(scalaDir: java.io.File, previousTag: String, currentTag: String)(implicit targetLanguage: TargetLanguage): String = {
    def rawHandWrittenNotes(file: java.io.File = new java.io.File(s"hand-written.md")): String = {
      val lines: List[String] = if (file.exists) {
        val src = Source.fromFile(file)
        src.getLines.toList
      } else Nil
      // if you don't have the next line, sub-bullets would be screwed!
      // please take this case into account and comment out 2 next lines and uncomment the line after!
      val newLines = lines.map(x => if (x.startsWith("    *")) "\n" + x else x)
      newLines.mkString("\n")
      //      lines.mkString("\n")
    }
    val info = new GitInfo(scalaDir, previousTag, currentTag)
    // val communityProjects = CommunityProjects.loadHtmlFromFile()
    import info.{ currentTag => _, _ }
    // <h3> Known issues </h3>
    // ${JiraIssues.makeOpenIssuesString}

    targetLanguage match {
      case Html => s"""<html>
      <head>
        <title>${currentTag} - Release notes</title>
      </head>
      <body>
        <h3>Scala ${currentTag drop 1} is now available!</h3>
        ${parseHandWrittenNotes()}
        <br/><br/>
        ${renderCommitterList}
        ${renderFixedIssues}
        ${renderCommitList}
      </body>
    </html>"""
      case MarkDown => s"""---
layout: news
post-type: announcement
title: "Scala ${currentTag drop 1} is now available!"
---
${rawHandWrittenNotes()}

${renderCommitterList}
${renderFixedIssues}
${renderCommitList}
      """
    }

  }
}