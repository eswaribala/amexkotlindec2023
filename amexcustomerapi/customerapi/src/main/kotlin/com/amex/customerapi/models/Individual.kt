package com.amex.customerapp.models

import com.amex.customerapp.models.Address
import com.amex.customerapp.models.Customer
import jakarta.persistence.*
import lombok.EqualsAndHashCode
import lombok.experimental.SuperBuilder
import org.springframework.format.annotation.DateTimeFormat

import java.time.LocalDate


@Entity
@Table(name="Individual")
@SuperBuilder
@EqualsAndHashCode(callSuper = false)

data class Individual(@Enumerated(EnumType.STRING)  @Column(name="Gender") var gender:Gender,
                      @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @Column(name="DOB") var dob:LocalDate):Customer()