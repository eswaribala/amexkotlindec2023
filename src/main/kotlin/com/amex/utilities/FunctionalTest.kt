package com.amex.utilities

import com.amex.facades.FullNameFunction


fun main(){

    //fun implementation for abstract function
    //no need to create subclass
    val result=FullNameFunction{firstName, lastName ->firstName+lastName }

    println(result.generateFullName("Parameswari","Bala"))

    //result.subStringFullName()
    //result.findIndexFullName()

}