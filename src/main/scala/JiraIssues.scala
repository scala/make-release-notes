//curl -D- -X GET https://issues.scala-lang.org/sr/jira.issueviews:searchrequest-printable/11907/SearchRequest-11907.html?tempMax=1000

object JiraIssues:

  def slurp(in: java.io.InputStream): String =
    val wrapped = new java.io.BufferedReader(new java.io.InputStreamReader(in))
    def read(buf: StringBuffer): String =
      wrapped.readLine match
        case null => buf.toString
        case line =>
          buf.append(s"$line\n")
          read(buf)
    try read(new StringBuffer)
    finally in.close()

  def parseXml(in: String): scala.xml.NodeSeq =
    import scala.xml.parsing.XhtmlParser
    XhtmlParser(scala.io.Source.fromString(in))

  def makeOpenIssuesString =
    import java.net.URL
    val url = new URL("https://issues.scala-lang.org/sr/jira.issueviews:searchrequest-printable/11907/SearchRequest-11907.html?tempMax=1000")

    val htmlString = slurp(url.openStream)

    val dropFront = htmlString drop (htmlString.indexOfSlice("""<table""", 0))
    val dropEnd = dropFront slice (0,dropFront.lastIndexOfSlice("</table>", dropFront.length))

    //val html = parseXml(htmlString)

    //val div = html \\ "div#printable-content"
    //div.toString
    dropEnd + "</table>"
