package com.example.krboot

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "Customers")
data class Customer (
        var id:Int=0,
        var name:String="",
        var telephone: TelePhone?=null
) {
    data class TelePhone(
            var countryCode:String="",
            var telephoneNumber:String=""
    )
}