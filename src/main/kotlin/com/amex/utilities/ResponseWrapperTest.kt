package com.amex.utilities

import com.amex.dtos.ResponseWrapper
import com.amex.models.Member


fun main() {

    var responseWrapper1=ResponseWrapper<String>("Data could not be added")
    println("${responseWrapper1}")

    var responseWrapper2=ResponseWrapper<Member>(Member(2946974,"Param"))
    println("${responseWrapper2}")



}