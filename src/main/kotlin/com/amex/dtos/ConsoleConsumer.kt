package com.amex.dtos

class ConsoleConsumer:ConsumerProducer<Long,String> {
    override fun writeToFile(message: Long): String {
        println("$message")
        return "Message sent to console"

    }
}