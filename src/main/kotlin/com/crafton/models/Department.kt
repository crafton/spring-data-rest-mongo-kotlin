package com.crafton.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Department(
        @Id
        var id: String? = null,
        @Indexed(unique = true)
        var name: String? = null,
        var description: String? = null,
        @DBRef
        var teams: MutableSet<Team>? = null
) {
}