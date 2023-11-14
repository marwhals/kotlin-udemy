package section7LambdasCollectionsGenerics

fun main(args: Array<String>) {

    /*
    - Set are immutable
     */
    val setInts = setOf(1,2,3,4,5,6,123)
    println(setInts.plus(11111))
    println(setInts.plus(1))
    println(setInts.minus(1))
    println(setInts.minus(99999999999999))
    println(setInts.average())
    println(setInts.drop(4))

    /*
    - Mubtable interface is often a sub interface of the immutable i.e for mutability use functions in the mutable interface
     */

    val setIntsMutable = mutableSetOf(1,2,3,4,5,6,123)
    println(setIntsMutable.plus(10))
    println(setIntsMutable)

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
/* *
 - Alternatvely make this a data class
 */
class Car(val color: String, val model: String, val year: Int) {
    operator fun component1() = color
    operator fun component2() = model
    operator fun component3() = year
}