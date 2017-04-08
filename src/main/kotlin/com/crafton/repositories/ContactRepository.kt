package com.crafton.repositories

import com.crafton.models.Address
import com.crafton.models.PhoneNumber
import org.springframework.data.mongodb.repository.MongoRepository

interface PhoneNumberRepository : MongoRepository<PhoneNumber, String>

interface AddressRepository : MongoRepository<Address, String>
