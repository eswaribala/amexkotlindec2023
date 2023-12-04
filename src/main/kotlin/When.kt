
//data restrictions
enum class Gender{MALE,FEMALE,TRANSGENDER}

fun main(){
    println("Enter CIBIL Score")
    val cibilScore= readln();
    when(cibilScore.toInt()){
        in 100..500 -> println("Score is very low")
        in 501..700 -> println("Score is good to give mid size loan")
        in 701..900 -> println("Score is great to process housing loan")
        else -> println("value not in range")

    }
    println("Enter Gender")
    val gender= readln();
    when(Gender.valueOf(gender)){
        Gender.MALE -> println("Income Tax Filing should be above 3 Lakhs")
        Gender.FEMALE -> println("Income Tax Filing should be above 5 Lakhs")
        Gender.TRANSGENDER -> println("Income Tax Filing should be above 7 Lakhs")
        //it will never reach
        else -> println("value not in range")
    }


}