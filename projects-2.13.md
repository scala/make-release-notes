## Available Projects for Scala 2.13.0-M5

Library maintainers, library users, please [edit this page](https://github.com/scala/make-release-notes/edit/2.13.x/projects-2.13.md) and let the world know what libraries are available.

### Scaladex

Scaladex, the index of Scala libraries, now offers searching by target version:

* [All libraries for 2.13.0-M5](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-M5)
* [Scala modules for 2.13.0-M5](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-M5+AND+organization%3Ascala)
* [Testing frameworks for 2.13.0-M5](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-M5+AND+topics%3Atesting)
* [Compiler plugins for 2.13.0-M5](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-M5+AND+topics%3Acompiler-plugin)

### sbt 1 compatibility

To use sbt 1 with Scala 2.13.0-M5, make sure you are using sbt 1.0.4 or newer.
Earlier 1.0.x releases won't work.  Using the latest 1.2.x patch release is
recommended.

### Scala modules

Add in sbt using `libraryDependencies += ...`:

    "org.scala-lang.modules"           %% "scala-parser-combinators"  % "1.1.1"
    "org.scala-lang.modules"           %% "scala-xml"                 % "1.1.0"
    "org.scala-lang.modules"           %% "scala-collection-compat"   % "0.2.0"
    "org.scala-lang.modules"           %% "scala-java8-compat"        % "0.9.0"

### Testing frameworks

Add in sbt using `libraryDependencies += ... % "test"`:

    "com.lihaoyi"                      %% "utest"                     % "0.6.6"   % "test"

### Other libraries

Add in sbt using `libraryDependencies += ...`:

    "com.github.nscala-time"           %% "nscala-time"               % "2.20.0"
    "com.github.scalaprops"            %% "scalaprops"                % "0.5.5"       % "test"
    "com.github.xuwei-k"               %% "msgpack4z-core"            % "0.3.5"
    "com.github.xuwei-k"               %% "zeroapply"                 % "0.2.2"
    "org.scalaz"                       %% "scalaz-core"               % "7.2.26"
    "org.typelevel"                    %% "macro-compat"              % "1.1.1"
    "com.chuusai"                      %% "shapeless"                 % "2.3.3"
    "org.json4s"                       %% "json4s-native"             % "3.6.1"

### Compiler plugins

Add in sbt using `addCompilerPlugin(...)`:

    "com.typesafe.genjavadoc"          %  "genjavadoc-plugin"          % "0.11"  cross CrossVersion.patch
    "com.lihaoyi"                      %% "acyclic"                    % "0.1.8"
    "org.spire-math"                   %  "kind-projector"             % "0.9.8" cross CrossVersion.patch

### sbt plugins

Most plugins do not need to be re-published for 2.13, but certain plugins did require changes.

Add using `addSbtPlugin(...)`:

    "org.scala-js"                      % "sbt-scalajs"               % "0.6.25"
    "org.wartremover"                   % "sbt-wartremover"           % "2.3.5"

### Pending

You can subscribe to these tickets to find out when a library you want becomes available:

#### new M5 tickets

* [scalacheck](https://github.com/rickynils/scalacheck/issues/418)
* [scalatest](https://github.com/scalatest/scalatest/issues/1409)
    * blocked by scalacheck
* [specs2](https://github.com/etorreborre/specs2/issues/709)
    * blocked by scalacheck
* [scala-logging](https://github.com/lightbend/scala-logging/issues/131)
    * blocked by scalatest
* [cats](https://github.com/typelevel/cats/issues/2389)
    * blocked by scalatest, ...?
* [scoverage](https://github.com/scoverage/scalac-scoverage-plugin/issues/234)
    * blocked by scalatest, scala-logging
* [minitest](https://github.com/monix/minitest/issues/23)
* [scala-parallel-collections](https://github.com/scala/scala-parallel-collections/issues/41)
* [zinc](https://github.com/sbt/zinc/pull/592)
    * blocked by scalacheck, scalatest, sbt-io, sbt-util-logging

#### Leftover tickets from M4 cycle

* [akka](https://github.com/akka/akka/issues/25105)
* [scalate](https://github.com/scalate/scalate/issues/133)
* [scalatra](https://github.com/scalatra/scalatra/issues/831)
* [twitter-util](https://github.com/twitter/util/issues/219)
* [twirl](https://github.com/playframework/twirl/issues/184)

## Available Projects for Scala 2.13.0-M4

See <https://github.com/scala/make-release-notes/blob/fbc273e6755dd284f0076ff92389a577edc2420b/projects-2.13.md>
