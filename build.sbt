name := "make-release-notes"

scalaVersion := "2.13.8"
scalacOptions ++= Seq("-feature", "-deprecation", "-Werror")

libraryDependencies ++= Seq(
  "org.pegdown" % "pegdown" % "1.6.0",
  "org.apache.commons" % "commons-text" % "1.9",
  "org.scala-lang.modules" %% "scala-xml" % "2.1.0",
  "org.scala-lang.modules" %% "scala-parallel-collections" % "1.0.4",
)
