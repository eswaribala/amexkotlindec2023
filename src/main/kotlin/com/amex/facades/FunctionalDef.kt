package com.amex.facades


fun interface FullNameFunction {
    //default implementation
    fun subStringFullName()=""
    //default implementation
    fun findIndexFullName()=""
    fun generateFullName(firstName:String,lastName:String):String
}