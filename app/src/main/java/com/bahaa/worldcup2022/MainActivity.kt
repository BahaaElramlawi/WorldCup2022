package com.bahaa.worldcup2022

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.bahaa.worldcup2022.match_screen.MatchScreen
import com.bahaa.worldcup2022.ui.theme.WorldCup2022Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WorldCup2022Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
                    color = Color.Black
                ) {
                    MatchScreen()
                }
            }
        }
    }
}