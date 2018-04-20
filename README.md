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

Then copy the built jar under `common/build/libs` to the `lib` directory in this repo and build this repo:

```
$ gradle jar
```

Then load both jars in one JVM.

You can do it by putting the covscript-devkt jar under `common/plugins`, and use

```
$ gradlew :swing:run
```

Now you can edit CovScript files in DevKt!
