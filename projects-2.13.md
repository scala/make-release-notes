## Available Projects for Scala 2.13.0-RC3

Library maintainers, library users, please [edit this page](https://github.com/scala/make-release-notes/edit/2.13.x/projects-2.13.md) and let the world know what libraries are available.

### Scaladex

Scaladex, the index of Scala libraries, now offers searching by target version:

* [All libraries for 2.13.0-RC3](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-RC3)
* [Scala modules for 2.13.0-RC3](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-RC3+AND+organization%3Ascala)
* [Testing frameworks for 2.13.0-RC3](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-RC3+AND+topics%3Atesting)
* [Compiler plugins for 2.13.0-RC3](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-RC3+AND+topics%3Acompiler-plugin)

You can also query [Maven Central](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.0-RC3/usages) or [Bintray](https://bintray.com/search?query=_2.13.0-RC3) for RC3 libraries.

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
    "hedgehog"                         https://github.com/hedgehogqa/scala-hedgehog#sbt-binary-dependency // Bintray
    "org.scalacheck"                   %% "scalacheck"               % "1.14.0"       % Test
    "org.scalatest"                    %% "scalatest"                % "3.0.8-RC5"    % Test
    "org.scalatest"                    %% "scalatest"                % "3.1.0-SNAP12" % Test
    "org.scalatestplus"                %% "scalatestplus-scalacheck" % "1.0.0-SNAP7"  % Test
    "org.specs2"                       %% "specs2-core"              % "4.5.1"        % Test
    "org.typelevel"                    %% "claimant"                 % "0.1.1"        % Test
    "org.typelevel"                    %% "discipline-scalatest"     % "0.12.0-M2"    % Test
    "org.typelevel"                    %% "discipline-specs2"        % "0.12.0-M2"    % Test

### Other libraries

Add in sbt using `libraryDependencies += ...`:

    "com.chuusai"                            %% "shapeless"               % "2.3.3"
    "com.github.nscala-time"                 %% "nscala-time"             % "2.22.0"
    "com.github.plokhotnyuk.jsoniter-scala"  %% "jsoniter-scala-core"     % "0.49.0"
    "com.github.plokhotnyuk.jsoniter-scala"  %% "jsoniter-scala-macros"   % "0.49.0"     % Provided
    "eu.timepit"                             %% "refined"                 % "0.9.7"
    "io.spray"                               %% "spray-json"              % "1.3.5"
    "org.json4s"                             %% "json4s-native"           % "3.6.6"
    "org.rogach"                             %% "scallop"                 % "3.3.0"
    "org.scala-js"                           %% "scalajs-stubs"           % "1.0.0-RC1"
    "org.typelevel"                          %% "cats-core"               % "2.0.0-M3"
    "org.typelevel"                          %% "cats-effect"             % "2.0.0-M3"
    "org.typelevel"                          %% "jawn-ast"                % "0.14.2"
    "org.typelevel"                          %% "jawn-parser"             % "0.14.2"
    "org.typelevel"                          %% "machinist"               % "0.6.8"
    "org.typelevel"                          %% "simulacrum"              % "0.18.0"
    "org.wvlet.airframe"                     %% "airframe"                % "19.5.2"

### Compiler plugins

Add in sbt using `addCompilerPlugin(...)`:

    "com.github.ghik"           %% "silencer-plugin"          % "1.4.0"
    "com.github.tomasmikula"    %% "pascal"                   % "0.3.4"
    "com.typesafe.genjavadoc"   %  "genjavadoc-plugin"        % "0.13"     cross CrossVersion.patch
    "org.typelevel"             %% "kind-projector"           % "0.10.2"

### sbt plugins

Most plugins do not need to be re-published for 2.13, but certain plugins did require changes.

Add using `addSbtPlugin(...)`:

    "org.scala-js"                      % "sbt-scalajs"               % "0.6.28"
    "org.scala-js"                      % "sbt-scalajs"               % "1.0.0-M8"
    "org.wartremover"                   % "sbt-wartremover"           % "2.4.2"
    "org.wartremover"                   % "sbt-wartremover-contrib"   % "1.3.1"

### Pending

You can subscribe to these tickets to find out when a library you want becomes available:

#### New RC3 tickets

* [akka](https://github.com/akka/akka/issues/27049)

#### Old RC2/RC1/M5/M4 tickets

Scala & sbt:

* [zinc](https://github.com/sbt/zinc/pull/592)

Lightbend and related:

* [omnidoc](https://github.com/playframework/omnidoc/issues/24)
* [play-iteratees](https://github.com/playframework/play-iteratees/issues/16)
* [lagom](https://github.com/lagom/lagom/issues/1240)
* [akka-persistence-cassandra](https://github.com/akka/akka-persistence-cassandra/issues/364)
* [alpakka-kafka](https://github.com/akka/alpakka-kafka/issues/540)

Typelevel and related:

* [paiges](https://github.com/typelevel/paiges/issues/152)
* [http4s](https://github.com/http4s/http4s/pull/2493)
* [blaze](https://github.com/http4s/blaze/issues/274)
* [tsec](https://github.com/jmcardon/tsec/pull/207)
* [enumeratum-circe](https://github.com/lloydmeta/enumeratum/issues/216)
* [scala-pet-store](https://github.com/pauljamescleary/scala-pet-store/issues/141)
* [catalysts](https://github.com/typelevel/catalysts/issues/27)
* [monix](https://github.com/monix/monix/issues/862)
* [blaze](https://github.com/http4s/blaze/pull/280)
* [doobie](https://github.com/tpolecat/doobie/issues/898)

Other:

* [gatling](https://github.com/gatling/gatling/issues/3566)
* [decline](https://github.com/bkirwi/decline/pull/47)
* [dispatch](https://github.com/dispatch/reboot/issues/210)
* [lift-json](https://github.com/lift/framework/issues/1955)
* [testz](https://github.com/scalaz/testz/issues/30)
* [mdoc](https://github.com/scalameta/mdoc/issues/156)
* [scalatra](https://github.com/scalatra/scalatra/issues/831)
* [twitter-util](https://github.com/twitter/util/issues/219)
* [scala-logging](https://github.com/lightbend/scala-logging/pull/159)
* [TwoTails](https://github.com/wheaties/TwoTails/pull/36)
* [grizzled-scala](https://github.com/bmc/grizzled-scala/pull/17)
* [kafka](https://github.com/apache/kafka/pull/5454)
* [scalamock](https://github.com/paulbutcher/ScalaMock/pull/257)
* [scala-records](https://github.com/scala-records/scala-records/pull/139)
* [sealerate](https://github.com/mrvisser/sealerate/pull/16)
* [scalameta](https://github.com/scalameta/scalameta/issues/1695)

## Available Projects for Scala 2.13.0-RC2

See <https://github.com/scala/make-release-notes/blob/f22d70b374897027ce62d05544e78395eba4b101/projects-2.13.md>

## Available Projects for Scala 2.13.0-RC1

See <https://github.com/scala/make-release-notes/blob/2c5e4054f221176b5bdcc438c3dd207fb5bfed86/projects-2.13.md>
