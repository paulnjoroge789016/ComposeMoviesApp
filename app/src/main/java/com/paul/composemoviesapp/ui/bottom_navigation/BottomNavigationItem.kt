package com.paul.composemoviesapp.ui.bottom_navigation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.paul.composemoviesapp.Screen


@ExperimentalAnimationApi
@Composable
fun BottomNavigationItem(
    item: Screen,
    isSelected: Boolean,
    onclick: () -> Unit,
    function: () -> Unit,
) {

    val backgroundColor = if (isSelected)
        MaterialTheme.colors.primary.copy(alpha = 0.1f)
    else
        Color.Transparent

    val contentColor = if (isSelected)
        MaterialTheme.colors.primary
    else
        MaterialTheme.colors.onBackground


    Box(
        modifier = Modifier
            .clip(CircleShape)
            .background(color = backgroundColor)
            .clickable(onClick = onclick)
    ) {


        Row(
            modifier = Modifier
                .padding(12.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalAlignment = Alignment.CenterVertically
        )
        {

            Icon(
                imageVector = item.icon,
                contentDescription = null,
                tint = contentColor
            )

            AnimatedVisibility(visible = isSelected) {
                Text(
                    text = stringResource(id = item.title),
                    color = contentColor

                )

            }

        }

    }

}

