package com.paystack.architecturedemo

import com.paystack.hardware_nexgo.NexgoApp
import com.paystack.poscontract.Hardware

class HardwareModule {

    fun getHardwareModule(): Hardware {
        return NexgoApp()
    }
}