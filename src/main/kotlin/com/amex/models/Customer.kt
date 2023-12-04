package com.amex.models

//empty class
//class Customer

//primary constructor
//class Customer public constructor(accountNo:Long,name:String,email:String,password:String,contactNo:Long)

//no annotation or no visibility, no need to use constructor keyword
//default values
class Customer(_accountNo:Long,_name:String,_email:String,_password:String="Test@123",_contactNo:Long){

    //fields initialized with constructor parameters
    var accountNo=_accountNo;
    var name=_name;
    var email=_email;
    var password=_password;
    var contactNo=_contactNo;

    //secondary constructor
    constructor():this(_accountNo=122343576,"Vignesh","vignesh@gmail.com",_contactNo=9952032881)

}


