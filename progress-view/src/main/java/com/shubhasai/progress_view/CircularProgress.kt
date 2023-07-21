package com.shubhasai.progress_view
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CircularProgress(
    modifier: Modifier = Modifier,
    percentage: Float,
    number: Int,
    fontSize: TextUnit = 28.sp,
    radius: Dp = 50.dp,
    color: Color = Color.Blue,
    strokeWidth: Dp = 8.dp,
    animDuration: Int = 1000,
    animDelay: Int = 0,
    capRounded: Boolean = true,
    startAngle: Float = -90f,
    maxAngle: Float = 360f,
    textColor: Color = Color.Black,
    useCenter: Boolean = false
){
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
        modifier = modifier.size(  radius * 2f)
    ) {
        Box(contentAlignment = Alignment. Center,modifier = Modifier.size(radius * 2f)) {
            androidx.compose.foundation.Canvas(modifier = Modifier.size(radius * 2f)) {
                drawArc(
                    color = color,
                    startAngle = startAngle,
                    sweepAngle = maxAngle * curPercentage.value,
                    useCenter = useCenter,
                    style = Stroke(strokeWidth.toPx(), cap = if (capRounded) StrokeCap.Round else StrokeCap.Butt)
                )
            }
            Text (
                text = (curPercentage.value*number).toInt ().toString(),
                color = textColor,
                fontSize = fontSize,
                fontWeight = FontWeight. Bold
            )
        }
    }
}