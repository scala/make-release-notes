name := "make-release-notes"

scalaVersion := "3.6.4"
scalacOptions ++= Seq("-feature", "-deprecation", "-Werror", "-source:future")

libraryDependencies ++= Seq(
  "org.pegdown" % "pegdown" % "1.6.0",
  "org.apache.commons" % "commons-text" % "1.13.0",
  "org.scala-lang.modules" %% "scala-xml" % "2.3.0",
  "org.scala-lang.modules" %% "scala-parallel-collections" % "1.2.0",
)
