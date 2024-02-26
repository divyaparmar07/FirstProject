package com.example.firstproject

fun main(args: Array<String>) {
    /*
    var myCharRange='a'.rangeTo(other:'z')
    or
    var myCharRange = 'a'..'z'
    var myChar = 'k' in myCharRange

     */

    var myCharRange = 'a'.rangeTo('k')
    var myChar = 'k' in myCharRange
    println("myCharRange has k: " + myChar)

}