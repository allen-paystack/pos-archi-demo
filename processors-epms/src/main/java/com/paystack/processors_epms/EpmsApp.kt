package com.paystack.processors_epms

import com.paystack.poscontract.Processor
import com.paystack.poscontract.models.TransactionType

class EpmsApp : Processor {

    override fun doCallHome() {
        TODO("Not yet implemented")
    }

    override fun downloadKeys() {
        TODO("Not yet implemented")
    }

    override fun doTransaction(transactionType: TransactionType, listener: Processor.Callback) {
        listener.transactionDetails("epms 223312903")
    }
}