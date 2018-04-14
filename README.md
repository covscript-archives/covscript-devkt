# covscript-devkt

The DevKt plugin for CovScript

# Build

First clone this repo and the main DevKt repo:

```
$ git clone https://github.com/covscript/covscript-devkt.git
$ git clone https://github.com/ice1000/dev-kt.git
```

Build the main DevKt repo first:

```
$ gradlew jar
```

Then copy the built jar under `build/libs` to the `lib` directory in this repo and build this repo:

```
$ gradle jar
```

Then load both jars in one JVM.

Now you can edit CovScript files in DevKt!
