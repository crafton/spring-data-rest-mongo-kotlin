package com.crafton.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.DBRef

data class Application(
        @Id
        var id: String? = null,
        @Indexed(unique = true)
        var name: String? = null,
        var description: String? = null,
        @DBRef
        var applicationContact: Team? = null
) {
}