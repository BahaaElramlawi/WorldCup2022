package com.bahaa.worldcup2022.match_screen.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bahaa.worldcup2022.R

@Composable
fun TimingSection(
    date: String,
    time: String,
    ticketValue: String,
    textColor: Color,
    modifier: Modifier=Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly

    ) {
        Box() {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = R.drawable.calendar),
                    contentDescription = "calendar icon",
                )
                Spacer(modifier = Modifier.width(5.dp))


                Text(
                    text = date,
                    style = TextStyle(fontSize = 11.sp, color = textColor)
                )


            }
        }
        Box() {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = R.drawable.time),
                    contentDescription = "time icon",
                )
                Spacer(modifier = Modifier.width(5.dp))


                Text(
                    text = time,
                    style = TextStyle(fontSize = 11.sp, color = textColor)
                )


            }
        }

        Box() {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ticket),
                    contentDescription = "ticket icon",
                )
                Spacer(modifier = Modifier.width(5.dp))


                Text(
                    text = ticketValue,
                    style = TextStyle(fontSize = 11.sp, color = textColor)
                )
            }
        }
    }

}

