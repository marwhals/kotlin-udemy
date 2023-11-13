package section6_LoopsIfWhenTryCatch

import java.math.BigDecimal

enum class Season {
    SPRING, SUMMER, FALL, WINTER
}

fun main(args: Array<String>) {

    val timeOfYear = Season.WINTER

    val str = when (timeOfYear) {
        Season.WINTER -> "winterrrr"
        Season.FALL -> "fall"
        Season.SUMMER -> "sumemrr"
        Season.SPRING -> "spring"
    }

    val num = 200

    when (num) {
        100, 600 -> println(600)
        in 200..255 -> println("in range")
        300 -> println(300)
        400 -> println(400)
        num + 230 -> println("Using expressions")
        else -> println(100)
    }

    /*
     - Using when on types
     */
    val obj: Any = "abc"
    val obj2: Any = BigDecimal(123.23)
    val obj3: Any = 45

    val something: Any = obj2

    val z = when (something) {
        is String -> println(something.toUpperCase())
        is BigDecimal -> println(something.remainder(BigDecimal(12.2)))
        is Int -> {
            println("${something - 22}")
            2
        }

        else -> "The else case. No type matched????"
    }

    println(z)

    val num2 = -50
    if (num < num2) {
        println("num is less that num2")
    } else if (num > num2) {
        println("num is greater than num2")
    } else {
        println("num = num2")
    }

    when {
        num < num2 -> println("num is less than num2")
        num < num2 -> println("num is greater than num2")
        else -> println("num = num2")
    }


}