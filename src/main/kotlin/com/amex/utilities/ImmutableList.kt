package com.amex.utilities

import com.amex.models.Member

fun main(){
    //immutable list
    var membersList= listOf<Member>(Member(2354623,"Zenitha"),
        Member(843257,"Vignesh"))


    membersList.sortedWith(Comparator<Member>{
            m1,m2-> m1.name.compareTo(m2.name)

    }).forEach{it->println("${it.name},${it.memberId}")}

}