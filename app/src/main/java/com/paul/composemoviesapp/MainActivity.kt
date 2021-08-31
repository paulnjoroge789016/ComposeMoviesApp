package com.paul.composemoviesapp

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.toArgb
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.paul.composemoviesapp.CustomeComposable.CustomBottomNavigation
import com.paul.composemoviesapp.ui.theme.ComposeMoviesAppTheme
import com.paul.composemoviesapp.viewmodels.MainViewModel

class MainActivity : ComponentActivity() {


    @OptIn(ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            window.statusBarColor = MaterialTheme.colors.background.toArgb()
            window.navigationBarColor = MaterialTheme.colors.background.toArgb()

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                window.navigationBarDividerColor =
                    MaterialTheme.colors.onBackground.copy(alpha = 0.1f).toArgb()
            }

            val currentScreen = mutableStateOf<Screen>(
                Screen.NewReleases
            )

            ComposeMoviesAppTheme {


                Surface(color = MaterialTheme.colors.background) {

                    val navController = rememberNavController()
                    val viewModel: MainViewModel = viewModel()

                    Scaffold(bottomBar = {
                        CustomBottomNavigation(
                            selectedRoute = currentScreen.value.route,
                            navController = navController,
                        ){

                            currentScreen.value = it
                        }
                    }) {
                        ScreenNavigator(navController, viewModel)
                    }


                }
            }
        }
    }
}

