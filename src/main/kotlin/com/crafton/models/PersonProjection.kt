package com.crafton.models

import org.springframework.data.rest.core.config.Projection
import java.util.*

@Projection(name = "personwithfulladdress", types = arrayOf(Person::class))
interface PersonProjection {
    val title: Title
    val firstName: String
    val surname: String
    val dateOfBirth: Date
    val emailAddress: String
    val addresses: List<Address>
    val phoneNumbers: List<PhoneNumber>
}