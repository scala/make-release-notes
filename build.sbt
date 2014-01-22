name := "scala-release-note-generator"

scalaVersion := "2.10.3"

libraryDependencies += "org.pegdown" % "pegdown" % "1.2.0"

libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.1"

{
  require(sys.props("file.encoding") == "UTF-8", "Please rerun with -Dfile.encoding=UTF-8")
  Nil
}
