package com.bahaa.worldcup2022.match_screen.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.bahaa.worldcup2022.match_screen.model.NextGamesItem

@Composable
fun NextGamesItem(
    nextGamesItem: NextGamesItem
) {
    Card(
        Modifier
            .width(224.dp)
            .height(224.dp)
            .fillMaxSize()
            .clip(RoundedCornerShape(20.dp))
            .background(color = Color.White)
            .border(border = BorderStroke(1.dp, Color.Green), shape = RoundedCornerShape(20.dp)),
        elevation = 0.dp,
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,

                ) {
                NationalTeamCard(
                    nationalTeamImage = nextGamesItem.firstTeamPainter,
                    nationalTeamName = nextGamesItem.firstTeamName,
                    possession = nextGamesItem.firstTeamPossession,
                    size = 55.dp,
                    cardColor = nextGamesItem.firstTeamBackgroundColor,
                    textColor = Color.Black
                )

                VSBox(size = 20.dp)
                NationalTeamCard(
                    nationalTeamImage = nextGamesItem.secondTeamPainter,
                    nationalTeamName = nextGamesItem.secondTeamName,
                    possession = nextGamesItem.secondTeamPossession,
                    size = 55.dp,
                    cardColor = nextGamesItem.secondTeamBackgroundColor,
                    textColor = Color.Black
                )
            }
            Divider()

            TimingSection(
                date = nextGamesItem.date,
                time = nextGamesItem.time,
                ticketValue = nextGamesItem.ticketValue,
                textColor = Color.Black,
                modifier = Modifier.padding(16.dp)
            )

        }

    }
}