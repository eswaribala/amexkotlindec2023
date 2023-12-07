package com.amex.utilities

import com.amex.dtos.CSVFileConsumer
import com.amex.dtos.ConsoleConsumer
import com.amex.models.Member
import kotlin.random.Random

fun main(){

    var consumer1=CSVFileConsumer()
   println("${ consumer1.writeToFile(Member(Random.nextInt(1,100).toLong(), "Param"))}")
    var consumer2=ConsoleConsumer()
    println("${ consumer2.writeToFile(Random.nextInt(1,100).toLong())}")

}