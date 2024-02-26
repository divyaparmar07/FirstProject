package com.example.firstproject

fun main(args: Array<String>) {
    var age = ArrayList<Int>()
    age.add(10)
    age.add(1, 20)
    age.add(30)

//    println(age[0])
//    println(age[1]) // also use age.get(1)
//    println(age[2])
//    println("${age[2]}") //get element

    age.remove(20)
    println(age.size)

    println(age[0])
    println(age[1])

    var cars = arrayListOf<String>("A", "B")
    cars.add("C")

    println(cars[0])
    println(cars[1])
    println(cars[2])

    //In this arrayList we can add any type of data like int,string,double
    var firstMixArrayList = ArrayList<Any>()
    firstMixArrayList.add("A")
    firstMixArrayList.add(5)
    firstMixArrayList.add(2.5)
    firstMixArrayList.add(false)
    firstMixArrayList.add('B')

    println()
    println(firstMixArrayList[0])
    println(firstMixArrayList[1])
    println(firstMixArrayList[2])
    println(firstMixArrayList[3])
    println(firstMixArrayList[4])


}