package com.shubhasai.progressview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shubhasai.progress_view.CircularFillProgress
import com.shubhasai.progress_view.CircularProgress
import com.shubhasai.progress_view.CloudUploadFillProgress
import com.shubhasai.progress_view.HeartFillProgress
import com.shubhasai.progress_view.HorizontalProgress
import com.shubhasai.progress_view.HourGlassFillProgress
import com.shubhasai.progress_view.UploadFillProgress
import com.shubhasai.progressview.ui.theme.ProgressViewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProgressViewTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        HorizontalProgress(percentage =0.85f,
                            number = 100,
                            modifier = Modifier
                                .padding(16.dp))
                        CircularProgress(percentage =0.85f,
                            number = 100,
                            modifier = Modifier
                                .padding(16.dp))

                        CircularFillProgress(percentage = 0.65f, number =100, viewSize = 100.dp,
                            modifier = Modifier
                                .padding(16.dp)
                                .size(100.dp), textColor = Color.White, fillColor = Color.Blue, fontSize = 14.sp, animDuration = 2000)
                        Row() {
                            HeartFillProgress(percentage = 0.75f, number =100, viewSize = 100.dp,
                                modifier = Modifier
                                    .padding(16.dp)
                                    .size(100.dp), fontSize = 14.sp, textColor = Color.White, fillColor = Color.Red, animDuration = 2000)
                            HourGlassFillProgress(percentage = 0.8f, viewSize = 100.dp,
                                modifier = Modifier
                                    .padding(16.dp)
                                    .size(100.dp), animDuration = 2000)
                        }
                        Row() {
                            UploadFillProgress(percentage = 0.5f, viewSize = 100.dp,
                                modifier = Modifier
                                    .padding(16.dp)
                                    .size(100.dp), animDuration = 2000)
                            CloudUploadFillProgress(percentage = 0.5f, viewSize = 100.dp,
                                modifier = Modifier
                                    .padding(16.dp)
                                    .size(100.dp), animDuration = 2000)
                        }
                    }
                }
            }
        }
    }
}