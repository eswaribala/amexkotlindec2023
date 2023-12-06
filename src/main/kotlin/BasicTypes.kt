fun main(){

    //variable declaration
    val bankName="AMEX";
    //reassignment not possible
    //bankName="BOA";
    println("Enter Account No");
    var accountNumber= readln().toLong();
    println("Enter Name");
    var name:String = readln();
    println("Enter Email");
    var email: String = readln();
    println("Enter Address");
    var address: String = readln();
    println("Enter Contact No");
    var contactNo: Long = readln().toLong();
    println("Enter Password");
    var password: String = readln();
    //type checking
    println(accountNumber::class.java.typeName);



}