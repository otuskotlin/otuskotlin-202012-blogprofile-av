plugins {
    kotlin("js") apply false
    kotlin("jvm") apply false
    kotlin("multiplatform") apply false
}
group = "ru.otus.otuskotlin.blogprofile"
version = "0.0.1"

allprojects {
    repositories {
        mavenCentral()
        jcenter()
    }
}