package com.crafton.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Person(
        @Id
        var id: String? = null,
        var title: Title? = null,
        @Indexed
        var firstName: String? = null,
        @Indexed
        var surname: String? = null,
        var dateOfBirth: Date? = null,
        @Indexed(unique = true)
        var emailAddress: String? = null,
        @DBRef
        var addresses: Set<Address>? = null,
        @DBRef
        var phoneNumbers: Set<PhoneNumber>? = null
) {
}