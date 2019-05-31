# Scala Release Notes Creator

This project generates the HTML release notes for Scala.   Its goal is to be minimal and sufficient.   Not an ideal example of Scala code,
but perhaps shows off a few standard library APIs.


## Building

1. Update the highlights notes in `hand-written.md`.
2. run `sbt -Dfile.encoding=UTF-8`, and then:
```
> runMain MakeReleaseNotes $PrevVersion $CurrentVersion $ReleaseYear/$ReleaseMonth/$ReleaseDay "$pathToScalaScalaCheckout"
```

## Contributing

Feel free to improve.   Make sure to sign the Scala CLA.
