package com.paul.composemoviesapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import com.paul.composemoviesapp.viewmodels.MainViewModel


@Composable
fun ScreenTrending(mainViewModel: MainViewModel) {
    mainViewModel.setCurrentScreen(Screen.Trending)
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Trending.", style = MaterialTheme.typography.h4)
    }
}