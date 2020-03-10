package com.skillbox.kotlin

fun main() {
    do {
        println("Enter a number")
        var number = readLine()

        try {
            println("Your number : ${number?.toInt()}")

        } catch(ex: NumberFormatException) {
            println("You entered a wrong number")}
    } while (true)
}