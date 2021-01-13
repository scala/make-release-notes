sealed trait TargetLanguage {
  def createHyperLink(link: String, content: String): String
  def blankLine(): String
  def header4(msg: String): String
  def tableHeader(firstColumn: String, secondColumn: String): String
  def tableRow(firstColumn: String, secondColumn: String): String
  def tableHeader(firstColumn: String, secondColumn: String, thirdColumn: String): String
  def tableRow(firstColumn: String, secondColumn: String, thirdColumn: String): String
  def tableEnd: String
  def ext: String
}
case object MarkDown extends TargetLanguage {
  val ext = "md"
  def createHyperLink(link: String, content: String): String =
    s"[$content]($link)"
  def blankLine(): String = "\n"
  def header4(msg: String): String = s"#### $msg\n"
  def tableHeader(firstColumn: String, secondColumn: String): String =
    s"""
${markdownEncode(firstColumn)} | $secondColumn
---: | ---
"""
  def tableRow(firstColumn: String, secondColumn: String): String = s"${firstColumn} | <notextile>${escapeHtml(secondColumn)}</notextile>\n"
  def tableHeader(firstColumn: String, secondColumn: String, thirdColumn: String): String =
    s"""
$firstColumn | $secondColumn | $thirdColumn
--- | --- | ---
"""
  def tableRow(firstColumn: String, secondColumn: String, thirdColumn: String): String = s"$firstColumn | $secondColumn | <notextile>${escapeHtml(thirdColumn)}</notextile>\n"
  def tableEnd: String = "\n"

  def markdownEncode(s: String): String = s.flatMap {
    case c if (List('*', '`', '[', ']', '#').contains(c)) => "\\" + c
    case x => x.toString
  }

  def escapeHtml(s: String): String = Html.htmlEncode(s).flatMap {
    case '|' => "&#124;" // it would destroy tables!
    case c => c.toString
  }
}
case object Html extends TargetLanguage {
  val ext = "html"
  def createHyperLink(link: String, content: String): String =
    s"""<a href="$link">$content</a>"""
  def blankLine(): String = "<p>&nbsp;</p>"
  def header4(msg: String): String = s"<h4>$msg</h4>"
  def tableHeader(firstColumn: String, secondColumn: String): String = s"""|<table border="0" cellspacing="0" cellpadding="1">
                 |  <thead><tr><th>$firstColumn</th><th align="left">$secondColumn</th></tr></thead>
                 |<tbody>""".stripMargin
  def tableRow(firstColumn: String, secondColumn: String): String = s"""<tr><td align="right">${firstColumn} &nbsp;</td><td>${htmlEncode(secondColumn)}</td></tr>"""
  def tableHeader(firstColumn: String, secondColumn: String, thirdColumn: String): String = s"""<table border="0" cellspacing="0" cellpading="1">
      <thead><tr><th>$firstColumn</th><th>$secondColumn</th><th>$thirdColumn</th></tr></thead>
    <tbody>"""
  def tableRow(firstColumn: String, secondColumn: String, thirdColumn: String): String = s"""<tr><td>${firstColumn}&nbsp;</td><td>${secondColumn}&nbsp;</td><td>${htmlEncode(thirdColumn)}</td></tr>"""
  def tableEnd: String = "</tbody></table>"

  def htmlEncode(s: String) = org.apache.commons.text.StringEscapeUtils.escapeHtml4(s)
}
