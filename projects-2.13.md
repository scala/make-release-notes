## Available Projects for Scala 2.13.0-RC1

Library maintainers, library users, please [edit this page](https://github.com/scala/make-release-notes/edit/2.13.x/projects-2.13.md) and let the world know what libraries are available.

### Scaladex

Scaladex, the index of Scala libraries, now offers searching by target version:

* [All libraries for 2.13.0-RC1](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-RC1)
* [Scala modules for 2.13.0-RC1](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-RC1+AND+organization%3Ascala)
* [Testing frameworks for 2.13.0-RC1](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-RC1+AND+topics%3Atesting)
* [Compiler plugins for 2.13.0-RC1](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0-RC1+AND+topics%3Acompiler-plugin)

You can also [query Maven Central](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.0-RC1/usages) for RC1 libraries.

### Scala modules

Add in sbt using `libraryDependencies += ...`:

    (coming soon)

### Testing libraries

Add in sbt using `libraryDependencies += ... % Test`:

    (coming soon)

### Other libraries

Add in sbt using `libraryDependencies += ...`:

    "com.lihaoyi"                      %% "sourcecode"                % "0.1.5"

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

#### New RC1 tickets

* [scala-xml](https://github.com/scala/scala-xml/issues/276)
* [other Scala modules](https://github.com/scala/bug/issues/11471)
* [scalacheck](https://github.com/rickynils/scalacheck/issues/464)
* [scalatest](https://github.com/scalatest/scalatest/issues/1567)
  * blocked by scala-xml
* [specs2](https://github.com/etorreborre/specs2/issues/735)
* [claimant](https://github.com/non/claimant/issues/4)
* [kind-projector](https://github.com/non/kind-projector/issues/99)
* [silencer](https://github.com/ghik/silencer/issues/25)

#### Old M5/M4 tickets

Scala & sbt:

* [scala-parallel-collections](https://github.com/scala/scala-parallel-collections/issues/41)
    * there will be no 2.13.0-M5 release; we will publish for 2.13.0-RC1
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

* [monix](https://github.com/monix/monix/issues/786)
* [http4s](https://github.com/http4s/http4s/issues/2025)
  * blocked by blaze, boopickle
* [blaze](https://github.com/http4s/blaze/issues/274)
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
* [kafka](https://github.com/apache/kafka/pull/5454)
* [mdoc](https://github.com/scalameta/mdoc/issues/156)
* [boopickle](https://github.com/suzaku-io/boopickle/issues/113)
* [scalatra](https://github.com/scalatra/scalatra/issues/831)
* [twitter-util](https://github.com/twitter/util/issues/219)

## Available Projects for Scala 2.13.0-M5

See <https://github.com/scala/make-release-notes/blob/825a2e1fc9024c731fd4fbdd5b93102100be629d/projects-2.13.md>
