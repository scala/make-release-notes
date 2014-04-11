import java.io.File



object BasicGithubReleeaseNotes {
  val GhProjectString = new util.matching.Regex("([^/]+)/(.+)")

  case class Config(project: GithubProject, previousTag: String, nextTag: String, location: File)
  
  def main(arg: Array[String]): Unit = {
    def usage(): Nothing = {
      System.err.println("Usage:  BasicGithubReleeaseNotes  options*")
      System.err.println(" ")
      System.err.println(" * -gh  <user/project>   Github project to use")
      System.err.println(" * -p  <tag>             Previous tag to compare against")
      System.err.println(" * -n  <tag>             Release tag to generate notes for")
      System.err.println(" * -l  <directory>       Location of the project.")
      System.exit(1)
      sys.error("no return from usage")
    }
    // TODO - Something better than junk for reading.
    def readArgs(
        remaining: List[String] = arg.toList, 
        project: Option[GithubProject] = None, 
        previousTag: Option[String] = None, 
        nextTag: Option[String] = None,
        location: Option[File] = Some(new File("."))
    ): Config =
      remaining match {
        case "-h" :: rest => usage()
        case "-gh" :: GhProjectString(user, project) :: rest => readArgs(rest, Some(GithubProject(user, project)), previousTag, nextTag, location)
        case GhProjectString(user, project) :: rest => readArgs(rest, Some(GithubProject(user, project)), previousTag, nextTag, location)
        case "-p" :: prev :: rest => readArgs(rest, project, Some(prev), nextTag, location)
        case "-n" :: next :: rest => readArgs(rest, project, previousTag, Some(next), location)
        case "-l" :: location :: rest => readArgs(rest, project, previousTag, nextTag, Some(new File(location)))
        case unknown :: rest =>
          System.err.println(s"Unknown option: ${unknown}")
          usage()
        case Nil =>
          // Default, we check to see if we have everyting:
          (for {
            pj <- project
            pt <- previousTag
            nt <- nextTag
            l  <- location
          } yield Config(pj, pt, nt, l)) match {
            case Some(config) => config
            case _ => usage()
          }
      }
    val Config(project, prev, next, loc) = readArgs()
    implicit val language = MarkDown
    val info = new GitInfo(loc, prev, next, project, GithubIssueDetector(project))
    println(info.renderFixedIssues)
    //println(info.renderCommitList)
    println(info.renderCommitterList)
  }
}