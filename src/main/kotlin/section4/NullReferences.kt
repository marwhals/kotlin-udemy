package section4

/**
 * can replace all java style null checks with the safety operator ? in kotlin
 */

fun main(args: Array<String>) {
    val str: String? = "This isnt null"
    val str3: String? = null
    val str2 = str3 ?: "This is the default value" // Provide a default value when something is null
    println(str2)
//    str.length
    str?.length //shorthand for the below -- this will evaluate to null if the expression is null otherwise it will continute as normal
    if (str != null) {
        str.length
        str.toUpperCase()
    }

    if (str == null) {
        null
    } else {
        str.length
    }

//    val countryCode: String? = bankBranch?.address?.country?.countrycode
//    val countryCode: String? = bankBranch?.address?.country?.countrycode ?: US //Using the elvis operator

    //?: the elvis operator - lets you specify a default value when a value evaluates to null

    //Safe casting - if you cant perform the cast successfully the cast will return null
    val something: Any = arrayOf(1,2,3,4,5,6)
    val str4 = something as? String
    println(str4)



}