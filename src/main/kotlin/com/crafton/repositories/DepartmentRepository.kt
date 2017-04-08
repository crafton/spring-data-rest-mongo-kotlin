package com.crafton.repositories

import com.crafton.models.Department
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.query.Param


interface DepartmentRepository : MongoRepository<Department, String> {
    fun findByName(@Param("name") name: String): Department
}