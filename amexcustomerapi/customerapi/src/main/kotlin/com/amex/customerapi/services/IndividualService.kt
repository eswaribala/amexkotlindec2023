package com.amex.customerapi.services


import com.amex.customerapi.models.Individual
import com.amex.customerapi.repositories.IndividualRepository
import org.springframework.stereotype.Service

@Service
class IndividualService(private val individualRepository:IndividualRepository) {

    //insert
    fun addIndividual(individual: Individual): Individual {

        return individualRepository.save(individual)
    }

    //select all
    fun getAllIndividuals():List<Individual>{
        return individualRepository.findAll()
    }

    //select individual by id

    fun getIndividualById(accountNo:Long):Individual{
        return individualRepository.findById(accountNo).orElse(null)
    }

    fun deleteIndividualById(accountNo:Long):Boolean{
        var status:Boolean=false
        individualRepository.deleteById(accountNo)
        if(getIndividualById(accountNo)==null){
            status=true
        }
        return status
    }


    fun updateIndividual(accountNo:Long,contactNo:Long, email:String):Individual{
        var individual:Individual=getIndividualById(accountNo)
        individual.email=email
        individual.contactNumber=contactNo;
        individualRepository.save(individual)
        return individual

    }

}