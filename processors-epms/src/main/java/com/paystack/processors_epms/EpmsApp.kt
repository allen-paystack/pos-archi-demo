package com.paystack.processors_epms

import com.paystack.poscontract.Processor

class EpmsApp : Processor {
    override fun doTransaction(listener: Processor.Callback) {
        listener.cardDetails("22331290u3")
    }
}