package com.amex.models

//empty class
//class Customer

//primary constructor
//class Customer public constructor(accountNo:Long,name:String,email:String,password:String,contactNo:Long)

//no annotation or no visibility, no need to use constructor keyword
//default values
/*class Customer(_accountNo:Long,_name:String,_email:String,_password:String="Test@123",_contactNo:Long){

    //fields initialized with constructor parameters
    var accountNo=_accountNo;
    var name=_name;
    var email=_email;
    var password=_password;
    var contactNo=_contactNo;

    //secondary constructor
    constructor():this(_accountNo=122343576,"Vignesh","vignesh@gmail.com",_contactNo=9952032881)

}*/

open class Customer{

    internal open val code="C"
    private var accountNo:Long=0;
    protected var name="";
    protected var email="";
    protected var password="";
    protected var contactNo:Long=0;
    protected lateinit var address:Address
    var bankName=""
   constructor (_accountNo:Long,_name:String,_email:String,_password:String="Test@123",_contactNo:Long,_address:Address) {

       //fields initialized with constructor parameters
       accountNo = _accountNo;
       name = _name;
       email = _email;
       password = _password;
       contactNo = _contactNo;
       address=_address
   }
    //secondary constructor
    constructor(_accountNo:Long,address: Address): this(_accountNo,"vignesh","viki@gmail.com","Test@123",99678901,address){

    }
    constructor()
   //static variable
    companion object{
        var counter=0
       fun showData(): Int{
           return counter;
       }
    }

   //instance block and increment the counter
    init{
        counter++
    }

    //instance method
    fun showCounter() : Int{
        return counter
    }

   open fun showCustomerData():String{
        return this.name+","+this.contactNo
    }

}

