package com.paul.composemoviesapp

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.List
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(

    val route: String,
    val title:Int,
     val icon: ImageVector

) {

    object NewReleases:Screen("new_releases", R.string.newReleases, Icons.Outlined.Home)
    object Trending:Screen("trending", R.string.trending, Icons.Outlined.Favorite)
    object Popular:Screen("popular", R.string.popular, Icons.Outlined.List)



    object Items{
        val list = listOf(
            NewReleases, Trending, Popular
        )
    }

}
