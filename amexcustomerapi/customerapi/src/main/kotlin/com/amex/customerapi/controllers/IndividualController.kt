package com.amex.customerapi.controllers

import com.amex.customerapi.models.Individual
import com.amex.customerapi.services.IndividualService
import com.amex.customerapp.dtos.DataWrapper
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customers")
class IndividualController(private val individualService: IndividualService) {

  @PostMapping("/v1.0/")
  fun addIndividual(@RequestBody individual:Individual):ResponseEntity<DataWrapper<Any>>{
      return if  (this.individualService.addIndividual(individual)!=null){
          ResponseEntity.status(HttpStatus.OK).body(DataWrapper(individual))
      }else{
          ResponseEntity.status(HttpStatus.BAD_REQUEST).body(DataWrapper("Could not Add Data"))
      }
  }
 @GetMapping("/v2.0/")
  fun getAllIndividuals():List<Individual>{
         return this.individualService.getAllIndividuals()
  }


  @GetMapping("/v1.0/{accountNo}")
  fun getIndividualById(@PathVariable("accountNo") accountNo:Long):ResponseEntity<DataWrapper<Any>>{
        var individual=this.individualService.getIndividualById(accountNo)
        return if  (individual!=null){
            ResponseEntity.status(HttpStatus.OK).body(DataWrapper(individual))
        }else{
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body(DataWrapper("Could not be found"))
        }

  }

    @PutMapping("/v1.0/{accountNo}/{contactNo}/{email}")
    fun updateIndividualById(@PathVariable("accountNo") accountNo:Long,@PathVariable("contactNo") contactNo:Long,@PathVariable("email") email:String ):ResponseEntity<DataWrapper<Any>>{
        var individual=this.individualService.updateIndividual(accountNo,contactNo,email)
        return if  (individual!=null){
            ResponseEntity.status(HttpStatus.OK).body(DataWrapper(individual))
        }else{
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body(DataWrapper("Not found"))
        }

    }

    @DeleteMapping("/v1.0/{accountNo}")
    fun deleteIndividualById(@PathVariable("accountNo") accountNo:Long):ResponseEntity<DataWrapper<Any>>{
        var status=this.individualService.deleteIndividualById(accountNo)
        return if  (status){
            ResponseEntity.status(HttpStatus.OK).body(DataWrapper("Deleted"))
        }else{
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body(DataWrapper("Not deleted"))
        }

    }

}