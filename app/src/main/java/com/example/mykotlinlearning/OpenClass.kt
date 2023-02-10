package com.example.mykotlinlearning


open class MyKotlinLearning {
    //use open keyword to allow child class to override it
    open val courseId: Int = 0

    //use open keyword to allow child class to override it
    open fun courseName(){
        println("Course Name")
    }
}

class Enhance : MyKotlinLearning(){
    //use the override keyword to override the variable
    override val courseId: Int = 1

    //use the override keyword to override the function
    override fun courseName() {
        println("My Kotlin Learning")
    }
}