package section5_OOinKotlin

val MY_CONSTANT = 100

fun main(args: Array<String>) {

    println(MY_CONSTANT)

    /*
    - In Kotlin the default visbility is public
    - internal - visibile in the same modules
     */
    val emp = Employee("Bob")
    println(emp)
    emp.fullTime = false


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
 * Kotlin creates getters and setters for free
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

data class Car(val color: String, val model: String, val year: Int) {
    /*
        Data classes come with some functions for free
        - such as equals
        - and toString
     */
}

class Employee(val firstName: String, fullTime: Boolean = true) {
    var fullTime = fullTime

    get() {
        println("Runing the custom get")
        return field
    }

    set(value) {
        println("Running the custom set")
        field = value
    }
}

class Demo {
    val dummy: String

    constructor() {
        dummy = "Hello"
    }
}