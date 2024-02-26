package com.example.firstproject

fun main(args: Array<String>) {
    /*
    Functions = Code Reus-ability

    fun addNumber(x:Int, y:int) : Int{
        var sum = 0
        sum = x + y
        return sum
    }

    in main
    var result = 0
    result = addNumber(10,20) // Function Calling
    println(result)

    Types of Functions:
    1. Standard Library Functions
    2. User-Defined Functions

    Unit(void) = return nothing
    Primitive = returns char,byte,short,int,long,boolean,float,double
    Non-primitive = returns reference data types. Such as object of Class, String etc.
    */

    print("Please enter the first number: ")
    var number1: Int = readLine()!!.toInt()
    print("Please enter the second number: ")
    var number2: Int = readLine()!!.toInt()

    show(number1, number2)
    var add: Int = add(number1, number2)
    println("Addition is: $add")
    var min: Int = findMinimumNumber(number1, number2)
    println("Minimum number is : $min")

//    val a = 3*2%4-1
//    printNum(a)
}

fun printNum(num: Int) {
    println(num)
}

fun show(num1: Int, num2: Int) {
    println("You entered $num1 and $num2")
}

fun add(num1: Int, num2: Int): Int {
    var sum: Int = 0
    sum = num1 + num2
    return sum
}

fun findMinimumNumber(num1: Int, num2: Int): Int {
    var minimum: Int
    if (num1 > num2) {
        minimum = num2
    } else {
        minimum = num1
    }
    return minimum
}







