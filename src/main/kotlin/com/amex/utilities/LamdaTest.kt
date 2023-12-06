package com.amex.utilities

import com.amex.models.Address
import com.amex.models.Gender
import com.amex.models.Individual
import java.time.LocalDate


fun  main() {

    val find=fun(individual1: Individual, individual2:Individual): Boolean{

        return individual1.dob.isBefore(individual2.dob)

    }

    var individual1=Individual(1353246, Address(),"Bala", Gender.FEMALE, LocalDate.of(1970,12,2))
    var individual2=Individual(1353289, Address(),"Manickam", Gender.MALE, LocalDate.of(1995,12,7))
    val result= find(individual1,individual2)

    println("The result=${result}")
}