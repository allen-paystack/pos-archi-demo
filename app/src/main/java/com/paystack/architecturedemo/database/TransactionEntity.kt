package com.paystack.architecturedemo.database

data class TransactionEntity(
    var paystackReference: String = "",
    var amount: String = "",
    var pan: String = "",
    var expiry: String = "",
    var iccData: String = "",
    var encryptedPin: String = "",
    var serviceCode: String = "",
    var rrn: String = ""
)