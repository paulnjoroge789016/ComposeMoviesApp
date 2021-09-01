package com.paul.composemoviesapp.ui.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.paul.composemoviesapp.R

@Preview
@Composable
fun MovieDetails() {

}

@Preview
@Composable
fun MovieHeader() {

    Column(
        Modifier
            .padding(all = 0.dp)
            .height(200.dp)
            .fillMaxWidth(),


        ) {


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),

            contentAlignment = Alignment.Center
        ) {

            Image(
                painter = painterResource(R.drawable.header),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()

            )


                Image(
                    painter = painterResource(R.drawable.youtube),
                    contentDescription = null,
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp),


                    )


        }

    }


}
