The 2.11.11 release concludes the 2.11.x series, with no further releases planned. Please consider upgrading to 2.12!

Note: please **do not use 2.11.9 and 2.11.10**, which introduced significant regressions (see below).

## Changes

[Significant changes](https://github.com/scala/scala/pulls?q=is%3Amerged%20milestone%3A2.11.9%20label%3Arelease-notes) since 2.11.8 include:

  - #5343 Add support for higher order unification under `-Ypartial-unification`
  - #5341 Fix for higher-kinded GADT refinement
  - #5061 JMH-based benchmark framework
  - #5026 Upgrade to latest scala-xml ([1.0.5](https://github.com/scala/scala-xml/releases/v1.0.5))

2.11.11 resolves the following regressions introduced in 2.11.9 and 2.11.10:

  - #5730 Allow user-defined apply/unapply method in case class companion under `-Xsource:2.12` (improved by #5828 in 2.11.10 and #5846 in 2.11.11)
  - #5821 Revert #5664 because the binary incompatible change leaks via erasure (in 2.11.10)

Our special thanks to @xuwei-k and @sjrd for reporting and helping diagnose these regressions.

For more information, check out [all closed bugs](https://github.com/scala/bug/issues?utf8=%E2%9C%93&q=is%3Aclosed%20milestone%3A2.11.9) and merged PRs:
  - [2.11.9](https://github.com/scala/scala/pulls?q=is%3Amerged%20milestone%3A2.11.9)
  - [2.11.10](https://github.com/scala/scala/pulls?q=is%3Amerged%20milestone%3A2.11.10)
  - [2.11.11](https://github.com/scala/scala/pulls?q=is%3Amerged%20milestone%3A2.11.11)


As usual for minor releases, Scala 2.11.11 is binary compatible with the whole Scala 2.11 series (with the exception of 2.11.9, which should not be used to publish artifacts, see #5821).

To share your feedback on this release, please use [this Scala contributors thread](https://contributors.scala-lang.org/t/upcoming-scala-releases-2-11-11-2-12-2-and-2-13-0-m1/599).

## Contributors

A big thank you to everyone who's helped improve Scala by reporting bugs, improving our documentation, spreading kindness in discussions around Scala, and submitting and reviewing pull requests! You are all magnificent.

This release was brought to you by 33 contributors, according to `git shortlog -sn --no-merges v2.11.8..v2.11.11`. Thank you, Adriaan Moors, A. P. Marki, Jason Zaugg, Seth Tisue, Lukas Rytz, Performant Data LLC, Stefan Zeiger, Pap Lőrinc, Iulian Dragos, Rory Graves, Miles Sabin, Martijn Hoekstra, Mike Skells, Sébastien Doeraene, Dale Wijnand, Raphael Jolly, ptrcarta, Łukasz Gieroń, Carsten Varming, CodingTwinky, Jasper-M, Johannes Rudolph, Krzysztof Romanowski, Martynas Mickevičius, Masaru Nomura, Nicolas Stucki, Oscar Boykin, Paul Kernfeld, Philippus Baalman, Tobias Schlatter, Viktor Klang, af, and jvican!


## Scala 2.11 Notes

The [release notes for Scala 2.11.0](https://github.com/scala/scala/releases/v2.11.0) have important information applicable to the whole 2.11 series.

## Obtaining Scala

Scala releases are available through a variety of channels, including (but not limited to):

* Bump the `scalaVersion` setting in your sbt-based project
* Download a distribution from [scala-lang.org](http://scala-lang.org/download/2.11.11.html)
* Obtain JARs via [Maven Central](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22org.scala-lang%22%20AND%20v%3A%222.11.11%22)
