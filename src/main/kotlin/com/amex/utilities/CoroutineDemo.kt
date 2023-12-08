package com.amex.utilities


import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main() {
    //This main Thread
    println("Main Starts->${Thread.currentThread().name}")
    var orgName="RPS Consulting Services"


    thread{
        println("User Thread Starts->${Thread.currentThread().name}")
        Thread.sleep(10000)
        println("User Thread Ends->${Thread.currentThread().name}")
    }

    //1250ms
    //creating the coroutine
   GlobalScope.launch {
       println("User Thread Starts->${Thread.currentThread().name}")
      // delay(2000)

       orgName.toCharArray().forEach { it->
           run {

               println("$it")
               delay(500)
           }
       }
       println("User Thread Ends->${Thread.currentThread().name}")

   }
 //Thread.sleep(2000)

    println("Main Ends->${Thread.currentThread().name}")
}