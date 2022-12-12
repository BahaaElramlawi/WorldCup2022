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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bahaa.worldcup2022.R
import com.bahaa.worldcup2022.ui.theme.White

@Composable
fun TopImageSection(
) {
    Box(
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.stadium),
            contentDescription = "stadium Image",
            modifier = Modifier
                .width(375.dp)
                .height(277.dp)
        )


        Column() {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,

                ) {
                NationalTeamCard(
                    painterResource(id = R.drawable.portugal),
                    stringResource(R.string.portugal_text),
                    85,
                    size = 64.82.dp,
                    cardColor = White,
                    textColor = Color.White
                )
                VSBox(size = 27.57.dp)
                NationalTeamCard(
                    painterResource(id = R.drawable.ghana),
                    stringResource(R.string.ghana_text),
                    15,
                    size = 64.82.dp,
                    cardColor = White,
                    textColor = Color.White
                )
            }

            Text(
                text = stringResource(R.string.group_ranking),
                style = TextStyle(
                    color = Color.White,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )


        }

    }
}

@Composable
fun VSBox(
    size: Dp,
) {
    Box(
        modifier = Modifier
            .size(size)
            .clip(RoundedCornerShape(10.dp))
            .background(color = Color.White),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = stringResource(R.string.vs_text),
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            ),

            )
    }
}

