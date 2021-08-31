package com.paul.composemoviesapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
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