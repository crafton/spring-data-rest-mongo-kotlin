package com.crafton.repositories

import com.crafton.models.*
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
interface PersonRepository : MongoRepository<Person, String> {
    fun findBySurname(@Param("surname") surname: String): List<Person>

    //Case-insensitive search on country
    @Query("{'addresses.country': { \$regex: '^?0$', \$options: 'i' } }")
    fun findAllPeopleByCountry(@Param("country") country: String): List<Person>
}

interface PhoneNumberRepository : MongoRepository<PhoneNumber, String>

interface AddressRepository : MongoRepository<Address, String>

interface RelativeRepository : MongoRepository<Relative, String>