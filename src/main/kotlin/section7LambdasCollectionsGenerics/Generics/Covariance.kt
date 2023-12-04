package section7LambdasCollectionsGenerics.Generics

fun main(args: Array<String>) {
    val shortList: MutableList<Short> = mutableListOf(1,2,3,4,5,6)
    convertToInt(shortList)
}

fun convertToInt(collection: MutableList<Number>) {
    for (num in collection) {
        println("${num.toInt()}")
    }
}

open class Flower {

}

//Out keyword -> now covariant
class Garden<out T: Flower>(val something: T) {

    val flowers: List<T> = listOf()

    fun pickFlower(i: Int): T = flowers[i]
    /*
    - Cant use flower in the in position i.e as a parameter - only in the out position
     */
//    fun plantFlower(flower: T) {
//     --This wont compile
//    }

}

class Rose: Flower() {

}

fun tendGarden(roseGarden: Garden<Rose>) {
    waterGarden(roseGarden)
}

fun waterGarden(garden: Garden<Flower>) {

}