package com.amex.dtos

interface ConsumerProducer<in T,out R> {
    fun writeToFile(message:T):R
}