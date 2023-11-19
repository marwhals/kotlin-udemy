package section7LambdasCollectionsGenerics.Generics

/*
- Type erasure
 */

fun main(args: Array<String>) {

    val ints = listOf(1, 2, 3, 4, 5)
    val shorts: List<Short?> = listOf(10, 20, 30, 40)
    val float: List<Float?> = listOf(100.3f, -231.45f)
    val strings = listOf("1", "2", "3")
    var listAny: Any = listOf("1", "2", "3")

    if (strings is List<String>) {
        println("This list contains strings")
    }

    if (listAny is List<*>) {
        println("Yes, this is a list. Thank you start projection!")
    }

    listAny = listOf(1,2,3,4)
    if (listAny is List<*>) {
        println("This list contains strings")
        val strList = listAny as List<String>
        println(strList[1].replace("str", "string"))
    }

    convertToInt(ints)
    convertToInt(shorts)

    append(StringBuilder("String 1"), StringBuilder("String 2"))

//    printCollection(shorts)
    printCollection(strings)

}

fun <T : Any> printCollection(collection: List<T>) {
    for (item in collection) {
        println(item)
    }
}

fun <T> append(item1: T, item2: T)
        where T : CharSequence, T : Appendable {
    println("Result is ${item1.append(item2)}")
}

fun <T : Number?> convertToInt(collection: List<T>) {
    for (num in collection) {
        println("${num?.toInt()}")
    }
}