package com.paystack.hardware_huaweii

import com.paystack.poscontract.Hardware

class HuaweiiApp : Hardware {
    override fun readCard(listener: Hardware.Callback) {
        listener.cardDetails("Huaweii Application running")
    }
}