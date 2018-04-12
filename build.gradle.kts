import org.gradle.api.internal.HasConvention
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet
import java.io.*
import java.nio.file.*
import java.util.concurrent.*
import java.util.stream.Collectors

val commitHash by lazy {
  val process: Process = Runtime.getRuntime().exec("git rev-parse --short HEAD")
  process.waitFor()
  val output = process.inputStream.use {
    it.bufferedReader().use(BufferedReader::readText)
  }
  process.destroy()
  output.trim()
}

val isCI = !System.getenv("CI").isNullOrBlank()

val shortVersion = "1.0"
val packageName = "org.covscript.devkt.lang"
val kotlinVersion: String by extra
val pluginCalculatedVersion = if (isCI) "$shortVersion-$commitHash" else shortVersion

group = packageName
version = pluginCalculatedVersion

buildscript {
  var kotlinVersion: String by extra
  kotlinVersion = "1.2.31"

  repositories {
    mavenCentral()
  }

  dependencies {
    classpath(kotlin("gradle-plugin", kotlinVersion))
  }
}

tasks.withType<Jar> {
  manifest {
    attributes(mapOf("Main-Class" to "org.ice1000.devkt.Main",
        "SplashScreen-Image" to "slpash.png"))
  }
}

val fatJar = task<Jar>("fatJar") {
  classifier = "all"
  description = "Assembles a jar archive containing the main classes and all the dependencies."
  group = "build"
  from(Callable {
    configurations.compile.map {
      @Suppress("IMPLICIT_CAST_TO_ANY")
      if (it.isDirectory) it else zipTree(it)
    }
  })
  with(tasks["jar"] as Jar)
}

plugins {
  java
  kotlin("jvm") version "1.2.31"
}

apply {
  plugin("kotlin")
}

java {
  sourceCompatibility = JavaVersion.VERSION_1_8
  targetCompatibility = JavaVersion.VERSION_1_8
}

val SourceSet.kotlin
	get() = (this as HasConvention).convention.getPlugin(KotlinSourceSet::class.java).kotlin

java.sourceSets {
  "main" {
    java.setSrcDirs(listOf("src"))
    kotlin.setSrcDirs(listOf("src"))
    resources.setSrcDirs(listOf("res"))
  }

  "test" {
    java.setSrcDirs(emptyList<Any>())
    kotlin.setSrcDirs(emptyList<Any>())
    resources.setSrcDirs(emptyList<Any>())
  }
}

repositories {
  mavenCentral()
  jcenter()
  maven("https://jitpack.io")
}

dependencies {
  compile(kotlin("compiler-embeddable", kotlinVersion))
  compileOnly(files("lib/dev-kt-v1.2-SNAPSHOT.jar"))
}

