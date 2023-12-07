package com.amex.utilities

import com.amex.dao.IndividualSubSystem
import com.amex.models.Address
import com.amex.models.Gender
import com.amex.models.Individual
import java.time.LocalDate
import kotlin.random.Random

fun main() {

    var individualSubSystem=IndividualSubSystem()

    for(records in 1..100)
       individualSubSystem.addIndividual(Individual(Random.nextInt(100000,100000000).toLong(), Address(),
        "Bala", Gender.FEMALE, LocalDate.of(Random.nextInt(1960,2022),Random.nextInt(1,12),
               Random.nextInt(1,26))))

    individualSubSystem.getAllIndividuals().forEach{it->println("${it.accountNo},${it.dob.toString()}")}

}