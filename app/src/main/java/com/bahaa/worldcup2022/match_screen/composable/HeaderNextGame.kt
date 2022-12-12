package com.bahaa.worldcup2022.match_screen.composable

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bahaa.worldcup2022.ui.theme.White

@Composable
fun HeaderNextGame(
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)

    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text(
                text = "Next games",
                style = MaterialTheme.typography.overline,
                color = White,
                modifier = Modifier.weight(8f)
            )
            Text(
                text = "See all", style = MaterialTheme.typography.overline,
                color = White,
            )

        }
    }
}