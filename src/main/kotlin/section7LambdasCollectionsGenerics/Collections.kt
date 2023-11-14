package section7LambdasCollectionsGenerics

fun main(args: Array<String>) {
    val strings = listOf("aasd","ewrt","ewrt","34512") // Imutable in Kotlin not Java
    println(strings.javaClass)
    /*
    - There are ways around the immutability
     */
    val emptyList = emptyList<String>()
    println(emptyList.javaClass)

    if (!emptyList.isEmpty()) {
        println(emptyList[0])
    }

    val notNullList = listOfNotNull("hello", null, "goodbye")
    println(notNullList)

    val arrayList = arrayListOf(1,2,3)
    println(arrayList.javaClass)

    val mutableList = mutableListOf<Int>(1,2,3,4)
    println(mutableList.javaClass)

    val array = arrayOf("black", "white", "purple")
    val colorList = array.toList()
    println(colorList)

    val ints = intArrayOf(1,2,3)
    println(ints.toList())

}