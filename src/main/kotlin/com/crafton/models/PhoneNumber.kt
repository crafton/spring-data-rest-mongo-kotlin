package com.crafton.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class PhoneNumber(
        @Id
        var id: String? = null,
        var type: ContactType? = null,
        var number: String? = null
) {
}