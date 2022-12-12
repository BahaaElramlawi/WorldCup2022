package com.bahaa.worldcup2022.match_screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.bahaa.worldcup2022.R
import com.bahaa.worldcup2022.match_screen.composable.*

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MatchScreen() {
    MatchContent()
}

@Composable
private fun MatchContent() {
    LazyColumn(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            TopImageSection()
            TimingSection(
                date = stringResource(R.string.date),
                time = stringResource(R.string.time),
                ticketValue = stringResource(R.string.ticket_count),
                textColor = Color.White
            )
            PlayersSection()
            HeaderNextGame()
            NextGamesItemInformation()
        }

    }
}



