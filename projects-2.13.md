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

### Other libraries

Add in sbt using `libraryDependencies += ...`:

    "com.chuusai"                      %% "shapeless"                 % "2.3.3"
    "org.scalaz"                       %% "scalaz-core"               % "7.2.19"
    "org.typelevel"                    %% "macro-compat"              % "1.1.1"
    "eu.timepit"                       %% "refined"                   % "0.8.7"
    "com.typesafe"                     %% "ssl-config-core"           % "0.2.2"
    "org.typelevel"                    %% "machinist"                 % "0.6.4"

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

### Pending

You can subscribe to these tickets to find out when a library you want becomes available:

#### New tickets for M3

* [Akka](https://github.com/akka/akka/issues/24507)
* [scala-logging](https://github.com/typesafehub/scala-logging/pull/116)
* [minitest](https://github.com/monix/minitest/issues/10)
* [scalameter](https://github.com/scalameter/scalameter/issues/196)
* [simulacrum](https://github.com/mpilquist/simulacrum/pull/99)

#### Existing 2.13 tickets predating M3

* [cats](https://github.com/typelevel/cats/issues/1648)
    * blocked by catalysts, simulacrum
* [catalysts](https://github.com/typelevel/catalysts/issues/14)
* [pcplod](https://github.com/ensime/pcplod/pull/28)
* [Play](https://github.com/playframework/playframework/issues/7940)
* [Jawn](https://github.com/non/jawn/issues/97)
* [wartremover](https://github.com/wartremover/wartremover/issues/363)

## Available Projects for Scala 2.13.0-M2

Library maintainers, library users, please [edit this page](https://github.com/scala/make-release-notes/edit/2.13.x/projects-2.13.md) and let the world know what libraries are available.

### Scaladex

Scaladex, the index of Scala libraries, now offers searching by target version:

* [All libraries for 2.13.0-M2](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-M2)
* [Scala modules for 2.13.0-M2](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-M2+AND+organization%3Ascala)
* [Testing frameworks for 2.13.0-M2](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-M2+AND+topics%3Atesting)
* [Compiler plugins for 2.13.0-M2](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-M2+AND+topics%3Acompiler-plugin)

### sbt 1 compatibility

To use sbt 1 with Scala 2.13.0-M2, make sure you are using sbt 1.0.4 or newer.
Earlier 1.0.x releases won't work.

### Scala modules

Add in sbt using `libraryDependencies += ...`:

    "org.scala-lang.modules"           %% "scala-async"                % "0.9.7"
    "org.scala-lang.modules"           %% "scala-java8-compat"         % "0.8.0"
    "org.scala-lang.modules"           %% "scala-parallel-collections" % "0.1.2"
    "org.scala-lang.modules"           %% "scala-parser-combinators"   % "1.0.6"
    "org.scala-lang.modules"           %% "scala-xml"                  % "1.0.6"
    "org.scala-lang.modules"           %% "scala-swing"                % "2.0.1"

### Testing frameworks

Add in sbt using `libraryDependencies += ... % "test"`:

    "com.github.scalaprops"            %% "scalaprops"                % "0.5.0"   % "test"
    "org.scalacheck"                   %% "scalacheck"                % "1.12.6"  % "test"
    "org.scalacheck"                   %% "scalacheck"                % "1.13.5"  % "test"
    "org.scalatest"                    %% "scalatest"                 % "3.0.4"   % "test"
    "org.specs2"                       %% "specs2-core"               % "4.0.1"   % "test"
    "com.lihaoyi"                      %% "utest"                     % "0.5.4"   % "test"

### Other libraries

Add in sbt using `libraryDependencies += ...`:

    "com.chuusai"                      %% "shapeless"                 % "2.3.2"
    "com.github.nscala-time"           %% "nscala-time"               % "2.16.0"
    "com.github.xuwei-k"               %% "iarray"                    % "0.4.0"
    "com.github.xuwei-k"               %% "msgpack4z-core"            % "0.3.7"
    "com.github.xuwei-k"               %% "nobox"                     % "0.2.0"
    "com.github.xuwei-k"               %% "zeroapply"                 % "0.2.2"
    "com.typesafe.scala-logging"       %% "scala-logging"             % "3.7.2"
    "org.json4s"                       %% "json4s-native"             % "3.5.3"
    "org.scalactic"                    %% "scalactic"                 % "3.0.4"
    "org.scalaz"                       %% "scalaz-core"               % "7.2.14"
    "org.squeryl"                      %% "squeryl"                   % "0.9.9"
    "com.wix"                          %% "accord-core"               % "0.7.2"

### Compiler plugins

Add in sbt using `addCompilerPlugin(...)`:

    "com.typesafe.genjavadoc"          %% "genjavadoc-plugin"          % "0.10"   cross CrossVersion.full
    "org.spire-math"                   %% "kind-projector"             % "0.9.5"  cross CrossVersion.binary

### sbt plugins

Most plugins do not need to be re-published for 2.13, but certain plugins did require changes.

Add using `addSbtPlugin(...)`:

    "org.scala-js"                     % "sbt-scalajs"                % "0.6.19"

### Pending

You can subscribe to these tickets to find out when a library you want becomes available:

* [cats](https://github.com/typelevel/cats/issues/1648)
    * blocked by catalysts
* [catalysts](https://github.com/typelevel/catalysts/issues/14)
* [pcplod](https://github.com/ensime/pcplod/pull/28)
* [Play](https://github.com/playframework/playframework/issues/7940)
* [Jawn](https://github.com/non/jawn/issues/97)
* [wartremover](https://github.com/wartremover/wartremover/issues/363)
