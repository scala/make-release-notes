name := "make-release-notes"

scalaVersion := "3.4.1"
scalacOptions ++= Seq("-feature", "-deprecation", "-Werror", "-source:future")

libraryDependencies ++= Seq(
  "org.pegdown" % "pegdown" % "1.6.0",
  "org.apache.commons" % "commons-text" % "1.11.0",
  "org.scala-lang.modules" %% "scala-xml" % "2.2.0",
  "org.scala-lang.modules" %% "scala-parallel-collections" % "1.0.4",
)
