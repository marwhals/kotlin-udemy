package section7LambdasCollectionsGenerics.Generics

import java.math.BigDecimal

fun main(args: Array<String>) {

    val list = mutableListOf("Hello")
    list.add("another string")
    list.printCollection()


    val bdList = mutableListOf(BigDecimal(12.22), BigDecimal(212.22342), BigDecimal(452.1212), BigDecimal(-12.22))
    bdList.printCollection()

}

fun <T> List<T>.printCollection() {
    for (item in this) {
        println(item)
    }
}