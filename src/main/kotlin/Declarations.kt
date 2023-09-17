/*
- Kotlin good practice is to use immutable values
- Cant change variable types on the fly
 */

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
    val number = 25
    val number2 : Short = 25

    val employees: EmployeeSet

    val names = arrayListOf("John","Joan","Jimmy")
    println(names[1])

    val employee1 = Employee("Lynn jones", 500)
    employee1.name = "Lynn Smith"
//    employee1 = Employee("Tim Watson", 1000)
    var employee2 = Employee("Tim Watson", 1000)

    val number3 = 100

    if (number < number2) {
        employee2 = Employee("Jane Smith", 400)
    } else {
        employee2 = Employee("Mike Watson", 500)
    }
}

class Employee(var name: String, val id: Int) {

}