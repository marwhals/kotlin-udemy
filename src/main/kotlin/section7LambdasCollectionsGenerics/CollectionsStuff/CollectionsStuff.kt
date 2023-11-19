package section7LambdasCollectionsGenerics.CollectionsStuff

fun main(args: Array<String>) {
    val setsInts = setOf(10,13,423,432,132, -22)

    println(setsInts.filter { it % 2 != 0 })

    val immutableMap = mapOf<Int, Car>(
        1 to Car("green", "Toyota", 2021),
        2 to Car("green", "Toyota", 2023),
        3 to Car("blue", "Nissan", 2012),
        4 to Car("purple", "Ford", 1993),
        43 to Car("green", "Ford", 1980),
        22 to Car("green", "Toyota", 1952)
    )

    println(immutableMap.filter { it.value.year == 2016 })

    val mutableMap = mutableMapOf<Int, Car>(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013)
    )

    mutableMap.filter { it.value.color == "silver " }
    println("The filters map is $mutableMap")

    val ints = arrayOf(1,2,3,4)
    val add10List: MutableList<Int> = mutableListOf()
    for (i in ints) {
        add10List.add(i + 10)
    }
    println(add10List)

    val add10ListMap = ints.map { it + 10}
    println(add10ListMap)

    println(immutableMap.map {it.value.year})
    println(immutableMap.filter { it.value.model == "Ford" }
        .map { it.value.color })
    println(immutableMap.all { it.value.year < 2010 })
    println(immutableMap.any { it.value.year < 2010 })
    println(immutableMap.count { it.value.year < 2010 })

    val cars = immutableMap.values
    println(cars.find {it.year > 2014})
    println(cars.groupBy { it.color })
    println(immutableMap.toSortedMap())
    println(cars.sortedBy { it.year })

}

/*
- Take care with difference between data class and normal class
 */
data class Car(val color: String, val model: String, val year: Int) {

}