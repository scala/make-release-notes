We are very excited to announce the final release of Scala 2.10.0!
Many thanks for your bug reports and pull requests (both code and documentation) that helped us pull this release together!

Over the coming days and weeks, we will be publishing guides to help you migrate your projects to 2.10,
and to highlight the features waiting for you after upgrading.

### New features
In the mean time, here's an overview of the most prominent new features and improvements:

* Value Classes
    * A class may now extend `AnyVal` to make it behave like a struct type (restrictions apply).
    * [http://docs.scala-lang.org/overviews/core/value-classes.html](http://docs.scala-lang.org/overviews/core/value-classes.html)
* Implicit Classes
    * The implicit modifier now also applies to class definitions to reduce the boilerplate of implicit wrappers.
    * [http://docs.scala-lang.org/sips/pending/implicit-classes.html](http://docs.scala-lang.org/sips/pending/implicit-classes.html)
* String Interpolation
    * `val what = "awesome"; println(s"string interpolation is ${what.toUpperCase}!")`
    * [http://docs.scala-lang.org/overviews/core/string-interpolation.html](http://docs.scala-lang.org/overviews/core/string-interpolation.html)
* Futures and Promises
    * Asynchronously get some JSON: `for (req <- WS.url(restApiUrl).get()) yield (req.json \ "users").as[List[User]]` (uses play!)
    * [http://docs.scala-lang.org/overviews/core/futures.html](http://docs.scala-lang.org/overviews/core/futures.html)
* Dynamic and applyDynamic
    * `x.foo` becomes `x.applyDynamic("foo")` if `x`'s type does not define a `foo`, but is a subtype of `Dynamic`
    * [http://docs.scala-lang.org/sips/pending/type-dynamic.html](http://docs.scala-lang.org/sips/pending/type-dynamic.html)
* Dependent method types:
    * `def identity(x: AnyRef): x.type = x` // the return type says we return exactly what we got
* New ByteCode emitter based on ASM
    * Can target JDK 1.5, 1.6 and 1.7
    * Emits 1.6 bytecode by default
    * Old 1.5 backend is deprecated
* A new Pattern Matcher
    * rewritten from scratch to generate more robust code (no more [exponential blow-up](https://issues.scala-lang.org/browse/SI-1133)!)
    * code generation and analyses are now independent (the latter can be turned off with `-Xno-patmat-analysis`)
* Scaladoc Improvements
    * Implicits (-implicits flag)
    * Diagrams (-diagrams flag, requires graphviz)
    * Groups (-groups)
* Modularized Language features
    * Get on top of the advanced Scala features used in your codebase by explicitly importing them.
    * [http://docs.scala-lang.org/sips/pending/modularizing-language-features.html](http://docs.scala-lang.org/sips/pending/modularizing-language-features.html)
* Parallel Collections are now configurable with custom thread pools
    * [http://docs.scala-lang.org/overviews/parallel-collections/overview.html](http://docs.scala-lang.org/overviews/parallel-collections/overview.html)
* Akka Actors now part of the distribution
    * scala.actors have been deprecated and the akka implementation is now included in the distribution.
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

### Experimental features
The following exciting -- experimental -- features are part of 2.10.0:

* Scala Reflection
    * [http://docs.scala-lang.org/overviews/reflection/overview.html](http://docs.scala-lang.org/overviews/reflection/overview.html)
* Macros
    * [http://docs.scala-lang.org/overviews/macros/overview.html](http://docs.scala-lang.org/overviews/macros/overview.html)

The API is subject to (possibly major) changes in the 2.11.x series, but don't let that stop you from experimenting with them!
A lot of developers have already come up with very cool applications for them.
Some examples can be seen at [http://scalamacros.org/news/2012/11/05/status-update.html](http://scalamacros.org/news/2012/11/05/status-update.html).

### Scala IDE for Eclipse

The Scala IDE with Scala 2.10.0 built right in is available through one of the following update-sites:

* [for Eclipse 3.7 (Indigo)](http://download.scala-ide.org/sdk/e37/scala210/dev/site/)
* [for Eclipse 3.8/4.2 (Juno)](http://download.scala-ide.org/sdk/e38/scala210/dev/site/) (Support for this version is experimental.)

Have a look at the [getting started guide](http://scala-ide.org/docs/user/gettingstarted.html) for more info.

### Known Issues
Please have a look at these critical/blocker issues scheduled [for 2.10.1](https://issues.scala-lang.org/secure/IssueNavigator.jspa?reset=true&jqlQuery=project+%3D+SI+AND+fixVersion+%3D+%22Scala+2.10.1-RC1%22+AND+resolution+%3D+Unresolved+AND+priority+%3E%3D+Critical+ORDER+BY+priority+DESC%2C+key+DESC) (RC1 out by mid-February).

### All Fixed Issues
Here's a comprehensive list of [the issues fixed since 2.9.2](https://issues.scala-lang.org/secure/IssueNavigator.jspa?reset=true&jqlQuery=project+%3D+SI+AND+fixVersion+%3C%3D+%22Scala+2.10.0%22+AND+fixVersion+%3E%3D+%22Scala+2.10.0-M1%22+AND+resolution+%3D+Fixed+ORDER+BY+fixVersion+ASC%2C+priority+DESC%2C+key+DESC).
