package com.ash.kot.test.repository

import com.ash.kot.test.model.Vendor
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface VendorRepository : MongoRepository<Vendor, String>{
}