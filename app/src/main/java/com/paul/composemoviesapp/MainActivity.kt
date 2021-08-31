package com.paul.composemoviesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.tooling.preview.Preview
import com.paul.composemoviesapp.CustomeComposable.CustomBottomNavigation
import com.paul.composemoviesapp.ui.theme.ComposeMoviesAppTheme

class MainActivity : ComponentActivity() {

    private val currentRoute  = mutableStateOf(Screen.NewReleases.route)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeMoviesAppTheme {

                Scaffold (

                    bottomBar = {
                        CustomBottomNavigation(
                            selectedRoute = currentRoute.value,
                            onItemSelected = {
                                currentRoute.value
                            }
                        )
                    },
                    backgroundColor = MaterialTheme.colors.primary,
                    contentColor = MaterialTheme.colors.onSurface,
                ){

                }

            }
        }
    }
}
