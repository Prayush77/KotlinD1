package com.example.myapplication


fun main() {
    //If-Else Statement
    print("Please enter a number: ")
    val number = readln().toIntOrNull() ?: run {
        println("Invalid input - not a number")
        return@run 0  // Default value if input is invalid
    }

    if (number % 2 == 0) {
        println("$number is even")
    } else {
        println("$number is odd")
    }
//    If-Else - if ladder statement

    print("Please enter your age: ")
    val yourAge = readln().toInt()

    if (yourAge < 13) {
        println("You are a child")
    } else if (yourAge < 19) {
        println("You are a teenager")
    } else {
        if (yourAge < 50) {
            println("You are an adult")
        } else {
            println("You are a senior")
        }
    }
//    Nested If statement
    println("Please enter 3 numbers: ")
    var number1: Int = readln()!!.toInt()
    var number2: Int = readln()!!.toInt()
    var number3: Int = readln()!!.toInt()
    var largestNumber: Int
    if (number1 >= number2) {
        if (number1 >= number3) {
            largestNumber = number1
        } else {
            largestNumber = number3
        }
    } else {
        if (number2 >= number3) {
            largestNumber = number2
        } else {
            largestNumber = number3
        }
    }
    println("The largest number is $largestNumber")

//    When statement

    print("Please enter a day number of week: ")
    var dayNumber: Int = readln()!!.toInt()
    var day: String
    when (dayNumber) {
        1 -> day = "Sunday"
        2 -> day = "Monday"
        3 -> day = "Tuesday"
        4 -> day = "Wednesday"
        5 -> day = "Thursday"
        6 -> day = "Friday"
        7 -> day = "Saturday"
        else -> day = "Invalid day choice"
    }
    println(day)

//    For Loop

    for (i in 1..9) {
        println(i)
    }

    var sum: Int = 0
    for (x in 0..5) {
        println(x)
        sum += x // sum = sum + x
    }

    sum = 0
    for (x in 0..10) {
        if (x % 2 == 0) {
            println(x)
            sum += x // sum = sum + x
        }
    }
    println("The sum of even number is $sum")

    var vehicle = arrayListOf<String>("Tata", "Kia", "Hyundai", "MG")
    for (y in vehicle.indices) {
        println("The value in $y index is ${vehicle[y]}")
    }

//    For each Loop

    var vehicle = arrayListOf<String>("Tata", "Kia", "Hyundai", "MG")
    vehicle.forEach { it: String ->
        println(it)
    }

//    While Loop
    var i: Int = 0
    while (i < 5) {
        println(i)
        i++
    }
//    Infinite Loop
    var number = kotlin.random.Random.nextInt(from = 0, until = 10000)
    println("Please enter any number from 0 to 10000: ")
    while (2 > 1) {
        var userGuess: Int = readln()!!.toInt()
        if (userGuess == number) {
            println("congratulations!!!!, you won")
            break
        } else if (userGuess < number) {
            println("Increase your guess")
        } else {
            println("Decrease your guess")
        }
    }
}