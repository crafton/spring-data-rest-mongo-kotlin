package com.crafton.models

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Address(
        val type: ContactType,
        val line1: String,
        val line2: String,
        val postCode: Int,
        @Indexed
        val state: String,
        @Indexed
        val country: String
) {
    override fun toString(): String = jacksonObjectMapper().writeValueAsString(this)
}