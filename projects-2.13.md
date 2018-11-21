## Available Projects for Scala 2.13.0-M5

Library maintainers, library users, please [edit this page](https://github.com/scala/make-release-notes/edit/2.13.x/projects-2.13.md) and let the world know what libraries are available.

### Scaladex

Scaladex, the index of Scala libraries, now offers searching by target version:

* [All libraries for 2.13.0-M5](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-M5)
* [Scala modules for 2.13.0-M5](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-M5+AND+organization%3Ascala)
* [Testing frameworks for 2.13.0-M5](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-M5+AND+topics%3Atesting)
* [Compiler plugins for 2.13.0-M5](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-M5+AND+topics%3Acompiler-plugin)

You can also [query Maven Central](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.0-M5/usages) for M5 libraries.

### Scala modules

Add in sbt using `libraryDependencies += ...`:

    "org.scala-lang.modules"           %% "scala-collection-compat"   % "0.2.0"
    "org.scala-lang.modules"           %% "scala-java8-compat"        % "0.9.0"
    "org.scala-lang.modules"           %% "scala-parser-combinators"  % "1.1.1"
    "org.scala-lang.modules"           %% "scala-xml"                 % "1.1.0"

### Testing libraries

Add in sbt using `libraryDependencies += ... % Test`:

    "com.eed3si9n.expecty"             %% "expecty"                   % "0.11.0"      % Test
    "com.github.scalaprops"            %% "scalaprops"                % "0.5.5"       % Test
    "com.lihaoyi"                      %% "utest"                     % "0.6.6"       % Test
    "org.scalacheck"                   %% "scalacheck"                % "1.14.0"      % Test
    "org.scalatest"                    %% "scalatest"                 % "3.0.6-SNAP4" % Test
    "org.specs2"                       %% "specs2-core"               % "4.3.5"       % Test
    "org.typelevel"                    %% "discipline"                % "0.10.0"      % Test
    "io.monix"                         %% "minitest"                  % "2.2.2"       % Test

### Other libraries

Add in sbt using `libraryDependencies += ...`:

    "com.chuusai"                      %% "shapeless"                 % "2.3.3"
    "com.github.nscala-time"           %% "nscala-time"               % "2.20.0"
    "com.github.xuwei-k"               %% "msgpack4z-core"            % "0.3.5"
    "com.github.xuwei-k"               %% "zeroapply"                 % "0.2.2"
    "com.lightbend"                    %% "emoji"                     % "1.2.1"
    "eu.timepit"                       %% "singleton-ops"             % "0.3.1"
    "io.spray"                         %% "spray-json"                % "1.3.4"
    "org.json4s"                       %% "json4s-native"             % "3.6.1"
    "org.portable-scala"               %% "portable-scala-reflect"    % "0.1.0"
    "org.scalactic"                    %% "scalactic"                 % "3.0.6-SNAP3"
    "org.scalaz"                       %% "scalaz-core"               % "7.2.26"
    "org.typelevel"                    %% "machinist"                 % "0.6.6"
    "org.typelevel"                    %% "macro-compat"              % "1.1.1"
    "ws.unfiltered"                    %% "unfiltered"                % "0.10.0-M2"
    "com.github.mpilquist"             %% "simulacrum"                % "0.14.0"
    "com.beachape"                     %% "enumeratum"                % "1.5.13"
    "com.github.mpilquist"             %% "simulacrum"                % "0.14.0"
    "org.scalatra.scalate"             %% "scalate-core"              % "1.9.1-RC1"
    "com.typesafe.scala-logging"       %% "scala-logging"             % "3.9.0"
    "org.wvlet.airframe"               %% "airframe"                  % "0.72"
    "org.typelevel"                    %% "catalysts"                 % "0.8"
    "eu.timepit"                       %% "refined"                   % "0.9.3"
    "com.typesafe"                     %% "ssl-config-core"           % "0.3.7"
    "org.typelevel"                    %% "cats-core"                 % "1.5.0-RC1"

### Compiler plugins

Add in sbt using `addCompilerPlugin(...)`:

    "com.lihaoyi"                      %% "acyclic"                    % "0.1.8"
    "com.typesafe.genjavadoc"          %  "genjavadoc-plugin"          % "0.11"  cross CrossVersion.patch
    "org.spire-math"                   %  "kind-projector"             % "0.9.8" cross CrossVersion.patch

### sbt plugins

Most plugins do not need to be re-published for 2.13, but certain plugins did require changes.

Add using `addSbtPlugin(...)`:

    "org.scala-js"                      % "sbt-scalajs"               % "0.6.25"
    "org.scala-js"                      % "sbt-scalajs"               % "1.0.0-M6"
    "org.wartremover"                   % "sbt-wartremover"           % "2.3.5"
    "org.scoverage"                     % "sbt-scoverage"             % "1.6.0-M5"
    "com.typesafe.sbt"                  % "sbt-twirl"                 % "1.4.0-RC1"

### Pending

You can subscribe to these tickets to find out when a library you want becomes available:

#### New M5 tickets

Scala & sbt:

* [scala-parallel-collections](https://github.com/scala/scala-parallel-collections/issues/41)
* [zinc](https://github.com/sbt/zinc/pull/592)
    * blocked by sbt-io, sbt-util-logging

Lightbend:

* [akka](https://github.com/akka/akka/issues/25105)
* [play-doc](https://github.com/playframework/play-doc/issues/41)
* [play-ws](https://github.com/playframework/play-ws/issues/274)
* most other projects, including the rest of Play and Lagom, are blocked by Akka for now

Typelevel:

* [algebra](https://github.com/typelevel/algebra/issues/219)
* [spire](https://github.com/non/spire/issues/742)
    * blocked by algebra

Other:

* [gatling](https://github.com/gatling/gatling/issues/3566)
* [monocle](https://github.com/julien-truffaut/Monocle/issues/596)

#### Leftover M4 tickets

* [scala-stm](https://github.com/scala-stm/scala-stm/pull/5)
* [scalatra](https://github.com/scalatra/scalatra/issues/831)
* [twitter-util](https://github.com/twitter/util/issues/219)

## Available Projects for Scala 2.13.0-M4

See <https://github.com/scala/make-release-notes/blob/fbc273e6755dd284f0076ff92389a577edc2420b/projects-2.13.md>
