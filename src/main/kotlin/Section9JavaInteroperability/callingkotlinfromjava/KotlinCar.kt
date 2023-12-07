@file:JvmName("StaticCar")

package Section9JavaInteroperability.callingkotlinfromjava

fun topLevel() = println("I'm in the Car file!")

fun main(args: Array<String>) {
    "Print this".print()
}
// See documentation @JvmField <- dont generate getters and setters
class KotlinCar(val color: String, @JvmField val model: String, val year: Int, val isAutomatic: Boolean) {

//    var color: String = color
//        private set(value) {
//            field = "always green"
//        }

}

fun String.print() {
    println(this)
}