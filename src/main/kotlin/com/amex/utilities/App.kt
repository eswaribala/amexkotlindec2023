package com.amex.utilities

import com.amex.models.Customer

fun main(){

    //named arguments
   var customer= Customer(accountNo=122343534,"Param","param@gmail.com",contactNo=9952032862)

    println(customer)

}