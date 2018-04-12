# covscript-devkt

The DevKt plugin for CovScript

# Build

First clone this repo:

```
$ git clone https://github.com/covscript/covscript-devkt.git
```

Then build this repo:

```
$ gradle jar
```

Then:

+ put the compiled jar together with a DevKt release
+ create `config.propreties` and write `languageExtensions=org.covscript.devkt.lang.CovScript`
+ load both jars in a JVM

Now you can edit CovScript files in DevKt!
