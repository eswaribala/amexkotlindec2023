import kotlin.random.Random

fun main(){
    var customerIds= arrayOfNulls<Int>(100);

    //assign values
    for(id in customerIds.indices){
        customerIds[id]= Random.nextInt(1000000);
    }

    //read values
//lambda expression
    customerIds.forEach { id -> println("Customer Id = $id") }


    //range

    for(branches in 1..45){
        println("Branch=$branches=The IFSC Code= AMEX-${Random.nextInt(1000000)}")
    }

    var index=0;
    while(index<customerIds.size){
        println("Customer Id = ${customerIds[index]}");
        index++;
    }


}