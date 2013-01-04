

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
    val communityProjects = CommunityProjects.loadHtmlFromFile()
    import info.{currentTag => _, _}
    s"""<html>
      <head>
        <title>${currentTag} - Release notes</title>
      </head>
      <body>
        <h3>A new release of Scala is available!  Please point your build tools at ${currentTag drop 1}</h3>
        ${parseHandWrittenNotes()}
        ${communityProjects}
        <br/><br/>
        ${renderFixedIssues}
        ${renderCommitterList}
        ${renderCommitList}
      </body>
    </html>"""
  }
}