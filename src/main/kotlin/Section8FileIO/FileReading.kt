package Section8FileIO

import java.io.File

fun main(args: Array<String>) {
    /*
    - Funtions with use in the name will close the resource for you
     */
    val lines = File("testFile.txt").reader().use { it.readText() }
    println(lines)
    File("testFile.txt").reader().forEachLine { println(it) }
//    File("testFile.txt").reader().useLines { sequence -> sequence.forEach { println(it)} }
    File("testFile.txt").reader().useLines { it -> it.forEach { println(it)} }

}