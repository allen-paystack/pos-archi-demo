package com.paystack.processors_tams

import com.paystack.poscontract.Processor
import com.paystack.poscontract.models.TransactionType

class TamsApp : Processor {

    override fun doCallHome() {
        TODO("Not yet implemented")
    }

    override fun downloadKeys() {
        TODO("Not yet implemented")
    }

    override fun doTransaction(transactionType: TransactionType, listener: Processor.Callback) {
        listener.transactionDetails("tams 223312903908")
    }
}