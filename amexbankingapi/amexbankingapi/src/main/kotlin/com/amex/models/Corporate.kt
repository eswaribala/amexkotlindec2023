package com.amex.models

class Corporate(_accountNo:Long,_name:String,_email:String,_password:String,_contactNo:Long,_address:Address,_companyType:CompanyType):
    Customer(_accountNo,_name,_email,_password,_contactNo,_address) {

    //override variable
    override val code="CC"
    var companyType=_companyType



}