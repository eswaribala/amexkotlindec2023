package com.amex.utilities
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
//coroutine using async
//join,delay,sleep,launch


var myOrgName="RPS Consulting Services"
fun main()= runBlocking{
    //coroutine created using async
   var deferred= async{ showVerticalDisplayV1("AMEX Server") }
    val result=deferred.await()
    println("Received Data $result")
}

suspend fun showVerticalDisplayV1(server:String):Pair<String,String>{
    myOrgName.toCharArray().forEach { it->
        run {

            println("$it")
            delay(50)
        }
    }
    val data="Async Data from $server"
    return server to data
}