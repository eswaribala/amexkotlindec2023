package com.amex.models

import io.swagger.v3.oas.annotations.media.Schema

@kotlinx.serialization.Serializable
@Schema(description = "Model for Employee.")
data class Employee(@field:Schema(
    description = "Id",
    example = "1999",
    type = "int",
    minimum = "1900",
    maximum = "2500"
)val id: Int, val name: String,
                    val email: String, val city: String)