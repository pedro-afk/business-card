package com.example.businesscard.data
import kotlinx.coroutines.*

class BusinessCardRepository(private val dao: BusinessCardDAO) {
    // runBlocking = abrir rotina
    fun insert(businessCard: BusinessCard) = runBlocking {
        launch(Dispatchers.IO) {
            dao.insert(businessCard)
        }
    }

    fun getAll() = dao.getAll()
}