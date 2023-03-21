package ru.foxdev.criminalintent.model

import androidx.lifecycle.ViewModel
import ru.foxdev.criminalintent.repository.CrimeRepository

class CrimeListViewModel : ViewModel() {

    private val crimeRepository = CrimeRepository.get()
    val crimeListLiveData = crimeRepository.getCrimes()
}