package ru.foxdev.criminalintent.controller

import android.app.Application
import ru.foxdev.criminalintent.repository.CrimeRepository

class CriminalIntentApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}