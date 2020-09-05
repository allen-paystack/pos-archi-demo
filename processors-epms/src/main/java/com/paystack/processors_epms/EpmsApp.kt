package com.paystack.processors_epms

import com.example.database.Transaction
import com.paystack.poscontract.Processor
import com.paystack.poscontract.models.TransactionType

class EpmsApp : Processor {

    override fun doCallHome() {
        TODO("Not yet implemented")
    }

    override fun downloadKeys() {
        TODO("Not yet implemented")
    }

    override fun doTransaction(
        transactionType: TransactionType,
        transaction: Transaction,
        listener: Processor.Callback
    ) {
        TODO("Not yet implemented")
    }

}