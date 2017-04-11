package com.crafton.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class OrganizationalRelationship(
        @Id
        var id: String? = null,
        var positionTitle: String? = null,
        var employmentStart: Date? = null,
        var employmentEnd: Date? = null
) {
}