package com.amex.dtos

import com.amex.models.Address
import com.amex.models.CompanyType
import com.amex.models.Corporate
import com.amex.models.Gender
import java.time.LocalDate

class CorporateProducer: Producer<Corporate> {
    override fun generateInstance(): Corporate {
        return Corporate(
            1353246, "Bala", "bala@gmail.com", "Test@123",
            9952032862, Address(), CompanyType.GOVERNMENT
        )
    }
}