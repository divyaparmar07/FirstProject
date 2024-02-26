package com.example.firstproject

fun main(args: Array<String>) {

    print("Please enter 3 numbers: ")
    var n1: Int = readLine()!!.toInt()
    var n2: Int = readLine()!!.toInt()
    var n3: Int = readLine()!!.toInt()

    var largestnumber: Int

    if (n1 >= n2) {
        if (n1 >= n3) {
            largestnumber = n1
        } else {
            largestnumber = n3
        }
    } else {
        if (n2 >= n3) {
            largestnumber = n2
        } else {
            largestnumber = n3
        }
    }
    println("The largest number is $largestnumber")
}