package com.skillbox.kotlin

fun main() {
    do {
        println("Enter number")
        var listOfNumbers = mutableListOf<Int>()
        readLine()?.toIntOrNull()?.let { number1 ->
            listOfNumbers.add(number1)
            println("The number $number1 is added to the list!")
        }
            ?: println("You entered a wrong number")
    } while (true)
}

