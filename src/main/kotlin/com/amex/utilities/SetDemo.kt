package com.amex.utilities

import kotlin.random.Random

fun main(){

    var idSets= mutableSetOf<Long>()

    for(id in 1..100){
        idSets.add(Random.nextInt(101,150).toLong())
    }

    idSets
        .sorted()
        .forEach{it-> println("${it}")}


    var javaDevelopers= setOf<String>("Ashu","Sid","Priya")
    var kotlinDevelopers= setOf<String>("Sid","Charu","VIgnesh")

    //list java and kotlin developers
    println("Java and Kotlin Developers")
    javaDevelopers.intersect(kotlinDevelopers).forEach{
            it-> println("${it}")
    }
    println("Java Developers")
    //list only java developers
    javaDevelopers.minus(kotlinDevelopers).forEach{
            it-> println("${it}")
    }

    println("All Developers")
    //list all the developers
    javaDevelopers.union(kotlinDevelopers).forEach{
            it-> println("${it}")
    }
}