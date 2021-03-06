package com.crafton.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Relative(
        @Id
        var id: String? = null,
        var type: RelativeType? = null,
        var owner: Person? = null,
        var target: Person? = null
) {
}