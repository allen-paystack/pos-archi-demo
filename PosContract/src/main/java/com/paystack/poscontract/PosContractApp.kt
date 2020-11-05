package com.paystack.poscontract

import android.content.Context
import com.paystack.poscontract.models.ReceiptType
import com.paystack.poscontract.models.Transaction
import com.paystack.poscontract.models.TransactionType

interface Hardware {
    fun init(context: Context, listener: Callback)
    fun readCard(paystackReference: String, amount: Int)
    fun printReceipt(receiptType: ReceiptType, isReprint: Boolean, transaction: Transaction)

    interface Callback {
        fun cardReadSuccessful()
        fun cardReadError()
        fun emvTransactionError(errorCode: Int)
        fun onWrongPinEntered(numberOfTries: Int)
        fun processComplete(transaction: Transaction)
    }
}

interface Processor {
    fun doCallHome()
    fun downloadKeys()
    fun doTransaction(
        transactionType: TransactionType,
        transaction: Transaction,
        listener: Callback
    )

    interface Callback {
        fun onTransactionResponse(message: String)
    }
}