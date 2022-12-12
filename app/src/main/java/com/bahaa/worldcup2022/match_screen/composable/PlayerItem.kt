package com.bahaa.worldcup2022.match_screen.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PlayerItem(
    playerImage: Painter,
    playerName: String,
    playerPosition: String
) {

    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 16.dp),

        ) {
        Card(
            elevation = 0.dp
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = playerImage,
                    contentDescription = "player Image",
                    modifier = Modifier
                        .border(1.dp, color = Color.Green, shape = CircleShape)
                        .size(30.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.FillHeight
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = playerName,
                    style = TextStyle(fontSize = 11.sp, color = Color.Black)
                )


            }
        }

        Text(text = playerPosition, style = TextStyle(fontSize = 11.sp, color = Color.Black))

    }

}