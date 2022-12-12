package com.bahaa.worldcup2022.match_screen.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NationalTeamCard(
    nationalTeamImage: Painter,
    nationalTeamName: String,
    possession: Int,
    size: Dp,
    cardColor: Color,
    textColor: Color
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(20.dp)
    ) {
        Box(
            modifier = Modifier
                .size(size)
                .clip(RoundedCornerShape(17.dp))
                .align(Alignment.CenterHorizontally)
                .background(color = cardColor),
            contentAlignment = Alignment.Center
        ) {
                Image(
                    painter = nationalTeamImage,
                    contentDescription = "National Team Image",
                    modifier = Modifier.size(size = size * 0.5f)
                )
            }

        Text(
            modifier = Modifier.padding(vertical = 10.18.dp),
            text = nationalTeamName,
            style = TextStyle(
                color = textColor,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            ),

            )

        Box(
            modifier = Modifier
                .width(54.dp)
                .height(32.dp)
                .clip(RoundedCornerShape(30.dp))
                .background(cardColor),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "$possession%",

                )
        }

    }
}