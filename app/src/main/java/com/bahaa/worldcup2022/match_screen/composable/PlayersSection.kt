package com.bahaa.worldcup2022.match_screen.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.bahaa.worldcup2022.R

@Composable
fun PlayersSection(
) {
    Box(
        Modifier
            .padding(16.dp)
            .width(343.dp)
            .height(466.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(color = Color.White)
            .border(
                border = BorderStroke(1.dp, Color.Green),
                shape = RoundedCornerShape(20.dp)
            ),

        ) {
        Column(
        ) {
            PlayerCardInformation()

            Box(
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = stringResource(R.string.escalation),
                    style = TextStyle(color = Color.Black, fontWeight = FontWeight.Bold),

                    )
            }

            ListHeader()
            PlayerListInformation()

        }


    }

}


