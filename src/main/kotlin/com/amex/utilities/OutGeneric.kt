package com.amex.utilities

import com.amex.dtos.CorporateProducer
import com.amex.dtos.MemberProducer
import com.amex.dtos.Producer
import com.amex.models.Corporate

fun main(){

    val producer1=CorporateProducer()
    val producer2=MemberProducer()

    println("${producer1.generateInstance().accountNo}")
    println("${producer2.generateInstance().memberId}")
}