package section5_OOinKotlin.inheritance

fun main(args: Array<String>) {
    val laserPrinter = LaserPrinter("Brother 1234", 15, 23)
    laserPrinter.printModel()

    SomethingElse("Whatever")

}

abstract class Printer(val modelName: String) {

    //This function cannont be overridnen with out the open keyword
    open fun printModel() = println("The model name of this printer is $modelName")
    abstract fun bestSellingPrice(): Double
}

open class LaserPrinter(modelName: String, ppm: Int, override val number: Int) : Printer(modelName), MyInterface {

    //override functions are also open
    final override fun printModel() = println("The model name of this laser printer is $modelName")
    override fun bestSellingPrice(): Double = 1291.99
    //This is from the interface
    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }
}

class SpecialLaserPrinter(modelName: String) : LaserPrinter(modelName, 12, 23) {

}

open class Something: MySubInterface{

    val someProperty: String
    override val number: Int = 25

    constructor(someParameter: String) {
        someProperty = someParameter
        println("I'm in the parents constructor")
    }

    override fun mySubFunction(num: Int): String {
        TODO("Not yet implemented")
    }

    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }


}

class SomethingElse : Something {
    constructor(someOtherParameter: String) : super(someOtherParameter) {
        println("I'm in the child's constructor")
    }
}

interface MyInterface {
    val number: Int
    val number2: Int
        get() = number * 100

    fun myFunction(str: String): String
}

interface MySubInterface: MyInterface {
    fun mySubFunction(num: Int): String
}