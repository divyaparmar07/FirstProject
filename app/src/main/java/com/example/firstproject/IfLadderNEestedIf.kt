package com.example.firstproject

fun main(args: Array<String>) {
    print("Please enter your age: ")
    var yourAge: Int = readLine()!!.toInt()
    if (yourAge < 13) {
        print("You are a child")
    } else if (yourAge < 19) {
        print("You are a teenager")
    } else {
//        print("You are an adult")
        if (yourAge < 65) {
            print("You are an adult")
        } else {
            print("You are a senior")
        }
    }
}