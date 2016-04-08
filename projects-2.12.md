## Available Projects for Scala 2.12

Please [submit a pull request](https://github.com/scala/make-release-notes/edit/2.12.x/projects-2.12.md) to update this list!

### Scala 2.12.0-M4

Scala modules, add in sbt using `libraryDependencies += ...`

    "org.scala-lang.modules"           %% "scala-xml"                 % "1.0.5"
    "org.scala-lang.modules"           %% "scala-parser-combinators"  % "1.0.4"
    "org.scala-lang.modules"           %% "scala-swing"               % "2.0.0-M2"

Testing frameworks, add in sbt using `libraryDependencies += ... % "test"`

    "org.scalatest"                    %% "scalatest"                 % "2.2.6"           % "test"
    "org.scalatest"                    %% "scalatest"                 % "3.0.0-M16-SNAP3" % "test"
    "org.scalacheck"                   %% "scalacheck"                % "1.11.6"          % "test"
    "org.scalacheck"                   %% "scalacheck"                % "1.12.5"          % "test"

Other libraries, add in sbt using `libraryDependencies += ...`

    "org.scalactic"                    %% "scalactic"                 % "2.2.6"
    "org.scalactic"                    %% "scalactic"                 % "3.0.0-M16-SNAP3"
    "org.typelevel"                    %% "macro-compat"              % "1.1.1"
    "com.chuusai"                      %% "shapeless"                 % "2.2.5"
    "com.chuusai"                      %% "shapeless"                 % "2.3.0"
    "org.scodec"                       %% "scodec-bits"               % "1.0.12"
    "org.scodec"                       %% "scodec-bits"               % "1.1.0"

Compiler plugins, add in sbt using `addCompilerPlugin(...)`:
    
    "org.scalamacros"                  %% "paradise"                  % "2.1.0"

Sbt plugins. Most plugins do not need to be re-published for 2.12, but certain plugins required changes. Add using `addSbtPlugin`:

    "com.typesafe"                     %  "sbt-mima-plugin"           % "0.1.9"

Additional notes:

* Support for Scala.js has not been published yet ([link with info](https://groups.google.com/d/msg/scala-internals/NZ4pVWB4HWY/CWtJJCqbHAAJ)).
* ScalaCheck 1.13.0 is not yet published; see https://github.com/rickynils/scalacheck/issues/230.
* Progress towards a Specs2 release for M4 can be tracked [here](https://github.com/etorreborre/specs2/issues/469).

### Scala 2.12.0-M3

Scala modules, add in Sbt using `libraryDependencies += ...`

    "org.scala-lang.modules"           %% "scala-xml"                 % "1.0.5"
    "org.scala-lang.modules"           %% "scala-parser-combinators"  % "1.0.4"
    "org.scala-lang.modules"           %% "scala-swing"               % "2.0.0-M2"
    "org.scala-lang.modules"           %% "scala-java8-compat"        % "0.7.0"

Testing frameworks, add in Sbt using `libraryDependencies += ...`

    "org.scalacheck"                   %% "scalacheck"                % "1.11.6"
    "org.scalacheck"                   %% "scalacheck"                % "1.12.5"
    "org.scalatest"                    %% "scalatest"                 % "2.2.5-M3"
    "org.specs2"                       %% "specs2-core"               % "3.7.1"

Other libraries, add in Sbt using `libraryDependencies += ...`

    "org.scalaz"                       %% "scalaz-core"               % "7.1.4"
    "org.scalaz"                       %% "scalaz-core"               % "7.0.8"
    "org.scalaz.stream"                %% "scalaz-stream"             % "0.8a"
    "org.scalactic"                    %% "scalactic"                 % "2.2.5-M3"
    "org.scodec"                       %% "scodec-bits"               % "1.0.10"
    "com.chuusai"                      %% "shapeless"                 % "2.2.5"
    "org.scalikejdbc"                  %% "scalikejdbc"               % "2.3.5"

Sbt plugins, add using `addSbtPlugin`; note that sbt 0.13 plugins always run on Scala 2.10, so most plugins don't need any changes to work with projects targeting 2.12; but the following plugins did need changes

    "org.scala-js"                     %  "sbt-scalajs"               % "0.6.5"
    "com.typesafe"                     %  "sbt-mima-plugin"           % "0.1.8"

### Scala 2.12.0-M2

Libraries, add using `libraryDependencies += ...`

    "org.scalacheck"                   %% "scalacheck"                % "1.11.6"
    "org.scalacheck"                   %% "scalacheck"                % "1.12.4"
    "org.scalatest"                    %% "scalatest"                 % "2.2.5-M2"
    "org.scalactic"                    %% "scalactic"                 % "2.2.5-M2"
    "com.chuusai"                      %% "shapeless"                 % "2.2.5"
    "org.scalaz"                       %% "scalaz-core"               % "7.0.8"
    "org.scalaz"                       %% "scalaz-core"               % "7.1.3"
    "org.scalaz.stream"                %% "scalaz-stream"             % "0.7.2"     // for scalaz 7.0
    "org.scalaz.stream"                %% "scalaz-stream"             % "0.7.2a"    // for scalaz 7.1
    "com.github.nscala-time"           %% "nscala-time"               % "2.0.0"
    "org.scodec"                       %% "scodec-bits"               % "1.0.9"
    
may or may not be usable, see [issue](https://github.com/etorreborre/specs2/issues/399):

    "org.specs2"                       %% "specs2-core"               % "3.6.3"

### Scala 2.12.0-M1

Libraries, add using `libraryDependencies += ...`

    "org.scalacheck"                   %% "scalacheck"                % "1.11.6"
    "org.scalatest"                    %% "scalatest"                 % "2.2.5-M1"
    "org.scalactic"                    %% "scalactic"                 % "2.2.5-M1"
    "org.scalaz"                       %% "scalaz-core"               % "7.0.7"
    "org.scalaz"                       %% "scalaz-core"               % "7.1.2"
    "com.github.nscala-time"           %% "nscala-time"               % "2.0.0"

Compiler Plugins, add using `addCompilerPlugin(...)`:
    
    "org.spire-math"                   %% "kind-projector             % "0.5.4" // resolvers += "bintray/non" at "http://dl.bintray.com/non/maven"
