package com.ash.kot.test.model

data class VendorRequest(
    var name: String? = "",
    val displayName: String? = "",
    val description: String? = "",
    val customerId: String? = "",
    val multiplier: Double = 0.0
)