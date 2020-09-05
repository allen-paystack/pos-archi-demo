package com.paystack.hardware_nexgo

import android.content.Context
import com.paystack.poscontract.Hardware
import com.paystack.poscontract.models.ReceiptType

class NexgoApp : Hardware {

    override fun init(context: Context, listener: Hardware.Callback) {
        TODO("Not yet implemented")
    }

    override fun readCard(paystackReference: String, amount: Int) {
        TODO("Not yet implemented")
    }

    override fun printReceipt(receiptType: ReceiptType, isReprint: Boolean) {
        TODO("Not yet implemented")
    }
}