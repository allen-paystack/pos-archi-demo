package com.paystack.processors_epms

import com.paystack.poscontract.Processor

class EpmsApp : Processor {
    override fun doTransaction(listener: Processor.Callback) {
        listener.transactionDetails("epms 223312903")
    }
}
