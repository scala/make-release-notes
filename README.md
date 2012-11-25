# Scala Release Notes Creator

This project generates the HTML release notes for Scala.   It's goal is to be minimal and sufficient.   Not an ideal example of scala code,
but perhaps shows off a few standard library APIs.


## Building

For now, it's still mostly manual.   What you need to do:

1. Fill in community project list from emails.  See the `community-projects.txt` file for the format and how to copy-paste into it.
2. Update the highlights notes in `hand-written.md`.
3. run `sbt console`, and then the following:

    scala> MakeReleaseNotes(new java.io.File("/path/to/scala/checkout"), "v2.9.2", "v2.10.0-RC3")

where the two strings are the tags to compare.


## Contributing

Feel free to improve.   Make sure to sign the Scala CLA.
