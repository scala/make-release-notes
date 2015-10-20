### Available Projects for Scala 2.12

Please [submit a pull request](https://github.com/scala/make-release-notes/edit/2.12.x/projects-2.12.md) to update this list!

#### Scala 2.12.0-M3

Libraries, add using `libraryDependencies += ...`

    "org.scalacheck"                   %% "scalacheck"                % "1.11.6"
    "org.scalaz"                       %% "scalaz-core"               % "7.1.4"
    "org.scalaz"                       %% "scalaz-core"               % "7.0.8"
    "org.scalatest"                    %% "scalatest"                 % "2.2.5-M3"
    "org.scalactic"                    %% "scalactic"                 % "2.2.5-M3"

#### Scala 2.12.0-M2

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

#### Scala 2.12.0-M1

Libraries, add using `libraryDependencies += ...`

    "org.scalacheck"                   %% "scalacheck"                % "1.11.6"
    "org.scalatest"                    %% "scalatest"                 % "2.2.5-M1"
    "org.scalactic"                    %% "scalactic"                 % "2.2.5-M1"
    "org.scalaz"                       %% "scalaz-core"               % "7.0.7"
    "org.scalaz"                       %% "scalaz-core"               % "7.1.2"
    "com.github.nscala-time"           %% "nscala-time"               % "2.0.0"

Compiler Plugins, add using `addCompilerPlugin(...)`:
    
    "org.spire-math"                   %% "kind-projector             % "0.5.4" // resolvers += "bintray/non" at "http://dl.bintray.com/non/maven"
