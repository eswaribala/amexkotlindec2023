package com.amex.models

class Address {

    var doorNo:String=""
     get()=field
    set(value){

        field=value
    }


    var streetName:String=""
        get()=field
        set(value){
         if (value.length>5)
            field=value
         else
             field=""
        }
    var city:String=""
    var pincode:Long = 0

}