package com.amex.utilities

import com.amex.dtos.ResponseWrapper
import com.amex.models.Customer
import com.amex.models.Member


fun <T> displayData(values:List<T>){
    values.forEach{it->println("$it")}

}

fun main() {

    var responseWrapper1=ResponseWrapper<String>("Data could not be added")
    println("${responseWrapper1}")

    var responseWrapper2=ResponseWrapper<Member>(Member(2946974,"Param"))
    println("${responseWrapper2}")

    displayData(listOf<Int>(3645,36546,12347623,4327503))
    displayData(listOf<String>("AMEX","RPS","TCS","HCL"))

}