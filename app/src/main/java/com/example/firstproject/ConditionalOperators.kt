package com.example.firstproject

fun main(args: Array<String>) {

    /*
    && conditional AND operator
    || conditional OR operator
     */

    var number1: Int = 5
    var number2: Int = 8
    var number3: Int = 12

    var result: Boolean = false

    //Conditional operator &&
    result = (number1 > number2) && (number3 > number2)
    println("Result:" + result)

    //Conditional operator ||
    result = (number1 > number2) || (number3 > number2)
    println("Result:" + result)
}