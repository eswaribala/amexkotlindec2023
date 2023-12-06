package com.amex.models

class Transaction {

     //internal visibility
    fun confirmTransaction(customer: Customer){

        println("${customer.code}")
    }

}