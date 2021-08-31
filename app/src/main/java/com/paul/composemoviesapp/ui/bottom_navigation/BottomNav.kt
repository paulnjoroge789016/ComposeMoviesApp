package com.paul.composemoviesapp.ui.bottom_navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.paul.composemoviesapp.Screen


@OptIn(ExperimentalAnimationApi::class)
@Composable
fun BottomNavigation(
    selectedRoute: String,
    navController: NavController,
    onItemSelected: (Screen) -> Unit
) {


    val items = Screen.Items.list
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    var currentRoute = navBackStackEntry?.destination?.route

    Row(
        modifier = Modifier
            .background(MaterialTheme.colors.background)
            .padding(8.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically

    ) {
        items.forEach { item ->
            BottomNavigationItem(
                item = item,
                isSelected = item.route == currentRoute,
                onclick = {

                    if (currentRoute != item.route) {


                        navController.navigate(item.route)
                    }


                }
        ){

                onItemSelected(item)
            }
    }
}
}


@Composable
private fun currentRoute(navController: NavHostController): String? {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    return navBackStackEntry?.destination?.route
}



