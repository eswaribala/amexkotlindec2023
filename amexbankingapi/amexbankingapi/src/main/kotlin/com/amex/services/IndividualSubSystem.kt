package com.amex.dao

import com.amex.facades.IndividualFacade
import com.amex.helpers.DbHelper
import com.amex.models.Individual
import java.sql.Connection

class IndividualSubSystem:IndividualFacade {
   var connection:Connection? = null

  var individualsList:MutableList<Individual> = mutableListOf<Individual>()

    init {
   try {
          connection = DbHelper.getConnection()
      }
      catch(classNotFoundException:ClassNotFoundException){
          println("Mysql Driver Missing....")
      }

    }
    override fun addIndividual(individual: Individual): Boolean {
        return individualsList.add(individual)
    }

    override fun getAllIndividuals(): List<Individual> {
        return individualsList
    }

    override fun getIndividualById(accountNo: Long): Individual {

        return individualsList.filter { it->it._accountNo==accountNo }.first()
    }

    override fun updateIndividual(individual: Individual): Individual {
        var position:Int=individualsList.indexOf(individualsList.filter { it->it._accountNo==individual._accountNo }.first())
        individualsList.set(position,individual)
        return individualsList.filter { it->it._accountNo==individual._accountNo }.first()
    }

    override fun deleteIndividual(accountNo: Long) {
      var position:Int=individualsList.indexOf(individualsList.filter { it->it._accountNo==accountNo }.first())
        individualsList.removeAt(position)
    }
}