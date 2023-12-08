package com.amex.utilities


import kotlinx.coroutines.*
import kotlin.concurrent.thread
var orgName="RPS Consulting Services"
fun main() {
    //This main Thread
    println("Main Starts->${Thread.currentThread().name}")




    //1250ms
    //creating the coroutine
    //global scope
   GlobalScope.launch {
       println("User Thread Starts->${Thread.currentThread().name}")
      // delay(2000)
      showVerticalDisplay()

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
    //suspend function we can invoke only from coroutine
   // showVerticalDisplay()
}

suspend fun showVerticalDisplay(){
    orgName.toCharArray().forEach { it->
        run {

            println("$it")
            delay(50)
        }
    }
}