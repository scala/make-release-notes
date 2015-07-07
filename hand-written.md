We are pleased to announce the availability of Scala 2.12.0-M2!

We would like to highlight the following changes since M1:

* Java 8 is now required. (The 2.12 compiler requires it, and programs compiled by 2.12 require it, too.)
* TODO

Compared to M1, this release resolves [TODO issues](https://issues.scala-lang.org/issues/?jql=project%20%3D%20SI%20AND%20resolution%20%3D%20Fixed%20AND%20fixVersion%20%3D%202.12.0-M2%20ORDER%20BY%20component%20ASC%2C%20priority%20DESC).  We [merged TODO pull requests](https://github.com/scala/scala/pulls?q=is%3Apr+is%3Amerged+milestone%3A2.12.0-M2).
<!-- Before upgrading, please also check the [known issues](https://issues.scala-lang.org/issues/?jql=project%20%3D%20SI%20AND%20status%3Dopen%20AND%20affectedVersion%20%3D%20%22Scala%202.11.7%22%20and%20fixVersion%20%3E%3D%20%22Scala%202.11.7%22%20ORDER%20BY%20component%20ASC%2C%20priority%20DESC) for this release.-->

As usual for milestones, 2.12.0-M2 is not binary compatible with any other Scala release, including other 2.12 milestones.

### Contributors

A big thank you to everyone who's helped improve Scala by reporting bugs, improving our documentation, spreading kindness in mailing lists and other public fora, and submitting and reviewing pull requests! You are all magnificent.

According to `git shortlog -sn --no-merges v2.12.0-M1..v2.12.0-M2`, TODO people contributed to this minor release: TODO. Thank you!

You can propose edits to these release notes [on GitHub](https://github.com/scala/make-release-notes/blob/2.12.x/hand-written.md).

### Obtaining Scala

Scala releases are available various ways, such as:

<!-- re-add for 2.12.0 final?
* Get started with the [Hello Scala 2.12 template](https://typesafe.com/activator/template/hello-scala-2_12) in [Typesafe Activator](https://typesafe.com/platform/getstarted)
-->
* Download a distribution from [scala-lang.org](http://scala-lang.org/download/2.12.0-M2.html)
* Bump the `scalaVersion` setting in your SBT-based project
* Obtain JARs via [Maven Central](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22org.scala-lang%22%20AND%20v%3A%222.12.0-M2%22)

### Scala 2.12 Notes

Beginning with 2.12.0-M2, the Scala 2.12 series targets Java 8. Programs written in Scala 2.12, including the Scala 2.12 compiler, can only be executed on Java 8 or newer.

#### Source Compatibility

2.12 is mostly source compatible with 2.11.  Code that compiles on 2.11.x without deprecation warnings should compile on 2.12.x too, unless you use experimental APIs such as reflection.  If not, please [file an issue](https://issues.scala-lang.org).

#### Binary compatibility

Since Scala 2.11, minor releases of Scala are binary compatible with each other.
Scala 2.12 will continue this tradition: every 2.12.x release will be binary compatible with 2.12.0.
Milestone releases and release candidates, however, are **not** binary compatible with any other release.

2.12 is not and will not be binary compatible with the 2.11.x series.  This allows us to keep improving the Scala compiler and standard library.  We are working with the community to ensure that core projects in the Scala eco-system become available for 2.12.  Please refer to this growing [list of libraries and frameworks](https://github.com/scala/make-release-notes/blob/2.12.x/projects-2.12.md).

The [Scala 2.11.1 release notes](http://scala-lang.org/news/2.11.1) explain in more detail on how binary compatibility works in Scala.  The same policies that applied to 2.11 will apply to 2.12 as well.


#### New Features

The following major changes are planned for Scala 2.12:

* Java 8 style closures.
  The Scala compiler will emit closure classes (lambdas) in the same manner as Java 8.
  The design notes for this feature are available in [this gist](https://gist.github.com/retronym/0178c212e4bacffed568).
* Lambda syntax for SAM types.
  Similar to Java 8, Scala 2.12 allows instantiating any type with one single abstract method by passing a lambda.
  This feature is already available in Scala 2.11 using the `-Xexperimental` compiler option.
  It improves the experience of using libraries written for Java 8 in Scala.
* New backend and optimizer.
  The "GenBCode" backend, which is already available in Scala 2.11 using the `-Ybackend:GenBCode` compiler option, will be enabled by default.
  Scala 2.12 will also ship with a new inliner and bytecode optimizer.
  We keep track of issues and work items for the new optimizer on the [scala-opt repository issue tracker](https://github.com/scala-opt/scala/issues).

This list will grow in later milestones.

#### Unbundled Features

The following modules have been removed from the Scala 2.12 distribution:

* Scala standard library actors.
  We recommend [Akka actors](http://akka.io/) instead.
  See the [Scala actors migration guide](http://docs.scala-lang.org/overviews/core/actors-migration-guide.html).
* Akka actors.
  The Scala distribution and the `scala-library-all` dependency no longer include Akka actors.
  To use Akka, [add it as a dependency](http://doc.akka.io/docs/akka/2.3.11/intro/getting-started.html).
* Continuations plugin.
  ([Community maintainers sought](https://github.com/scala/scala-continuations).)
