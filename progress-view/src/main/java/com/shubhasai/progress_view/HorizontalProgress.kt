package com.shubhasai.progress_view
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HorizontalProgress(
    modifier: Modifier = Modifier,
    percentage: Float,
    number: Int,
    fontSize: TextUnit = 28.sp,
    width: Dp = 350.dp,
    height: Dp = 50.dp,
    color: Color = Color.Blue,
    animDuration: Int = 1000,
    animDelay: Int = 0,
    radius: Dp = 20.dp,
    backgroundColor: Color = Color.LightGray,
    textColor: Color = Color.Black,
    percentageTextColor:Color = Color.White,
    percentageTextSize:TextUnit = 20.sp
) {
    var animationPlayed by remember {
        mutableStateOf( false)
    }
    val curPercentage = animateFloatAsState (
        targetValue = if(animationPlayed) percentage else 0f,
        animationSpec = tween (
            durationMillis = animDuration,
            delayMillis = animDelay
        )
    )
    //To make sure that animation is played once
    LaunchedEffect (key1 = true) {
        animationPlayed = true
    }
    Box (
        modifier = modifier.size(width, height)
    ) {
        Column() {
            Box {
                Canvas(
                    modifier = Modifier
                        .size(width, height)
                ) {
                    drawRoundRect(
                        cornerRadius = CornerRadius(radius.toPx()),
                        color =backgroundColor, // Change this to the color you want for the filled portion
                        size = Size((width).toPx(), size.height)
                    )
                    drawRoundRect(
                        cornerRadius = CornerRadius(radius.toPx()),
                        color = color, // Change this to the color you want for the filled portion
                        size = Size((width * curPercentage.value).toPx(), size.height)
                    )
                }
                Text(text = "${percentage*100f.toInt()}%",
                    modifier = Modifier.align(Alignment.Center).padding(0.5.dp),
                    color = percentageTextColor,
                    fontSize = percentageTextSize)
            }

            Row(modifier = Modifier.width(width), horizontalArrangement = Arrangement.SpaceBetween) {
                Text (
                    text = "0",
                    color = textColor,
                    fontSize = fontSize,
                    fontWeight = FontWeight. Bold
                )
                Text (
                    text = "$number",
                    color = textColor,
                    fontSize = fontSize,
                    fontWeight = FontWeight. Bold
                )
            }

        }

    }
}

