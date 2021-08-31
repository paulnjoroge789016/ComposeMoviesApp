package com.paul.composemoviesapp.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paul.composemoviesapp.Screen

class MainViewModel : ViewModel() {

    private val _currentScreen = MutableLiveData<Screen>(Screen.NewReleases)
    val currentScreen: LiveData<Screen> = _currentScreen

    fun setCurrentScreen(screen: Screen) {
        _currentScreen.value = screen
    }
}