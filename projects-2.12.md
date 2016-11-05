## Available Projects for Scala 2.12

Library maintainers, library users, please [submit a pull request](https://github.com/scala/make-release-notes/edit/2.12.x/projects-2.12.md) and let the world know what libraries are available.

### Scaladex

Scaladex, the index of Scala libraries, now offers searching by target version:

* [Scala modules for 2.12](https://index.scala-lang.org/search?q=keywords:scala-module)
* [Testing frameworks for 2.12](https://index.scala-lang.org/search?q=targets%3Ascala_2.12+AND+keywords%3Atesting)
* [Other libraries for 2.12](https://index.scala-lang.org/search?q=targets%3Ascala_2.12)
* [Compiler plugins for 2.12](https://index.scala-lang.org/search?q=keywords%3Acompiler-plugin+AND+targets%3Ascala_2.12)
* [Sbt plugins for 2.12](https://index.scala-lang.org/search?q=keywords%3Asbt-plugin+AND+targets%3Ascala_2.12)

### Scala modules

Add in sbt using `libraryDependencies += ...`:

    "org.scala-lang.modules"           %% "scala-async"               % "0.9.6"
    "org.scala-lang.modules"           %% "scala-java8-compat"        % "0.8.0"
    "org.scala-lang.modules"           %% "scala-parser-combinators"  % "1.0.4"
    "org.scala-lang.modules"           %% "scala-swing"               % "2.0.0-M2"
    "org.scala-lang.modules"           %% "scala-xml"                 % "1.0.6"

### Testing frameworks

Add in sbt using `libraryDependencies += ... % "test"`:

    "com.github.scalaprops"            %% "scalaprops"                % "0.3.4"           % "test"
    "com.lihaoyi"                      %% "utest"                     % "0.4.4"           % "test"
    "io.monix"                         %% "minitest"                  % "0.27"            % "test"
    "org.scalacheck"                   %% "scalacheck"                % "1.11.6"          % "test"
    "org.scalacheck"                   %% "scalacheck"                % "1.12.6"          % "test"
    "org.scalacheck"                   %% "scalacheck"                % "1.13.4"          % "test"
    "org.scalatest"                    %% "scalatest"                 % "3.0.0"           % "test"
    "org.specs2"                       %% "specs2-core"               % "3.8.6"           % "test"

### Other libraries

Add in sbt using `libraryDependencies += ...`:

    "co.fs2"                           %% "fs2-core"                  % "0.9.2"
    "co.fs2"                           %% "fs2-io"                    % "0.9.2"
    "com.beachape"                     %% "enumeratum"                % "1.4.17"
    "com.chuusai"                      %% "shapeless"                 % "2.3.2"
    "com.github.dnvriend"              %% "akka-persistence-inmemory" % "1.3.14"
    "com.github.dnvriend"              %% "akka-persistence-journal-writer" % "0.0.2"
    "com.github.julien-truffaut"       %% "monocle-core"              % "1.3.2"
    "com.github.mpilquist"             %% "simulacrum"                % "0.10.0"
    "com.github.nscala-time"           %% "nscala-time"               % "2.14.0"
    "com.github.scopt"                 %% "scopt"                     % "3.5.0"
    "com.github.seratch"               %% "bigquery4s"                % "0.5"
    "com.github.seratch"               %% "hackenews4s"               % "0.6.1"
    "com.github.seratch"               %% "sadamasashi-compiler"      % "0.2"
    "com.github.xuwei-k"               %% "applybuilder"              % "0.2.2"
    "com.github.xuwei-k"               %% "iarray"                    % "0.3.1"
    "com.github.xuwei-k"               %% "msgpack4z-core"            % "0.3.5"
    "com.github.xuwei-k"               %% "nobox"                     % "0.1.11"
    "com.github.xuwei-k"               %% "zeroapply"                 % "0.2.1"
    "com.lihaoyi"                      %% "fastparse"                 % "0.4.2"
    "com.lihaoyi"                      %% "scalatags"                 % "0.6.2"
    "com.lihaoyi"                      %% "sourcecode"                % "0.1.3"
    "com.softwaremill.macwire"         %% "macros"                    % "2.2.5"
    "com.softwaremill.quicklens"       %% "quicklens"                 % "1.4.8"
    "com.typesafe.akka"                %% "akka-actor"                % "2.4.12"
    "com.typesafe.akka"                %% "akka-stream"               % "2.4.12"
    "com.wix"                          %% "accord-core"               % "0.6"
    "eu.timepit"                       %% "refined"                   % "0.6.0"
    "io.get-coursier"                  %% "coursier"                  % "1.0.0-M14"
    "io.monix"                         %% "monix"                     % "2.0.6"
    "org.clapper"                      %% "classutil"                 % "1.1.0"
    "org.clapper"                      %% "grizzled-scala"            % "3.1.0"
    "org.clapper"                      %% "grizzled-slf4j"            % "1.3.0"
    "org.json4s"                       %% "json4s-core"               % "3.5.0"
    "org.parboiled"                    %% "parboiled"                 % "2.1.3"
    "org.scalactic"                    %% "scalactic"                 % "3.0.0"
    "org.scalafx"                      %% "scalafx"                   % "8.0.102-R11"
    "org.scalatra.scalate"             %% "scalate-core"              % "1.8.0"
    "org.scalaz"                       %% "scalaz-core"               % "7.1.11"
    "org.scalaz"                       %% "scalaz-core"               % "7.2.7"
    "org.scalaz.stream"                %% "scalaz-stream"             % "0.8.6"
    "org.scalaz.stream"                %% "scalaz-stream"             % "0.8.6a"
    "org.scalikejdbc"                  %% "scalikejdbc"               % "2.5.0"
    "org.scodec"                       %% "scodec-bits"               % "1.1.2"
    "org.scodec"                       %% "scodec-core"               % "1.10.3"
    "org.skinny-framework"             %% "skinny-micro"              % "1.2.0-RC1"
    "org.skinny-framework"             %% "skinny-framework"          % "2.3.0-RC1"
    "org.spire-math"                   %% "jawn-ast"                  % "0.10.3"
    "org.spire-math"                   %% "jawn-parser"               % "0.10.3"
    "org.squeryl"                      %% "squeryl"                   % "0.9.7"
    "org.typelevel"                    %% "discipline"                % "0.7.2"
    "org.typelevel"                    %% "macro-compat"              % "1.1.1"
    "org.wvlet"                        %% "wvlet-log"                 % "1.1"

### Compiler plugins

Add in sbt using `addCompilerPlugin(...)`:

    "com.lihaoyi"                      %% "acyclic"                    % "0.1.5"
    "com.typesafe.genjavadoc"          %% "genjavadoc-plugin"          % "0.10"   cross CrossVersion.full
    "org.psywerx.hairyfotr"            %% "linter"                     % "0.1.16"
    "org.scala-lang.plugins"           %% "scala-continuations-plugin" % "1.0.3"  cross CrossVersion.full
    "org.scalamacros"                  %% "paradise"                   % "2.1.0"

### Sbt plugins

Most plugins do not need to be re-published for 2.12, but certain plugins did require changes.

Add using `addSbtPlugin(...)`:

    "com.typesafe"                     % "sbt-mima-plugin"            % "0.1.11"
    "org.scala-js"                     % "sbt-scalajs"                % "0.6.13"
    "org.tpolecat"                     % "tut-plugin"                 % "0.4.6"

### Pending

You can subscribe to these tickets to find out when a library you want becomes available:

* [akka-http](https://github.com/akka/akka-http/issues/437)
* [Argonaut](https://github.com/argonaut-io/argonaut/issues/246)
* [Cats](https://github.com/typelevel/cats/pull/1450)
* [Circe](https://github.com/travisbrown/circe/issues/302)
* [fs2](https://github.com/functional-streams-for-scala/fs2/issues/757)
* [Play](https://github.com/playframework/playframework/issues/6110)
* [sbt-catalysts](https://github.com/typelevel/sbt-catalysts/issues/11)
* [scala-refactoring](https://github.com/scala-ide/scala-refactoring/issues/168)
* [scala-ssh](https://github.com/veact/scala-ssh/pull/5)
* [Apache Spark](https://issues.apache.org/jira/browse/SPARK-14220)
* [Spire](https://github.com/non/spire/issues/596)
* [WartRemover](https://github.com/puffnfresh/wartremover/issues/278)
