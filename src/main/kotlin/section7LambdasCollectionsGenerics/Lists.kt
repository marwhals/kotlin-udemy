package section7LambdasCollectionsGenerics

fun main(args: Array<String>) {
    val strings = listOf("summer","summer", "ewrt", "ewrt", "34512")
    val colorList = listOf("blue", "red", "super-red", "green")

    println(strings.last())
    println(strings.asReversed())

    println(strings.getOrNull(5))

    val ints = listOf(1,2,3,4,54,5,6)
    println(ints.max())

    println(colorList.zip(strings))

    val mergedList = listOf(colorList, strings)
    println(mergedList)

    val combinedList = colorList + strings
    println(combinedList)

    val noDupsList = colorList.union(strings)
    println(noDupsList)

    val noDupColors = colorList.distinct()
    println(noDupColors)

    val mutableSeasons = strings.toMutableList()
    mutableSeasons.add("Some other season")
    println(mutableSeasons)

}