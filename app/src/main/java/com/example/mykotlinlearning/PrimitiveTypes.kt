package com.example.mykotlinlearning

fun main(){

    //var uses more memory
    val intTestValue: Int = 23
    val doubleTestValue: Double = 23.23
    val floatTestValue: Float = 23.23f
    val stringTestValue: String = ":) -324 = 2.2.3"

    //Null safety
    val intTestValueNull: Int? = null
    val doubleTestValueNull: Double? = null
    val floatTestValueNull: Float? = null
    val stringTestValueNull: String? = null


    var intTestValue1: Int = 23
    var doubleTestValue1: Double = 23.23
    var floatTestValue1: Float = 23.23f
    var stringTestValue1: String = ":) -324 = 2.2.3"

    //default function magic
    intTestValue1 = (23.4) .toInt()
    floatTestValue1 = intTestValue1.toFloat()
    doubleTestValue1 = floatTestValue1.toDouble()
    stringTestValue1 = doubleTestValue1.toString()


    //null safety magic
    //?. is safe call for the value
    //!! is force call for thr value(not reccomended until sure of it)
    //?: is default value in case of null

    intTestValue1 = floatTestValueNull?.toInt() ?: 2
    if(intTestValueNull != null){}
    floatTestValue1 = intTestValue1.toFloat()
    doubleTestValue1 = floatTestValue1.toDouble()
    stringTestValue1 = doubleTestValue1.toString()

}