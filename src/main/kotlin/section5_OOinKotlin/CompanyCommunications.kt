package section5_OOinKotlin

import java.time.Year

/*
- Singletons in Kotlin
 */

fun main(args: Array<String>) {
    println(Department.ACCOUNTING.getDeptInfo()) // Using the enum

    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())

    println(SomeClass.Companion.accessPrivateCar()) //Don't actually have to use the word companion

    val someClass1 = SomeClass.justAssign("This is the string as is")
    val someClass2 = SomeClass.upperOrLowerCase("this isn't the string as is", false)
    println(someClass1.someString)
    println(someClass2.someString)
//    val someClass3 = SomeClass() <-- this line won't compile it needs to go through the companion object

    var thisIsMutable = 45

    wantsSomeInterface(object : SomeInterface {
        override fun mustImplement(num: Int): String {
            thisIsMutable++
            return "This is from mustImplement: ${num * 100}"
        }
    })
    println(thisIsMutable)
}

object CompanyCommunications {

    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"
    internal fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All right reserved" // Module only
}

/*
- Implementing the factory pattern
- i.e the companion object is responsisble for creating instances
- the primary constructor has been marked as private
 */
class SomeClass private constructor(val someString: String) {
    /*
    - companion object SomeCompanion <- could use a name
     */
//    val someString: String
//
//    /*
//    - Declaring two secondary constructors
//     */
//
//    constructor(str: String) {
//        someString = str
//    }
//
//    constructor(str: String, lowerCase: Boolean) {
//        if (lowerCase) {
//            someString = str.toUpperCase()
//        } else
//            someString = str.toLowerCase()
//    }

    companion object {
        private var privateVar = 6

        fun accessPrivateCar() = "I'm accessing privateVar: $privateVar"

        fun justAssign(str: String) = SomeClass(str)
        fun upperOrLowerCase(str: String, lowerCase: Boolean): SomeClass {
            if (lowerCase) {
                return SomeClass(str.toLowerCase())
            } else {
                return SomeClass(str.toUpperCase())
            }
        }
    }
}

interface SomeInterface {
    fun mustImplement(num: Int): String
}

fun wantsSomeInterface(si: SomeInterface) {
    println("Printing from wantsSomeInterface ${si.mustImplement(22)}")
}

/*
- Enum class
 */

enum class Department(val fullName: String, val numEmployees: Int) {
    HR("Human Resources", 5),
    IT("The IT", 321),
    ACCOUNTING("Accounting", 3),
    SALES("Salesy", 34); // Exception to the semi colon rule

    fun getDeptInfo() = "The $fullName department has $numEmployees employees"

}

private fun topLevel(str: String) = println("Top level function: $str") // Private file only