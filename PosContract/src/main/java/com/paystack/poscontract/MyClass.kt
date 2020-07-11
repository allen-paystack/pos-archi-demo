package com.paystack.poscontract

interface Hardware {
    fun readCard(listener: Callback)

    interface Callback {
        fun cardDetails(message: String)
    }
}