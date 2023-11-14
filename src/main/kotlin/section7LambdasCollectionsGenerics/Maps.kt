package section7LambdasCollectionsGenerics

import Section4_DataTypesNullReferences.printText

fun main(args: Array<String>) {

    val immutableMap = mapOf<Int, Car>(
        1 to Car("red", "honda", 123),
        2 to Car("green", "honda", 123),
        3 to Car("yellow", "nissan", 547869)
    )

    println(immutableMap.javaClass)
    println(immutableMap)

    val mutableMap = mutableMapOf<String, Car>(
        "bobs car" to Car("red","hyundai",1234),
        "carls car" to Car("green","hyundai",2334)
    )

    val pair = Pair(10, "ten")
    val (firstValue, secondValue) = pair
    println(firstValue)
    println(secondValue)

    for ((key,value) in mutableMap) {
        println(key)
        println(value)
    }

    val car = Car("blue", "Corvette", 1959)
    val (color, model, year) = car //We need to implment component functions before this 'destructuring' can be done.
    println("color = $color, model = $model, and year = $year")

}

class Car(val color: String, val model: String, val year: Int) {
    operator fun component1() = color
    operator fun component2() = model
    operator fun component3() = year
}