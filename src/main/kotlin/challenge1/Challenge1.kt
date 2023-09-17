package challenge1

fun main(args: Array<String>) { // psvm??????

    val hello1 = "Hello" /* JVM string pool nuances*/
    val hello2 = "Hello2"

    println("referential equality ${hello2 === hello2}")
    println("structural equality ${hello2 == hello2}")

    var number = 2899

    val anything: Any = "Any type is root of kotlin class hierachy"
    if (anything is String) {
        println(anything.uppercase())
    }

    val ones = """ 1
        |  11
        |  111
        |  1111
    """.trimMargin()

    println(ones)


}