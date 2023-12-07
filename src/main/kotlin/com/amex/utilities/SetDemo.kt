package com.amex.utilities

import kotlin.random.Random

fun main(){

    var idSets= mutableSetOf<Long>()

    for(id in 1..100){
        idSets.add(Random.nextInt(1,50).toLong())
    }

    idSets
        .sorted()
        .forEach{it-> println("${it}")}

}