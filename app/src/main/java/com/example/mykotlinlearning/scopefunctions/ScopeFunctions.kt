package com.example.mykotlinlearning.scopefunctions

class ScopeFunctions {

//    Scope functions make code more readable, clear and concise.
//    Object reference – ‘this’ and ‘it’.
//    Return value – context object and lambda result.
//    let : working with nullable objects to avoid NullPointerException.
//    apply : changing object configuration.
//    run: operate on nullable object, executing lambda expressions.
//    also : adding additional operations.
//    with : operating on non-null objects.

    fun let() {
        // nullable variable a
        // with value as null
        var a: Int? = null
        // using let function
        a?.let {
            // statement(s) will
            // not execute as a is null
            print(it)
        }
        // re-initializing value of a to 2
        a = 2
        a?.let {
            // statement(s) will execute
            // as a is not null
            print(a)
        }
    }

    class Company() {
        lateinit var name: String
        lateinit var objective: String
        lateinit var founder: String
    }

    fun apply() {
        Company().apply {
            // same as founder = “Evan Jones”
            this.founder = "Evan Jones"
            name = "MyKotlinLearning"
            objective = "Let's learn Kotlin!"
        }
    }

    fun run(args: Array<String>) {
        println("Company Name : ")
        var company: Company? = null
        // body only executes if
        // company is non-null
        company?.run {
            print(name)
        }
        print("Company Name : ")
        // re-initialize company
        company = Company().apply {
            name = "MyKotlinLearning"
            founder = "Evan Jones"
            objective = "Let's Learn Kotlin"
        }
        // body executes as
        // 'company' is non-null
        company?.run {
            print(name)
        }
    }

    fun also() {
        // initialized
        val list = mutableListOf<Int>(1, 2, 3)

        // later if we want to perform
        // multiple operations on this list
        list.also {
            it.add(4)
            it.remove(2)
            // more operations if needed
        }
        println(list)
    }

    fun with() {
        val mkl = Company().apply {
            name = "MyKotlinLearning"
            objective = "Let's learn Kotlin!"
            founder = "Evan Jones"
        }

        // with function
        with(mkl) {
            // similar to println( "${this.name}" )
            println(" $name ")
        }
    }
}