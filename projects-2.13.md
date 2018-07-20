## Available Projects for Scala 2.13.0-M4

Library maintainers, library users, please [edit this page](https://github.com/scala/make-release-notes/edit/2.13.x/projects-2.13.md) and let the world know what libraries are available.

### Scaladex

Scaladex, the index of Scala libraries, now offers searching by target version:

* [All libraries for 2.13.0-M4](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-M4)
* [Scala modules for 2.13.0-M4](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-M4+AND+organization%3Ascala)
* [Testing frameworks for 2.13.0-M4](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-M4+AND+topics%3Atesting)
* [Compiler plugins for 2.13.0-M4](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-M4+AND+topics%3Acompiler-plugin)

### sbt 1 compatibility

To use sbt 1 with Scala 2.13.0-M4, make sure you are using sbt 1.0.4 or newer.
Earlier 1.0.x releases won't work.  Using the latest 1.1.x patch release is
recommended.

### Scala modules

Add in sbt using `libraryDependencies += ...`:

    "org.scala-lang.modules"           %% "scala-collection-compat"   % "0.1.1"
    "org.scala-lang.modules"           %% "scala-parser-combinators"  % "1.1.1"
    "org.scala-lang.modules"           %% "scala-xml"                 % "1.1.0"
    "org.scala-lang.modules"           %% "scala-java8-compat"        % "0.9.0"

### Testing frameworks

Add in sbt using `libraryDependencies += ... % "test"`:

    "org.scalacheck"                   %% "scalacheck"                % "1.14.0"      % "test"
    "com.github.scalaprops"            %% "scalaprops"                % "0.5.5"       % "test"
    "org.scalatest"                    %% "scalatest"                 % "3.0.6-SNAP1" % "test"
    "org.specs2"                       %% "specs2-core"               % "4.3.0"       % "test"

### Other libraries

Add in sbt using `libraryDependencies += ...`:

    "org.scalaz"                       %% "scalaz-core"               % "7.2.23"
    "com.github.nscala-time"           %% "nscala-time"               % "2.20.0"
    "org.json4s"                       %% "json4s-native"             % "3.5.4"
    "org.squeryl"                      %% "squeryl"                   % "0.9.12"
    "com.github.xuwei-k"               %% "applybuilder"              % "0.2.3"
    "com.github.xuwei-k"               %% "msgpack4z-core"            % "0.3.9"
    "com.github.xuwei-k"               %% "zeroapply"                 % "0.2.2"
    "org.typelevel"                    %% "macro-compat"              % "1.1.1"
    "com.chuusai"                      %% "shapeless"                 % "2.3.3"
    "org.scalactic"                    %% "scalactic"                 % "3.0.4"
    "org.typelevel"                    %% "machinist"                 % "0.6.5"
    "com.typesafe.scala-logging"       %% "scala-logging"             % "3.9.0"

### Compiler plugins

Add in sbt using `addCompilerPlugin(...)`:

    "org.spire-math"                   % "kind-projector"             % "0.9.7" cross CrossVersion.binary
    "com.typesafe.genjavadoc"          % "genjavadoc-plugin"          % "0.11"  cross CrossVersion.full

### sbt plugins

Most plugins do not need to be re-published for 2.13, but certain plugins did require changes.

Add using `addSbtPlugin(...)`:

    "org.scala-js"                     % "sbt-scalajs"                % "0.6.23"
    "org.tpolecat"                     % "tut-plugin"                 % "0.6.6"

### Pending

You can subscribe to these tickets to find out when a library you want becomes available:

<https://github.com/scala/community-builds/wiki/scala-2.13.x-migration>

---

## Available Projects for Scala 2.13.0-M3

See <https://github.com/scala/make-release-notes/blob/41046c3a4bc12842ecc40766f4489eed13bb133a/projects-2.13.md#available-projects-for-scala-2130-m3>
