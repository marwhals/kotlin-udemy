package Section8FileIO

import java.io.DataInputStream
import java.io.EOFException
import java.io.FileInputStream

fun main(args: Array<String>) {
    val di = DataInputStream(FileInputStream("testFile.bin"))
    var si: String

    try {
        while (true) {
            si = di.readUTF()
            println(si)
        }
    } catch (e: EOFException) {

    }
}