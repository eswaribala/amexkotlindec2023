package com.amex.utilities

fun main(){

    var customerList= listOf<String>("c1","c2","c3","c4")
    var loanList= listOf<Long>(300000, 600000, 500000, 2000000)

    customerList.zip(loanList).forEach{(v1,v2)->println("$v1,$v2")}

}