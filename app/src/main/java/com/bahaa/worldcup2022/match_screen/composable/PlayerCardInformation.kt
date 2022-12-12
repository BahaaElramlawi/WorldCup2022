package com.bahaa.worldcup2022.match_screen.composable

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.bahaa.worldcup2022.R
import com.bahaa.worldcup2022.match_screen.model.Player

@Composable
fun PlayerCardInformation() {
    LazyRow() {
        item {
            PlayerCard(
                player = Player(
                    information = "Cristiano Ronaldo is a Portuguese professional footballer who plays as captains the Portugal national team.",
                    percentage = "80%",
                    painter = painterResource(id = R.drawable.cristiano)
                )
            )

            PlayerCard(
                player = Player(
                    information = "Leo Messi is an Argentine professional footballer who plays as a forward",
                    percentage = "80%",
                    painter = painterResource(id = R.drawable.messi)
                )
            )

            PlayerCard(
                player = Player(
                    information = "Neymar is a Brazilian professional footballer who plays as a forward for the Brazil national team.",
                    percentage = "60%",
                    painter = painterResource(id = R.drawable.kindpng)
                )
            )

            PlayerCard(
                player = Player(
                    information = "Harry Edward Kane is an English professional footballer  and captains the England national team.",
                    percentage = "50%",
                    painter = painterResource(id = R.drawable.harry_kane)
                )
            )

            PlayerCard(
                player = Player(
                    information = "Robert Lewandowski is a Polish professional footballer  captains the Poland national team.",
                    percentage = "30%",
                    painter = painterResource(id = R.drawable.lewandowski)
                )
            )
        }
    }
}