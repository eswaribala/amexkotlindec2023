package com.amex.dao

import com.amex.facades.IndividualFacade
import com.amex.helpers.DbHelper
import com.amex.models.Individual
import java.sql.Connection

class IndividualSubSystem:IndividualFacade {
   var connection:Connection? = null

    init {
        try {
            connection = DbHelper.getConnection()
        }
        catch(classNotFoundException:ClassNotFoundException){
            println("Mysql Driver Missing....")
        }
    }
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