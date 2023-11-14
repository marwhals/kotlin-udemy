fun main(args: Array<String>) {
    run { println("I'm in a lambda!!!!!!!!!!") }

    val employees = listOf(
        Employee("bob", "bobson", 111),
        Employee("bob123", "bobson321", 11133),
        Employee("bob234", "bobson654", 11122)
    )

    println(employees.minBy { e -> e.startYear })
    println(employees.minBy { it.startYear })
    println(employees.minBy(Employee::startYear))

    /* scoping */
    var num = 123
    run {
        num += 12
        println(num)
    }

    run(::topLevel)

}

fun topLevel() = println("Im in a function")

fun useParameters(employees: List<Employee>, num: Int) {
    employees.forEach {
        println(it.firstName)
        println(num)
    }
}

data class Employee(val firstName: String, val lastName: String, val startYear: Int) {

}