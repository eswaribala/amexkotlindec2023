package com.amex.utilities


import com.amex.models.Address
import com.amex.models.Gender
import com.amex.models.Individual
import java.time.LocalDate


inline fun validate1(data:String,individual1:Individual,individual2: Individual,
             operation1:(String)->Boolean,
             operation2:(Individual,Individual)->Boolean): Boolean{
    return operation1(data) && operation2(individual1,individual2)
}

inline fun validateAccountNo1(accountNo:String) : Boolean{
    return accountNo.length==16
}

inline fun validateName1(name: String): Boolean{
    val pattern=Regex("[a-zA-Z]*")
    return pattern.matches(name)
}

inline fun compareInstances1(individual1:Individual,individual2: Individual):Boolean{
    return individual1.dob.isBefore(individual2.dob)
}

fun main() {
    var individual1=Individual(1353246, Address(),"Bala", Gender.FEMALE, LocalDate.of(1970,12,2))
    var individual2=Individual(1353289, Address(),"Manickam", Gender.MALE, LocalDate.of(1995,12,7))

    //function passed as parameter
    println(validate("123456789012345324",individual1,individual2,::validateAccountNo1, ::compareInstances1))

    println(validate("Parameswari",individual1,individual2,::validateName1,::compareInstances1))
}