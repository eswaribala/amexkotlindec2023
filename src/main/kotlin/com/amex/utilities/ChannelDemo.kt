package com.amex.utilities

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.random.Random

fun main():Unit= runBlocking {

    //create channel
    var channel=Channel<Long>()

    launch {

        println("Inside Coroutine 1")
        //Data Producer
        for(i in 1..100){
            channel.send(Random.nextInt(400,600).toLong())
        }
        channel.close()
    }


    launch {
         println("Inside Coroutine 2")
        //Receiver channel
        for(data in channel){
            println(data)
        }


    }


}