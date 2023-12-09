package com.amex.models


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

import java.time.LocalDate
import java.util.*
object DateSerializer : KSerializer<Date> {
    override val descriptor = PrimitiveSerialDescriptor("Date", PrimitiveKind.LONG)
    override fun serialize(encoder: Encoder, value: Date) = encoder.encodeLong(value.time)
    override fun deserialize(decoder: Decoder): Date = Date(decoder.decodeLong())
}
@kotlinx.serialization.Serializable
data class Individual(var _accountNo:Long,var _address:Address,var _surName:String, var _gender: Gender,
                      @Serializable(DateSerializer::class) var _dob: Date):Customer(_accountNo,_address)
    //override variable
   // override val code="CI"


