package com.amex.utilities


fun validate(data:String,operation:(String)->Boolean): Boolean{
    return operation(data)
}

fun validateAccountNo(accountNo:String) : Boolean{
    return accountNo.length==16
}

fun validateName(name: String): Boolean{
    val pattern=Regex("[a-zA-Z]*")
    return pattern.matches(name)
}


fun main() {

    //function passed as parameter
    validate("123456789012345324",::validateAccountNo)

    validate("Parameswari",::validateName)
}