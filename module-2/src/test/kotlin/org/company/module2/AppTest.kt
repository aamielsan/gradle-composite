/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package org.company.module2

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class AppTest {
    @Test fun testAppHasAGreeting() {
        val classUnderTest = App()
        assertNotNull(classUnderTest.greeting, "app should have a greeting")
    }

    @Test fun `someLibraryMethod returns true`() {
        val classUnderTest = App()
        assertEquals(true, classUnderTest.someLibraryMethod())
    }
}