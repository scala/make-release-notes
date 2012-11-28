
### New features for Scala 2.10.0-RC3

This is the third RC of Scala 2.10.0 release. This release comes with a few new shiny features, notably:

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
* Dynamic Types no longer experimental
    * [http://docs.scala-lang.org/sips/pending/type-dynamic.html](http://docs.scala-lang.org/sips/pending/type-dynamic.html)
* Improved Pattern Matcher
* Modularized Language features
    * [http://docs.scala-lang.org/sips/pending/modularizing-language-features.html](http://docs.scala-lang.org/sips/pending/modularizing-language-features.html)
* Scala Reflection (Experimental)
    * [https://docs.google.com/document/d/1Z1VhhNPplbUpaZPIYdc0_EUv5RiGQ2X4oqp0i-vz1qw/edit#heading=h.pqwdkl](https://docs.google.com/document/d/1Z1VhhNPplbUpaZPIYdc0_EUv5RiGQ2X4oqp0i-vz1qw/edit#heading=h.pqwdkl)
* Macros (Experimental)
    * [http://docs.scala-lang.org/sips/pending/self-cleaning-macros.html](http://docs.scala-lang.org/sips/pending/self-cleaning-macros.html)
* Scaladoc Improvements
    * Implicits (-implicits flag)
    * Diagrams (-diagrams flag, requires graphviz)
    * Groups (-groups)
* Akka Actors now included in distribution
    * Scala actors library deprecated in favor of Akka
    * **Actors migration library included (version 1.0.0-RC2)** to ease migration from Scala -> Akka 
    * See the [actors migration project](http://docs.scala-lang.org/actors-migration/) for more information.
* Deprecations and cleanup
    * Floating point and octal literal syntax deprecation
    * Removal of scala.dbc
* Performance Improvements
    * Faster inliner
    * `Range#sum is now O(1)
    * Update of ForkJoin library
    * Fixes in immutable `TreeSet`/`TreeMap`
    * Improvements to PartialFunctions
* Addition of `???` and `NotImplementedError`
* Addition of `IsTraversableOnce` + `IsTraversableLike` type classes for extension methods

### Scala IDE for Eclipse

If you are an Eclipse user, you can install the Scala IDE with Scala 2.10.0-RC3 through one of the following update-sites:

* Eclipse 3.7 (Indigo) - [http://download.scala-ide.org/sdk/e37/scala210/dev/site/](http://download.scala-ide.org/sdk/e37/scala210/dev/site/)
* Eclipse 3.8/4.2 (Juno) - [http://download.scala-ide.org/sdk/e38/scala210/dev/site/](http://download.scala-ide.org/sdk/e38/scala210/dev/site/)