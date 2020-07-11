package com.paystack.architecturedemo

import com.paystack.mylibrary_nexgo.NexgoApp
import com.paystack.poscontract.Hardware

class HardwareModule {

    fun getHardwareModule(): Hardware {
        return NexgoApp()
    }
}