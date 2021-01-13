
case class Commit(sha: String, author: String, header: String, body: String) {
  def trimmedHeader = header.take(80)
  override def toString = " * " + sha + " (" + author + ") " + header + " - " + body.take(5) + " ..."
}

/** Gobal functions for dealing with git. */
object GitHelper {
  def processGitCommits(gitDir: java.io.File, previousTag: String, currentTag: String): IndexedSeq[Commit] = {
    import sys.process._
    val gitFormat = "%h %s" // sha and subject
    val log = Process(Seq("git", "--no-pager", "log", s"${previousTag}..${currentTag}", "--format=format:" + gitFormat, "--no-merges", "--topo-order"), gitDir).lineStream

    log.par.map(_.split(" ", 2)).collect {
      case Array(sha, title) =>
        val (author :: body) = Process(Seq("git", "--no-pager", "show", sha, "--format=format:%aN%n%b", "--quiet"), gitDir).lineStream.toList
        Commit(sha, author, title, body.mkString("\n"))
    }.toVector
  }

  def hasFixins(msg: String): Boolean = (
    (msg contains "SI-") /*&& ((msg.toLowerCase contains "fix") || (msg.toLowerCase contains "close"))*/
  )

  val siPattern = java.util.regex.Pattern.compile("(SI-[0-9]+)")

  def fixLinks(commit: Commit)(implicit targetLanguage: TargetLanguage): String = {
    val searchString = commit.body + commit.header
    val m = siPattern matcher searchString
    val issues = new collection.mutable.ArrayBuffer[String]
    while (m.find()) {
      issues += (m group 1)
    }
    issues map (si => targetLanguage.createHyperLink(s"https://issues.scala-lang.org/browse/$si", si)) mkString ", "
  }

  def htmlEncode(s: String) = org.apache.commons.text.StringEscapeUtils.escapeHtml4(s)
}

class GitInfo(gitDir: java.io.File, val previousTag: String, val currentTag: String)(implicit targetLanguage: TargetLanguage) {
  import GitHelper._
  val commits = processGitCommits(gitDir, previousTag, currentTag)

  val authors: Seq[(String, Int)] = {
    val grouped: Vector[(String, Int)] = (commits groupBy (_.author)).map { case (a, c) => a -> c.length } { collection.breakOut }
    (grouped sortBy (_._2)).reverse
  }

  val fixCommits =
    for {
      commit <- commits
      searchString = commit.body + commit.header
      if hasFixins(searchString)
    } yield commit

  private def commitShaLink(sha: String) =
    targetLanguage.createHyperLink(s"https://github.com/scala/scala/commit/${sha}", sha)

  private def blankLine(): String = targetLanguage.blankLine()
  private def header4(msg: String): String = targetLanguage.header4(msg)

  def renderCommitterList: String = {
    val sb = new StringBuffer
    sb append blankLine()
    sb append header4("A big thank you to all the contributors!")
    sb append targetLanguage.tableHeader("#", "Author")
    for ((author, count) <- authors)
      sb append targetLanguage.tableRow(count.toString, author)
    sb append targetLanguage.tableEnd
    sb.toString
  }

  def renderCommitList: String = {
    val sb = new StringBuffer
    sb append blankLine()
    sb append header4("Complete commit list!")
    sb append targetLanguage.tableHeader("sha", "Title")
    for (commit <- commits)
      sb append targetLanguage.tableRow(commitShaLink(commit.sha), commit.trimmedHeader)
    sb append targetLanguage.tableEnd
    sb.toString
  }

  def renderFixedIssues: String = {
    val sb = new StringBuffer
    sb append blankLine()
    sb append header4(s"Commits and the issues they fixed since ${previousTag}")
    sb append targetLanguage.tableHeader("Issue(s)", "Commit", "Message")
    for (commit <- fixCommits)
      sb append targetLanguage.tableRow(fixLinks(commit), commitShaLink(commit.sha), commit.trimmedHeader)
    sb append targetLanguage.tableEnd
    sb append blankLine()
    sb.toString
  }

}
