package com.amex.utilities

import kotlinx.coroutines.*

fun main()= runBlocking{
    println("Main Program Starts,${Thread.currentThread().name}")
    var job: Job =launch {
        println("C1 Program Starts,${Thread.currentThread().name}")
        for(i in 0..500){
            println("$i")
          //Thread.sleep(50) // job cancel won't work, it's not copoperative
            delay(50) //job cancel will work, it's  copoperative
        }

        println("C1 Program Ends,${Thread.currentThread().name}")
    }


    delay(200)
    job.cancel()
    job.join()

    println("Main Program Ends,${Thread.currentThread().name}")
}