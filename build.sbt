name := "scala-release-note-generator"

scalaVersion := "2.11.5"

libraryDependencies += "org.pegdown" % "pegdown" % "1.2.0"
libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.1"
libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.0.3"

{
  require(sys.props("file.encoding") == "UTF-8", "Please rerun with -Dfile.encoding=UTF-8")
  Nil
}
