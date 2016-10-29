We are happy to announce the availability of Scala 2.12.0!

The Scala 2.12 compiler has been completely overhauled to make use of the new VM features available in Java 8!
 - A trait is compiled to an interface with default methods for improved binary compatibility.
 - We've unified the treatment of Scala's built-in function types and Single Abstract Method types (for overload resolution, type inference and code generation).
 - Specifically, code generation for function literals uses `invokedynamic` to avoid emitting a classfile at compile time. Many of these features were developed in fruitful collaboration with the Dotty team.

Lukas has delivered a powerful new optimizer with this release, built on earlier work by Miguel Garcia. Many more  (effectively) final methods, including those defined in objects and traits, are now inlined. As well, closure allocations, dead code and [box/unbox pairs](https://github.com/scala/scala/pull/4858) are eliminated more effectively.

From now on, 2.12.x releases will be fully binary compatible. This release is identical to 2.12.0-RC2. To run Scala 2.12 code, you need a Java 8 runtime.

Our [roadmap](https://github.com/scala/scala/milestones) lists the following upcoming releases for 2016: 2.12.1 will be out shortly (by the end of November) to address some known (but rare) issues in 2.12.0, and 2.11.9 is the last planned 2.11.x release (due by mid December). In the next few weeks, we at Lightbend will share our plans for Scala 2.13.


### Known issues
There are some [known issues](https://issues.scala-lang.org/issues/?jql=project%20%3D%20SI%20and%20affectedVersion%20%3D%20%22Scala%202.12.0%22%20and%20status%20%3D%20open) with this release that [will be resolved](https://github.com/scala/scala/pulls?q=is%3Aopen+is%3Apr+milestone%3A2.12.1+label%3Arelease-notes) in 2.12.1, due out by the end of November.

As with previous 2.12 builds, the new trait encoding may make some
trait-based code run slower. We've investigated this issue in depth,
and have implemented important improvements in RC2.
Compile times may still be longer in 2.12 than 2.11. Please let us know
if you notice any performance regressions. We will continue to tweak
the bytecode we emit during the 2.12.x cycle to get the best performance out of the JVM.

We welcome feedback from the Scala community helping to isolate unusual slowdowns.

We hope to address the following in a future 2.12.x release:

* [SI-9824](https://issues.scala-lang.org/browse/SI-9824):
  Parallel collections are prone to deadlock in the REPL and
  in object initializers.

## Scala 2.12

Scala 2.12 is all about making optimal use of Java 8's new features (and thus generates code that requires a Java 8 runtime).
  - Traits ([#5003](https://github.com/scala/scala/pull/5003)) and functions are compiled to their Java 8 equivalents.
  - We treat Single Abstract Method types and Scala's builtin function types uniformly from type checking to the back end ([#4971](https://github.com/scala/scala/pull/4971)). We also use `invokedynamic` for a more natural encoding of other language features ([#4896](https://github.com/scala/scala/pull/4896)).
  - We've standardized on the GenBCode back end ([#4814](https://github.com/scala/scala/pull/4814), [#4838](https://github.com/scala/scala/pull/4838)) and the flat classpath implementation is now the default ([#5057](https://github.com/scala/scala/pull/5057)).
  - The optimizer has been completely overhauled for 2.12.

Except for the breaking changes listed below, code that compiles on 2.11.x without deprecation warnings should compile on 2.12.x too, unless you use experimental APIs such as reflection.  If you find incompatibilities, please [file an issue](https://issues.scala-lang.org). Cross-building is a one-line change to most sbt builds, and even provides support for [version-specific source folders](http://www.scala-sbt.org/0.13/docs/sbt-0.13-Tech-Previews.html#Cross-version+support+for+Scala+sources) out of the box, when necessary to work around incompatibilities (e.g. macros).

### New features
Here are the [most noteworthy pull request](https://github.com/scala/scala/pulls?utf8=%E2%9C%93&q=%20is%3Amerged%20label%3A2.12%20label%3Arelease-notes%20) of the 2.12 release. See also the [RC2](http://scala-lang.org/news/2.12.0-RC2) and [RC1](http://scala-lang.org/news/2.12.0-RC1) release notes for the most recent changes.


#### Trait compiles to an interface

With Java 8 allowing concrete methods in interfaces, Scala 2.12 is able to compile a trait to a single interface. Before, a trait was represented as a class that held the method implementations and an interface. Note that the compiler still has quite a bit of magic to perform behind the scenes, so that care must be taken if a trait is meant to be implemented in Java. (Briefly, if a trait does any of the following its subclasses require synthetic code: defining fields, calling super, initializer statements in the body, extending a class, relying on linearization to find implementations in the right super trait.)

#### Java 8-style lambdas

Scala 2.12 emits closures in the same style as Java 8, whether they target a `FunctionN` class from the standard library or a user-defined Single Abstract Method (SAM) type. The type checker accepts a function literal as a valid expression for either kind of "function-like" type (built-in or SAM). This improves the experience of using libraries written for Java 8 in Scala.

For each lambda the compiler generates a method containing the lambda body, and emits an `invokedynamic` that will spin up a lightweight class for this closure using the JDK's `LambdaMetaFactory`.

Compared to Scala 2.11, the new scheme has the advantage that, in most cases, the compiler does not need to generate an anonymous class for each closure. This leads to significantly smaller JAR files.

#### New back end

Scala 2.12 standardizes on the "GenBCode" back end, which emits code more quickly because it directly generates ASM bytecode from Scala compiler trees, while the previous back end used an intermediate representation called "ICode". The old back ends (GenASM and GenIcode) have been removed ([#4814](https://github.com/scala/scala/pull/4814), [#4838](https://github.com/scala/scala/pull/4838)).

#### New optimizer

The GenBCode back end includes a new inliner and bytecode optimizer.
The optimizer is enabled using `-opt` compiler option, which defaults
to `-opt:l:classpath`.  Check `-opt:help` to see the full list of
available options for the optimizer.

The following optimizations are available:

* Inlining final methods, including methods defined in objects and final methods defined in traits
* If a closure is allocated and invoked within the same method, the closure invocation is replaced by an invocations of the corresponding lambda body method
* Dead code elimination and a small number of cleanup optimizations
* Box/unbox elimination [#4858](https://github.com/scala/scala/pull/4858)

#### Either is now right-biased

`Either` now supports operations like `map`, `flatMap`, `contains`,
`toOption`, and so forth, which operate on the right-hand side.

(`.left` and `.right` may be deprecated in favor of `.swap` in a later release.)

The changes are source-compatible with old code (except in the
presence of conflicting extension methods).

Thanks, [Simon Ochsenreither](https://github.com/soc), for this
contribution.

#### Futures improved

This [blog post series](https://github.com/viktorklang/blog)
by Viktor Klang explores the diverse improvements made to
`scala.concurrent.Future` for 2.12.

#### Scaladoc look-and-feel overhauled

Scaladoc's output is now more attractive, more modern, and easier
to use.

Thanks, [Felix Mulder](https://github.com/felixmulder), for leading
this effort.

#### Scaladoc now supports doc comments in Java sources

Thanks, [Jakob Odersky](https://github.com/jodersky), for this fix to [SI-4826](https://issues.scala-lang.org/browse/SI-4826).

This feature is enabled by default, but can be disabled with:

    scalacOptions in (Compile, doc) += "-no-java-comments"

#### Partial unification of type constructors (SI-2712)

Compiling with `-Ypartial-unification` adds partial unification of type constructors, fixing the notorious [SI-2712](https://issues.scala-lang.org/browse/SI-2712), thanks to [Miles Sabin](https://github.com/milessabin).

### Breaking changes

#### SAM types

Implicit conversion of function types to SAM types won't kick in as often now, since the compiler's own SAM conversion takes priority:

    trait MySam { def apply(x: Int): String }
    implicit def unused(fun: Int => String): MySam =
      new MySam { def apply(x: Int) = fun(x) }
    // uses SAM conversion, not the `unused` implicit
    val sammy: MySam = (_: Int).toString

To retain the old behavior, you may compile under `-Xsource:2.11`, or disqualify the type from being a SAM (e.g. by adding a second abstract method).

#### Inferred types for `val` (and `lazy val`)

[#5141](https://github.com/scala/scala/pull/5141) and
[#5294](https://github.com/scala/scala/pull/5294) align type
inference for `def`, `val`, and `lazy val`, fixing assorted
corner cases and inconsistencies.  As a result, the inferred type
of a `val` or `lazy val` may change.

In particular, `implicit val`s that didn't need explicitly declared
types before may need them now.  (This is always good practice
anyway.)

You can get the old behavior with `-Xsource:2.11`.  This may be
useful for testing whether these changes are responsible if your
code fails to compile.

[Lazy vals and objects](https://github.com/scala/scala/pull/5294) have been reworked,
and those defined in methods now use a [more efficient representation](https://github.com/scala/scala/pull/5374)
that allows synchronization on the holder of the `lazy val`, instead of the surrounding class (as in Dotty).

#### Changed syntax trees (affects macro and compiler plugin authors)

PR [#4794](https://github.com/scala/scala/pull/4749) changed the syntax trees for selections of statically accessible symbols. For example, a selection of `Predef` no longer has the shape `q"scala.this.Predef"` but simply `q"scala.Predef"`. Macros and compiler plugins matching on the old tree shape need to be adjusted.



## Binary compatibility

Since Scala 2.11, minor releases of Scala are binary compatible with each other. The [Scala 2.11.1 release notes](http://scala-lang.org/news/2.11.1) explain in more detail on how binary compatibility works in Scala.
Scala 2.12 will continue this tradition: every 2.12.x release will be binary compatible with 2.12.0.

Although Scala 2.11 and 2.12 are mostly source compatible to facilitate cross-building, they are not *binary* compatible.  This allows us to keep improving the Scala compiler and standard library.  We are working with the community to ensure that core projects in the Scala eco-system become available for 2.12.  Please refer to this growing [list of libraries and frameworks](https://github.com/scala/make-release-notes/blob/2.12.x/projects-2.12.md).


## Contributors

A big thank you to everyone who's helped improve Scala by reporting bugs, improving our documentation, spreading kindness in mailing lists and other public fora, and submitting and reviewing pull requests! You are all magnificent.

Scala 2.12.0 is the result of merging over [500 pull requests](https://github.com/scala/scala/pulls?utf8=%E2%9C%93&q=is%3Amerged%20label%3A2.12%20) out of about [600 received PRs](https://github.com/scala/scala/pulls?utf8=%E2%9C%93&q=is%3Apr%20label%3A2.12%20). The [contributions to 2.12.x over the last 2 years](https://github.com/scala/scala/graphs/contributors?from=2014-11-01&to=2016-10-29&type=c) [break down](https://docs.google.com/spreadsheets/d/16zVViCpJEZn_x2RlYFh-xAOiHJG3SrYYpfetRr5cu_Y/edit#gid=912693440) as 64/32/4 between the Scala team at Lightbend (lrytz, retronym, adriaanm, SethTisue, szeiger), the community and EPFL.

Thank you very much to all contributors that helped realize this Scala release!


## Release notes

Improvements to these release notes [are welcome!](https://github.com/scala/make-release-notes/blob/2.12.x/hand-written.md)

## Obtaining Scala
* Install a Java 8 runtime (Java 9 is not yet supported).
* Download a distribution from [scala-lang.org](http://scala-lang.org/download/2.12.0.html)
* Bump the `scalaVersion` setting in your sbt-based project. We recommend upgrading to 0.13.13 for [faster compilation](https://github.com/sbt/sbt/pull/2754) and much more!
* Obtain JARs via [Maven Central](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22org.scala-lang%22%20AND%20v%3A%222.12.0%22)
