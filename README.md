# Scala Release Notes Creator

This project generates the HTML release notes for Scala.   Its goal is to be minimal and sufficient.   Not an ideal example of Scala code,
but perhaps shows off a few standard library APIs.


## Building

1. Update the highlights notes in `hand-written.md`.
2. run `sbt -Dfile.encoding=UTF-8 console`, and then:
```
scala> MakeReleaseNotes.genPR("$PrevVersion", "$CurrentVersion", "$ReleaseYear/$ReleaseMonth/$ReleaseDay")
```


1. Fill in community project list from emails.  See the `community-projects.txt` file for the format and how to copy-paste into it.

## Contributing

Feel free to improve.   Make sure to sign the Scala CLA.
