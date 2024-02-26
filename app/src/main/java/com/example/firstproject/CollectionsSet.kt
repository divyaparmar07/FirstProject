package com.example.firstproject

fun main(args: Array<String>) {

    var mySetArray = arrayListOf<Any>("Kotlin", 2, 2.5, 'K', true, "Kotlin")
    println(mySetArray.size)
    println(mySetArray.last())
    println()

    //Using set, replicate data is removed automatically and also not count in set
    var mySetArray1 = setOf<Any>("Kotlin", 2, 2.5, 'K', true, "Kotlin")
    println(mySetArray1.size)
    println(mySetArray1.last())
}