package com.amex.dtos

import com.amex.models.Member
import java.io.File

class CSVFileConsumer:ConsumerProducer<Member, String> {
    override fun writeToFile(message: Member): String {
        File("member.log").bufferedWriter().use{
            out->out.write(message.name+","+message.memberId)
        }
        return "Contents written to file"
    }
}