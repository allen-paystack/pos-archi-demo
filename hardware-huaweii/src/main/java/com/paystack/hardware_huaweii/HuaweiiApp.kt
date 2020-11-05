package com.paystack.hardware_huaweii

import android.content.Context
import com.paystack.poscontract.Hardware
import com.paystack.poscontract.models.ReceiptType
import com.paystack.poscontract.models.Transaction

class HuaweiiApp : Hardware {

    private lateinit var listener: Hardware.Callback
    private lateinit var transaction: Transaction

    override fun init(context: Context, listener: Hardware.Callback) {
        this.listener = listener
        transaction = Transaction()
    }

    override fun readCard(paystackReference: String, amount: Int) {
        transaction.amount = amount.toString()
        transaction.paystackReference = paystackReference
        listener.cardReadSuccessful()
        otherRandomProcess()
    }

    override fun printReceipt(receiptType: ReceiptType, isReprint: Boolean, transaction: Transaction) {
        //TODO: Print receipt
    }

    private fun otherRandomProcess() {
        listener.processComplete(transaction)
    }
}