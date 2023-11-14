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

    println(countTo100())

    findByLastName(employees, "bobson")
    findByLastName(employees, "zobson")

    "Some string".apply somestring@{
        "Another String".apply {
            println(lowercase())
            println(this@somestring.uppercase())
        }
    }

}

fun countTo100(): String {
    val numbers = StringBuilder()
    for (i in 1..99) {
        numbers.append(i)
        numbers.append(", ")
    }
    numbers.append(100)
    return numbers.toString()
}

fun countTo100With(): String {
    val numbers = StringBuilder()
    return with(numbers) {//Converting this instance object into a 'reciever' -> an object that has been passed to a lambda
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
        toString()
    }
}

fun findByLastName(employees: List<Employee>, lastName: String) {
    employees.forEach() returnBlock@{
        if (it.lastName == lastName) {
            println("Yes there is a person with last name $lastName")
            return@returnBlock // Now a local return
        }
    }
    println("Nope there is no emplployee with the last name $lastName")
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