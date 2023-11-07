package section5_OOinKotlin

fun main(args: Array<String>) {
    /*
    - In Kotlin the default visbility is public
    - internal - visibile in the same modules
     */
    val emp = Employee("Bob")
    println(emp)

    val emp2 = Employee("Joe")
    println(emp.firstName)
    println(emp.fullTime)

    val emp3 = Employee("Drew")
    println(emp.firstName)
    println(emp.fullTime)

    println(Demo().dummy)

}

/**
 * When A constructor is declared outside of the curly braces it is known as a primary constructor
 */
//private class protected constructor(val firstName: String)
//private class Employee(val firstName: String){
//    var fullTime: Boolean = true
//
//    constructor(firstName: String, fullTime: Boolean): this(firstName) {
//        this.fullTime = fullTime
//    }
//
////    val firstName: String = firstName
//
////    init {
//        // This block is used in conjunction with the primary constructor
////        this.firstName = firstName
////    }
//}

class Employee(val firstName: String, var fullTime: Boolean = true)

class Demo {
    val dummy: String

    constructor() {
        dummy = "Hello"
    }
}