package com.amex.facades

import com.amex.models.Corporate


interface CorporateFacade {
    fun addCorporate(corporate: Corporate):Boolean
    fun getAllCorporates():List<Corporate>
    fun getCorporateById(accountNo:Long): Corporate
    fun updateCorporate(corporate: Corporate): Corporate
    fun deleteCorporate(accountNo: Long)
}