package com.example.mykotlinlearning

fun main(args: Array<String>)
{
    //declaring a data class
    data class Person(val name: String, val age: Int)
    {
        //property declared in class body
        var height: Int = 0;
    }

    val person1 = Person("Evan",29)

    //copying details of person1 with change in name of person
    val  person2 =  person1.copy(name="Lindsay")

    //copying all details of person1 to person3
    val  person3 =  person1.copy();

    //declaring heights of individual people
    person1.height=188
    person2.height=167
    person3.height=170

    //person1 & person3 have different class body values,
    //but same parameter values

    //printing info all 3 people
    println("$person1 is ${person1.height} cm in height")
    println("$person2 is ${person2.height} cm in height")
    println("$person3 is ${person3.height} cm in height")

}