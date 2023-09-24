package section5_OOinKotlin

fun main(args: Array<String>) {
    /*
    - In Kotlin the default visbility is public
    - internal - visibile in the same modules
     */
    val emp = Employee()
    println(emp)

}

private class Employee {
        // This is visible to everything in the same file
}