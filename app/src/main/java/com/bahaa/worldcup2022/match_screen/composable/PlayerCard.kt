package com.bahaa.worldcup2022.match_screen.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bahaa.worldcup2022.R
import com.bahaa.worldcup2022.match_screen.model.Player

@Composable
fun PlayerCard(
    player: Player
) {
    Card(
        modifier = Modifier
            .height(160.dp),
        elevation = 0.dp
    ) {
        Card(
            Modifier
                .fillMaxSize()
                .padding(16.dp)
                .clip(RoundedCornerShape(23.dp)),
            elevation = 0.dp
        ) {
            Image(
                modifier = Modifier
                    .fillMaxSize(),
                painter = painterResource(id = R.drawable.stadium_green),
                contentDescription = "stadium Image",
            )

            Row(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .padding(18.dp)
                        .width(218.dp)
                        .height(58.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(

                        text = player.information,
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold
                        ),
                    )
                    Text(
                        text = player.percentage.toString(),
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold
                        ),
                    )
                }
            }

        }
        Image(
            modifier = Modifier
                .padding(start = 230.dp, top = 10.dp)
                .width(94.41.dp)
                .height(154.dp),
            painter = player.painter,
            contentDescription = "player Image",
        )
    }
}