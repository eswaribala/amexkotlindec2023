package com.amex.utilities

import com.amex.models.Account
import com.amex.models.validateOpeningDate
import java.time.LocalDate

fun main(){
    var account=Account(65000, LocalDate.of(2015,2,2))
    println("Validation Result=${account.validateOpeningDate()}")
}