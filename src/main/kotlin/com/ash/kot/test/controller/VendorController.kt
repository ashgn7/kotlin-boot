package com.ash.kot.test.controller

import com.ash.kot.test.model.Vendor
import com.ash.kot.test.model.VendorRequest
import com.ash.kot.test.service.VendorService
import org.bson.types.ObjectId
import org.springframework.web.bind.annotation.*

@RestController
class VendorController(val vendorService: VendorService) {

    @GetMapping("/list_vendors")
    fun getAllVendors(): List<Vendor> {
        println("getting all vendors")
        return vendorService.getAllVendors()
    }

    @GetMapping("/get/{id}")
    fun getVendorById(@PathVariable("id") id: String): Vendor? {
        if (ObjectId.isValid(id)) {
            val objectId = ObjectId(id)
            val findByVendorId = vendorService.findByVendorId(objectId)
            if (findByVendorId.isPresent) return findByVendorId.get()
        }
        return null
    }

    @PostMapping("create_vendor")
    fun createVendor(@RequestBody payload: VendorRequest) : Vendor =
        vendorService.createVendor(payload)

}