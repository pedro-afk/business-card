package com.example.businesscard

import android.app.Application
import com.example.businesscard.data.AppDatabase
import com.example.businesscard.data.BusinessCardRepository

class App : Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
    val repository: BusinessCardRepository by lazy { BusinessCardRepository(database.businessDao()) }
}