package com.paystack.hardware_huaweii

import android.content.Context
import androidx.room.Room
import com.example.database.AppDatabase
import com.example.database.Transaction
import com.example.database.TransactionDao
import com.paystack.poscontract.Hardware
import com.paystack.poscontract.models.ReceiptType

class HuaweiiApp : Hardware {

    private lateinit var listener: Hardware.Callback
    private lateinit var transaction: Transaction
    private lateinit var transactionDao: TransactionDao

    override fun init(context: Context, listener: Hardware.Callback) {
        this.listener = listener
        transaction = Transaction()
        val roomDb = Room.databaseBuilder(context, AppDatabase::class.java, "database")
            .build()
        transactionDao = roomDb.transactionDataDao()
    }

    override fun readCard(paystackReference: String, amount: Int) {
        transaction.amount = amount.toString()
        transaction.paystackReference = paystackReference
        listener.cardReadSuccessful()
        otherRandomProcess()
    }

    override fun printReceipt(receiptType: ReceiptType, isReprint: Boolean) {
        //TODO: Print receipt
    }

    private fun otherRandomProcess() {
        // At this point, the process of reading card and confirming PIN that has to do with the hardware is complete
        val long = transactionDao.insert(transaction)

        // This is not effective, once the index gets to 10, rrn will be 13 digits and that will cause an ISO exception.
        transaction.rrn = "00000000000${long}"
        transactionDao.update(transaction)
        listener.processComplete(transaction)
    }
}