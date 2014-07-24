### Available Projects for Scala 2.11

The following Scala projects have been released against Scala 2.11. See also:
* [@jrudolph](https://github.com/jrudolph)'s list of [library versions for Scala 2.11](https://gist.github.com/jrudolph/7a323f5e2820d8479b18).
* The "[Awesome Scala](https://github.com/lauris/awesome-scala)" list of libraries and frameworks, maintained by [@lauris](https://github.com/lauris).

We'd love to include your release in this list as soon as it's available -- please submit a PR to update [this list](https://github.com/scala/make-release-notes/blob/2.11.x/projects-2.11.md).

    "org.scalacheck"                   %% "scalacheck"                % "1.11.4"
    "org.scalatest"                    %% "scalatest"                 % "2.1.7"
    "org.scalautils"                   %% "scalautils"                % "2.1.3"
    "com.typesafe.akka"                %% "akka-actor"                % "2.3.4"
    "com.typesafe.scala-logging"       %% "scala-logging-slf4j"       % "2.1.2"
    "org.scala-lang.modules"           %% "scala-async"               % "0.9.1"
    "org.scalikejdbc"                  %% "scalikejdbc-interpolation" % "2.0.0-beta1"
    "com.softwaremill.scalamacrodebug" %% "macros"                    % "0.4"
    "com.softwaremill.macwire"         %% "macros"                    % "0.6"
    "com.chuusai"                      %% "shapeless"                 % "1.2.4"
    "com.chuusai"                      %% "shapeless"                 % "2.0.0"
    "org.nalloc"                       %% "optional"                  % "0.1.0"
    "org.scalaz"                       %% "scalaz-core"               % "7.0.6"
    "com.assembla.scala-incubator"     %% "graph-core"                % "1.8.1"
    "com.nocandysw"                    %% "platform-executing"        % "0.5.0"
    "com.qifun"                        %% "stateless-future"          % "0.1.1"
    "com.github.scopt"                 %% "scopt"                     % "3.2.0"
    "com.dongxiguo"                    %% "commons-continuations"     % "0.2.2"
    "com.dongxiguo"                    %% "memcontinuationed"         % "0.3.2"
    "com.dongxiguo"                    %% "fastring"                  % "0.2.4"
    "com.dongxiguo"                    %% "zero-log"                  % "0.3.5"
    "com.github.seratch"               %% "ltsv4s"                    % "1.0.0"
    "com.googlecode.kiama"             %% "kiama"                     % "1.5.3"
    "org.scalamock"                    %% "scalamock-scalatest-support" % "3.0.1"
    "org.scalamock"                    %% "scalamock-specs2-support"  % "3.0.1"
    "com.github.nscala-time"           %% "nscala-time"               % "1.0.0"
    "com.github.xuwei-k"               %% "applybuilder70"            % "0.1.2"
    "com.github.xuwei-k"               %% "nobox"                     % "0.1.9"
    "org.typelevel"                    %% "scodec-bits"               % "1.0.0"
    "org.typelevel"                    %% "scodec-core"               % "1.0.0"
    "com.sksamuel.scrimage"            %% "scrimage"                  % "1.3.20"
    "net.databinder"                   %% "dispatch-http"             % "0.8.10"
    "net.databinder"                   %% "unfiltered"                % "0.8.0"
    "net.databinder"                   %% "unfiltered"                % "0.7.1"
    "io.argonaut"                      %% "argonaut"                  % "6.0.4"
    "org.specs2"                       %% "specs2"                    % "2.3.12"
    "com.propensive"                   %% "rapture-core"              % "0.9.0"
    "com.propensive"                   %% "rapture-json"              % "0.9.1"
    "com.propensive"                   %% "rapture-io"                % "0.9.1"
    "org.scala-stm"                    %% "scala-stm"                 % "0.7"
    "org.parboiled"                    %% "parboiled-scala"           % "1.1.6"
    "io.spray"                         %% "spray-json"                % "1.2.6"
    "org.scala-libs"                   %% "scalajpa"                  % "1.5"
    "com.casualmiracles"               %% "treelog"                   % "1.2.3"
    "org.monifu"                       %% "monifu"                    % "0.6.1"
    "org.mongodb"                      %% "casbah"                    % "2.7.1"
    "com.clarifi"                      %% "f0"                        % "1.1.2"
    "org.scalaj"                       %% "scalaj-http"               % "0.3.15"

The following libraries are specific to the 2.11.x minor release you're using. If you depend on them, you should also cross-version fully!

    "org.scalamacros"                   % "paradise"                  % "2.0.0" cross CrossVersion.full
