package com.example.demolib.test

import com.example.demolib.LibraryMain
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LibraryTest1 {
    @Test
    fun test1() {
        assertEquals(8, LibraryMain.add(5,3),"5+3 should be 8")
    }
    @Test
    fun test2() {
        assertEquals(9, LibraryMain.mul(3,3), "3*3 should be 9")
    }
}