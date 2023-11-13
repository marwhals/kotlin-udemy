package section5_OOinKotlin
// Package doesnt have to match but here it does

import section5_OOinKotlin.SomeClass as blah

fun main(args: Array<String>) {
    val x = blah.justAssign("some import stuff with an alias")
    println(x.someString)
}