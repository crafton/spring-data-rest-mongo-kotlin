package com.crafton.repositories

import com.crafton.models.Team
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.query.Param


interface TeamRepository : MongoRepository<Team, String> {
    fun findByName(@Param("teamName") teamName: String): Team
}