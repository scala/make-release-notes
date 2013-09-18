# Scala Release Notes Creator

This project generates the HTML release notes for Scala.   Its goal is to be minimal and sufficient.   Not an ideal example of Scala code,
but perhaps shows off a few standard library APIs.


## Building

For now, it's still mostly manual.   What you need to do:

1. Fill in community project list from emails.  See the `community-projects.txt` file for the format and how to copy-paste into it.
2. Update the highlights notes in `hand-written.md`.
3. run `sbt -Dfile.encoding=UTF-8 console`, and then the following if you want .html output:

```
scala> MakeReleaseNotes(new java.io.File("~/git/scala"), "v2.9.2", "v2.9.3")
scala> MakeReleaseNotes(new java.io.File("~/git/scala"), "v2.9.2", "v2.9.3")(MarkDown) // markdown for scala-lang.org
```

where the two strings are the tags to compare.

To make the download page:

```
scala> new MakeDownloadPage("2.10.3-RC2").write()
```

## Contributing

Feel free to improve.   Make sure to sign the Scala CLA.
