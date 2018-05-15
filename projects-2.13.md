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

    (coming soon)

### Testing frameworks

Add in sbt using `libraryDependencies += ... % "test"`:

    (coming soon)

### Other libraries

Add in sbt using `libraryDependencies += ...`:

    (coming soon)

### Compiler plugins

Add in sbt using `addCompilerPlugin(...)`:

    (coming soon)

### sbt plugins

Most plugins do not need to be re-published for 2.13, but certain plugins did require changes.

Add using `addSbtPlugin(...)`:

    (coming soon)

### Pending

You can subscribe to these tickets to find out when a library you want becomes available:

* [scala-xml](https://github.com/scala/scala-xml/issues/217)
* [scala-parser-combinators](https://github.com/scala/scala-parser-combinators/issues/151)
* [ScalaCheck](https://github.com/rickynils/scalacheck/issues/410)
* [ScalaTest](https://github.com/scalatest/scalatest/issues/1367)
* [kind-projector](https://github.com/non/kind-projector/issues/72)

## Available Projects for Scala 2.13.0-M3

Library maintainers, library users, please [edit this page](https://github.com/scala/make-release-notes/edit/2.13.x/projects-2.13.md) and let the world know what libraries are available.

### Scaladex

Scaladex, the index of Scala libraries, now offers searching by target version:

* [All libraries for 2.13.0-M3](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-M3)
* [Scala modules for 2.13.0-M3](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-M3+AND+organization%3Ascala)
* [Testing frameworks for 2.13.0-M3](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-M3+AND+topics%3Atesting)
* [Compiler plugins for 2.13.0-M3](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-M3+AND+topics%3Acompiler-plugin)

### sbt 1 compatibility

To use sbt 1 with Scala 2.13.0-M3, make sure you are using sbt 1.0.4 or newer.
Earlier 1.0.x releases won't work.

### Scala modules

Add in sbt using `libraryDependencies += ...`:

    "org.scala-lang.modules"           %% "scala-async"                % "0.9.7"
    "org.scala-lang.modules"           %% "scala-java8-compat"         % "0.8.0"
    "org.scala-lang.modules"           %% "scala-parallel-collections" % "0.1.2"
    "org.scala-lang.modules"           %% "scala-parser-combinators"   % "1.1.0"
    "org.scala-lang.modules"           %% "scala-swing"                % "2.0.2"
    "org.scala-lang.modules"           %% "scala-xml"                  % "1.0.6"

### Testing frameworks

Add in sbt using `libraryDependencies += ... % "test"`:

    "org.scalacheck"                   %% "scalacheck"                 % "1.12.6"  % "test"
    "org.scalacheck"                   %% "scalacheck"                 % "1.13.5"  % "test"
    "org.specs2"                       %% "specs2-core"                % "4.0.2"   % "test"
    "io.monix"                         %% "minitest"                   % "2.1.1"   % "test"

### Other libraries

Add in sbt using `libraryDependencies += ...`:

    "com.chuusai"                      %% "shapeless"                 % "2.3.3"
    "org.scalaz"                       %% "scalaz-core"               % "7.2.19"
    "org.typelevel"                    %% "macro-compat"              % "1.1.1"
    "eu.timepit"                       %% "refined"                   % "0.8.7"
    "com.typesafe"                     %% "ssl-config-core"           % "0.2.2"
    "org.typelevel"                    %% "machinist"                 % "0.6.4"
    "com.github.scopt"                 %% "scopt"                     % "3.7.0"
    "com.typesafe.scala-logging"       %% "scala-logging"             % "3.8.0"
    "com.github.mpilquist"             %% "simulacrum"                % "0.12.0"
    "com.typesafe.play"                %% "play-json"                 % "2.6.9"
    "com.typesafe.play"                %% "play-ws-standalone"        % "2.0.0-M1"
    "org.typelevel"                    %% "catalysts-platform"        % "0.6"
    "org.spire-math"                   %% "jawn-parser"               % "0.12.1"
    "com.storm-enroute"                %% "scalameter"                % "0.10-SNAPSHOT"
    "com.typesafe.akka"                %% "akka-actor"                % "2.5.11"
    "com.typesafe.akka"                %% "akka-http"                 % "10.1.0"

### Compiler plugins

Add in sbt using `addCompilerPlugin(...)`:

    "org.scalamacros"                  % "paradise"                   % "2.1.1" cross CrossVersion.full
    "org.spire-math"                   % "kind-projector"             % "0.9.6" cross CrossVersion.binary
    "com.typesafe.genjavadoc"          % "genjavadoc-plugin"          % "0.11"  cross CrossVersion.full

### sbt plugins

Most plugins do not need to be re-published for 2.13, but certain plugins did require changes.

Add using `addSbtPlugin(...)`:

    "org.scala-js"                     % "sbt-scalajs"                % "0.6.22"
    "org.scala-js"                     % "sbt-scalajs"                % "1.0.0-M3"
    "com.typesafe.sbt"                 % "sbt-twirl"                  % "1.3.15"

### Pending

You can subscribe to these tickets to find out when a library you want becomes available:

* [cats](https://github.com/typelevel/cats/issues/1648)
* [wartremover](https://github.com/wartremover/wartremover/issues/363)
