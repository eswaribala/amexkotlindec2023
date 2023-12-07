package com.amex.utilities

fun main(){

    var customerList= listOf<String>("c1","c2","c3","c4")
    var loanList= listOf<Long>(300000, 600000, 500000, 2000000)
    var fdList= listOf<Long>(34767,34959,3475034,342750)

    customerList.zip(loanList).zip(fdList).forEach{(v1,v2)->println("$v1,$v2")}


    var loanMap= mutableMapOf<String,Long>()

    customerList.zip(loanList).forEach{(v1,v2)->loanMap.put(v1,v2)}

    loanMap.forEach{(key,value)-> println("$key,$value") }

}