## Available Projects for Scala 2.13

Library maintainers, library users, please [edit this page](https://github.com/scala/make-release-notes/edit/2.13.x/projects-2.13.md) and let the world know what libraries are (or [aren't](https://github.com/scala/make-release-notes/blob/2.13.x/projects-2.13.md#pending)) available.

### Scaladex

Scaladex, the index of Scala libraries, now offers searching by target version:

* [All libraries for 2.13](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0)
* [Scala modules for 2.13](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0+AND+organization%3Ascala)
* [Testing frameworks for 2.13](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0+AND+topics%3Atesting)
* [Compiler plugins for 2.13](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0+AND+topics%3Acompiler-plugin)

You can also query [Maven Central](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.0/usages) or [Bintray](https://bintray.com/search?query=_2.13.0) for 2.13 libraries.

### Scala modules

Add in sbt using `libraryDependencies += ...`:

    "org.scala-lang.modules"           %% "scala-async"                % "0.10.0"
    "org.scala-lang.modules"           %% "scala-collection-compat"    % "2.0.0"
    "org.scala-lang.modules"           %% "scala-java8-compat"         % "0.9.0"
    "org.scala-lang.modules"           %% "scala-parallel-collections" % "0.2.0"
    "org.scala-lang.modules"           %% "scala-parser-combinators"   % "1.1.2"
    "org.scala-lang.modules"           %% "scala-swing"                % "2.1.1"
    "org.scala-lang.modules"           %% "scala-xml"                  % "1.2.0"

### Testing libraries

Add in sbt using `libraryDependencies += ... % Test`:

    "com.eed3si9n.expecty"             %% "expecty"                  % "0.11.0"       % Test
    "com.github.scalaprops"            %% "scalaprops"               % "0.6.0"        % Test
    "com.lihaoyi"                      %% "utest"                    % "0.6.9"        % Test
    "hedgehog"                         https://github.com/hedgehogqa/scala-hedgehog#sbt-binary-dependency // Bintray
    "org.scalacheck"                   %% "scalacheck"               % "1.14.0"       % Test
    "org.scalatest"                    %% "scalatest"                % "3.0.8"        % Test
    "org.scalatest"                    %% "scalatest"                % "3.1.0-SNAP13" % Test
    "org.specs2"                       %% "specs2-core"              % "4.5.1"        % Test
    "org.typelevel"                    %% "claimant"                 % "0.1.1"        % Test

### Other libraries

Add in sbt using `libraryDependencies += ...`:

    "com.chuusai"                            %% "shapeless"               % "2.3.3"
    "com.github.mpilquist"                   %% "simulacrum"              % "0.19.0"
    "com.github.nscala-time"                 %% "nscala-time"             % "2.22.0"
    "com.github.plokhotnyuk.fsi"             %% "fsi-macros"              % "0.6.0"
    "com.github.plokhotnyuk.jsoniter-scala"  %% "jsoniter-scala-core"     % "0.50.0"
    "com.github.plokhotnyuk.jsoniter-scala"  %% "jsoniter-scala-macros"   % "0.50.0"      % Provided
    "com.github.plokhotnyuk.rtree2d"         %% "rtree2d-core"            % "0.9.0"
    "com.github.scalaprops"                  %% "scalaprops-shapeless"    % "0.3.1"
    "com.github.scopt"                       %% "scopt"                   % "3.7.1"
    "com.github.xuwei-k"                     %% "applybuilder"            % "0.2.4"
    "com.github.xuwei-k"                     %% "iarray"                  % "0.5.0"
    "com.github.xuwei-k"                     %% "msgpack4z-argonaut"      % "0.5.3"
    "com.github.xuwei-k"                     %% "msgpack4z-core"          % "0.3.10"
    "com.github.xuwei-k"                     %% "msgpack4z-native"        % "0.3.5"
    "com.github.xuwei-k"                     %% "nobox"                   % "0.3.0"
    "com.github.xuwei-k"                     %% "optparse-applicative"    % "0.8.1"
    "com.github.xuwei-k"                     %% "zeroapply"               % "0.2.3"
    "com.lihaoyi"                            %% "fansi"                   % "0.2.7"
    "com.lihaoyi"                            %% "fastparse"               % "2.1.3"
    "com.lihaoyi"                            %% "geny"                    % "0.1.8"
    "com.lihaoyi"                            %% "os-lib"                  % "0.3.0"
    "com.lihaoyi"                            %% "pprint"                  % "0.5.5"
    "com.lihaoyi"                            %% "requests-scala"          % "0.2.0"
    "com.lihaoyi"                            %% "scalatags"               % "0.7.0"
    "com.lihaoyi"                            %% "sourcecode"              % "0.1.7"
    "com.lihaoyi"                            %% "ujson"                   % "0.7.5"
    "com.lihaoyi"                            %% "upack"                   % "0.7.5"
    "com.lihaoyi"                            %% "upickle"                 % "0.7.5"
    "com.typesafe"                           %% "ssl-config-core"         % "0.4.0"
    "com.typesafe.akka"                      %% "akka-actor"              % "2.5.23"
    "com.typesafe.akka"                      %% "akka-cluster"            % "2.5.23"
    "com.typesafe.akka"                      %% "akka-discovery"          % "2.5.23"
    "com.typesafe.akka"                      %% "akka-http"               % "10.1.8"
    "com.typesafe.akka"                      %% "akka-persistence"        % "2.5.23"
    "com.typesafe.akka"                      %% "akka-stream"             % "2.5.23"
    "io.argonaut"                            %% "argonaut"                % "6.2.3"
    "io.spray"                               %% "spray-json"              % "1.3.5"
    "nl.grons"                               %% "metrics4-scala"          % "4.0.7"
    "org.foundweekends"                      %% "knockoff"                % "0.8.12"
    "org.json4s"                             %% "json4s-native"           % "3.6.6"
    "org.julienrf"                           %% "play-json-derived-codecs" % "5.0.0"
    "org.rogach"                             %% "scallop"                 % "3.3.0"
    "org.scala-js"                           %% "scalajs-stubs"           % "1.0.0"
    "org.scala-stm"                          %% "scala-stm"               % "0.9.1"
    "org.scalaz"                             %% "scalaz-core"             % "7.2.27"
    "org.squeryl"                            %% "squeryl"                 % "0.9.14"
    "org.typelevel"                          %% "cats-core"               % "2.0.0-M4"
    "org.typelevel"                          %% "cats-effect"             % "2.0.0-M4"
    "org.typelevel"                          %% "machinist"               % "0.6.8"
    "org.wvlet.airframe"                     %% "airframe"                % "19.6.1"
    "ws.unfiltered"                          %% "unfiltered-filter"       % "0.10.0-M4"

### Compiler plugins

Add in sbt using `addCompilerPlugin(...)`:

    "com.github.ghik"                %% "silencer-plugin"          % "1.4.1"
    "com.lihaoyi"                    %% "acyclic"                  % "0.2.0"
    "com.olegpy"                     %% "better-monadic-for"       % "0.3.0"
    "com.typesafe.genjavadoc"        %  "genjavadoc-plugin"        % "0.13"     cross CrossVersion.patch
    "org.typelevel"                  %% "kind-projector"           % "0.10.3"

### sbt plugins

Most plugins do not need to be re-published for 2.13, but certain plugins did require changes.

Add using `addSbtPlugin(...)`:

    "org.scala-js"                      % "sbt-scalajs"               % "0.6.28"
    "org.scala-js"                      % "sbt-scalajs"               % "1.0.0-M8"
    "org.tpolecat"                      % "tut-plugin"                % "0.6.12"
    "org.wartremover"                   % "sbt-wartremover"           % "2.4.2"
    "org.wartremover"                   % "sbt-wartremover-contrib"   % "1.3.1"

### Pending

You can subscribe to these tickets to find out when a library you want becomes available:

* [http4s](https://github.com/http4s/http4s/pull/2493)
* [kafka](https://github.com/apache/kafka/pull/5454)
* [lagom](https://github.com/lagom/lagom/issues/1240)
* [mdoc](https://github.com/scalameta/mdoc/issues/156)
* [monix](https://github.com/monix/monix/issues/862)
* [omnidoc](https://github.com/playframework/omnidoc/issues/24)
* [playframework](https://github.com/playframework/playframework/issues/9260)
* [scalameta](https://github.com/scalameta/scalameta/issues/1873)
* [spire](https://github.com/typelevel/spire/issues/805)
* [twitter-util](https://github.com/twitter/util/issues/219)
