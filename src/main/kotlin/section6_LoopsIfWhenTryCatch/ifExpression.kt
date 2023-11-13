package section6_LoopsIfWhenTryCatch

/*
- Ternary operator doesn't exist in Kotlin
 */

fun main(args: Array<String>) {

    val someCondition = 23 < 32

    val num = if (someCondition) 50 else 232

    /*
    - Similar to Scala - the below is an expression. Both branches must exist
     */
    val num2 = if (someCondition) {
        println("abcde")
        40
    } else {
        println("1234365786")
        687
    }

    println(num2)

    /*
    - Returning a unit
     */

    val x = if (someCondition) {
        println("sometthing")
    } else {
        println("nahahanah")
    }

    println(x.javaClass)

}