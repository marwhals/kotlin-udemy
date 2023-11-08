package section5_OOinKotlin.inheritance

fun main(args: Array<String>) {
    val laserPrinter = LaserPrinter("Brother 1234")
    laserPrinter.printModel()
}

abstract class Printer(val modelName: String) {

    //This function cannont be overridnen with out the open keyword
    open fun printModel() = println("The model name of this printer is $modelName")
    abstract fun bestSellingPrice(): Double
}

class LaserPrinter(modelName: String) : Printer(modelName) {

    override fun printModel() = println("The model name of this laser printer is $modelName")
    override fun bestSellingPrice(): Double = 1291.99

}