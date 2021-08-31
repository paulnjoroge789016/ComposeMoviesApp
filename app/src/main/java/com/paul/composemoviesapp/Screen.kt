package com.paul.composemoviesapp

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.List
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(

    val route: String,
    @StringRes val title:Int,
     val icon: ImageVector

) {

    object NewReleases:Screen("new_releases", R.string.newReleases, Icons.Rounded.Home)
    object Trending:Screen("trending", R.string.trending, Icons.Rounded.Favorite)
    object Popular:Screen("popular", R.string.popular, Icons.Rounded.List)
}
