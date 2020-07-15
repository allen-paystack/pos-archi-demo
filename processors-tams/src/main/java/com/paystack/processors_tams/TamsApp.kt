package com.paystack.processors_tams

import com.paystack.poscontract.Processor

class TamsApp : Processor {
    override fun doTransaction(listener: Processor.Callback) {
        listener.transactionDetails("tams 223312903908")
    }
}