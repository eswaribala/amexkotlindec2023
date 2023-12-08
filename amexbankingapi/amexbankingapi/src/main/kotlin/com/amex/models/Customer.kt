package com.amex.models
abstract class Customer{

    open val code="C"
    var accountNo:Long=0;
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


}

