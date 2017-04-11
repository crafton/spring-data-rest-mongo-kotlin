package com.crafton.repositories

import com.crafton.models.Application
import com.crafton.models.Department
import com.crafton.models.OrganizationalRelationship
import com.crafton.models.Team
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.query.Param

interface OrganizationRepository : MongoRepository<OrganizationalRelationship, String>

interface DepartmentRepository : MongoRepository<Department, String> {
    fun findByName(@Param("name") name: String): Department
}

interface TeamRepository : MongoRepository<Team, String> {
    fun findByName(@Param("teamName") teamName: String): Team
}

interface ApplicationRepository : MongoRepository<Application, String>