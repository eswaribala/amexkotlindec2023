package com.amex.models
@kotlinx.serialization.Serializable

data class Employee(val id: Int, val name: String,
                    val email: String, val city: String)