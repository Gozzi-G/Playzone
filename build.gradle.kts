buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Dependencies.Kotlin.gradlePlugin)
        classpath("com.android.tools.build:gradle:7.2.1")
    }
}

//plugins {
//    //trick: for the same plugin versions in all sub-modules
//    id("com.android.application").version("7.2.2").apply(false)
//    id("com.android.library").version("7.2.2").apply(false)
//    kotlin("android").version("1.7.10").apply(false)
//    kotlin("multiplatform").version("1.7.10").apply(false)
//}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
