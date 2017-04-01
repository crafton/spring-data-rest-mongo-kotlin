package com.crafton.models

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class PhoneNumber(
        val type: ContactType,
        val number: String
) {
    override fun toString(): String = jacksonObjectMapper().writeValueAsString(this)
}