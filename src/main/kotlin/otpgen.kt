import kotlin.random.Random

fun otpgen(): Int{

    return Random.nextInt(9000,9999);
}

//function expression
fun passwordGenWithName(name:String, customerId:Long)=if(customerId>100000) name.substring(2,6)+Random.nextInt(1,100000) else
     name.substring(1,4)+Random.nextInt(9000,9999)

fun parseData(customerId:String):Int?=customerId.toIntOrNull()

fun passwordGen(name:String,customerId: String):String{
    var id=parseData(customerId);
      return if(id!=null) passwordGenWithName(name,id.toLong())
    else
       "Not Possible to generate Password"
}

fun main(){

   println("Generated OTP=${otpgen()}")
    //string templates
    var formatter=String.format("%s->%d",passwordGen("?%parameswari?*","458242543"),parseData("345845"))
    println("Generated Password=$formatter")
//print the amount in 10 digits
    var amount=45845;
    println(amount.toString().padStart(10,'*'));

}



