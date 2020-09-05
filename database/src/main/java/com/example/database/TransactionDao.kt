package com.example.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Update

@Dao
interface TransactionDao {

    @Insert
    fun insert(transaction: Transaction):Long

    @Update
    fun update(transaction: Transaction)
}