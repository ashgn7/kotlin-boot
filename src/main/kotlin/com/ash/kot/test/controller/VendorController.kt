package com.ash.kot.test.controller

import com.ash.kot.test.model.Vendor
import com.ash.kot.test.service.VendorService
import lombok.extern.slf4j.Slf4j
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Slf4j
class VendorController(val vendorService: VendorService) {

    @GetMapping("/list_vendors")
    fun getAllVendors(): List<Vendor> {
        println("getting all vendors")
        return vendorService.getAllVendors()
    }


}