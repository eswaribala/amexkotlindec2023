package com.amex.customerapi.controllers

import com.amex.customerapi.models.Individual
import com.amex.customerapi.services.IndividualService
import com.amex.customerapp.dtos.DataWrapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

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
 @GetMapping("/v1.0/")
  fun getAllIndividuals():List<Individual>{
         return this.individualService.getAllIndividuals()
  }


}