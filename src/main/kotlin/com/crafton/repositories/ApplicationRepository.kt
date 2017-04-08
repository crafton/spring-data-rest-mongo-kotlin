package com.crafton.repositories

import com.crafton.models.Application
import org.springframework.data.mongodb.repository.MongoRepository


interface ApplicationRepository : MongoRepository<Application, String> {
}