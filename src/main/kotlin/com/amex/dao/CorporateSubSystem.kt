package com.amex.dao

import com.amex.facades.CorporateFacade
import com.amex.models.Corporate

class CorporateSubSystem:CorporateFacade {
    override fun addCorporate(corporate: Corporate): Boolean {
        TODO("Not yet implemented")
    }

    override fun getAllCorporates(): List<Corporate> {
        TODO("Not yet implemented")
    }

    override fun getCorporateById(accountNo: Long): Corporate {
        TODO("Not yet implemented")
    }

    override fun updateCorporate(corporate: Corporate): Corporate {
        TODO("Not yet implemented")
    }

    override fun deleteCorporate(accountNo: Long) {
        TODO("Not yet implemented")
    }
}