package com.amex.models


import kotlinx.serialization.Contextual
import java.time.LocalDate
import java.util.*

@kotlinx.serialization.Serializable
data class Individual(var _accountNo:Long,var _address:Address,var _surName:String, var _gender: Gender,
                       var _dob: String
)
    //override variable
   // override val code="CI"


