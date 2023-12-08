package com.amex.utilities

import kotlinx.coroutines.*

var name="RPS Consulting Services"
fun main()= runBlocking{
    //This main Thread
    println("Main Starts->${Thread.currentThread().name}")
    //creating the coroutine
    //global scope
   var job: Job = GlobalScope.launch {
        println("User Thread Starts->${Thread.currentThread().name}")
        // delay(2000)
        name.toCharArray().forEach { it->
            run {

                println("$it")
                delay(50)
            }
        }

        println("User Thread Ends->${Thread.currentThread().name}")

    }

    //main thread waits for coroutine to complete the job
    //we can avoid writing delay or sleep
  job.join()

    println("Main Ends->${Thread.currentThread().name}")

}