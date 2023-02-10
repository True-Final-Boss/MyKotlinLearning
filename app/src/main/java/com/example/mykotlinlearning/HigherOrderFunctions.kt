package com.example.mykotlinlearning


fun main(){

    val callFun ={
        println("Hey, I am from Lambda Fun!")
    } //Lambda

    println(callFun())

    val addFun = {a: Int, b: Int -> a+b}

    println(addFun(6, 7))
}