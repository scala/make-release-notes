## Available Projects for Scala 2.13.0-RC2

Library maintainers, library users, please [edit this page](https://github.com/scala/make-release-notes/edit/2.13.x/projects-2.13.md) and let the world know what libraries are available.

### Scaladex

Scaladex, the index of Scala libraries, now offers searching by target version:

* [All libraries for 2.13.0-RC2](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-RC2)
* [Scala modules for 2.13.0-RC2](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-RC2+AND+organization%3Ascala)
* [Testing frameworks for 2.13.0-RC2](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-RC2+AND+topics%3Atesting)
* [Compiler plugins for 2.13.0-RC2](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-RC2+AND+topics%3Acompiler-plugin)

You can also query [Maven Central](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.0-RC2/usages) or [Bintray](https://bintray.com/search?query=_2.13.0-RC2) for RC2 libraries.

### Scala modules

Add in sbt using `libraryDependencies += ...`:

    "org.scala-lang.modules"           %% "scala-swing"                % "2.1.1"
    "org.scala-lang.modules"           %% "scala-xml"                  % "1.2.0"

### Testing libraries

Add in sbt using `libraryDependencies += ... % Test`:

    (coming soon)

### Other libraries

Add in sbt using `libraryDependencies += ...`:

    "org.scala-js"                           %% "scalajs-stubs"           % "1.0.0-RC1"

### Compiler plugins

Add in sbt using `addCompilerPlugin(...)`:

    (coming soon)

### sbt plugins

Most plugins do not need to be re-published for 2.13, but certain plugins did require changes.

Add using `addSbtPlugin(...)`:

    "org.scala-js"                      % "sbt-scalajs"               % "0.6.27"
    "org.scala-js"                      % "sbt-scalajs"               % "1.0.0-M7"

### Pending

You can subscribe to these tickets to find out when a library you want becomes available:

#### New RC2 tickets

* [scala-parser-combinators](https://github.com/scala/scala-parser-combinators/issues/211)

#### Old RC1/M5/M4 tickets

Scala & sbt:

* [zinc](https://github.com/sbt/zinc/pull/592)

Lightbend and related:

* [omnidoc](https://github.com/playframework/omnidoc/issues/24)
* [play-iteratees](https://github.com/playframework/play-iteratees/issues/16)
* [lagom](https://github.com/lagom/lagom/issues/1240)
* [akka-persistence-cassandra](https://github.com/akka/akka-persistence-cassandra/issues/364)
* [alpakka-kafka](https://github.com/akka/alpakka-kafka/issues/540)
* [akka-http](https://github.com/akka/akka-http/issues/2515)

Typelevel and related:

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
* [log4s](https://github.com/Log4s/log4s/pull/32)
* [grizzled-scala](https://github.com/bmc/grizzled-scala/pull/17)
* [kafka](https://github.com/apache/kafka/pull/5454)
* [scalamock](https://github.com/paulbutcher/ScalaMock/pull/257)
* [scala-records](https://github.com/scala-records/scala-records/pull/139)
* [sealerate](https://github.com/mrvisser/sealerate/pull/16)
* [scalameta](https://github.com/scalameta/scalameta/issues/1695)

## Available Projects for Scala 2.13.0-RC1

See <https://github.com/scala/make-release-notes/blob/2c5e4054f221176b5bdcc438c3dd207fb5bfed86/projects-2.13.md>
