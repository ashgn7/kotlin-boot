package com.ash.kot.test.service

import com.ash.kot.test.model.Vendor
import com.ash.kot.test.model.VendorRequest
import com.ash.kot.test.repository.VendorRepository
import org.bson.types.ObjectId
import org.springframework.stereotype.Service
import java.util.*

@Service
class VendorService(val vendorRepository: VendorRepository) {

    fun getAllVendors(): List<Vendor> {
        return vendorRepository.findAll()
    }

    fun findByVendorId(objectId: ObjectId): Optional<Vendor> {
        return vendorRepository.findById(objectId.toString())
    }

    fun createVendor(vendorRequest: VendorRequest): Vendor {
        println("About to save vendor")

        return vendorRepository.save(
            Vendor(
                id = ObjectId.get().toString(),
                name = vendorRequest.name,
                displayName = vendorRequest.displayName,
                description = vendorRequest.description,
                customerId = vendorRequest.customerId,
                multiplier = vendorRequest.multiplier
            )
        )
    }
}