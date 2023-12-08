package com.amex.utilities


import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    //This main Thread
    println("Main Starts->${Thread.currentThread().name}")
    var orgName="RPS Consulting Services"

    //creating the coroutine
   GlobalScope.launch {
       println("User Thread Starts->${Thread.currentThread().name}")
      // delay(1000)
       orgName.toCharArray().forEach { it->
           run {

               println("$it")
               delay(50)
           }
       }
       println("User Thread Ends->${Thread.currentThread().name}")

   }
    Thread.sleep(5000)
    println("Main Ends->${Thread.currentThread().name}")
}