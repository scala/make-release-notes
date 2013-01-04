### New features

We are very excited to announce the final release of Scala 2.10.0!

Over the coming days and weeks, we will be publishing migration guides to help you move your code to 2.10 if you haven't already done so,
and to highlight the features you can take advantage of after upgrading.

In the mean time, here's an overview of the most prominent new features and improvements:

* Value Classes
    * [http://docs.scala-lang.org/overviews/core/value-classes.html](http://docs.scala-lang.org/overviews/core/value-classes.html)
* Implicit Classes
    * [http://docs.scala-lang.org/sips/pending/implicit-classes.html](http://docs.scala-lang.org/sips/pending/implicit-classes.html)
* String Interpolation
    * [http://docs.scala-lang.org/overviews/core/string-interpolation.html](http://docs.scala-lang.org/overviews/core/string-interpolation.html)
* Futures and Promises
    * [http://docs.scala-lang.org/overviews/core/futures.html](http://docs.scala-lang.org/overviews/core/futures.html)
* Parallel Collections are now configurable with custom thread pools
    * [http://docs.scala-lang.org/overviews/parallel-collections/overview.html](http://docs.scala-lang.org/overviews/parallel-collections/overview.html)
* New ByteCode emitter based on ASM
    * Can target JDK 1.5, 1.6 and 1.7
    * Emits 1.6 bytecode by default
    * Old 1.5 backend is deprecated
* Dynamic and applyDynamic
    * [http://docs.scala-lang.org/sips/pending/type-dynamic.html](http://docs.scala-lang.org/sips/pending/type-dynamic.html)
    * `x.foo` becomes `x.applyDynamic("foo")` if `x`'s type does not define a `foo`, but is a subtype of `Dynamic`
* Dependent method types:
    * `def identity(x: AnyRef): x.type = x` // the return type says we return exactly what we got
* A new Pattern Matcher
    * rewritten from scratch to generate more robust code (no more [exponential blow-up](https://issues.scala-lang.org/browse/SI-1133)!)
    * code generation and analyses are now independent (the latter can be turned off with `-Xno-patmat-analysis`)
* Modularized Language features
    * [http://docs.scala-lang.org/sips/pending/modularizing-language-features.html](http://docs.scala-lang.org/sips/pending/modularizing-language-features.html)
* Scaladoc Improvements
    * Implicits (-implicits flag)
    * Diagrams (-diagrams flag, requires graphviz)
    * Groups (-groups)
* Akka Actors now included in distribution
    * Scala actors library deprecated in favor of Akka
    * **Actors migration library included (version 1.0.0-RC2)** to ease migration from Scala -> Akka 
    * See the [actors migration project](http://docs.scala-lang.org/actors-migration/) for more information.
* Performance Improvements
    * Faster inliner
    * `Range#sum is now O(1)
    * Update of ForkJoin library
    * Fixes in immutable `TreeSet`/`TreeMap`
    * Improvements to PartialFunctions
* Addition of `???` and `NotImplementedError`
* Addition of `IsTraversableOnce` + `IsTraversableLike` type classes for extension methods
* Deprecations and cleanup
    * Floating point and octal literal syntax deprecation
    * Removed scala.dbc

### Experimental features:

* Scala Reflection
    * [https://docs.google.com/document/d/1Z1VhhNPplbUpaZPIYdc0_EUv5RiGQ2X4oqp0i-vz1qw/edit#heading=h.pqwdkl](https://docs.google.com/document/d/1Z1VhhNPplbUpaZPIYdc0_EUv5RiGQ2X4oqp0i-vz1qw/edit#heading=h.pqwdkl)
* Macros
    * [http://docs.scala-lang.org/sips/pending/self-cleaning-macros.html](http://docs.scala-lang.org/sips/pending/self-cleaning-macros.html)

### Scala IDE for Eclipse

You may install the Scala IDE with Scala 2.10.0 through one of the following update-sites:

* Eclipse 3.7 (Indigo) - [http://download.scala-ide.org/sdk/e37/scala210/dev/site/](http://download.scala-ide.org/sdk/e37/scala210/dev/site/)
* Eclipse 3.8/4.2 (Juno) - [http://download.scala-ide.org/sdk/e38/scala210/dev/site/](http://download.scala-ide.org/sdk/e38/scala210/dev/site/) (Support for this version is experimental.)


### Known Issues

### All fixed Issues
[project = SI AND fixVersion <= "Scala 2.10.0" AND fixVersion >= "Scala 2.10.0-M1" AND resolution = Fixed ORDER BY fixVersion ASC, priority DESC, key DESC](https://issues.scala-lang.org/secure/IssueNavigator.jspa?reset=true&jqlQuery=project+%3D+SI+AND+fixVersion+%3C%3D+%22Scala+2.10.0%22+AND+fixVersion+%3E%3D+%22Scala+2.10.0-M1%22+AND+resolution+%3D+Fixed+ORDER+BY+fixVersion+ASC%2C+priority+DESC%2C+key+DESC)