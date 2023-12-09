package com.amex.models
@kotlinx.serialization.Serializable
data class Address(var doorNo:String,var streetName:String,var city:String, var pincode:Long )