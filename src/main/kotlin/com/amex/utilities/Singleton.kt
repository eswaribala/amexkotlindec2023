package com.amex.utilities

object DBSingleton {

    init{
        println("Singleton Invocation")
    }

    fun getConnection(dbName:String):String{
        return "mysql:localhost:3306"+dbName
    }

}