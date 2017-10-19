## Changes

Our [benchmarks](https://scala-ci.typesafe.com/grafana/dashboard/db/scala-benchmark?var-branch=2.12.x&from=1501580691158&to=1507711932006) show a further reduction in compile times since 2.12.3 of 5-10%.

We'd like to highlight a few of the excellent contributions by @hrhino and @TomasMikula:
  - #5867 Include the parts of a compound/refinement type in implicit scope
  - #6074 Resolve implicit instances for abstract types, according to the spec
  - #6069 Higher-kinded type variable unification

Improved jdk9 friendliness, with more to come!
  - #6097 Fix runtime reflection of empty package members under Java 9
  - #6098 Adapt to change in Java 9 classloader hierarchy

For Spark, with love:
  - #6101 Make Lazy* classes serializable 

Note that named arguments will be simplified in 2.13:
  - #6089 Deprecate assignments in argument position

Rather than pollute `/tmp`,
  - #6120 Move compilation daemon portfile under `~/.scalac/`

For more details, check out [all closed bugs](https://github.com/scala/bug/issues?q=is%3Aclosed%20milestone%3A2.12.4) and [merged PRs](https://github.com/scala/scala/pulls?q=is%3Amerged%20milestone%3A2.12.4).

As usual for minor releases, Scala 2.12.4 is binary compatible with the whole Scala 2.12 series.

## Contributors

A big thank you to everyone who's helped improve Scala by reporting bugs, improving our documentation, spreading kindness in discussions around Scala, and submitting and reviewing pull requests! You are all magnificent.

This release was brought to you by 24 contributors, according to `git shortlog -sn --no-merges v2.12.3..v2.12.4`. Thank you, Jason Zaugg, Lukas Rytz, jvican, Adriaan Moors, A. P. Marki, Harrison Houghton, Tomas Mikula, Philippus Baalman, Miles Sabin, Seth Tisue, Dhirendra Kumar Kashyap, Martijn Hoekstra, Martin Grotzke, Martynas Mickevičius, Matt Sicker, Mike, Mike Skells, Rex Kerr, cong, Allison H, Janek Bogucki, Edmund Noble, Jasper Moeys, Kenji Yoshida!

## Scala 2.12 Notes

The [release notes for Scala 2.12.0](https://github.com/scala/scala/releases/v2.12.0) have important information applicable to the whole 2.12 series.

## Obtaining Scala

Scala releases are available through a variety of channels, including (but not limited to):

* Bump the `scalaVersion` setting in your sbt-based project
* Download a distribution from [scala-lang.org](http://scala-lang.org/download/2.12.4.html)
* Obtain JARs via [Maven Central](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22org.scala-lang%22%20AND%20v%3A%222.12.4%22)
