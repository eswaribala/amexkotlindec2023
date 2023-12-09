package com.amex.models


import kotlinx.serialization.Contextual
import java.time.LocalDate
@kotlinx.serialization.Serializable
class Individual:Customer{
    var surName:String
    var gender:Gender
    @Contextual
    var dob:LocalDate
    constructor(_accountNo:Long,_address:Address,_surName:String, _gender: Gender,_dob:LocalDate){

        surName=_surName;
        gender=_gender
        dob=_dob
    }
    //override variable
   // override val code="CI"



}