package com.amex.utilities

import com.amex.models.Member
import kotlin.random.Random

fun main(){


    var memberMap= mutableMapOf<Int,Member>()

    for(key in 1..100){
        memberMap.put(Random.nextInt(1,1000), Member(Random.nextInt(1,100000).toLong(),"Member"+key))
    }

    memberMap.forEach{(key,value)->println("$key, ${value}")}

}