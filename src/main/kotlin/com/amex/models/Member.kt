package com.amex.models

data class Member(var memberId: Long, var name:String):Comparable<Member>{
    override fun compareTo(other: Member): Int {
       return this.memberId.compareTo(other.memberId)
    }

}
