## Available Projects for Scala 2.13

Library maintainers, library users, please [edit this page](https://github.com/scala/make-release-notes/edit/2.13.x/projects-2.13.md) and let the world know what libraries are (or [aren't](https://github.com/scala/make-release-notes/blob/2.13.x/projects-2.13.md#pending)) available.

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

    "com.eed3si9n.expecty"             %% "expecty"                     % "0.11.0"       % Test
    "com.github.scalaprops"            %% "scalaprops"                  % "0.6.0"        % Test
    "com.lihaoyi"                      %% "utest"                       % "0.6.9"        % Test
    "com.whisk"                        %% "docker-testkit-scalatest"    % "0.9.9"        % Test
    "com.whisk"                        %% "docker-testkit-impl-spotify" % "0.9.9"        % Test
    "hedgehog"                         https://github.com/hedgehogqa/scala-hedgehog#sbt-binary-dependency // Bintray
    "org.scalacheck"                   %% "scalacheck"                  % "1.14.0"       % Test
    "org.scalatest"                    %% "scalatest"                   % "3.0.8"        % Test
    "org.scalatest"                    %% "scalatest"                   % "3.1.0-SNAP13" % Test
    "org.specs2"                       %% "specs2-core"                 % "4.5.1"        % Test
    "org.typelevel"                    %% "claimant"                    % "0.1.1"        % Test

### Other libraries

Add in sbt using `libraryDependencies += ...`:

    "com.chuusai"                            %% "shapeless"               % "2.3.3"
    "com.eed3si9n"                           %% "gigahorse-akka-http"     % "0.5.0"
    "com.eed3si9n"                           %% "gigahorse-asynchttpclient" % "0.5.0"
    "com.eed3si9n"                           %% "gigahorse-okhttp"        % "0.5.0"
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
    "com.iheart"                             %% "ficus"                   % "1.4.7"
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
    "com.typesafe.scala-logging"             %% "scala-logging"           % "3.9.2"
    "com.typesafe.slick"                     %% "slick"                   % "3.3.2"
    "io.argonaut"                            %% "argonaut"                % "6.2.3"
    "io.spray"                               %% "spray-json"              % "1.3.5"
    "io.suzaku"                              %% "boopickle"               % "1.3.1"
    "nl.grons"                               %% "metrics4-scala"          % "4.0.7"
    "org.clapper"                            %% "classutil"               % "1.5.1"
    "org.clapper"                            %% "grizzled-scala"          % "4.10.0"
    "org.foundweekends"                      %% "knockoff"                % "0.8.12"
    "org.json4s"                             %% "json4s-native"           % "3.6.6"
    "org.julienrf"                           %% "play-json-derived-codecs" % "5.0.0"
    "org.parboiled"                          %% "parboiled-scala"         % "1.3.1"
    "org.rogach"                             %% "scallop"                 % "3.3.1"
    "org.scala-js"                           %% "scalajs-stubs"           % "1.0.0"
    "org.scala-stm"                          %% "scala-stm"               % "0.9.1"
    "org.scalamacros"                        %% "resetallattrs"           % "1.0.0"
    "org.scalameta"                          %% "scalameta"               % "4.1.12"
    "org.scalameta"                          %% "semanticdb-scalac"       % "4.1.12"
    "org.scalaz"                             %% "scalaz-core"             % "7.2.27"
    "org.squeryl"                            %% "squeryl"                 % "0.9.14"
    "org.typelevel"                          %% "cats-core"               % "2.0.0-M4"
    "org.typelevel"                          %% "cats-effect"             % "2.0.0-M4"
    "org.typelevel"                          %% "cats-tagless-macros"     % "0.8"
    "org.typelevel"                          %% "machinist"               % "0.6.8"
    "org.typelevel"                          %% "spire"                   % "0.17.0-M1"
    "org.wvlet.airframe"                     %% "airframe"                % "19.6.1"
    "ws.unfiltered"                          %% "unfiltered-filter"       % "0.10.0-M4"
    "com.github.vagmcs"                      %% "optimus"                 % "3.2.0"
    "com.github.vagmcs"                      %% "optimus-solver-oj"       % "3.2.0"
    "com.github.vagmcs"                      %% "optimus-solver-lp"       % "3.2.0"
    "com.github.vagmcs"                      %% "optimus-solver-gurobi"   % "3.2.0"
    "com.github.vagmcs"                      %% "optimus-solver-mosek"    % "3.2.0"
    "com.lambdista"                          %% "config"                  % "0.6.0"
    "com.lambdista"                          %% "money"                   % "0.7.0"

### Compiler plugins

Add in sbt using `addCompilerPlugin(...)`:

    "com.github.cb372"               %  "scala-typed-holes"        % "0.0.9"    cross CrossVersion.full
    "com.github.ghik"                %% "silencer-plugin"          % "1.4.1"
    "com.github.tomasmikula"         %% "pascal"                   % "0.3.5"
    "com.lihaoyi"                    %% "acyclic"                  % "0.2.0"
    "com.olegpy"                     %% "better-monadic-for"       % "0.3.0"
    "com.sksamuel.scapegoat"         %% "scalac-scapegoat-plugin"  % "1.3.9"
    "com.typesafe.genjavadoc"        %  "genjavadoc-plugin"        % "0.13"     cross CrossVersion.patch
    "org.typelevel"                  %% "kind-projector"           % "0.10.3"

### sbt plugins

Most plugins do not need to be re-published for 2.13, but certain plugins did require changes.

Add using `addSbtPlugin(...)`:

    "org.scala-js"                      % "sbt-scalajs"               % "0.6.28"
    "org.scala-js"                      % "sbt-scalajs"               % "1.0.0-M8"
    "org.scoverage"                     % "sbt-scoverage"             % "1.6.0"
    "org.tpolecat"                      % "tut-plugin"                % "0.6.12"
    "org.wartremover"                   % "sbt-wartremover"           % "2.4.2"
    "org.wartremover"                   % "sbt-wartremover-contrib"   % "1.3.1"

### Pending

You can subscribe to these tickets to find out when a library you want becomes available:

* [base64](https://github.com/marklister/base64/pull/220)
* [dispatch](https://github.com/dispatch/reboot/issues/210)
* [http4s](https://github.com/http4s/http4s/pull/2493)
* [json-lenses](https://github.com/jrudolph/json-lenses/pull/32)
* [kafka](https://github.com/apache/kafka/pull/5454)
* [lagom](https://github.com/lagom/lagom/issues/1240)
* [mdoc](https://github.com/scalameta/mdoc/issues/156)
* [metaconfig](https://github.com/olafurpg/metaconfig/issues/71)
* [monadic-html](https://github.com/OlivierBlanvillain/monadic-html/issues/109)
* [monix](https://github.com/monix/monix/issues/862)
* [omnidoc](https://github.com/playframework/omnidoc/issues/24)
* [paiges](https://github.com/typelevel/paiges/issues/152)
* [playframework](https://github.com/playframework/playframework/issues/9260)
* [sbt-io](https://github.com/sbt/io/issues/244)
* [sbt-util](https://github.com/sbt/util/issues/201)
* [twitter-util](https://github.com/twitter/util/issues/219)
