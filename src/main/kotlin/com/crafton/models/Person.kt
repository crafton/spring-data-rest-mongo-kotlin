package com.crafton.models

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.index.TextIndexed
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Person(
        @Id
        val id: String?,
        val title: Title,
        @Indexed
        val firstName: String,
        @Indexed
        val surname: String,
        val age: Int,
        @Indexed(unique = true)
        val emailAddress: String,
        @TextIndexed
        val addresses: List<Address>,
        val phoneNumbers: List<PhoneNumber>
) {
    override fun toString(): String = jacksonObjectMapper().writeValueAsString(this)
}