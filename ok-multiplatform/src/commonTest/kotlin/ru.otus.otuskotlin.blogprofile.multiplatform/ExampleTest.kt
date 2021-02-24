package ru.otus.otuskotlin.blogprofile.multiplatform

import kotlin.test.*;

class ExampleTest{

    @Test
    fun testExample(){
        val str = "multiplatform test";
        assertNotEquals(str,"wrong text", "bad text")
    }
}