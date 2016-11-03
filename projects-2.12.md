## Available Projects for Scala 2.12

Library maintainers, library users, please [submit a pull request](https://github.com/scala/make-release-notes/edit/2.12.x/projects-2.12.md) and let the world know what libraries are available.

[Scala modules](https://index.scala-lang.org/search?q=keywords:scala-module), add in sbt using `libraryDependencies += ...`

    "org.scala-lang.modules"           %% "scala-xml"                 % "1.0.6"
    "org.scala-lang.modules"           %% "scala-parser-combinators"  % "1.0.4"
    "org.scala-lang.modules"           %% "scala-swing"               % "2.0.0-M2"
    "org.scala-lang.modules"           %% "scala-async"               % "0.9.6"
    "org.scala-lang.modules"           %% "scala-java8-compat"        % "0.8.0"

[Testing frameworks](https://index.scala-lang.org/search?q=targets%3Ascala_2.12+AND+keywords%3Atesting), add in sbt using `libraryDependencies += ... % "test"`

    "com.github.scalaprops"            %% "scalaprops"                % "0.3.4"           % "test"
    "com.lihaoyi"                      %% "utest"                     % "0.4.4"           % "test"
    "io.monix"                         %% "minitest"                  % "0.27"            % "test"
    "org.scalacheck"                   %% "scalacheck"                % "1.13.4"          % "test"
    "org.scalacheck"                   %% "scalacheck"                % "1.12.6"          % "test"
    "org.scalacheck"                   %% "scalacheck"                % "1.11.6"          % "test"
    "org.scalatest"                    %% "scalatest"                 % "3.0.0"           % "test"
    "org.specs2"                       %% "specs2-core"               % "3.8.6"           % "test"

[Other libraries](https://index.scala-lang.org/search?q=targets%3Ascala_2.12), add in sbt using `libraryDependencies += ...`

    "com.github.nscala-time"           %% "nscala-time"               % "2.14.0"
    "org.scalaz"                       %% "scalaz-core"               % "7.2.7"
    "org.scalaz"                       %% "scalaz-core"               % "7.1.11"
    "com.github.xuwei-k"               %% "zeroapply"                 % "0.2.1"
    "com.github.xuwei-k"               %% "msgpack4z-core"            % "0.3.5"
    "com.github.xuwei-k"               %% "applybuilder"              % "0.2.2"
    "com.github.xuwei-k"               %% "iarray"                    % "0.3.1"
    "com.github.xuwei-k"               %% "nobox"                     % "0.1.11"
    "com.lihaoyi"                      %% "sourcecode"                % "0.1.3"
    "com.lihaoyi"                      %% "scalatags"                 % "0.6.2"
    "org.scalactic"                    %% "scalactic"                 % "3.0.0"
    "com.chuusai"                      %% "shapeless"                 % "2.3.2"
    "org.typelevel"                    %% "macro-compat"              % "1.1.1"
    "org.scodec"                       %% "scodec-bits"               % "1.1.2"
    "org.scodec"                       %% "scodec-core"               % "1.10.3"
    "com.softwaremill.quicklens"       %% "quicklens"                 % "1.4.8"
    "com.softwaremill.macwire"         %% "macros"                    % "2.2.5"
    "org.json4s"                       %% "json4s-native"             % "3.4.2"
    "org.squeryl"                      %% "squeryl"                   % "0.9.7"
    "eu.timepit"                       %% "refined"                   % "0.6.0"
    "org.scalaz.stream"                %% "scalaz-stream"             % "0.8.6"
    "org.scalaz.stream"                %% "scalaz-stream"             % "0.8.6a"
    "com.typesafe.akka"                %% "akka-actor"                % "2.4.12"
    "com.typesafe.akka"                %% "akka-stream"               % "2.4.12"
    "org.typelevel"                    %% "discipline"                % "0.7.2"
    "com.lihaoyi"                      %% "fastparse"                 % "0.4.2"
    "com.github.scopt"                 %% "scopt"                     % "3.5.0"
    "org.scalikejdbc"                  %% "scalikejdbc"               % "2.5.0-RC2"
    "io.monix"                         %% "monix"                     % "2.0.6"
    "org.scalafx"                      %% "scalafx"                   % "8.0.102-R11"
    "com.beachape"                     %% "enumeratum"                % "1.4.17"
    "com.wix"                          %% "accord-core"               % "0.6"
    "com.github.dnvriend"              %% "akka-persistence-inmemory" % "1.3.14"
    "com.github.dnvriend"              %% "akka-persistence-journal-writer" % "0.0.2"

[Compiler plugins](https://index.scala-lang.org/search?q=keywords%3Acompiler-plugin+AND+targets%3Ascala_2.12), add in sbt using `addCompilerPlugin(...)`:

    "org.scala-lang.plugins"           % "scala-continuations-plugin" % "1.0.3"  cross CrossVersion.full
    "com.lihaoyi"                      %% "acyclic"                   % "0.1.5"
    "org.scalamacros"                  %% "paradise"                  % "2.1.0"
    "org.psywerx.hairyfotr"            %% "linter"                    % "0.1.16"

[Sbt plugins](https://index.scala-lang.org/search?q=keywords%3Asbt-plugin+AND+targets%3Ascala_2.12). Most plugins do not need to be re-published for 2.12, but certain plugins did require changes. Add using `addSbtPlugin(...)`:

    "org.scala-js"                     % "sbt-scalajs"                % "0.6.13"
    "com.typesafe"                     % "sbt-mima-plugin"            % "0.1.11"
    "org.tpolecat"                     % "tut-plugin"                 % "0.4.6"

Pending: [akka-http](https://github.com/akka/akka-http/issues/437), [Play](https://github.com/playframework/playframework/issues/6110), [Monocle](https://github.com/julien-truffaut/Monocle/issues/407), [WartRemover](https://github.com/puffnfresh/wartremover/issues/278), [Argonaut](https://github.com/argonaut-io/argonaut/issues/246), [Circe](https://github.com/travisbrown/circe/issues/302), [scala-refactoring](https://github.com/scala-ide/scala-refactoring/issues/168), [scala-ssh](https://github.com/veact/scala-ssh/pull/5), [fs2](https://github.com/functional-streams-for-scala/fs2/issues/757), [Coursier](https://github.com/alexarchambault/coursier/pull/374), [Cats](https://github.com/typelevel/cats/pull/1450)...
