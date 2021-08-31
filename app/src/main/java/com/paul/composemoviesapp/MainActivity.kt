package com.paul.composemoviesapp

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.paul.composemoviesapp.CustomeComposable.CustomBottomNavigation
import com.paul.composemoviesapp.ui.theme.ComposeMoviesAppTheme

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

                    Scaffold (bottomBar = {
                        CustomBottomNavigation(
                            selectedRoute = currentScreen.value.route,
                        ) {
                            currentScreen.value = it
                        }

                    }){

                    }



            }
        }
    }
    }



}
