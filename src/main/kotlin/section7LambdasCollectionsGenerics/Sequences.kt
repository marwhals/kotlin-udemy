package section7LambdasCollectionsGenerics

import printBigLine
import section7LambdasCollectionsGenerics.CollectionsStuff.Car

/*
Streams are just sequences from java
 */

fun main(args: Array<String>) {
    val immutableMap = mapOf<Int, Car>(
        1 to Car("green", "Toyota", 2021),
        2 to Car("green", "Toyota", 2023),
        3 to Car("blue", "Nissan", 2012),
        4 to Car("purple", "Ford", 1993),
        43 to Car("green", "Ford", 1980),
        22 to Car("green", "Toyota", 1952)
    )
   /*
   - Intermediate vs termianl operations - similar to Java
    */

    println(immutableMap.asSequence().filter { it.value.model== "Ford" }
        .map {it.value.color})

    /*
    The code immiediate below will not execute
     */
    printBigLine()

    listOf("Joe", "Mary", "Jane").asSequence()
        .filter { println("filtering $it"); it[0] == 'J' }
        .map { println("mapping $it"); it.uppercase() }

    printBigLine()

    listOf("Joe", "Mary", "Jane").asSequence()
        .filter { println("filtering $it"); it[0] == 'J' }
        .map { println("mapping $it"); it.uppercase() }
        .toList()

    printBigLine()

    listOf("Joe", "Mary", "Jane").asSequence()
        .filter { println("filtering $it"); it[0] == 'J' }
        .map { println("mapping $it"); it.uppercase() }
        .find { it.endsWith('E') }

    printBigLine()

    listOf("Joe", "Mary", "Jane")
        .filter { println("filtering $it"); it[0] == 'J' }
        .map { println("mapping $it"); it.uppercase() }
        .find { it.endsWith('E') }

    printBigLine()
/*
Care with the order of map and filter
 */
    listOf("Joe", "Mary", "Jane")
        .map { println("mapping $it"); it.uppercase() }
        .filter { println("filtering $it"); it[0] == 'J' }
        .find { it.endsWith('E') }

}