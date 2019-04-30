## Available Projects for Scala 2.13.0-RC1

Library maintainers, library users, please [edit this page](https://github.com/scala/make-release-notes/edit/2.13.x/projects-2.13.md) and let the world know what libraries are available.

### Scaladex

Scaladex, the index of Scala libraries, now offers searching by target version:

* [All libraries for 2.13.0-RC1](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-RC1)
* [Scala modules for 2.13.0-RC1](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-RC1+AND+organization%3Ascala)
* [Testing frameworks for 2.13.0-RC1](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-RC1+AND+topics%3Atesting)
* [Compiler plugins for 2.13.0-RC1](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-RC1+AND+topics%3Acompiler-plugin)

You can also query [Maven Central](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.0-RC1/usages) or [Bintray](https://bintray.com/search?query=_2.13.0-RC1) for RC1 libraries.

### Scala modules

Add in sbt using `libraryDependencies += ...`:

    "org.scala-lang.modules"           %% "scala-async"                % "0.10.0"
    "org.scala-lang.modules"           %% "scala-collection-compat"    % "1.0.0"
    "org.scala-lang.modules"           %% "scala-parallel-collections" % "0.2.0"
    "org.scala-lang.modules"           %% "scala-parser-combinators"   % "1.1.2"
    "org.scala-lang.modules"           %% "scala-swing"                % "2.1.1"
    "org.scala-lang.modules"           %% "scala-xml"                  % "1.2.0"
    "org.scala-lang.modules"           %% "scala-java8-compat"         % "0.9.0"

### Testing libraries

Add in sbt using `libraryDependencies += ... % Test`:

    "com.eed3si9n.expecty"             %% "expecty"                   % "0.11.0"      % Test
    "com.github.scalaprops"            %% "scalaprops"                % "0.6.0"       % Test
    "com.lihaoyi"                      %% "utest"                     % "0.6.7"       % Test
    "org.mockito"                      %% "mockito-scala"             % "1.3.1"       % Test
    "org.scalacheck"                   %% "scalacheck"                % "1.14.0"      % Test
    "org.scalatest"                    %% "scalatest"                 % "3.0.8-RC2"   % Test
    "org.specs2"                       %% "specs2-core"               % "4.5.1"       % Test
    "org.typelevel"                    %% "discipline"                % "0.11.1"      % Test
    "org.typelevel"                    %% "discipline"                % "0.11.2-M1"   % Test
    "io.monix"                         %% "minitest"                  % "2.4.0"       % Test
    "hedgehog"                         https://github.com/hedgehogqa/scala-hedgehog#sbt-binary-dependency // Bintray

### Other libraries

Add in sbt using `libraryDependencies += ...`:

    "co.blocke"                              %% "scalajack"               % "6.0.1"      // Bintray
    "com.chuusai"                            %% "shapeless"               % "2.3.3"
    "com.github.mpilquist"                   %% "simulacrum"              % "0.16.0"
    "com.github.nscala-time"                 %% "nscala-time"             % "2.22.0"
    "com.github.plokhotnyuk.jsoniter-scala"  %% "jsoniter-scala-core"     % "0.45.0"
    "com.github.plokhotnyuk.jsoniter-scala"  %% "jsoniter-scala-macros"   % "0.45.0"     % Provided
    "com.github.scalaprops"                  %% "scalaprops-shapeless"    % "0.3.0"
    "com.github.scopt"                       %% "scopt"                   % "3.7.1"
    "com.github.xuwei-k"                     %% "msgpack4z-native"        % "0.3.5"
    "com.github.xuwei-k"                     %% "zeroapply"               % "0.2.2"
    "com.lihaoyi"                            %% "sourcecode"              % "0.1.6"
    "com.sizmek.fsi"                         %% "fsi-macros"              % "0.5.0"      // Bintray
    "com.sizmek.rtree2d"                     %% "rtree2d-core"            % "0.8.0"      // Bintray
    "com.typesafe.play"                      %% "cachecontrol"            % "1.1.6"
    "io.argonaut"                            %% "argonaut"                % "6.2.3"
    "io.spray"                               %% "spray-json"              % "1.3.5"
    "org.ekrich"                             %% "sconfig"                 % "0.7.6"
    "org.foundweekends"                      %% "knockoff"                % "0.8.11"
    "org.json4s"                             %% "json4s-native"           % "3.6.5"
    "org.portable-scala"                     %% "portable-scala-reflect"  % "0.1.0"
    "org.rogach"                             %% "scallop"                 % "3.2.0"
    "org.scala-js"                           %% "scalajs-stubs"           % "1.0.0-RC1"
    "org.scalaz"                             %% "scalaz-core"             % "7.2.27"
    "org.scodec"                             %% "scodec-bits"             % "1.1.10"
    "org.squeryl"                            %% "squeryl"                 % "0.9.13"
    "org.typelevel"                          %% "cats-core"               % "2.0.0-M1"
    "org.typelevel"                          %% "claimant"                % "0.1.0"
    "org.typelevel"                          %% "export-hook"             % "1.2.0"
    "org.typelevel"                          %% "jawn-parser"             % "0.14.2"
    "org.typelevel"                          %% "machinist"               % "0.6.7"
    "org.typelevel"                          %% "macro-compat"            % "1.1.1"
    "org.wvlet.airframe"                     %% "airframe"                % "19.4.1"
    "ws.unfiltered"                          %% "unfiltered-filter"       % "0.10.0-M3"

### Compiler plugins

Add in sbt using `addCompilerPlugin(...)`:

    "com.github.ghik"           %% "silencer-plugin"        % "1.3.3"
    "com.github.tomasmikula"    %% "pascal"                 % "0.3.2"
    "com.olegpy"                %% "better-monadic-for"     % "0.3.0"
    "com.typesafe.genjavadoc"   %  "genjavadoc-plugin"      % "0.13"     cross CrossVersion.patch
    "org.typelevel"             %  "kind-projector"         % "0.10.0"   cross CrossVersion.patch

### sbt plugins

Most plugins do not need to be re-published for 2.13, but certain plugins did require changes.

Add using `addSbtPlugin(...)`:

    "org.scala-js"                      % "sbt-scalajs"               % "0.6.27"
    "org.scala-js"                      % "sbt-scalajs"               % "1.0.0-M7"
    "org.wartremover"                   % "sbt-wartremover"           % "2.4.1"
    "org.wartremover"                   % "sbt-wartremover-contrib"   % "1.3.1"
    "io.github.davidgregory084"         % "sbt-tpolecat"              % "0.1.6"
    "com.typesafe.sbt"                  % "sbt-twirl"                 % "1.4.1"
    "org.tpolecat"                      % "tut-plugin"                % "0.6.11"
    "org.scoverage"                     % "sbt-scoverage"             % "1.6.0-RC1"

### Pending

You can subscribe to these tickets to find out when a library you want becomes available:

#### New RC1 tickets

* [scala-logging](https://github.com/lightbend/scala-logging/pull/159)
* [TwoTails](https://github.com/wheaties/TwoTails/pull/36)
* [catalysts](https://github.com/typelevel/catalysts/issues/27)
* [cats-effect](https://github.com/typelevel/cats-effect/issues/507)
* [log4s](https://github.com/Log4s/log4s/pull/32)
* [grizzled-scala](https://github.com/bmc/grizzled-scala/pull/17)
* [akka](https://github.com/akka/akka/issues/26691)
* [monix](https://github.com/monix/monix/issues/862)
  * blocked by cats-effect
* [blaze](https://github.com/http4s/blaze/pull/280)
  * blocked by scalac-scoverage-plugin
* [metrics-scala](https://github.com/erikvanoosten/metrics-scala/issues/139)
  * blocked by akka
* [kafka](https://github.com/apache/kafka/pull/5454)
  * blocked by scalac-scoverage-plugin, scala-logging
* [scalamock](https://github.com/paulbutcher/ScalaMock/pull/257)
* [ficus](https://github.com/iheartradio/ficus/pull/69)

#### Old M5/M4 tickets

Scala & sbt:

* [zinc](https://github.com/sbt/zinc/pull/592)
    * blocked by sbt-io, sbt-util-logging

Lightbend and related:

* [omnidoc](https://github.com/playframework/omnidoc/issues/24)
* [play-iteratees](https://github.com/playframework/play-iteratees/issues/16)
* [lagom](https://github.com/lagom/lagom/issues/1240)
* [akka-persistence-cassandra](https://github.com/akka/akka-persistence-cassandra/issues/364)
* [slick](https://github.com/slick/slick/issues/1958)
* [alpakka-kafka](https://github.com/akka/alpakka-kafka/issues/540)

Typelevel and related:

* [blaze](https://github.com/http4s/blaze/issues/274)
* [tsec](https://github.com/jmcardon/tsec/pull/207)
* [enumeratum-circe](https://github.com/lloydmeta/enumeratum/issues/216)
* [scala-pet-store](https://github.com/pauljamescleary/scala-pet-store/issues/141)
    * blocked by tsec, enumeratum-circe

Other:

* [gatling](https://github.com/gatling/gatling/issues/3566)
* [decline](https://github.com/bkirwi/decline/pull/47)
* [dispatch](https://github.com/dispatch/reboot/issues/210)
    * blocked by lift-json
* [lift-json](https://github.com/lift/framework/issues/1955)
* [scalapb](https://github.com/scalapb/ScalaPB/issues/540)
* [testz](https://github.com/scalaz/testz/issues/30)
* [kafka](https://github.com/apache/kafka/pull/5454)
* [mdoc](https://github.com/scalameta/mdoc/issues/156)
* [boopickle](https://github.com/suzaku-io/boopickle/issues/113)
* [scalatra](https://github.com/scalatra/scalatra/issues/831)
* [twitter-util](https://github.com/twitter/util/issues/219)

## Available Projects for Scala 2.13.0-M5

See <https://github.com/scala/make-release-notes/blob/825a2e1fc9024c731fd4fbdd5b93102100be629d/projects-2.13.md>
