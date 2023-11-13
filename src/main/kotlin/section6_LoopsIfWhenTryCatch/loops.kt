package section6_LoopsIfWhenTryCatch

fun main(args: Array<String>) {
    /*
    - For loops in kotlin use what is called a range
    */
    val range = 1..5
    for (i in range) {
        println(i)
    }
    val charRange = 'a'..'z'
    val stringRange = "ABD".."XYZ" // Strings dont have an iterator so you cant loop through them
    val str = "Hello"
    for (c in str) {
        println(c)
    }

    println(3 in range)
    println('q' in charRange)
    println("CCC" in stringRange)
    println("CCCCCCCCCC" in stringRange)
    println("ZZZZZZZ" in stringRange)

    val backwardsRange = 5.downTo(1)
    val thisDoesntWork = 5..1
    println(5 in thisDoesntWork)
    println(backwardsRange)
    val stepRange = 3..15
    val stepThree = stepRange.step(3)
    for (i in stepRange) {
        println(i)
    }

    val reversedRange = range.reversed()

    for (num in 1..20 step 4) {
        println(num)
    }

    for (i in 20 downTo 13) {
        println(i)
    }

    val seasons = arrayOf("Winter", "Summer")
    for (season in seasons) {
        println(season)
    }

    for (index in seasons.indices) {
        println("${seasons[index]} is season number $index")
    }

    seasons.forEach { println(it) }
    seasons.forEachIndexed{index, value -> println("$value is season number $index") }


    val notASeason = "lalalal" !in seasons
    println(notASeason)
    /*
    - Not in (!in) operator works with strings and numbers
     */

    for (i in 1..3) {
        println("i = $i")
        jloop@ for (j in 1..4) {
            println("j = $j")
            for (k in 5..10) {
                if (k == 7) {
                    break@jloop
                }
            }
        }
    }
}