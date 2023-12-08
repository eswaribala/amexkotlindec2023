package com.amex.facades

import com.amex.models.Individual

interface IndividualFacade {

    fun addIndividual(individual:Individual):Boolean
    fun getAllIndividuals():List<Individual>
    fun getIndividualById(accountNo:Long):Individual
    fun updateIndividual(individual: Individual):Individual
    fun deleteIndividual(accountNo: Long)

}