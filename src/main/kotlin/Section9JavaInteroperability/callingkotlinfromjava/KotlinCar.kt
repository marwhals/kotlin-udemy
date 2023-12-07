@file:JvmName("StaticCar")

package Section9JavaInteroperability.callingkotlinfromjava

import java.io.IOException

/*
- The @static annotation tell the compiler to generate two versions of the function
- One within the instance and also a static one that can be called form Java
 */

fun topLevel() = println("I'm in the Car file!")

fun main(args: Array<String>) {
    "Print this".print()
    KotlinCar.carComp() //Notice the difference with what is in Main
}

@JvmOverloads fun defaultArgs(str: String, num: Int = 25) {

}

@Throws(IOException::class)
fun doIO() {
    throw IOException()
}

object SingletonObj {
    @JvmStatic fun doSomething() = println("I'm doing something in the singleton object")
}

// See documentation @JvmField <- dont generate getters and setters
class KotlinCar(val color: String, @JvmField val model: String, val year: Int, val isAutomatic: Boolean) {


    companion object { //Jvm static.... compiler will generate both versions of the code. A static one for Java
        const val constant = 25; // Doesn't need any kind of annotation modifier
        @JvmField val isAuto = false
        @JvmStatic fun carComp() = println("I'm in Car's companion object")
    }

    fun printMe(text: String) {
        println("I don't expect a null value: $text")
    }

//    var color: String = color
//        private set(value) {
//            field = "always green"
//        }

}

fun String.print() {
    println(this)
}