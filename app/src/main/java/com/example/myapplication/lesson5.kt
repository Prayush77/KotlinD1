//package com.example.myapplication
//
//fun displayList() {
//    val numbers: List<String> = listOf("one", "two", "three", "four")
//
//    println("Number of elements: ${numbers.size}")
//    println("Third element: ${numbers[2]}")
//    println("Fourth element: ${numbers[3]}")
//    println("Index of element \"two\": ${numbers.indexOf("two")}")
//}
//fun Mylist() {
//    // Immutable List
//    val lst = listOf("one", "two", "three")
//    println("Immutable list:")
//    for (i in lst.indices) {
//        println(lst[i])
//    }
//
//    println()
//
//    // Mutable List
//    val mutableLst = mutableListOf("one", "two", "three")
//    mutableLst.add("Four")
//    println("Mutable list:")
//    for (i in mutableLst.indices) {
//        println(mutableLst[i])
//    }
//}
//
//fun set() {
//    val numbers = setOf(1, 2, 3, 4)
//    for (element in numbers) {
//        println(element)
//    }
//
//    val numbersBackwards = setOf(4, 3, 2, 1)
//    println("The sets are equal: ${numbers == numbersBackwards}")
//}
//
//fun map() {
//    val countriesCapitals = mapOf(
//        "Nepal" to "Kathmandu",
//        "China" to "Beijing",
//        "India" to "New Delhi"
//    )
//
//    println("All keys: ${countriesCapitals.keys}")
//    println("All values: ${countriesCapitals.values}")
//    println("Capital of Nepal is: ${countriesCapitals["Nepal"]}")
//
////    Immutable map
//
//    val studentMarks = mapOf(
//        "ram" to 45,
//        "shyam" to 45,
//        "hari" to 45,
//        "gita" to 45
//    )
//
//    println("Enter student name: ")
//    val input: String = readln().lowercase()
//    println(studentMarks[input])
//
////    Mutable map
//    val studentMarks = mutableMapOf(
//        "ram" to 45,
//        "shyam" to 45,
//        "hari" to 45,
//        "gita" to 45
//    )
//
//    studentMarks["ram"] = 60
//    studentMarks.put("sabin", 80)
//
//    println("Enter student name: ")
//    val input: String = readln().lowercase()
//    println(studentMarks[input])
//
//
//}
//
//
//
//
//fun main() {
//    set()
//    displayList()
//    Mylist()
//    map()
//}
//
//
