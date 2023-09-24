package Section4_DataTypesNullReferences

import java.math.BigDecimal

fun main(args: Array<String>) {
    val intergsz = 10
    val longsz = 10L

    // Kotlin doesnt widen types us toLong() function
    // Kotlin will widen literals

        val booleans = true

    val vacationTime = false
    val onVacation = DummyClass().isVacationTime(vacationTime) // Calling the java code

    println(onVacation)

    //Kotlin compiles to primitve behind the scenes
    // Note kotlin returns unit
    // Nothing is a subclass of any class

    // ------ ARRAYS
    val names = arrayOf("steve","barry")
    val longs = arrayOf<Long>(112,323)
    val evenNumbers = Array(16) { i -> i * 2 }

    for (number in evenNumbers) {
        println(number)
    }

    val lotsOfNumbers = Array(1000) {i -> i + 1}
    val allZeros = Array(1000) {0}

    var someArray: Array<Int>
    someArray = arrayOf(1,2,3,4)
    for (number in someArray) {
        println(number)
    }

    val mixedArray = arrayOf("hello", 123, BigDecimal(12.5), 'a')
    for (element in mixedArray) {
        println(element)
    }

    println(mixedArray.isArrayOf<Any>())
//    println(mixedArray is Array<Any>)

    val myIntArray = intArrayOf(1,3,2,4,5,1)
    DummyClass().printNumbers(myIntArray)
}