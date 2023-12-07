package com.amex.dtos

import com.amex.models.Member
import kotlin.random.Random

class MemberProducer:Producer<Member> {
    override fun generateInstance(): Member {
        return Member(Random.nextInt(1,100).toLong(),"m1")
    }

}