package Section9JavaInteroperability.javacode

/*
- Onus is on the developer to add the Nullable/ NotNullable annotations
 */

fun main(args: Array<String>) {
    val car = Car("blue", "Ford", 2392)
    car.color = "red"
    println(car)

    var model: String? = car.model
//    println(model.javaClass)
    model = null
    println(model)
}