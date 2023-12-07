package com.amex.dtos

interface Producer<out T> {
//T can be used only as return type because of out
    fun generateInstance():T
}