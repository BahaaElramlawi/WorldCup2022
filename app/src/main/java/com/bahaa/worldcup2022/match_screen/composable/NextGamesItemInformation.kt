package com.bahaa.worldcup2022.match_screen.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import com.bahaa.worldcup2022.match_screen.model.NextGamesItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.bahaa.worldcup2022.R
import com.bahaa.worldcup2022.ui.theme.Blue50
import com.bahaa.worldcup2022.ui.theme.Red50
import com.bahaa.worldcup2022.ui.theme.Yellow50

@Composable
fun NextGamesItemInformation() {
    LazyRow(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)
    ) {
        item {
            NextGamesItem(
                nextGamesItem = NextGamesItem(
                    firstTeamPainter = painterResource(id = R.drawable.japan_flag),
                    secondTeamPainter = painterResource(id = R.drawable.costa_rica_flag),
                    firstTeamName = stringResource(R.string.portugal_text),
                    secondTeamName = stringResource(R.string.ghana_text),
                    firstTeamBackgroundColor = Red50,
                    secondTeamBackgroundColor = Blue50,
                    firstTeamPossession = 0,
                    secondTeamPossession = 0,
                    date = "27 Nov",
                    time = "12:00",
                    ticketValue = "600",
                )
            )
            Spacer(modifier = Modifier.width(10.dp))

            NextGamesItem(
                nextGamesItem = NextGamesItem(
                    firstTeamPainter = painterResource(id = R.drawable.belgium_flag),
                    secondTeamPainter = painterResource(id = R.drawable.morocco_flag),
                    firstTeamName = stringResource(R.string.portugal_text),
                    secondTeamName = stringResource(R.string.ghana_text),
                    firstTeamBackgroundColor = Yellow50,
                    secondTeamBackgroundColor = Red50,
                    firstTeamPossession = 0,
                    secondTeamPossession = 0,
                    date = "27 Nov",
                    time = "15:00",
                    ticketValue = "500",
                )
            )
            Spacer(modifier = Modifier.width(10.dp))

            NextGamesItem(
                nextGamesItem = NextGamesItem(
                    firstTeamPainter = painterResource(id = R.drawable.germany_flag),
                    secondTeamPainter = painterResource(id = R.drawable.spain_flag),
                    firstTeamName = stringResource(R.string.portugal_text),
                    secondTeamName = stringResource(R.string.ghana_text),
                    firstTeamBackgroundColor = Red50,
                    secondTeamBackgroundColor = Yellow50,
                    firstTeamPossession = 0,
                    secondTeamPossession = 0,
                    date = "27 Nov",
                    time = "21:00",
                    ticketValue = "450",
                )
            )


        }
    }

}