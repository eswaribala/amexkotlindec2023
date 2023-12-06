package com.amex.utilities

import com.amex.models.Address
import com.amex.models.Gender
import com.amex.models.Individual
import java.time.LocalDate

fun validate(data:String,individual1:Individual,individual2: Individual,
             operation1:(String)->Boolean,
             operation2:(Individual,Individual)->Boolean): Boolean{
    return operation1(data) && operation2(individual1,individual2)
}

fun validateAccountNo(accountNo:String) : Boolean{
    return accountNo.length==16
}

fun validateName(name: String): Boolean{
    val pattern=Regex("[a-zA-Z]*")
    return pattern.matches(name)
}

fun compareInstances(individual1:Individual,individual2: Individual):Boolean{
    return individual1.dob.isBefore(individual2.dob)
}

fun main() {
    var individual1=Individual(1353246, Address(),"Bala", Gender.FEMALE, LocalDate.of(1970,12,2))
    var individual2=Individual(1353289, Address(),"Manickam", Gender.MALE, LocalDate.of(1995,12,7))

    //function passed as parameter
    println(validate("123456789012345324",individual1,individual2,::validateAccountNo, ::compareInstances))

    println(validate("Parameswari",individual1,individual2,::validateName,::compareInstances))
}