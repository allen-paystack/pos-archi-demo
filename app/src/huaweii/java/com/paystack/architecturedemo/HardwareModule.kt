package com.paystack.architecturedemo

import com.paystack.mylibrary_huaweii.HuaweiiApp
import com.paystack.poscontract.Hardware

class HardwareModule {

    fun getHardwareModule(): Hardware {
        return HuaweiiApp();
    }
}