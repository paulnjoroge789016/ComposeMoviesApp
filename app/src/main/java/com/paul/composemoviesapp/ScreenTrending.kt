package com.paul.composemoviesapp

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController


@Composable
fun ScreenTrending(navController: NavController) {
    Text(text = "Trending")
}