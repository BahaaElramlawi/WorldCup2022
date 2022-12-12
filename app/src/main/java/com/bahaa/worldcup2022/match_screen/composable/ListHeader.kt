package com.bahaa.worldcup2022.match_screen.composable

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.bahaa.worldcup2022.R

@Composable
fun ListHeader(
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)

    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text(
                text = stringResource(R.string.player),
                style = MaterialTheme.typography.overline,
                color = Color.DarkGray,
            )
            Text(
                text = stringResource(R.string.position),
                style = MaterialTheme.typography.overline,
                color = Color.DarkGray,
            )

        }
    }
}
