package com.example.advance.movieList.util

import android.media.Rating
import android.widget.RatingBar
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material.icons.rounded.StarHalf
import androidx.compose.material.icons.rounded.StarOutline
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun RatingBar(
    modifier: Modifier = Modifier,
    starModifier: Modifier = Modifier,
    rating: Double = 0.5,
    star: Int = 5,
    starColor: Color = Color.Yellow
){
    val filledStar = kotlin.math.floor(rating).toInt()
    val unfilledStar = (star - kotlin.math.ceil(rating)).toInt()
    val halfStar = !(rating.rem(1).equals(0.0))

    Row (modifier = Modifier){
        repeat(filledStar){
            Icon(
                modifier = Modifier,
                imageVector = Icons.Rounded.Star ,
                contentDescription = "rating",
                tint = starColor)
        }
        if(halfStar){
            Icon(
                modifier = starModifier,
                imageVector = Icons.Rounded.StarHalf,
                contentDescription = null,
                tint = starColor
            )
        }
        repeat(unfilledStar) {
            Icon(
                modifier = starModifier,
                imageVector = Icons.Rounded.StarOutline,
                contentDescription = null,
                tint = starColor
            )
        }
    }
}

