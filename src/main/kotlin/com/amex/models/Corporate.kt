package com.amex.models

class Corporate(_accountNo:Long,_address:Address,_companyType:CompanyType):Customer(_accountNo,_address) {

    var companyType=_companyType
}