package com.shubhasai.progress_view

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CircularFillProgress(
    modifier: Modifier = Modifier,
    percentage: Float,
    number: Int,
    fontSize: TextUnit = 28.sp,
    viewSize: Dp = 50.dp,
    color: Color = Color.LightGray,
    animDuration: Int = 1000,
    animDelay: Int = 0,
    textColor: Color = Color.Black,
    fillColor: Color = Color.Blue,
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
        modifier = modifier.size(viewSize)
    ) {
        val vectorRes2: Painter = painterResource(id = R.drawable.ms_circle)
        Icon(
            vectorRes2,
            modifier = Modifier
                .drawWithContent {
                    val height = size.height * curPercentage.value

                    with(drawContext.canvas.nativeCanvas) {
                        val checkPoint = saveLayer(null, null)

                        val totalHeight = size.height
                        val filledHeight = totalHeight * curPercentage.value

                        // Destination
                        drawContent()

                        // Source
                        drawRect(
                            fillColor,
                            topLeft = Offset(0f, totalHeight - height),
                            size = Size(size.width, height),
                            blendMode = BlendMode.SrcIn

                        )

                        restoreToCount(checkPoint)

                    }
                }
                .size(viewSize),
            contentDescription = null,
            tint = color
        )
        Text(
            text = "${number*percentage}",
            color = textColor,
            fontSize = fontSize,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Composable
fun HeartFillProgress(
    modifier: Modifier = Modifier,
    percentage: Float,
    number: Int,
    fontSize: TextUnit = 28.sp,
    viewSize: Dp = 50.dp,
    color: Color = Color.LightGray,
    animDuration: Int = 1000,
    animDelay: Int = 0,
    textColor: Color = Color.Black,
    fillColor: Color = Color.Blue,
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
        modifier = modifier.size(viewSize)
    ) {
        val vectorRes2: Painter = painterResource(id = R.drawable.ms_heart)
        Icon(
            vectorRes2,
            modifier = Modifier
                .drawWithContent {
                    val height = size.height * curPercentage.value

                    with(drawContext.canvas.nativeCanvas) {
                        val checkPoint = saveLayer(null, null)

                        val totalHeight = size.height
                        val filledHeight = totalHeight * curPercentage.value

                        // Destination
                        drawContent()

                        // Source
                        drawRect(
                            fillColor,
                            topLeft = Offset(0f, totalHeight - height),
                            size = Size(size.width, height),
                            blendMode = BlendMode.SrcIn

                        )

                        restoreToCount(checkPoint)

                    }
                }
                .size(viewSize),
            contentDescription = null,
            tint = color
        )
        Text(
            text = "${number*percentage}",
            color = textColor,
            fontSize = fontSize,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Composable
fun HourGlassFillProgress(
    modifier: Modifier = Modifier,
    percentage: Float,
    viewSize: Dp = 50.dp,
    color: Color = Color.LightGray,
    animDuration: Int = 1000,
    animDelay: Int = 0,
    fillColor: Color = Color.Blue,
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
        modifier = modifier.size(viewSize)
    ) {
        val vectorRes2: Painter = painterResource(id = R.drawable.ms_hourglass)
        Icon(
            vectorRes2,
            modifier = Modifier
                .drawWithContent {
                    val height = size.height * curPercentage.value

                    with(drawContext.canvas.nativeCanvas) {
                        val checkPoint = saveLayer(null, null)

                        val totalHeight = size.height
                        val filledHeight = totalHeight * curPercentage.value

                        // Destination
                        drawContent()

                        // Source
                        drawRect(
                            fillColor,
                            topLeft = Offset(0f, totalHeight - height),
                            size = Size(size.width, height),
                            blendMode = BlendMode.SrcIn

                        )

                        restoreToCount(checkPoint)

                    }
                }
                .size(viewSize),
            contentDescription = null,
            tint = color
        )
    }
}

@Composable
fun UploadFillProgress(
    modifier: Modifier = Modifier,
    percentage: Float,
    viewSize: Dp = 50.dp,
    color: Color = Color.LightGray,
    animDuration: Int = 1000,
    animDelay: Int = 0,
    fillColor: Color = Color.Blue,
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
        modifier = modifier.size(viewSize)
    ) {
        val vectorRes2: Painter = painterResource(id = R.drawable.ms_upload)
        Icon(
            vectorRes2,
            modifier = Modifier
                .drawWithContent {
                    val height = size.height * curPercentage.value

                    with(drawContext.canvas.nativeCanvas) {
                        val checkPoint = saveLayer(null, null)

                        val totalHeight = size.height
                        val filledHeight = totalHeight * curPercentage.value

                        // Destination
                        drawContent()

                        // Source
                        drawRect(
                            fillColor,
                            topLeft = Offset(0f, totalHeight - height),
                            size = Size(size.width, height),
                            blendMode = BlendMode.SrcIn

                        )

                        restoreToCount(checkPoint)

                    }
                }
                .size(viewSize),
            contentDescription = null,
            tint = color
        )

    }
}

@Composable
fun CloudUploadFillProgress(
    modifier: Modifier = Modifier,
    percentage: Float,
    viewSize: Dp = 50.dp,
    color: Color = Color.LightGray,
    animDuration: Int = 1000,
    animDelay: Int = 0,
    fillColor: Color = Color.Blue,
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
        modifier = modifier.size(viewSize)
    ) {
        val vectorRes2: Painter = painterResource(id = R.drawable.ms_cloudupload)
        Icon(
            vectorRes2,
            modifier = Modifier
                .drawWithContent {
                    val height = size.height * curPercentage.value

                    with(drawContext.canvas.nativeCanvas) {
                        val checkPoint = saveLayer(null, null)

                        val totalHeight = size.height
                        val filledHeight = totalHeight * curPercentage.value

                        // Destination
                        drawContent()

                        // Source
                        drawRect(
                            fillColor,
                            topLeft = Offset(0f, totalHeight - height),
                            size = Size(size.width, height),
                            blendMode = BlendMode.SrcIn

                        )

                        restoreToCount(checkPoint)

                    }
                }
                .size(viewSize),
            contentDescription = null,
            tint = color
        )
    }
}