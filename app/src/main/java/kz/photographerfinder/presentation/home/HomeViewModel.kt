package kz.photographerfinder.presentation.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kz.photographerfinder.data.Photographer
import kz.photographerfinder.data.repository.PhotographerRepository

class HomeViewModel(private val photographerRepository: PhotographerRepository): ViewModel(){
    private lateinit var topLiveData: MutableLiveData<List<Photographer>>

    fun getTop(): LiveData<List<Photographer>>{
        if(!::topLiveData.isInitialized) {
            return topLiveData
        } else{
            topLiveData = MutableLiveData()
            topLiveData.postValue(photographerRepository.getTop())
            return topLiveData
        }
    }
}