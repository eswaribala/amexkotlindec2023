package com.amex.utilities


import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun main() {
    //This main Thread
    println("Main Starts->${Thread.currentThread().name}")
    var orgName="RPS Consulting Services"



    //1250ms
    //creating the coroutine
    //global scope
   GlobalScope.launch {
       println("User Thread Starts->${Thread.currentThread().name}")
      // delay(2000)

       orgName.toCharArray().forEach { it->
           run {

               println("$it")
               delay(50)
           }
       }
       println("User Thread Ends->${Thread.currentThread().name}")

   }
    //local scope
    runBlocking {
         launch {
             println("Local Scope Routing Starts->${Thread.currentThread().name}")
             delay(1000)
             println("Local Scope Routing Starts->${Thread.currentThread().name}")
         }
    }


 Thread.sleep(2000)

    println("Main Ends->${Thread.currentThread().name}")
}