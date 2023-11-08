package section5_OOinKotlin

//Block body
fun main(args: Array<String>) {
    println(labelMultiply(3, 4))

    val emp = Employee2("Joe")
    println(emp.upperCaseFirstName())

    val car1 = Car2("Purple", "Nissan", 2022)
    val car2 = Car2("Blue", "Nissan", 2022)
    val car3 = Car2("Green", "Nissan", 2022)
    val car4 = Car2("Orange", "Nissan", 2022)
    printColors(car1, car2, car3, car4, str = "Color :")
    val manyCars = arrayOf(car1, car2, car4, car3, car1)
    val moreCars = arrayOf(car1, car2, car4, car3, car1)
    printColors(*manyCars, str = "Spread operator * Color:")
    //Combining arrays
    val lotsOfCars = arrayOf(*manyCars, *moreCars, car3)

    for (c in lotsOfCars) {
        println(c)
    }

    val s = "this is all in lowercase"
    //Using the extenstion function
    println(s.upperFirstAndLast())
}

//Example extension function
// String is the reciever type
fun String.upperFirstAndLast(): String {
    // Could actually remove the 'this keyword'
    val upperFirst = this.substring(0, 1).uppercase() + this.substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) +
            upperFirst.substring(upperFirst.length - 1, upperFirst.length).uppercase()
}

fun whatever() = 3 * 4

//Expression body
// Function parameter types always have to be included
inline fun labelMultiply(operand1: Int, operand2: Int, label: String = "The answer is:") = "$label ${operand1 * operand2}"

//* can only have one vararg parameter in a function signature just like Java
fun printColors(vararg cars: Car2, str: String) {
    for (car in cars) {
        println(car.color)
    }
}

class Employee2(val firstName: String) {
    // This function will be public and final by default just like everything in Kotlin
    fun upperCaseFirstName() = firstName.uppercase()
}

data class Car2(val color: String, val model: String, val year: Int) {

}
