package com.crafton.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.DBRef

data class Application(
        @Id
        val id: String? = null,
        @Indexed(unique = true)
        val name: String? = null,
        val description: String? = null,
        @DBRef
        val applicationContact: Team? = null
) {
}