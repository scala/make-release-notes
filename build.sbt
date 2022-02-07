name := "make-release-notes"

scalaVersion := "2.12.15"

scalacOptions ++= Seq("-feature", "-deprecation", "-Xfatal-warnings")

libraryDependencies += "org.pegdown" % "pegdown" % "1.6.0"
libraryDependencies += "org.apache.commons" % "commons-text" % "1.9"
libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "2.0.1"

{
  require(sys.props("file.encoding") == "UTF-8", "Please rerun with -Dfile.encoding=UTF-8")
  Nil
}
