package com.example.firstproject

fun main(args: Array<String>) {

    /*
    var name:String?=readLine()
    or
    var name:String = readLine()!!
    var age:Int = readLine()!!.toInt()
     */

    print("What is your name? ")
    var name: String? = readLine()

    print("How old are you? ")
    var age: Int = readLine()!!.toInt()

    println("Name is: $name and age is: " + age)

//    val num = 3+5*2%5-4
//    println(num)

//    print(13 / 2)
//    print(13 / 2.0)
//    print(13 % 2)
//    print(13 % 2.0)
}