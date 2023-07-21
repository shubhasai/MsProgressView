package com.shubhasai.progressview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.shubhasai.progress_view.CircularProgress
import com.shubhasai.progressview.ui.theme.ProgressViewTheme
import com.shubhasai.progress_view.HorizontalProgress

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
                    Column() {
                        HorizontalProgress(percentage = 0.75f, number = 100, modifier = Modifier.padding(16.dp))
                        CircularProgress(percentage = 0.65f, number = 360, modifier = Modifier.padding(16.dp))
                        CircularProgress(percentage = 1f, number = 100, modifier = Modifier.padding(16.dp), useCenter = false, maxAngle = 180f, startAngle = -180f)
                    }

                }
            }
        }
    }
}


