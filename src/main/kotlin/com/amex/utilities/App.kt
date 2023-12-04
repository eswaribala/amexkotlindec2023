package com.amex.utilities

import com.amex.models.Customer

fun main(){

    //named arguments, primary constructor
   var customer= Customer(_accountNo=122343534,"Param","param@gmail.com",_contactNo=9952032862)

    var formatter=String.format("%s,%s",customer.name,customer.email)
    println("$formatter")

    //secondary constructor
   /* var customerObj=Customer();
    formatter=String.format("%s,%s",customerObj.name,customerObj.email)
    println("$formatter")*/

 var customerObj=Customer(34576769769);
    formatter=String.format("%s,%s",customerObj.name,customerObj.email)
    println("$formatter")
}