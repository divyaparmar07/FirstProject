package com.example.firstproject

fun main(args: Array<String>) {
    //diff btw var and val is var is muttable we can change the value of val variable and in val, we cannot change variable value
    var age = 20
    age = 25
    println(age)

    val _age = 20
//    _age = 10
    println(_age)
}