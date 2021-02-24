rootProject.name = "otuskotlin-202012-blogprofile-av"

include("ok-common-backend")
include("ok-multiplatform")

pluginManagement {
    plugins {
        val kotlinVersion: String by settings

        kotlin("multiplatform") version kotlinVersion apply false
        kotlin("jvm") version kotlinVersion apply false
        kotlin("js") version kotlinVersion apply false

    }

    repositories {
        gradlePluginPortal()
        mavenCentral()
        jcenter()
    }
}