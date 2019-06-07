## Available Projects for Scala 2.13

Library maintainers, library users, please [edit this page](https://github.com/scala/make-release-notes/edit/2.13.x/projects-2.13.md) and let the world know what libraries are available.

### Scaladex

Scaladex, the index of Scala libraries, now offers searching by target version:

* [All libraries for 2.13](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0)
* [Scala modules for 2.13](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0+AND+organization%3Ascala)
* [Testing frameworks for 2.13](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0+AND+topics%3Atesting)
* [Compiler plugins for 2.13](https://index.scala-lang.org/search?q=fullScalaVersion%3A2.13.0+AND+topics%3Acompiler-plugin)

You can also query [Maven Central](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.0/usages) or [Bintray](https://bintray.com/search?query=_2.13.0) for 2.13 libraries.

### Scala modules

Add in sbt using `libraryDependencies += ...`:

    "org.scala-lang.modules"           %% "scala-xml"                  % "1.2.0"

### Testing libraries

Add in sbt using `libraryDependencies += ... % Test`:

    "com.eed3si9n.expecty"             %% "expecty"                  % "0.11.0"       % Test

### Other libraries

Add in sbt using `libraryDependencies += ...`:

    "com.github.plokhotnyuk.fsi"             %% "fsi-macros"              % "0.6.0"
    "com.github.plokhotnyuk.jsoniter-scala"  %% "jsoniter-scala-core"     % "0.49.0"
    "com.github.plokhotnyuk.jsoniter-scala"  %% "jsoniter-scala-macros"   % "0.49.0"      % Provided
    "com.github.plokhotnyuk.rtree2d"         %% "rtree2d-core"            % "0.9.0"
    "org.scala-js"                           %% "scalajs-stubs"           % "1.0.0"

### Compiler plugins

Add in sbt using `addCompilerPlugin(...)`:

    "org.typelevel"                  %% "kind-projector"           % "0.10.3"

### sbt plugins

Most plugins do not need to be re-published for 2.13, but certain plugins did require changes.

Add using `addSbtPlugin(...)`:

    "org.scala-js"                      % "sbt-scalajs"               % "0.6.28"
    "org.scala-js"                      % "sbt-scalajs"               % "1.0.0-M8"

### Pending

You can subscribe to these tickets to find out when a library you want becomes available:

#### New 2.13 tickets

    (coming soon)

#### Old RC3/RC2/RC1/M5/M4 tickets

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

* [grizzled-scala](https://github.com/bmc/grizzled-scala/pull/18)
* [json-lenses](https://github.com/jrudolph/json-lenses/pull/32)
* [macro-compat](https://github.com/milessabin/macro-compat/pull/85)
* [scala-typed-holes](https://github.com/cb372/scala-typed-holes/pull/20)
* [utest](https://github.com/lihaoyi/utest/pull/200)
* [gatling](https://github.com/gatling/gatling/issues/3566)
* [decline](https://github.com/bkirwi/decline/pull/47)
* [dispatch](https://github.com/dispatch/reboot/issues/210)
* [lift-json](https://github.com/lift/framework/issues/1955)
* [testz](https://github.com/scalaz/testz/issues/30)
* [mdoc](https://github.com/scalameta/mdoc/issues/156)
* [scalatra](https://github.com/scalatra/scalatra/issues/831)
* [twitter-util](https://github.com/twitter/util/issues/219)
* [TwoTails](https://github.com/wheaties/TwoTails/pull/36)
* [grizzled-scala](https://github.com/bmc/grizzled-scala/pull/17)
* [kafka](https://github.com/apache/kafka/pull/5454)
* [scalamock](https://github.com/paulbutcher/ScalaMock/pull/257)
* [scala-records](https://github.com/scala-records/scala-records/pull/139)
* [sealerate](https://github.com/mrvisser/sealerate/pull/16)
* [scalameta](https://github.com/scalameta/scalameta/issues/1695)

## Available Projects for Scala 2.13.0-RC3

See <https://github.com/scala/make-release-notes/blob/768d80c9b9981b10f1b402a216e6d631645c9550/projects-2.13.md>

## Available Projects for Scala 2.13.0-RC2

See <https://github.com/scala/make-release-notes/blob/f22d70b374897027ce62d05544e78395eba4b101/projects-2.13.md>

## Available Projects for Scala 2.13.0-RC1

See <https://github.com/scala/make-release-notes/blob/2c5e4054f221176b5bdcc438c3dd207fb5bfed86/projects-2.13.md>
