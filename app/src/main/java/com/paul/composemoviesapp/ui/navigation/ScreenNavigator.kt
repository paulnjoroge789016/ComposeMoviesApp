package com.paul.composemoviesapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.paul.composemoviesapp.Screen
import com.paul.composemoviesapp.ScreenNewReleases
import com.paul.composemoviesapp.ScreenPopular
import com.paul.composemoviesapp.ScreenTrending
import com.paul.composemoviesapp.viewmodels.MainViewModel


@Composable
fun ScreenNavigator(navController: NavController, viewModel: MainViewModel) {




    NavHost(
        navController  = navController as NavHostController,
        startDestination = Screen.Trending.route,
    ) {

        composable(Screen.NewReleases.route) {
            ScreenNewReleases(mainViewModel = viewModel)
        }
        composable(Screen.Popular.route) {
            ScreenPopular(mainViewModel = viewModel)
        }
        composable(Screen.Trending.route) {
            ScreenTrending(mainViewModel = viewModel)
        }

    }
}