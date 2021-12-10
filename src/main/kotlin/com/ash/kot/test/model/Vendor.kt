package com.ash.kot.test.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Vendor(
    @Id
    var id: String,
    var name: String,
    var displayName: String,
    var description: String,
    var customerId: String = "",
    var multiplier: Int
)
