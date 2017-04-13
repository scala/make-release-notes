## Changes

[Significant changes](https://github.com/scala/scala/pulls?q=is%3Amerged%20milestone%3A2.12.2%20label%3Arelease-notes) since 2.12.1 include:

  - [#5245](https://github.com/scala/scala/pull/5245) The glorious return of Comma McTraily
  - [#5589](https://github.com/scala/scala/pull/5589) The thrilling continuation to the infix type printing saga
  - [#5402](https://github.com/scala/scala/pull/5402) Improve unused warnings
  - [#5724](https://github.com/scala/scala/pull/5724) Improve direct dependency experience
  - [#5816](https://github.com/scala/scala/pull/5816) Allow user-defined `[un]apply` in case companion
  - [#5663](https://github.com/scala/scala/pull/5663) Enable colored output by default on unix
  - [#5592](https://github.com/scala/scala/pull/5592) Don't keep JarFile open in ZipArchive
  - [#5667](https://github.com/scala/scala/pull/5667) -Xmaxerrs to limit messages
  - [#5659](https://github.com/scala/scala/pull/5659) Fix endless cycle in runtime reflection
  - [#5602](https://github.com/scala/scala/pull/5602) Modules w. serializable type alias "companions" are not serializable
  - [#5550](https://github.com/scala/scala/pull/5550) Fix detection of term-owned companions
  - [#5625](https://github.com/scala/scala/pull/5625) Update to [scala-parser-combinators v1.0.5](https://github.com/scala/scala-parser-combinators/releases/tag/v1.0.5)


For more information, check out [all closed bugs](https://github.com/scala/bug/issues?q=is%3Aclosed%20milestone%3A2.12.2) and [merged PRs](https://github.com/scala/scala/pulls?q=is%3Amerged%20milestone%3A2.12.2).

As usual for minor releases, Scala 2.12.2 is binary compatible with the whole Scala 2.12 series.

## Contributors

A big thank you to everyone who's helped improve Scala by reporting bugs, improving our documentation, spreading kindness in discussions around Scala, and submitting and reviewing pull requests! You are all magnificent.

This release was brought to you by 49 contributors, according to `git shortlog -sn --no-merges v2.12.1..v2.12.2`. Thank you, A. P. Marki, Jason Zaugg, Adriaan Moors, Seth Tisue, Lukas Rytz, Pap Lőrinc, Philippus Baalman, Rory Graves, Dale Wijnand, Janek Bogucki, Iulian Dragos, Stefan Zeiger, Johannes Rudolph, Edmund Noble, Lars Hupel, Masaru Nomura, allisonhb, jvican, Sébastien Doeraene, Mike Skells, Antoine Gourlay, Aaron S. Hawley, Viktor Klang, Vlad Ureche, piyush-jaiswal, ptrcarta, teldosas, wpopielarski, Alessandro Cifani, Alexey Romanov, Ben Hutchison, Carsten Varming, Evgeny Slutsky, Hao Xia, Jasper-M, Jon Pretty, Kenji Yoshida, Markus Jura, Martijn Hoekstra, Martynas Mickevičius, Miles Sabin, Oscar Boykin, Pablo Fco. Pérez Hidalgo, Paul Phillips, Rui Gonçalves, Sam Halliday, Tamer AbdulRadi, Tamer Mohammed Abdul-Radi, and Tobias Schlatter!

## Scala 2.12 Notes

The [release notes for Scala 2.12.0](https://github.com/scala/scala/releases/v2.12.0) have important information applicable to the whole 2.12 series.

## Obtaining Scala

Scala releases are available through a variety of channels, including (but not limited to):

* Bump the `scalaVersion` setting in your sbt-based project
* Download a distribution from [scala-lang.org](http://scala-lang.org/download/2.12.2.html)
* Obtain JARs via [Maven Central](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22org.scala-lang%22%20AND%20v%3A%222.12.2%22)
