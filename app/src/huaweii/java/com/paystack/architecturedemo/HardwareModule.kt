package com.paystack.architecturedemo

import com.paystack.hardware_huaweii.HuaweiiApp
import com.paystack.poscontract.Hardware

class HardwareModule {

    fun getHardwareModule(): Hardware {
        return HuaweiiApp();
    }
}