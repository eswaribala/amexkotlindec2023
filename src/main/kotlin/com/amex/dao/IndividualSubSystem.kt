package com.amex.dao

import com.amex.facades.IndividualFacade
import com.amex.models.Individual

class IndividualSubSystem:IndividualFacade {
    override fun addIndividual(individual: Individual): Boolean {
        TODO("Not yet implemented")
    }

    override fun getAllIndividuals(): List<Individual> {
        TODO("Not yet implemented")
    }

    override fun getIndividualById(accountNo: Long): Individual {
        TODO("Not yet implemented")
    }

    override fun updateIndividual(individual: Individual): Individual {
        TODO("Not yet implemented")
    }

    override fun deleteIndividual(accountNo: Long) {
        TODO("Not yet implemented")
    }
}