package com.paystack.hardware-nexgo

import com.paystack.poscontract.Hardware

class NexgoApp : Hardware {
    override fun readCard(listener: Hardware.Callback) {
        listener.cardDetails("Nexgo Application running")
    }
}