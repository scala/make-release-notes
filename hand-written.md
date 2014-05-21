<!---
NOTE: Our generator now strips triple-dash comments form the generated markdown.
      These have been problematic for jekyll.
-->

We are very pleased to announce the final release of Scala 2.11.0!

<!-- Notes from 2.11.0
* Get started with the [Hello Scala 2.11 template](https://typesafe.com/activator/template/hello-scala-2_11) in [Typesafe Activator](https://typesafe.com/platform/getstarted)
* Download a distribution from [scala-lang.org](http://scala-lang.org/download/2.11.0.html)
* Obtain it via [Maven Central](http://search.maven.org/?search%7Cga%7C1%7Cg%3A%22org.scala-lang%22%20AND%20v%3A%222.11.0%22#search%7Cga%7C1%7Cg%3A%22org.scala-lang%22%20AND%20v%3A%222.11.0%22)

There have been no code changes since RC4, just improvements to documentation and version bump to the most recent stable version of Akka actors. Here's the [difference between the release and RC4](https://github.com/scala/scala/compare/v2.11.0-RC4...v2.11.0).

Code that compiled on 2.10.x without deprecation warnings should compile on 2.11.x (we do not guarantee this for experimental APIs, such as reflection). If not, [please file a regression](https://issues.scala-lang.org/secure/CreateIssueDetails!init.jspa?pid=10005&issuetype=1&versions=11311&labels=regression). We are working with the community to ensure availability of the core projects of the Scala 2.11.x eco-system, please see below for a list. This release is *not* binary compatible with the 2.10.x series, to allow us to keep improving the Scala standard library.
-->

<!--break-->

<!-- Notes from 2.11.0
The Scala 2.11.x series targets Java 6, with (evolving) experimental support for Java 8. In 2.11.0, Java 8 support is mostly limited to reading Java 8 bytecode and parsing Java 8 source. Stay tuned for more complete (experimental) Java 8 support.
-->

### New features in the 2.12 series
This release contains all of the bug fixes and improvements made in the 2.11 series, as well as:

<!-- Notes from 2.11.0
* Collections
  * Immutable `HashMap`s and `HashSet`s perform faster filters, unions, and the like, with improved structural sharing (lower memory usage or churn).
  * ...
-->

<!-- Notes from 2.11.0
The Scala team and contributors [fixed 613 bugs](https://issues.scala-lang.org/issues/?jql=project%20%3D%20SI%20and%20fixVersion%20>%3D%20"Scala%202.11.0-M1"%20and%20fixVersion%20<%3D%20"Scala%202.11.0"%20and%20resolution%20%3D%20fixed) that are exclusive to Scala 2.11.0! We also backported as many as possible. With the release of 2.11, 2.10 backports will be dialed back.

A big thank you to everyone who's helped improve Scala by reporting bugs, improving our documentation, participating in mailing lists and other public fora, and -- of course -- submitting and reviewing pull requests! You are all awesome.

Concretely, according to `git log --no-merges --oneline master --not 2.10.x --format='%aN'  | sort | uniq -c | sort -rn`, 112 people contributed code, tests, and/or documentation to Scala 2.11.x: Paul Phillips, Jason Zaugg, ...

Thank you all very much.

If you find any errors or omissions in these relates notes, [please submit a PR](https://github.com/scala/make-release-notes/blob/master/hand-written.md)!
-->

<!-- Notes from 2.11.0
### Reporting Bugs / Known Issues
Please [file any bugs you encounter](https://issues.scala-lang.org/secure/CreateIssueDetails!init.jspa?pid=10005&issuetype=1&versions=11311). If you're unsure whether something is a bug, please contact the [scala-user](https://groups.google.com/forum/?fromgroups#!forum/scala-user) mailing list.

Before reporting a bug, please have a look at these [known issues](https://issues.scala-lang.org/issues/?jql=project%20%3D%20SI%20AND%20fixVersion%20%21%3D%20%22Scala%202.11.0-RC3%22%20AND%20affectedVersion%20%3D%20%22Scala%202.11.0%22%20%20and%20resolution%20%3D%20unresolved%20ORDER%20BY%20priority%20DESC).
-->

### Scala IDE for Eclipse

<!-- Notes from 2.11.0
The Scala IDE with this release built in is [available from this update site](http://download.scala-ide.org/sdk/helium/e38/scala211/stable/site/) for [Eclipse 4.2/4.3 (Juno/Kepler)](http://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/keplersr2). Please have a look at the [getting started guide](http://scala-ide.org/docs/user/gettingstarted.html) for more info.
-->

### Available projects

<!-- Notes from 2.11.0
The following Scala projects have already been released against 2.11.0! We'd love to include yours in this list as soon as it's available -- please submit a PR to update [these release notes](https://github.com/scala/make-release-notes/blob/master/hand-written.md).

    "org.scalacheck"                   %% "scalacheck"                % "1.11.3"
    ...

The following projects were released against 2.11.0-RC4, with an 2.11 build hopefully following soon:

    "org.scalafx"            %% "scalafx"            % "8.0.0-R4"
    ...
-->

### Cross-building with sbt 0.13

<!-- Notes from 2.11.0
When cross-building between Scala versions, you often need to vary the versions of your dependencies. In particular, the new scala modules (such as scala-xml) are no longer included in scala-library, so you'll have to add an explicit dependency on it to use Scala's xml support.

Here's how we recommend handling this in sbt 0.13. For the full build and Maven build, see [example](https://github.com/scala/scala-module-dependency-sample).

    scalaVersion        := "2.11.0"

    crossScalaVersions  := Seq("2.11.0", "2.10.3")

    // add scala-xml dependency when needed (for Scala 2.11 and newer)
    // this mechanism supports cross-version publishing
    libraryDependencies := {
      CrossVersion.partialVersion(scalaVersion.value) match {
        case Some((2, scalaMajor)) if scalaMajor >= 11 =>
          libraryDependencies.value :+ "org.scala-lang.modules" %% "scala-xml" % "1.0.1"
        case _ =>
          libraryDependencies.value
      }
    }
-->

### Important changes

<!-- Notes from 2.11.0
For most cases, code that compiled under 2.10.x without deprecation warnings should not be affected. We've verified this by [compiling](https://jenkins-dbuild.typesafe.com:8499/job/Community-2.11.x) a [sizeable number of open source projects](https://github.com/typesafehub/community-builds/blob/master/common-2.11.x.conf#L43).

Changes to the reflection API may cause breakages...

We've decided to fix the following more obscure deviations from specified behavior without deprecating them first.

* [SI-4577](https://issues.scala-lang.org/browse/SI-4577) Compile `x match { case _ : Foo.type => }` to `Foo eq x`, as specified. It used to be `Foo == x` (without warning). If that's what you meant, write `case Foo =>`.
* ...

The following changes were made after a deprecation cycle

* [SI-6809](https://issues.scala-lang.org/browse/SI-6809) Case classes without a parameter list are no longer allowed.
* ...

Finally, some notable improvements and bug fixes:

* [SI-7296](https://issues.scala-lang.org/browse/SI-7296) Case classes with > 22 parameters are now allowed.
*...
-->

### Deprecations

The following language "warts" have been deprecated:
* [#3746](https://github.com/scala/scala/pull/3746) Generation of bean info classes using the `@BeanInfo` annotation.

<!-- Notes from 2.11.0
Deprecation is closely linked to source and binary compatibility. We say two versions are source compatible when they compile the same programs with the same results. Deprecation requires qualifying this statement: "assuming there are no deprecation warnings". This is what allows us to evolve the Scala platform and keep it healthy. We move slowly to guarantee smooth upgrades, but we want to keep improving as well!
-->

### Binary Compatibility

When two versions of Scala are binary compatible, it is safe to compile your project on one Scala version and link against another Scala version at run time. Safe run-time linkage (only!) means that the JVM does not throw a (subclass of) [`LinkageError`](http://docs.oracle.com/javase/7/docs/api/java/lang/LinkageError.html) when executing your program in the mixed scenario, assuming that none arise when compiling and running on the same version of Scala. Concretely, this means you may have external dependencies on your run-time classpath that use a different version of Scala than the one you're compiling with, as long as they're binary compatibile. In other words, separate compilation on different binary compatible versions does not introduce problems compared to compiling and running everything on the same version of Scala.

We check binary compatibility automatically with [MiMa](https://github.com/typesafehub/migration-manager). We strive to maintain a similar invariant for the `behavior` (as opposed to just linkage) of the standard library, but this is not checked mechanically (Scala is not a proof assistant so this is out of reach for its type system).

#### Forwards and Back
We distinguish forwards and backwards compatibility (think of these as properties of a sequence of versions, not of an individual version). Maintaining backwards compatibility means code compiled on an older version will link with code compiled with newer ones. Forwards compatibility allows you to compile on new versions and run on older ones.

Thus, backwards compatibility precludes the removal of (non-private) methods, as older versions could call them, not knowing they would be removed, whereas forwards compatibility disallows adding new (non-private) methods, because newer programs may come to depend on them, which would prevent them from running on older versions (private methods are exempted here as well, as their definition and call sites must be in the same compilation unit).

<!-- Notes from 2.11.0
These are strict constraints, but they have worked well for us in the Scala 2.10.x series. They didn't stop us from fixing [372 issues](https://issues.scala-lang.org/issues/?jql=project%20%3D%20"SI"%20AND%20resolution%3D"fixed"%20and%20fixVersion%20>%20"Scala%202.10.0"%20and%20fixVersion%20<%3D%20"Scala%202.10.4") in the 2.10.x series post 2.10.0. The advantages are clear, so we will maintain this policy in the 2.11.x series, and are looking (but not yet commiting!) to extend it to include major versions in the future.

#### Meta

Note that so far we've only talked about the jars generated by scalac for the standard library and reflection.
Our policies do not extend to the meta-issue: ensuring binary compatibility for bytecode generated from identical sources, by different version of scalac? (The same problem exists for compiling on different JDKs.) While we strive to achieve this, it's not something we can test in general. Notable examples where we know meta-binary compatibility is hard to achieve: specialisation and the optimizer.

In short, if binary compatibility of your library is important to you, use [MiMa](https://github.com/typesafehub/migration-manager) to verify compatibility before releasing.
Compiling identical sources with different versions of the scala compiler (or on different JVM versions!) could result in binary incompatible bytecode. This is rare, and we try to avoid it, but we can't guarantee it will never happen.

#### Concretely
Just like the 2.10.x series, we guarantee forwards and backwards compatibility of the `"org.scala-lang" % "scala-library" % "2.11.x"` and `"org.scala-lang" % "scala-reflect" % "2.11.x"` artifacts, except for anything under the `scala.reflect.internal` package, as scala-reflect is still experimental. We also strongly discourage relying on the stability of `scala.concurrent.impl` and `scala.reflect.runtime`, though we will only break compatibility for severe bugs here.

Note that we will only enforce *backwards* binary compatibility for the new modules (artifacts under the groupId `org.scala-lang.modules`). As they are opt-in, it's less of a burden to require having the latest version on the classpath. (Without forward compatibility, the latest version of the artifact must be on the run-time classpath to avoid linkage errors.)

Finally, Scala 2.11.0 introduces `scala-library-all` to aggregate the modules that constitute a Scala release. Note that this means it does not provide forward binary compatibility, whereas the core `scala-library` artifact does. We consider the versions of the modules that `"scala-library-all" % "2.11.x"` depends on to be the canonical ones, that are part of the official Scala distribution. (The distribution itself is defined by the new `scala-dist` maven artifact.)
-->