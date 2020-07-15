package com.paystack.architecturedemo

import com.paystack.poscontract.Processor
import com.paystack.processors_tams.TamsApp

class ProcessorModule {
    fun getProcessorModule(): Processor {
        return TamsApp()
    }
}