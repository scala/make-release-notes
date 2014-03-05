<!-- comment at the top because it breaks the markdown parser when it's where we'd actually like it...
Things to update:
- replace 2.11.0-RC1 by actual version,
- milestone=27 by actual milestone number
- bug/PR counts
-->

We are very pleased to announce the first release candidate of Scala 2.11.0!

Please do try out this release to help us find any serious regressions before the final release.
The next release candidate will be released in two weeks, with subsequent RCs switching to a weekly schedule.
Our goal is to have no more than three RCs for this release -- please help us achieve this by testing your project soon!

For production use, we recommend the latest stable release, 2.10.3 (soon 2.10.4).

If your code compiled on 2.10.x without deprecation warnings, it should compile on 2.11.x. If not, [please file a regression](https://issues.scala-lang.org/secure/CreateIssueDetails!init.jspa?pid=10005&issuetype=1&versions=11311&labels=regression).
We are working with the community to ensure availability of the core artifacts of the Scala 2.11.x eco-system, please see below for a list.
This release is *not* binary compatible with the 2.10.x series, so that we can keep improving the Scala standard library.

Scala 2.11.0-RC1 is available for download from [scala-lang.org](http://scala-lang.org/download/2.11.0-RC1.html)
or from [Maven Central](http://search.maven.org/%23search%7Cga%7C1%7Cg%3A%22org.scala-lang%22%20AND%20v%3A%222.11.0-RC1%22).

The Scala team and contributors [fixed 133 issues](https://issues.scala-lang.org/issues/?jql=project+%3D+SI+AND+fixVersion+%3D+%22Scala+2.11.0-RC1%22+AND+status+%3D+CLOSED+ORDER+BY+priority+DESC) via [154 merged pull requests](https://github.com/scala/scala/issues?milestone=27&state=closed) since the last milestone!

### Reporting Bugs / Known Issues
Please [file any bugs you encounter](https://issues.scala-lang.org/secure/CreateIssueDetails!init.jspa?pid=10005&issuetype=1&versions=11311). If you're unsure whether something is a bug, please contact the [scala-user](https://groups.google.com/forum/?fromgroups#!forum/scala-user) mailing list.

Before reporting a bug, please have a look at these [known issues](https://issues.scala-lang.org/issues/?jql=project%20%3D%20SI%20AND%20fixVersion%20%21%3D%20%22Scala%202.11.0-RC1%22%20AND%20affectedVersion%20%3D%20%22Scala%202.11.0-RC1%22%20%20and%20resolution%20%3D%20unresolved%20ORDER%20BY%20priority%20DESC).

Scala 2.11.0-RC1 ships with akka-actor 2.3.0-RC4, which we now know to be the last RC (it wasn't release when RC1 was cut).
The next Scala 2.11 RC will ship with (the identical) akka-actor 2.3.0 final.

### Scala IDE for Eclipse
The Scala IDE with this release built in is available at the following update-site:

* [for Eclipse 4.2/4.3 (Juno/Kepler)](http://download.scala-ide.org/sdk/helium/e38/scala211/dev/site/)

Have a look at the [getting started guide](http://scala-ide.org/docs/user/gettingstarted.html) for more info.

<!--break-->

### Available libraries

TODO: scalacheck 1.11.3, scalatest 2.1.0, specs2, scalaz,...

### Important changes
For most cases, code that compiled under 2.10.x without deprecation warnings should not be affected.
We've verified this by [compiling](https://jenkins-dbuild.typesafe.com:8499/job/Community-2.11.x) a [sizeable number of open source projects](https://github.com/typesafehub/community-builds/blob/master/community-2.11.x.dbuild#L26).

We've decided to fix the following more obscure deviations from specified behavior without deprecating them first.

  * SI-4577 `x match { case _ : Foo.type => }` is now compiled to `Foo eq x`, as specified. It used to be `Foo == x` (without warning), which (still) corresponds to `case Foo =>`.

The following changes were made after a deprecation cycle:

  * SI-6809 Case classes without a parameter list are no longer allowed
  * SI-7618 Octal number literals no longer supported

Finally, some notable improvements and bug fixes:

  * [SI-7296](https://issues.scala-lang.org/browse/SI-7296) Case classes with > 22 parameters are now allowed
  * [SI-6169](https://issues.scala-lang.org/browse/SI-6169) Infer bounds of Java-defined existential types
  * [SI-6566](https://issues.scala-lang.org/browse/SI-6566) Right-hand sides of type aliases are now considered invariant for variance checking

TODO: source flag / -Xfuture

### Deprecations
Deprecation is essential to two of the 2.11.x series' three themes ([faster/smaller/stabler](http://java.dzone.com/articles/state-scala-2013)).
They make the language and the libraries smaller, and thus easier to use and maintain, which ultimately improves stability.
We are very proud of Scala's first decade, which brought us to where we are, and we are actively working on minimizing the downsides of this legacy,
as exemplified by 2.11.x's focus on deprecation, modularization and infrastructure work.

The following language "warts" have been deprecated:

  * SI-7605 Procedure syntax.
  * SI-5479 DelayedInit. We will continue support for the important `extends App` idiom. ([More details and a proposed alternative.](https://issues.scala-lang.org/browse/SI-4330?jql=labels%20%3D%20delayedinit%20AND%20resolution%20%3D%20unresolved))
  * SI-6455 Rewrite of .withFilter to .filter: you must implement `withFilter` to be compatible with for-comprehensions.
  * SI-8035 Automatic insertion of `()` on missing argument lists.
  * SI-6675 Auto-tupling in patterns.
  * SI-7247 NotNull, which was never fully implemented -- slated for removal in 2.12.
  * SI-1503 Unsound type assumption for stable identifier and literal patterns.

We'd like to emphasize the following library deprecations:

  * [#3103](https://github.com/scala/scala/pull/3103), [#3191](https://github.com/scala/scala/pull/3191), [#3582](https://github.com/scala/scala/pull/3582) Collection classes and methods that are (very) difficult to extend safely have been slated for being marked `final`. Proxies and wrappers that were not adequately implemented or kept up-to-date have been deprecated, along with other minor inconsistencies.
  * scala-actors is now deprecated and will be removed in 2.12; please follow the steps in the [Actors Migration Guide](http://docs.scala-lang.org/overviews/core/actors-migration-guide.html) to port to Akka Actors
  * SI-7958 Deprecate `scala.concurrent.future` and `scala.concurrent.promise`
  * SI-3235 Deprecate `round` on `Int` and `Long` ([#3581](https://github.com/scala/scala/pull/3581)).
  

Deprecation is closely linked to source and binary compatibility.
We say two versions are source compatible when they compile the same programs with the same results.
Deprecation requires qualifying this statement: "assuming there are no deprecation warnings".
This is what allows us to evolve the Scala platform and keep it healthy.
We move slowly to guarantee smooth upgrades, but we want to keep improving as well!

### Binary Compatibility
When two versions of Scala are binary compatible, it is safe to compile your project on one Scala version and link against another Scala version at run time.
Safe run-time linkage (only!) means that the JVM does not throw a (subclass of) [`LinkageError`](http://docs.oracle.com/javase/7/docs/api/java/lang/LinkageError.html) when executing your program in the mixed scenario, assuming that none arise when compiling and running on the same version of Scala. Concretely, this means you may have external dependencies on your run-time classpath that use a different version of Scala than the one you're compiling with, as long as they're binary compatibile. In other words, separate compilation on different binary compatible versions does not introduce problems compared to compiling and running everything on the same version of Scala.

We check binary compatibility automatically with [MiMa](https://github.com/typesafehub/migration-manager).
We strive to maintain a similar invariant for the `behavior` (as opposed to just linkage) of the standard library,
but this is not checked mechanically (Scala is not a proof assistant so this is out of reach for its type system).

#### Forwards and Back
We distinguish forwards and backwards compatibility (think of these as properties of a sequence of versions, not of an individual version).
Maintaining backwards compatibility means code compiled on an older version will link with code compiled with newer ones.
Forwards compatibility allows you to compile on new versions and run on older ones.

Thus, backwards compatibility precludes the removal of (non-private) methods, as older versions could call them, not knowing they would be removed,
whereas forwards compatibility disallows adding new (non-private) methods, because newer programs may come to depend on them,
which would prevent them from running on older versions (private methods are exempted here as well, as their definition and call sites must be in the same compilation unit).

These are strict constraints, but they have worked well for us in the Scala 2.10.x series. They didn't stop us from fixing [372 issues](https://issues.scala-lang.org/browse/SI-8168?filter=12405&jql=project%20%3D%20SI%20AND%20resolution%20%3D%20fixed%20AND%20fixVersion%20%3E%20%22Scala%202.10.0%22%20and%20fixVersion%20%3C%3D%20%22scala%202.10.4-RC3%22) in the 2.10.x series post 2.10.0. The advantages are clear, so we will maintain this policy in the 2.11.x series, and are looking (but not yet commiting!) to extend it to include major versions in the future.

#### Concretely
Just like the 2.10.x series, we guarantee forwards and backwards compatibility of the `"org.scala-lang" % "scala-library" % "2.11.x"` and `"org.scala-lang" % "scala-reflect" % "2.11.x"` artifacts, except for anything under the `scala.reflect.internal` package, as scala-reflect is still experimental. We also strongly discourage relying on the stability of `scala.concurrent.impl` and `scala.reflect.runtime`, though we will only break compatibility for severe bugs here.

Note that we will only enforce *backwards* binary compatibility for the new modules (artifacts under the groupId `org.scala-lang.modules`).
As they are opt-in, it's less of a burden to require having the latest version on the classpath (which is the requirement implied by the lack of forward compatibility).

Finally, Scala 2.11.0 introduces `scala-library-all` to aggregate the modules that consistute a Scala release.
Note that this means it does not provide forward binary compatibility, whereas the core `scala-library` artifact does.
We consider the versions of the modules that `"scala-library-all" % "2.11.x"` depends on to be the canonical ones, that are part of the


### New features in the 2.11 series
This release contains all of the bug fixes and improvements made in the 2.10 series, as well as:

* Modularization
    * The core Scala standard library jar has shed 20% of its bytecode. The modules for xml, parsing, and swing are available individually or via [scala-library-all](http://search.maven.org/#artifactdetails%7Corg.scala-lang%7Cscala-library-all%7C2.11.0-RC1%7Cpom). Note that this artifact has weaker binary compatibility guarantees than `scala-library` -- as explained above.
    * The compiler has been internally modularized, to separate the presentation compiler, scaladoc
      and the REPL. In this release, all of these modules are still packaged in scala-compiler.jar.
      We plan to ship them in separate JARs in 2.12.x.
    * TODO: https://github.com/scala/scala/wiki/Scala-2.11#xml
* Slimming down
    * The experimental .NET backend has been removed from the compiler.
    * Scala 2.10 shipped with new implementations of the Pattern Matcher and the Bytecode Emitter. We have removed the old implementations.
    * Search and destroy mission for ~5000 chunks of dead code. [#1648](https://github.com/scala/scala/pull/1648/files)
* Language
* REPL
    * The bytecode decompiler command, :javap, now works with Java 7 [SI-4936](https://issues.scala-lang.org/browse/SI-4936) and has sprouted new options [SI-6894](https://issues.scala-lang.org/browse/SI-6894) (Thanks, [Andrew Marki](https://github.com/som-snytt)!)
    * Added command :kind to help to tell ground types from type constructors. [#2340](https://github.com/scala/scala/pull/2340) (Thanks, [George Leontiev](https://github.com/folone) and [Eugene Yokota](https://github.com/eed3si9n)!)
    * The interpreter can now be embedded as a JSR-166 Scripting Engine [SI-874](https://issues.scala-lang.org/browse/SI-874). (Thanks, [Raphael Jolly](https://github.com/rjolly)!)
* Compiler Performance
    * Improve performance of reflection [SI-6638](https://issues.scala-lang.org/browse/SI-6638)
* Better Optimizer
    * Branch elimination through constant analysis [#2214](https://github.com/scala/scala/pull/2214)
* Warnings
    * Warn about unused private / local terms and types, and unused imports, under `-Xlint`. This will even tell you
      when a local `var` could be a `val`.
* Collections
    * Immutable `HashMap`s and `HashSet`s perform faster filters, unions, and the like, with improved structural
      sharing (lower memory usage or churn).
    * Mutable `LongMap` and `AnyRefMap` have been added to provide improved performance when keys are `Long` or
      `AnyRef` (performance enhancement of up to 4x or 2x respectively).
    * `BigDecimal` is more explicit about rounding and numeric representations, and better handles very large
      values without exhausting memory (by avoiding unnecessary conversions to `BigInt`).
    * `List` has improved performance on `map`, `flatMap`, and `collect`.


### License clarification
Important note: Scala is now distributed under the standard 3-clause BSD license. Originally, the same 3-clause BSD license was adopted, but slightly reworded over the years. We're now back to the standard formulation.