package com.crafton.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Address(
        @Id
        var id: String? = null,
        var type: ContactType? = null,
        var line1: String? = null,
        var line2: String? = null,
        var postCode: Int? = null,
        @Indexed
        var state: String? = null,
        @Indexed
        var country: String? = null
) {
}