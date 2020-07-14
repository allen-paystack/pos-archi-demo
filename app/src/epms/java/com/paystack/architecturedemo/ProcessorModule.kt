package com.paystack.architecturedemo

import com.paystack.poscontract.Processor
import com.paystack.processors_epms.EpmsApp

class ProcessorModule {
    fun getProcessorModule(): Processor {
        return EpmsApp()
    }
}