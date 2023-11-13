package section6_LoopsIfWhenTryCatch

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main(args: Array<String>) {
    println(getNumber("22.34") ?: throw IllegalArgumentException("bad argument"))

    notImplementedYet("string")

}

fun notImplementedYet(something: String): Nothing {
    throw IllegalArgumentException("Implement me!!!!!!!!")
}

fun getNumber(str: String): Int? {
    return try {
        Integer.parseInt(str)
    }
    catch(e : NumberFormatException) {
        null
    }
    finally {
        println("I'm in the finally block")
        1 // No value will every be returned from the value of a finally block
    }
}