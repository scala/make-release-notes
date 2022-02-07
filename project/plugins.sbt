locally {
  require(sys.props("file.encoding") == "UTF-8",
    "Please rerun with -Dfile.encoding=UTF-8")
  Nil
}

scalacOptions ++= Seq("-feature", "-deprecation", "-Xfatal-warnings")
