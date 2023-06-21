case class ProjectInfo(name: String, desc: String, url: String, loc: String) {

  def toHtml = <li><a href={url}><strong>{name}</strong></a><br />
    {desc}<br />
    Location: {
      for l <- loc.split("\n")
      yield <xml:group>{l}<br /></xml:group>
    }<br />
    &nbsp;</li>
}

/** This class encapsulates parsing/loading community project HTML from
 * the formatted emails people write.  These emails are usually dumped
 * into a file called community-projects.txt with a one-line separator between them.
 */
object CommunityProjects {

  def loadHtmlFromFile(file: java.io.File = new java.io.File("community-projects.txt")): String =
    loadCommunityProjects(loadLines(file)) match {
      case projects if projects.nonEmpty => renderProjectHtml(projects)
      case _ => ""
    }


  def loadLines(file: java.io.File): Seq[String] = {
    val in = new java.io.BufferedReader(new java.io.FileReader(file))
    def read(lines: Vector[String] = Vector.empty): Vector[String] = in.readLine match {
      case null => lines
      case line =>
        read(lines :+ line)
    }
    try read()
    finally in.close()
  }

  def loadCommunityProjects(lines: Seq[String]): Seq[ProjectInfo] = {
    val groups: Seq[Seq[String]] = {
      def grouper(left: Seq[String], current: Seq[Seq[String]] = Seq.empty): Seq[Seq[String]] =
        if left.isEmpty then current
        else grouper(left dropWhile (x => !x.isEmpty) drop 1, current :+ (left takeWhile (x => !x.isEmpty)))
      grouper(lines)
    }
    groups map parseProject
  }



  def fix(header: String)(content: String): String =
    if content.toLowerCase.startsWith(header.toLowerCase) then content.drop(header.length)
    else sys.error("Expected [" + header + "] found [" + content + "]")

  private def parseProject(content: Seq[String]): ProjectInfo =
    content match {
      case Seq(name, desc, url, location @ _*) if !location.isEmpty =>
        ProjectInfo(fix("Name:")(name),
                    fix("Description:")(desc),
                    fix("URL:")(url),
                    fix("Location:")(location.head) + "\n" + (location.tail mkString "\n"))
      case _ => sys.error("Bad project group: " + content.mkString("\n"))
    }

  def renderProjectHtml(projects: Seq[ProjectInfo]): String = {
    def list = <ul> { for p <- projects yield p.toHtml } </ul>
    val sb = new StringBuffer
    sb.append("<h1> Community Projects </h1>")
    sb.append(s"<p> Special thanks to the ${projects.size} projects that have made releases available for this version of Scala!</p>")
    sb.append(list.toString)
    sb.toString
  }

}
