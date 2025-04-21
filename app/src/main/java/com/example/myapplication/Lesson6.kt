package com.example.myapplication

fun main() {

//    Arithmetic
    var num1: Double = 10.6
    var num2: Double = 5.0
    var result: Double = 0.0

    result = num1 + num2
    println("num1 + num2 is $result")

    result = num1 - num2
    println("num1 - num2 is $result")

    result = num1 * num2
    println("num1 * num2 is $result")

    result = num1 / num2
    println("num1 / num2 is $result")

    result = num1 % num2
    println("num1 % num2 is $result")
//    Assignemnt
    var x: Int = 20
    var y: Int = 10
    var z: Int = 0

    z = x + y
    println("z = x + y = $z")

    z += x
    println("z += x = $z")

    z -= x
    println("z -= x = $z")

    z *= x
    println("z *= x = $z")

    z /= x
    println("z /= x = $z")

    z %= x
    println("z %= x = $z")
//    Unary
    var number: Double = 7.6
    var isCheck: Boolean = true
    println("+number ${+number}")
    println("-number ${-number}")
    println("++number ${++number}")
    println("--number ${--number}")
    println("!isCheck ${!isCheck}")
    println("------")

    var result: Double = 4.7  // Fixed: Added '='
    println("result: $result")
    println("result++: ${result++}")

//    Equality and Relational Operators
    var a: Int = 5
    var b: Int = 5
    println("a == b: ${a == b}")
    println("a != b: ${a != b}")
    println("a < b: ${a < b}")
    println("a > b: ${a > b}")
    println("a >= b: ${a >= b}")
    println("a <= b: ${a <= b}")


//    Conditional Operators
    var number1: Int = 5
    var number2: Int = 8
    var number3: Int = 12
    var result: Boolean = false  // Fixed: Added '='

// Conditional operator (&&)
    result = (number1 > number2) && (number3 > number2)
    println(result)  // Output: false

// Conditional operator (||)
    result = (number1 > number2) || (number3 > number2)
    println(result)  // Output: true


//    Operator Precedence
    // BODMAS (Order of operations)
    var result: Int = 5 + 2 * 4  // Multiplication before addition: 2*4=8 +5=13
    println("Result = " + result)  // Output: 13

    result = (5 + 2) * 4  // Parentheses first: 5+2=7 *4=28
    println("Result = " + result)  // Output: 28

    var x: Int = 8
    var y: Int = 4
    var z: Int = 2
    var sum: Int = x + --y * z  // --y decrements y first (y=3), then 3*2=6 +8=14
    println("x + --y * z = $sum")  // Output: 14

//    rangeTo() Function and "in" operator
    // Correct ways to create character ranges in Kotlin
    var myCharRange = 'a'..'j'          // Using range operator (..)
    var testCharRange = 'a'..'j'        // Corrected from 'a' s.. s'j'
    var check = 'Z' in testCharRange    // Check if 'Z' is in the range

    println("myCharRange has Z: $check") // Prints false (Z not in a-j)
    println(myCharRange)                // Prints a..j
    println(testCharRange)              // Prints a..j

//    console Input in Android App Development
    print("Enter age: ")
    var age: Int? = readln().toIntOrNull()
    age?.let {
        println("You entered age: $it")
    } ?: println("Invalid number entered")

}