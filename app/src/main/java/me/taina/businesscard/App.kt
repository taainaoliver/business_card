package me.taina.businesscard

import android.app.Application
import me.taina.businesscard.data.AppDatabase
import me.taina.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}