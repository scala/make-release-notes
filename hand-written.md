We are happy to announce the availability of Scala 2.12.0!

The Scala 2.12 compiler has been completely overhauled to make use of the new VM features available in Java 8!
  - A trait [compiles directly to an interface](#trait-compiles-to-an-interface) with default methods for improved binary compatibility.
  - A function literal (lambda) can now target any [Single Abstract Method (SAM) type](#java-8-style-lambdas), including Scala's built-in `FunctionN` classes. Scala code can seamlessly use libraries with higher-order functions written in Java 8, and vice versa. Code generation for function literals uses `invokedynamic` to avoid emitting a classfile at compile time, just like Java 8.

This release ships with a powerful new optimizer. Many more (effectively) final methods, including those defined in objects and traits, are now inlined. As well, closure allocations, dead code and [box/unbox pairs](https://github.com/scala/scala/pull/4858) are eliminated more effectively.

From now on, 2.12.x releases will be fully binary compatible. This release is identical to 2.12.0-RC2.

Our [roadmap](https://github.com/scala/scala/milestones) lists the following upcoming releases for 2016: 2.12.1 will be out shortly (by the end of November) to address some known (but rare) issues in 2.12.0, and 2.11.9 is the last planned 2.11.x release (due by mid December). In the next few weeks, we at Lightbend will share our plans for Scala 2.13.


## Known issues
There are some [known issues](https://issues.scala-lang.org/browse/SI-10009?jql=project%20%3D%20SI%20AND%20affectedVersion%20%3D%20%22Scala%202.12.0%22) with this release that [will be resolved](https://github.com/scala/scala/pulls?q=is%3Apr+milestone%3A2.12.1+label%3Arelease-notes) in 2.12.1, due by the end of November.

The heavy use of default methods for compiling traits caused some performance regressions in the
startup time of Scala applications. Note that steady-state performance is not affected according to
our measurements.

The regression was mitigated 2.12.0-RC2 (and the final release) by generating forwarder methods in
classes that inherit concrete methods form trait. A summary and links to detailed information is
available in the description of pull request [#5429](https://github.com/scala/scala/pull/5429).

Please let us know if you notice any performance regressions. We will continue to tweak the bytecode
during the 2.12.x cycle to get the best performance out of the JVM.

We hope to address the following in a future 2.12.x release:

  - [SI-9824](https://issues.scala-lang.org/browse/SI-9824): Parallel collections are prone to deadlock in the REPL and in object initializers.

## Obtaining Scala
### Java 8 runtime
Install a recent build of the Java 8 Platform, from [OpenJDK](http://openjdk.java.net/install/) or [Oracle](http://www.oracle.com/technetwork/java/javase/downloads/index.html). Any Java 8 compliant run-time will do.
We are planning to add (some) support for Java 9 in the near future. Full Java 9 support will be part of the 2.13 roadmap discussions.

### Build tool
We recommend using [sbt 0.13.13](http://www.scala-sbt.org/download.html). Simply bump the `scalaVersion` setting in your existing project, or start a new project using `sbt new scala/scala-seed.g8`. We strongly recommend upgrading to sbt 0.13.13 for [templating support using the new command](https://github.com/sbt/sbt/pull/2705), [faster compilation](https://github.com/sbt/sbt/pull/2754), and [much more](http://www.scala-sbt.org/0.13/docs/sbt-0.13-Tech-Previews.html#sbt+0.13.13)!

Please head over to the [scala-seed repo](https://github.com/scala/scala-seed.g8) to extend this [giter8 template](https://github.com/foundweekends/giter8) with an example of your favorite 2.12 feature!

Scala also works with ant, [maven](http://docs.scala-lang.org/tutorials/scala-with-maven.html) and [gradle](https://docs.gradle.org/current/userguide/scala_plugin.html). You can also download a distribution from [scala-lang.org](http://scala-lang.org/download/2.12.0.html), or obtain the JARs yourself via [Maven Central](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22org.scala-lang%22%20AND%20v%3A%222.12.0%22).


## Contributors

A big thank you to everyone who's helped improve Scala by reporting bugs, improving our documentation, spreading kindness in mailing lists and other public fora, and submitting and reviewing pull requests! You are all magnificent.

Scala 2.12.0 is the result of merging over [500 pull requests](https://github.com/scala/scala/pulls?utf8=%E2%9C%93&q=is%3Amerged%20label%3A2.12%20) out of about [600 received PRs](https://github.com/scala/scala/pulls?utf8=%E2%9C%93&q=is%3Apr%20label%3A2.12%20). The [contributions to 2.12.x](https://github.com/scala/scala/graphs/contributors?from=2014-11-01&to=2016-10-29&type=c) over the last 2 years [were split](https://docs.google.com/spreadsheets/d/16zVViCpJEZn_x2RlYFh-xAOiHJG3SrYYpfetRr5cu_Y/edit#gid=912693440) as 64/32/4 between the Scala team at Lightbend (lrytz, retronym, adriaanm, SethTisue, szeiger), the community and EPFL.

The new encodings of traits, lambdas and lazy vals were developed in fruitful collaboration with the Dotty team.

Thank you very much to all contributors that helped realize this Scala release!


## Binary compatibility

Since Scala 2.10, minor releases of Scala are binary compatible with each other. We maintain [this policy](/documentation/compatibility.html) for 2.12.x.

Although Scala 2.11 and 2.12 are mostly source compatible to facilitate cross-building, they are not *binary* compatible.  This allows us to keep improving the Scala compiler and standard library.


## Scala 2.12 Overview

Scala 2.12 is all about making optimal use of Java 8's new features (and thus generates code that requires a Java 8 runtime).
  - Traits ([#5003](https://github.com/scala/scala/pull/5003)) and functions are compiled to their Java 8 equivalents. The compiler no longer generates trait implementation classes (`T$class.class`) and anonymous function classes (`C$$anonfun$1.class`).
  - We treat Single Abstract Method types and Scala's builtin function types uniformly from type checking to the back end ([#4971](https://github.com/scala/scala/pull/4971)).
  - In addition to compiling functions, we also use `invokedynamic` for a more natural encoding of other language features ([#4896](https://github.com/scala/scala/pull/4896)).
  - We've standardized on the GenBCode back end ([#4814](https://github.com/scala/scala/pull/4814), [#4838](https://github.com/scala/scala/pull/4838)) and the flat classpath implementation is now the default ([#5057](https://github.com/scala/scala/pull/5057)).
  - The optimizer has been completely overhauled for 2.12.

Except for the breaking changes listed below, code that compiles on 2.11.x without deprecation warnings should compile on 2.12.x too, unless you use experimental APIs such as reflection.  If you find incompatibilities, please [file an issue](https://issues.scala-lang.org). Cross-building is a one-line change to most sbt builds, and even provides support for [version-specific source folders](http://www.scala-sbt.org/0.13/docs/sbt-0.13-Tech-Previews.html#Cross-version+support+for+Scala+sources) out of the box, when necessary to work around incompatibilities (e.g. macros).

### New Language Features
The next sections introduce new features and breaking changes in Scala 2.12 in more detail. To understand more technicalities and review past discussions, you can also take a look at the full list of [noteworthy pull request](https://github.com/scala/scala/pulls?utf8=%E2%9C%93&q=%20is%3Amerged%20label%3A2.12%20label%3Arelease-notes%20) that went into this release.

#### Trait compiles to an interface

With Java 8 allowing concrete methods in interfaces, Scala 2.12 is able to compile a trait to a single interface classfile. Before, a trait was represented as an interface and a class that held the method implementations.

Note that the compiler still has quite a bit of magic to perform behind the scenes, so that care must be taken if a trait is meant to be implemented in Java.
Briefly, if a trait does any of the following its subclasses require synthetic code: defining fields ( `val` or `var`, but a constant is ok -- `final val` without result type), calling super, initializer statements in the body, extending a class, relying on linearization to find implementations in the right super trait.

#### Java 8-style lambdas

Scala 2.12 emits closures in the same style as Java 8, whether they target a `FunctionN` class from the standard library or a user-defined Single Abstract Method (SAM) type. The type checker accepts a function literal as a valid expression for either kind of "function-like" type (built-in or SAM). This improves the experience of using libraries written for Java 8 in Scala.

For each lambda the compiler generates a method containing the lambda body, and emits an `invokedynamic` that will spin up a lightweight class for this closure using the JDK's `LambdaMetaFactory`. Note that in the following situations, the an anonymous function class is still synthesized at compile-time:
  
  - If the SAM type is not a simple interface, for example an abstract class or a trait with a field definition (see [#4971](https://github.com/scala/scala/pull/4971))
  - If the abstract method is specialized - except for `scala.FunctionN`, whose specialized variants can be instantiated using `LambdaMetaFactory` (see [#4971](https://github.com/scala/scala/pull/4971))
  - If the function literal is defined in a constructor or a super call ([#3616](https://github.com/scala/scala/pull/3616))

Compared to Scala 2.11, the new scheme has the advantage that, in most cases, the compiler does not need to generate an anonymous class for each closure. This leads to significantly smaller JAR files.

For example, in the REPL:

```
scala> val runRunnableRun: Runnable = () => println("Run!")
runRunnableRun: Runnable = $$Lambda$1073/754978432@7cf283e1

scala> runRunnableRun.run()
Run!
```

Our support for `invokedynamic` is also exposed to macro authors, as shown in [this test case](https://github.com/scala/scala/blob/v2.12.0/test/files/run/indy-via-macro-with-dynamic-args/macro_1.scala).


#### Partial unification for type constructor inference

Compiling with `-Ypartial-unification` improves type constructor inference with support for partial unification, fixing the notorious [SI-2712](https://issues.scala-lang.org/browse/SI-2712). Thank you, [Miles Sabin](https://github.com/milessabin) for contributing [your implementation](https://github.com/scala/scala/pull/5102) (and [backporting to 2.11.9](https://github.com/scala/scala/pull/5343))!

Also, hat tip to Daniel Spiewak for [a great explanation of this feature](https://gist.github.com/djspiewak/7a81a395c461fd3a09a6941d4cd040f2).

For now, we recommend using `-Ypartial-unification` over `-Xexperimental`, as the latter enables some surprising features that will not ship with a future release of Scala.

#### Parameter names available at runtime

With [JEP-118](http://openjdk.java.net/jeps/118), parameter names can be stored in class files and be queried at runtime using reflection.
A quick REPL session shows this in action:

```
scala> case class Person(name: String, age: Int)
defined class Person

scala> val paramNames = classOf[Person].getConstructors.head.getParameters.toList
paramNames: List[java.lang.reflect.Parameter] = List(final java.lang.String name, final int age)
```

### Tooling Improvements

#### New back end

Scala 2.12 standardizes on the "GenBCode" back end, which emits code more quickly because it directly generates bytecode from Scala compiler trees, while the previous back end used an intermediate representation called "ICode".
The old back ends (GenASM and GenIcode) have been removed ([#4814](https://github.com/scala/scala/pull/4814), [#4838](https://github.com/scala/scala/pull/4838)).


#### New optimizer

The GenBCode back end includes a new inliner and bytecode optimizer. The optimizer is configured
using `-opt` compiler option, by default it removes unreachable code within a method. Check
`-opt:help` to see the list of available options for the optimizer.

The following optimizations are available:

* Inlining final methods, including methods defined in objects and final methods defined in traits
* If a closure is allocated and invoked within the same method, the closure invocation is replaced by an invocations of the corresponding lambda body method
* Dead code elimination and a small number of cleanup optimizations
* Box/unbox elimination [#4858](https://github.com/scala/scala/pull/4858): primitive boxes and tuples that are created and used within some method without exscaping are eliminated.

For example, the following code

```scala
def f(a: Int, b: Boolean) = (a, b) match {
  case (0, true) => -1
  case _ if a < 0 => -a
  case _ => a
}
```

produces, when compiled with `-opt:l:method`, the following bytecode (decompiled using cfr-decompiler):

```java
public int f(int a, boolean b) {
  int n = 0 == a && true == b ? -1 : (a < 0 ? - a : a);
  return n;
}
```

The optimizer supports inlining (disabled by default). With `-opt:l:project` code from source files currently being compiled is inlined, while `-opt:l:classpath` enables inlining code from libraries on the compiler's classpath. Other than methods marked [`@inline`](http://www.scala-lang.org/files/archive/api/2.12.0/scala/inline.html), higher-order methods are inlined if the function argument is a lambda, or a parameter of the callee.

Note that:
  - We recommend to enable inlining only for production builds, as sbt's incremental compilation does not track dependencies introduced by inlining.
  - When inlining code from the classpath, you need to ensure that all dependencies have exactly the same versions at compile time and run time.

The Scala distribution is built using `-opt:l:classpath`, which improves the performance of the Scala compiler by roughly 5% (hot and cold, measured using our [JMH-based benchmark suite](https://github.com/scala/compiler-benchmark/blob/master/compilation/src/main/scala/scala/tools/nsc/ScalacBenchmark.scala)) compared to a non-optimized build.

The GenBCode backend and the implementation of the new optimizer are built on earlier work by Miguel Garcia.


#### Scaladoc look-and-feel overhauled

Scaladoc's output is now more attractive, more modern, and easier
to use.

Thanks, [Felix Mulder](https://github.com/felixmulder), for leading
this effort.

#### Scaladoc can be used to document Java sources
This fix for [SI-4826](https://issues.scala-lang.org/browse/SI-4826) simplifies generating comprehensive documentation for projects with both Scala and Java sources. Thank you for your contribution, [Jakob Odersky](https://github.com/jodersky)!

This feature is enabled by default, but can be disabled with:

    scalacOptions in (Compile, doc) += "-no-java-comments"

Some projects with very large Javadoc comments may run into a stack overflow in the Javadoc scanner, which [will be fixed in 2.12.1](https://github.com/scala/scala/pull/5469).


#### Scala Shell ([REPL](https://en.wikipedia.org/wiki/Read%E2%80%93eval%E2%80%93print_loop))
Scala's interactive shell ships with several spiffy improvements. To try it out, launch it from the command line with the `scala` script or in sbt using the `console` task. If you like color (who doesn't!), use `scala -Dscala.color` instead until [it's turned on by default](https://github.com/scala/scala-dev/issues/256).

Since 2.11.8, the REPL uses the [same tab completion logic](https://github.com/scala/scala/pull/4725) as Scala IDE and ENSIME, which greatly improves the experience! Check out the PR description for some tips and tricks.

### Library Improvements
#### Either is now right-biased

`Either` now supports operations like `map`, `flatMap`, `contains`,
`toOption`, and so forth, which operate on the right-hand side.

(`.left` and `.right` may be deprecated in favor of `.swap` in a later release.)

The changes are source-compatible with old code (except in the
presence of conflicting extension methods).

This change has allowed other libraries, such as [cats](http://typelevel.org/cats/) to standardize on `Either`.

Thanks, [Simon Ochsenreither](https://github.com/soc), for this contribution.


#### Futures improved

This [blog post series](https://github.com/viktorklang/blog)
by Viktor Klang explores the diverse improvements made to
`scala.concurrent.Future` for 2.12.

#### Use Standard Java 8 APIs
The Scala library is [free](https://github.com/scala/scala/pull/4443) of [references](https://github.com/scala/scala/pull/4712) to `sun.misc.Unsafe`, and [no longer ships](https://github.com/scala/scala/pull/4629) with a fork of the forkjoin library.



## Breaking changes

### Lambdas and locks
TODO

### SAM types

Implicit conversion of function types to SAM types won't kick in as often now, since the compiler's own SAM conversion takes priority:

    trait MySam { def apply(x: Int): String }
    implicit def unused(fun: Int => String): MySam =
      new MySam { def apply(x: Int) = fun(x) }
    // uses SAM conversion, not the `unused` implicit
    val sammy: MySam = (_: Int).toString

To retain the old behavior, you may compile under `-Xsource:2.11`, or disqualify the type from being a SAM (e.g. by adding a second abstract method).

### Inferred types for `val` (and `lazy val`)

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

### Changed syntax trees (affects macro and compiler plugin authors)

PR [#4794](https://github.com/scala/scala/pull/4749) changed the syntax trees for selections of statically accessible symbols. For example, a selection of `Predef` no longer has the shape `q"scala.this.Predef"` but simply `q"scala.Predef"`. Macros and compiler plugins matching on the old tree shape need to be adjusted.



## Improving these notes

Improvements to these release notes [are welcome!](https://github.com/scala/make-release-notes/blob/2.12.x/hand-written.md)

