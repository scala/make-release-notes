name := "make-release-notes"

scalaVersion := "3.8.2"
scalacOptions ++= Seq("-feature", "-deprecation", "-Werror", "-source:future")

libraryDependencies ++= Seq(
  "org.pegdown" % "pegdown" % "1.6.0",
  "org.apache.commons" % "commons-text" % "1.15.0",
  "org.scala-lang.modules" %% "scala-xml" % "2.4.0",
  "org.scala-lang.modules" %% "scala-parallel-collections" % "1.2.0",
)
