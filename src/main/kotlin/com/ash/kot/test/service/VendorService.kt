package com.ash.kot.test.service

import com.ash.kot.test.model.Vendor
import com.ash.kot.test.repository.VendorRepository
import org.springframework.stereotype.Service

@Service
class VendorService(val vendorRepository: VendorRepository) {

    fun getAllVendors(): List<Vendor> {
        return vendorRepository.findAll()
    }
}