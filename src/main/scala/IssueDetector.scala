/**
 * Trait used to detect + create links to issue comments
 * in git commits.
 */
trait IssueDetector {
  def isFixCommit(commit:  Commit): Boolean
  def issueLink(commit: Commit)(implicit targetLanguage: TargetLanguage): String
}

/**
 * Detector for issue tracking in scala commit messages.
 */
object ScalaIssueDetector extends IssueDetector {
  private val siPattern = java.util.regex.Pattern.compile("(SI-[0-9]+)")
  private def hasFixins(msg: String): Boolean = (
    (msg contains "SI-") /*&& ((msg.toLowerCase contains "fix") || (msg.toLowerCase contains "close"))*/
  )
  private def fixLinks(commit: Commit)(implicit targetLanguage: TargetLanguage): String = {
    val searchString = commit.body + commit.header
    val m = siPattern matcher searchString
    val issues = new collection.mutable.ArrayBuffer[String]
    while (m.find()) {
      issues += (m group 1)
    }
    issues map (si => targetLanguage.createHyperLink(s"https://issues.scala-lang.org/browse/$si", si)) mkString ", "
  }
  
  def isFixCommit(commit:  Commit): Boolean = 
    hasFixins(commit.body + commit.header)
  def issueLink(commit: Commit)(implicit targetLanguage: TargetLanguage): String =  
    fixLinks(commit)
}


/**
 * Detector for issue tracking in canonical github projects.
 */
case class GithubIssueDetector(project: GithubProject) extends IssueDetector {
  import GithubIssueDetector.IssueNum
  def isFixCommit(commit:  Commit): Boolean = 
    (commit.body + commit.header).toLowerCase contains "fix"  // TODO && contains # ?
  def issueLink(commit: Commit)(implicit targetLanguage: TargetLanguage): String ={
  	(commit.body + commit.header).split("[\r\n]+").collect {
  		case IssueNum(num) => targetLanguage.createHyperLink(s"https://github.com/${project.user}/${project.project}/issues/${num}", num)
  	} mkString " "
  }
}
object GithubIssueDetector {
  val IssueNum = new scala.util.matching.Regex(".*\\#([0-9]+).*")
}