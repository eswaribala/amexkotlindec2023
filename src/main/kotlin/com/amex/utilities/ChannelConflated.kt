package com.amex.utilities
import com.amex.dao.IndividualSubSystem
import com.amex.models.Address
import com.amex.models.Gender
import com.amex.models.Individual
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.time.LocalDate
import kotlin.random.Random

fun main():Unit= runBlocking {

    var individualSubSystem = IndividualSubSystem()
    for (records in 1..100)
        individualSubSystem.addIndividual(
            Individual(
                Random.nextInt(100000, 100000000).toLong(), Address(),
                "Bala", Gender.FEMALE, LocalDate.of(
                    Random.nextInt(1960, 2022), Random.nextInt(1, 12),
                    Random.nextInt(1, 26)
                )
            )
        )


    //create channel with buffered overflow
    var channel = Channel<String>(capacity =Channel.CONFLATED)

    launch {

        println("Inside Coroutine 1")
        //Data Producer
        individualSubSystem.getAllIndividuals()
            .sortedWith(Comparator<Individual> { i1, i2 ->
                i1.dob.compareTo(i2.dob)

            })
            .forEach { it -> channel.send("${it.accountNo},${it.dob.toString()}") }
        channel.close()
    }


    launch {
        println("Inside Coroutine 2")
        //Receiver channel
        for (data in channel) {
            println(data)
        }


    }
}

