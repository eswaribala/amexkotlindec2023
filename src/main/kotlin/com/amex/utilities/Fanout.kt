package com.amex.utilities

import com.amex.dao.IndividualSubSystem
import com.amex.models.Address
import com.amex.models.Gender
import com.amex.models.Individual
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import java.time.LocalDate
import kotlin.random.Random

//Extension function
fun CoroutineScope.getIndividualsContactNo()=produce<String> {

    var individualSubSystem= IndividualSubSystem()
    for(records in 1..100)
        individualSubSystem.addIndividual(
            Individual(
                Random.nextInt(100000,100000000).toLong(), Address(),
                "Bala", Gender.FEMALE, LocalDate.of(
                    Random.nextInt(1960,2022), Random.nextInt(1,12),
                    Random.nextInt(1,26)))
        )

   individualSubSystem.getAllIndividuals().forEach{it->channel.send(it.dob.toString())}


}

fun CoroutineScope.launchProcessor(
    id: Int,
    channel: ReceiveChannel<String>
) = launch {
    for (msg in channel) {
        println("#$id received $msg")
    }
}



suspend fun main():Unit= coroutineScope {
    //producer
    var fanoutChannel= getIndividualsContactNo()

    //consumers
     launchProcessor(1,fanoutChannel )
    launchProcessor(2,fanoutChannel )
    launchProcessor(3,fanoutChannel )

}