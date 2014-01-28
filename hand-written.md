<!-- comment at the top because it breaks the markdown parser when it's where we'd actually like it...
Things to update:
- replace 2.11.0-M8 by actual version
- link to closed milestone (after clearing milestone of un-merged PRs with https://github.com/adriaanm/binfu/blob/master/hubfu.sh#L29)
-->

We are pleased to announce the final milestone release of Scala 2.11.0!

Please do try out this release to help us find any regressions before the first release candidate, which is scheduled for February 18.
For production use, we recommend the latest stable release, 2.10.3 (soon 2.10.4).

If your code compiled on 2.10.x without deprecation warnings, it should compile on 2.11.x. If not, [please file a regression](https://issues.scala-lang.org/secure/CreateIssueDetails!init.jspa?pid=10005&issuetype=1&versions=11311&labels=regression).
We are working with the community to ensure availability of the core artifacts of the Scala 2.11.x eco-system.
This release is *not* binary compatible with the 2.10.x series, so that we can keep improving the Scala standard library.

Scala 2.11.0-M8 is available for download from [scala-lang.org](http://scala-lang.org/download/2.11.0-M8.html)
or from [Maven Central](http://search.maven.org/%23search%7Cga%7C1%7Cg%3A%22org.scala-lang%22%20AND%20v%3A%222.11.0-M8%22).

The Scala team and contributors [fixed 119 issues](https://issues.scala-lang.org/issues/?jql=project+%3D+SI+AND+fixVersion+%3D+%22Scala+2.11.0-M8%22+AND+status+%3D+CLOSED+ORDER+BY+priority+DESC) via [174 merged pull requests](https://github.com/scala/scala/issues?milestone=26&page=1&state=closed)!

### Reporting Bugs / Known Issues
Please [file any bugs you encounter](https://issues.scala-lang.org/secure/CreateIssueDetails!init.jspa?pid=10005&issuetype=1&versions=11311). If you're unsure whether something is a bug, please contact the [scala-user](https://groups.google.com/forum/?fromgroups#!forum/scala-user) mailing list.

Before reporting a bug, please have a look at these [known issues](https://issues.scala-lang.org/issues/?jql=project%20%3D%20SI%20AND%20fixVersion%20%21%3D%20%22Scala%202.11.0-M8%22%20AND%20affectedVersion%20%3D%20%22Scala%202.11.0-M8%22%20%20and%20resolution%20%3D%20unresolved%20ORDER%20BY%20priority%20DESC).

### Scala IDE for Eclipse
The Scala IDE with this release built in will soon be available at the usual update-site:

* [for Eclipse 4.2/4.3 (Juno/Kepler)](http://download.scala-ide.org/sdk/e38/scala211/dev/site/)

Have a look at the [getting started guide](http://scala-ide.org/docs/user/gettingstarted.html) for more info.

<!--break-->

### New features in the 2.11 series
This release contains all of the bug fixes and improvements made in the 2.10 series, as well as:

* Modularization
    * The core Scala standard library jar has shed 20% of its bytecode. The modules for xml, parsing, and swing are available individually or via [scala-library-all](http://search.maven.org/#artifactdetails%7Corg.scala-lang%7Cscala-library-all%7C2.11.0-M8%7Cpom).
    * The compiler has been internally modularized, to separate the presentation compiler, scaladoc
      and the REPL. In this release, all of these modules are still packaged in scala-compiler.jar.
      We plan to ship them in separate JARs in 2.12.x.
* Slimming down
    * The experimental .NET backend has been removed from the compiler.
    * In Scala 2.10.0, new implementations of the Pattern Matcher and the Bytecode Emitter
      were shipped. We have now removed the old implementations.
    * scala-actors is now deprecated; we advise users to follow the steps in the [Actors Migration Guide](http://docs.scala-lang.org/overviews/core/actors-migration-guide.html) to port to Akka Actors, which have been included in the distribution since 2.10.0.
    * Search and destroy mission for ~5000 chunks of dead code. [#1648](https://github.com/scala/scala/pull/1648/files)
* Language
    * Case classes with > 22 parameters are now supported [SI-7296](https://issues.scala-lang.org/browse/SI-7296)
    * Infer bounds of existential types [SI-1786](https://issues.scala-lang.org/browse/SI-1786)
* REPL
    * The bytecode decompiler command, :javap, now works with Java 7 [SI-4936](https://issues.scala-lang.org/browse/SI-4936) and has sprouted new options [SI-6894](https://issues.scala-lang.org/browse/SI-6894) (Thanks, [Andrew Marki](https://github.com/som-snytt)!)
    * Added command :kind to help to tell ground types from type constructors. [#2340](https://github.com/scala/scala/pull/2340) (Thanks, [George Leontiev](https://github.com/folone) and [Eugene Yokota](https://github.com/eed3si9n)!)
    * The interpreter can now be embedded as a JSR-166 Scripting Engine [SI-874](https://issues.scala-lang.org/browse/SI-874). (Thanks, [Raphael Jolly](https://github.com/rjolly)!)
* Performance
    * Branch elimination through constant analysis [#2214](https://github.com/scala/scala/pull/2214)
    * Improve performance of reflection [SI-6638](https://issues.scala-lang.org/browse/SI-6638)
* Warnings
    * Warn about unused private / local terms and types, and unused imports, under `-Xlint`. This will even tell you
      when a local `var` could be a `val`. (We might move these warnings to a separate command line option before
      the final release, your feedback is welcome here.)

