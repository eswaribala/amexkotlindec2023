package com.amex.models

import java.time.LocalDate

class Account {
    var runningTotals: Long=0
    lateinit var openingDate: LocalDate

    constructor(_runningTotals:Long, _openingDate: LocalDate){
        this.runningTotals=_runningTotals
        this.openingDate=_openingDate
    }

}