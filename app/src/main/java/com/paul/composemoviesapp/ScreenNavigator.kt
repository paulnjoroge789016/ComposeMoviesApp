package com.paul.composemoviesapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun ScreenNavigator() {

    val navController = rememberNavController()


    NavHost(
        navController = navController,
        startDestination = Screen.NewReleases.route,
    ) {

        composable(Screen.NewReleases.route) {
            ScreenNewReleases(navController = navController)
        }
        composable(Screen.Popular.route) {
            ScreenPopular(navController = navController)
        }
        composable(Screen.Trending.route) {
            ScreenTrending(navController = navController)
        }

    }
}