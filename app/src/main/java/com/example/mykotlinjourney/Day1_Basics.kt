package com.example.mykotlinjourney

import java.security.KeyStore.TrustedCertificateEntry
import java.sql.Struct
import kotlin.math.truncate
import kotlin.time.measureTime

fun main() {
    val myName = "sai"
    var myAge = 25
    println("name: $myName, age: $myAge")

    myAge +=1
    println("after birthday my age is : $myAge")

    val score:Int = 90
    val pi:Double = 3.1415
    val isPassed:Boolean = true
    val grade:Char = 'A'
    val message:String = "you scored $score and got this grade $grade"

    println(message)
    println("pi value is $pi and you passed $isPassed")

    // functions to greet

    println(greet("hello sai"))
    println("sum of 10 and 20 is : ${add(10,20)}")

    // if-else example

    val votingAge = 17
    val status = if(votingAge>=18) "eligible to vote" else "not eligible"

    // when example

    val day = 3
    val dayName= when(day){
        1 -> "sunday"
        2 -> "monday"
        3 -> "tuesday"
        4 -> "wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Invalid day"

    }

    println("Day is $day and Day name is $dayName")


}

fun greet(name:String):String {
    return "Hello, $name! WELCOME."
}

fun add(a:Int,b:Int): Int{
    return a+b
}