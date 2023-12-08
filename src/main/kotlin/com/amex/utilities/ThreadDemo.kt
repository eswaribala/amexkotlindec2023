package com.amex.utilities

import kotlin.concurrent.thread

fun main(){
    println("Main Starts->${Thread.currentThread().name}")
    var orgName="RPS Consulting Services"
    thread{
        println("User Thread Starts->${Thread.currentThread().name}")
        Thread.sleep(1000)
        orgName.toCharArray().forEach { it->
            run {

                println("$it")
                Thread.sleep(500)
            }
        }
        println("User Thread Ends->${Thread.currentThread().name}")
    }
    println("Main Thread Ends->${Thread.currentThread().name}")
}