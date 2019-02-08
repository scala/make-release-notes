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

    "org.scala-lang.modules"           %% "scala-async"               % "0.9.7"
    "org.scala-lang.modules"           %% "scala-collection-compat"   % "0.2.0"
    "org.scala-lang.modules"           %% "scala-java8-compat"        % "0.9.0"
    "org.scala-lang.modules"           %% "scala-parser-combinators"  % "1.1.1"
    "org.scala-lang.modules"           %% "scala-swing"               % "2.1.0"
    "org.scala-lang.modules"           %% "scala-xml"                 % "1.1.0"

### Testing libraries

Add in sbt using `libraryDependencies += ... % Test`:

    "com.eed3si9n.expecty"             %% "expecty"                   % "0.11.0"      % Test
    "com.github.scalaprops"            %% "scalaprops"                % "0.5.5"       % Test
    "com.lihaoyi"                      %% "utest"                     % "0.6.6"       % Test
    "io.monix"                         %% "minitest"                  % "2.2.2"       % Test
    "org.scalacheck"                   %% "scalacheck"                % "1.14.0"      % Test
    "org.scalatest"                    %% "scalatest"                 % "3.0.6-SNAP6" % Test
    "org.specs2"                       %% "specs2-core"               % "4.3.6"       % Test
    "org.typelevel"                    %% "discipline"                % "0.10.0"      % Test

### Other libraries

Add in sbt using `libraryDependencies += ...`:

    "ch.megard"                        %% "akka-http-cors"            % "0.3.4"
    "co.fs2"                           %% "fs2-core"                  % "1.0.3"
    "com.beachape"                     %% "enumeratum"                % "1.5.13"
    "com.chuusai"                      %% "shapeless"                 % "2.3.3"
    "com.github.julien-truffaut"       %% "monocle-core"              % "1.6.0-M1"
    "com.github.mpilquist"             %% "simulacrum"                % "0.14.0"
    "com.github.mpilquist"             %% "simulacrum"                % "0.14.0"
    "com.github.nscala-time"           %% "nscala-time"               % "2.20.0"
    "com.github.pathikrit"             %% "better-files"              % "3.7.0"
    "com.github.scopt"                 %% "scopt"                     % "3.7.1"
    "com.github.xuwei-k"               %% "msgpack4z-core"            % "0.3.5"
    "com.github.xuwei-k"               %% "zeroapply"                 % "0.2.2"
    "com.lightbend"                    %% "emoji"                     % "1.2.1"
    "com.lihaoyi"                      %% "sourcecode"                % "0.1.5"
    "com.typesafe"                     %% "ssl-config-core"           % "0.3.7"
    "com.typesafe.akka"                %% "akka-actor"                % "2.5.19"
    "com.typesafe.akka"                %% "akka-cluster"              % "2.5.19"
    "com.typesafe.akka"                %% "akka-http"                 % "10.1.7"
    "com.typesafe.akka"                %% "akka-stream"               % "2.5.19"
    "com.typesafe.play"                %% "cachecontrol"              % "1.1.5"
    "com.typesafe.play"                %% "play-doc"                  % "2.0.0-RC1"
    "com.typesafe.play"                %% "play-json"                 % "2.7.0-RC1"
    "com.typesafe.play"                %% "play-server"               % "2.7.0"
    "com.typesafe.play"                %% "play-ws"                   % "2.0.1"
    "com.typesafe.scala-logging"       %% "scala-logging"             % "3.9.0"
    "eu.timepit"                       %% "refined"                   % "0.9.3"
    "eu.timepit"                       %% "singleton-ops"             % "0.3.1"
    "io.circe"                         %% "circe-core"                % "0.11.0"
    "io.github.cquiroz"                %% "scala-java-time"           % "2.0.0-RC1"
    "io.spray"                         %% "spray-json"                % "1.3.4"
    "nl.grons"                         %% "metrics4-scala"            % "4.0.4"
    "org.json4s"                       %% "json4s-native"             % "3.6.1"
    "org.log4s"                        %% "log4s"                     % "1.7.0"
    "org.portable-scala"               %% "portable-scala-reflect"    % "0.1.0"
    "org.scala-stm"                    %% "scala-stm"                 % "0.9"
    "org.scalactic"                    %% "scalactic"                 % "3.0.6-SNAP3"
    "org.scalariform"                  %% "scalariform"               % "0.2.7"
    "org.scalatra.scalate"             %% "scalate-core"              % "1.9.1-RC1"
    "org.scalaz"                       %% "scalaz-core"               % "7.2.26"
    "org.scodec"                       %% "scodec-bits"               % "1.1.7"
    "org.tpolecat"                     %% "doobie-core"               % "0.7.0-M2"
    "org.typelevel"                    %% "algebra"                   % "1.0.1"
    "org.typelevel"                    %% "catalysts"                 % "0.8"
    "org.typelevel"                    %% "cats-core"                 % "1.5.0-RC1"
    "org.typelevel"                    %% "cats-effect"               % "1.1.0"
    "org.typelevel"                    %% "jawn-parser"               % "0.14.0"
    "org.typelevel"                    %% "machinist"                 % "0.6.6"
    "org.typelevel"                    %% "macro-compat"              % "1.1.1"
    "org.wvlet.airframe"               %% "airframe"                  % "0.72"
    "ws.unfiltered"                    %% "unfiltered"                % "0.10.0-M2"

### Compiler plugins

Add in sbt using `addCompilerPlugin(...)`:

    "com.lihaoyi"                      %% "acyclic"                    % "0.1.8"
    "com.olegpy"                       %% "better-monadic-for"         % "0.3.0-M4"
    "com.typesafe.genjavadoc"          %  "genjavadoc-plugin"          % "0.11"  cross CrossVersion.patch
    "org.spire-math"                   %  "kind-projector"             % "0.9.8" cross CrossVersion.patch
    "com.github.ghik"                  %% "silencer-plugin"            % "1.3.1"

### sbt plugins

Most plugins do not need to be re-published for 2.13, but certain plugins did require changes.

Add using `addSbtPlugin(...)`:

    "com.typesafe.sbt"                  % "sbt-twirl"                 % "1.4.0-RC1"
    "org.scala-js"                      % "sbt-scalajs"               % "0.6.25"
    "org.scala-js"                      % "sbt-scalajs"               % "1.0.0-M6"
    "org.scoverage"                     % "sbt-scoverage"             % "1.6.0-M5"
    "org.wartremover"                   % "sbt-wartremover"           % "2.3.5"

### Pending

You can subscribe to these tickets to find out when a library you want becomes available:

#### New M5 tickets

Scala & sbt:

* [scala-parallel-collections](https://github.com/scala/scala-parallel-collections/issues/41)
    * there will be no 2.13.0-M5 release; we will publish for 2.13.0-RC1
* [zinc](https://github.com/sbt/zinc/pull/592)
    * blocked by sbt-io, sbt-util-logging

Lightbend and related:

* [omnidoc](https://github.com/playframework/omnidoc/issues/24)
* [play-file-watch](https://github.com/playframework/play-file-watch/issues/27)
* [play-iteratees](https://github.com/playframework/play-iteratees/issues/16)
* [lagom](https://github.com/lagom/lagom/issues/1240)
* [akka-persistence-cassandra](https://github.com/akka/akka-persistence-cassandra/issues/364)

Typelevel and related:

* [spire](https://github.com/non/spire/issues/742)
* [monix](https://github.com/monix/monix/issues/786)
* [http4s](https://github.com/http4s/http4s/issues/2025)
* [tsec](https://github.com/jmcardon/tsec/pull/207)
* [enumeratum-circe](https://github.com/lloydmeta/enumeratum/issues/216)
* [scala-pet-store](https://github.com/pauljamescleary/scala-pet-store/issues/141)
    * blocked by http4s, tsec, enumeratum-circe

Other:

* [gatling](https://github.com/gatling/gatling/issues/3566)
* [decline](https://github.com/bkirwi/decline/pull/47)
* [dispatch](https://github.com/dispatch/reboot/issues/210)
    * blocked by lift-json
* [lift-json](https://github.com/lift/framework/issues/1955)
* [scalapb](https://github.com/scalapb/ScalaPB/issues/540)
* [testz](https://github.com/scalaz/testz/issues/30)

#### Leftover M4 tickets

* [scalatra](https://github.com/scalatra/scalatra/issues/831)
* [twitter-util](https://github.com/twitter/util/issues/219)

## Available Projects for Scala 2.13.0-M4

See <https://github.com/scala/make-release-notes/blob/fbc273e6755dd284f0076ff92389a577edc2420b/projects-2.13.md>
