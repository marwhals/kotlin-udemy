package Section9JavaInteroperability.javacode

/*
- Onus is on the developer to add the Nullable/ NotNullable annotations
 */

fun main(args: Array<String>) {
    val car = Car("blue", "Ford", 2392)
    car.color = "red" // Can only do this if the Java field has getter and setter methods
    println(car)

    var model: String? = car.model
//    println(model.javaClass)
    model = null
    println(model)

    car.variableMethod(5,"zxxcvbn", "abcdef")
    val strings = arrayOf("hello", "goodbye")
    car.variableMethod(10, *strings) // Unpack array first before passing it into java method
    car.wantsIntArray(intArrayOf(1,2,3,4,5,6,7)) // Have to pass a primitive array to Java not one which uses generics

    (car.anObject as java.lang.Object).notify()

    println("x = ${Car.x}")
    println(Car.xString())

    car.demoMethod({ println("I'm in a thread!") })

}