package section7LambdasCollectionsGenerics.Generics

import java.math.BigDecimal

/*
- Reification is a Kotlin feature that prevents the type from being erased at runtime
- Use it when you want to check the type withing a function
 */
fun main(args: Array<String>) {
    val mixedList: List<Any> = listOf("string", 1, BigDecimal(123.452), "fall", BigDecimal(-12321.1232))
    val bigDecimalsOnly = getElementsOfType<BigDecimal>(mixedList)

    for (item in bigDecimalsOnly) {
        println(item)
    }

}

inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {
    var newList: MutableList<T> = mutableListOf()
    for(element in list) {
        if (element is T) {
            newList.add(element)
        }
    }

    return newList
}