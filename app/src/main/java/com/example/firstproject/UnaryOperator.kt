package com.example.firstproject

fun main(args: Array<String>) {

    //Unary Operator
    // + is Unary plus operator
    // - is Unary minus operator
    // ++ is Increment operator
    // -- is Decrement operator
    // ! is Logical Complement operator

    var number: Double = 7.6
    var isCheck: Boolean = true

    println("+number = " + +number)
    println("-number = " + -number)
    println("++number = " + ++number)
    println("--number = " + --number)
    println("!isCheck = " + !isCheck)
    println()

    var result: Double = 4.7
    println("result++ = " + result++)
    println("result = " + result)
    println("++result = " + ++result)
    println("result = " + result)
}