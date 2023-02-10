package com.example.mykotlinlearning

class Circle(val radius: Double) {
    fun area(): Double{
        return Math.PI * radius * radius
    }
}

fun Circle.perimeter(): Double{
    return 2 * Math.PI * radius
}

//Same as above, but simple enough for one line
fun Circle.perimeterTest() = 2 * Math.PI * radius

fun main(){
    val circle = Circle(3.5)

    println("Radius: ${circle.radius}")
    println("Area: ${circle.area()}")

    println("Perimeter: ${circle.perimeter()}")
}