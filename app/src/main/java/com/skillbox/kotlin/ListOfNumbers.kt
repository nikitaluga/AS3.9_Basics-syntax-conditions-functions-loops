package com.skillbox.kotlin

fun main() {
    do {
        println("Enter number")
        var listOfNumbers = mutableListOf<Int>()
        readLine()?.toIntOrNull()?.let { number ->
            listOfNumbers.add(number)
            println("The number $number is added to the list!")
        }
            ?: println("You entered a wrong number")
    } while (true)
}

