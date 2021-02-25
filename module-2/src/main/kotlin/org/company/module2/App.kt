/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package org.company.module2

import org.company.dependency1.Library

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }

    fun someLibraryMethod(): Boolean {
        return Library().someLibraryMethod()
    }
}

fun main(args: Array<String>) {
    println(App().greeting)
}
