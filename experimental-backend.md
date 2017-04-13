# Experimental Backend in Scala 2.11

Scala 2.11 ships with an experimental backend named "GenBCode", originally implemented by [@magarciaEPFL](https://github.com/magarciaEPFL).
This backend will become the new default in Scala 2.12.
Given that the new backend is experimental in Scala 2.11, it can be modified and extended without compatibility concerns.
Most of the work towards the Scala 2.12 backend happens in the 2.11 branch and flows into 2.11.x minor releases.

This gives you the chance to preview pieces of Scala 2.12 just by enabling some compiler flags in 2.11!

## Enabling GenBCode

`-Ybackend:GenBCode` enables the new backend.

GenBCode without any further compiler flags is a drop-in replacement for the current backend ("GenASM").
The generated bytecode is binary compatible, although not exactly the same; some instruction sequences may differ.
If you find a binary incompatibility, please [report an issue](https://issues.scala-lang.org/secure/Dashboard.jspa).

## Delambdafy-Method

`-Ydelambdafy:method` is an experimental option in Scala 2.11 to alter the translation of lambdas, implemented by [@JamesIry](https://github.com/JamesIry).

Traditionally, the anonymous class generated for a lambda contains the lambda body in the `apply` method of the class.
When using delambdafy-method, a method containing the lambda body is generated for each lambda, and the anonymous class delegates to this method.

Delambdafy-method is a requirement for emitting lambdas in Java 8 style, as explained in detail in [this Gist by @retronym](https://gist.github.com/retronym/0178c212e4bacffed568).

## Target jvm-1.8

`-target:jvm-1.8` instructs the Scala compiler to generate classfiles of version 52 (the default is `jvm-1.6`, generating classfiles of version 50).

This option is one of the requirements to enable emitting lambdas in Java 8 style.

## Scala-Java8-Compat

The [`scala-java8-compat` library](https://github.com/scala/scala-java8-compat) defines subtypes of Scala's `FunctionN` that have a single abstract method. 

The `FunctionN` traits in Scala are compiled to interface classfiles with multiple abstract methods (`compose`, `apply`, `andThen`, specialized variants of `apply`).
The compat library compiles to Java 8 bytecode and makes use of [default methods](https://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html) for all methods but `apply`.

## Emitting Java 8 Style Lambdas

The Scala 2.11.7 compiler emits lambdas in Java 8 style (using `invokedynamic` and LambdaMetaFactory) if the following conditions are met:
  - the compiler is running on Java 8
  - `-Ybackend:GenBCode` is enabled
  - `-Ydelambdafy:method` is enabled
  - `-target:jvm-1.8` is enabled
  - the scala-java8-compat library is on the compiler's classpath

In an SBT project, this can be achieved using the following settings:

    libraryDependencies += "org.scala-lang.modules" %% "scala-java8-compat" % "0.7.0"
    
    scalacOptions ++= List("-Ybackend:GenBCode", "-Ydelambdafy:method", "-target:jvm-1.8")

An sbt project with these options can be found here: https://github.com/lrytz/experimental-backend-2.11

[The Gist by @retronym](https://gist.github.com/retronym/0178c212e4bacffed568) explains all the glorious details required to generate Java 8 style lambdas from Scala code.

## New Optimizer

`-Yopt:l:classpath` enables the new optimizer.

As part of the new backend for Scala 2.12 we are developing a new inliner and bytecode optimizer.
The inliner is already available in Scala 2.11.7 and can be enabled using the `-Yopt` compiler option.
Check `-Yopt:help` to see the available optimizations.

If you encounter a bug, please file an issue on this bugtracker: https://github.com/scala-opt/scala/issues