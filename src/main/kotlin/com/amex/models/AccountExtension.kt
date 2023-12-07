package com.amex.models

import java.time.LocalDate
//Extension Function
fun Account.validateOpeningDate():Boolean{

    return openingDate.isBefore(LocalDate.now())
}