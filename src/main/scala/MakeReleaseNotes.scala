

import java.io.BufferedReader
object MakeReleaseNotes {
  
  
  def apply(scalaDir: java.io.File, previousTag: String, currentTag: String): Unit = {
    val out = new java.io.File("release-notes.html")
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
  
  def makeReleaseNotes(scalaDir: java.io.File, previousTag: String, currentTag: String): String = {
    val info = new GitInfo(scalaDir, previousTag, currentTag)
    // val communityProjects = CommunityProjects.loadHtmlFromFile()
    import info.{currentTag => _, _}
    // <h3> Known issues </h3>
    // ${JiraIssues.makeOpenIssuesString}

    s"""<html>
      <head>
        <meta charset="UTF-8">
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
  }
}