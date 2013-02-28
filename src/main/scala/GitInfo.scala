
case class Commit(sha: String, author: String, header: String, body: String) {
  override def toString = " * " + sha + " (" + author + ") " + header + " - " + body.take(5) + " ..."
}


/** Gobal functions for dealing with git. */
object GitHelper {
  def processGitCommits(gitDir: java.io.File, previousTag: String, currentTag: String): IndexedSeq[Commit] = {
    import sys.process._
    val gitFormat = "%h %s" // sha and subject
    val log = Process(Seq("git", "--no-pager", "log", s"${previousTag}..${currentTag}","--format=format:"+gitFormat,"--no-merges", "--topo-order"), gitDir).lines

    log.par.map(_.split(" ", 2)).collect {
      case Array(sha, title) =>
        val (author :: body) = Process(Seq("git", "--no-pager", "show", sha ,"--format=format:%aN%n%b","--quiet"), gitDir).lines.toList
        Commit(sha, author, title, body.mkString("\n"))
    }.toVector
  }

  def hasFixins(msg: String): Boolean = (
    (msg contains "SI-") /*&& ((msg.toLowerCase contains "fix") || (msg.toLowerCase contains "close"))*/
  )
  
  val siPattern = java.util.regex.Pattern.compile("(SI-[0-9]+)")

  def fixLinks(commit: Commit): String = {
    val searchString = commit.body + commit.header
    val m = siPattern matcher searchString
    val issues = new collection.mutable.ArrayBuffer[String]
    while(m.find()) {
      issues += (m group 1)
    }
    issues map (si => """<a href="https://issues.scala-lang.org/browse/%s">%s</a>""" format (si, si)) mkString ", "
  }

}

class GitInfo(gitDir: java.io.File, val previousTag: String, val currentTag: String) {
  import GitHelper._
  val commits = processGitCommits(gitDir, previousTag, currentTag)

  val authors: Seq[(String, Int)] = {
    val grouped: Vector[(String,Int)] = (commits groupBy (_.author)).map { case (a,c) => a -> c.length }{collection.breakOut}
    (grouped sortBy (_._2)).reverse
  }

  val fixCommits =
   for {
     commit <- commits
     searchString = commit.body + commit.header
     if hasFixins(searchString)
   } yield commit

  private def commitShaLink(sha: String) = 
    s"""<a href="https://github.com/scala/scala/commit/${sha}">${sha}</a>"""

  private def blankLine(): String = "<p>&nbsp</p>"
  private def header4(msg: String): String = s"<h4>$msg</h4>"

  def renderCommitterList: String = {
    val sb = new StringBuffer
    sb append blankLine()
    sb append header4("A big thank you to all the contributors!")
    sb append """|<table border="0" cellspacing="0" cellpadding="1">
                 |  <thead><tr><th>#</th><th align="left">Author</th></tr></thead>
                 |<tbody>""".stripMargin
    for((author, count) <- authors)
      sb append s"""<tr><td align="right">${count} &nbsp;</td><td>${author}</td></tr>"""
    sb append """</tbody></table>"""
    sb.toString
  }

  def renderCommitList: String = {
    val sb = new StringBuffer
    sb append blankLine()
    sb append header4("Complete commit list!")
    sb append """<table border="0" cellspacing="0" cellpadding="1">
      <thead><tr><th>sha</th><th align="left">Title</th></tr></thead>
    <tbody>"""
    for(commit <- commits)
       sb append s"""<tr><td align="right">${commitShaLink(commit.sha)}&nbsp;</td><td>${commit.header}</td></tr>\n"""
    sb append """</tbody>
      </table>"""
    sb.toString
  }

  def renderFixedIssues: String = {
    val sb = new StringBuffer
    sb append blankLine()
    sb append header4(s"Here's a list of isssues that have been fixed since ${previousTag}")
    sb append ("""<table border="0" cellspacing="0" cellpading="1">
      <thead><tr><th>Issue(s)</th><th>Commit</th><th>Message</th></tr></thead>
    <tbody>""")
    for(commit <- fixCommits)
      sb append s"""<tr><td>${fixLinks(commit)}&nbsp;</td><td>${commitShaLink(commit.sha)}&nbsp;</td><td>${commit.header}</td></tr>"""
    sb append """</tbody>
      </table>"""
    sb append blankLine()
    sb.toString
  }

   
}