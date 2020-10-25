package com.paystack.architecturedemo.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Update

@Dao
interface TransactionDao {

    @Insert
    fun insert(transaction: TransactionEntity):Long

    @Update
    fun update(transaction: TransactionEntity)
}