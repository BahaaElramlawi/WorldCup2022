package com.bahaa.worldcup2022.match_screen.composable

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.bahaa.worldcup2022.R

@Composable
fun PlayerListInformation() {
    LazyColumn(
    ) {
        item {
            PlayerItem(
                playerImage = painterResource(id = R.drawable.ronaldo),
                "Cristiano Ronaldo",
                "Centre-Forward"
            )
            PlayerItem(
                playerImage = painterResource(id = R.drawable.bernardo_silva),
                "Bernardo Silva",
                "Attacking Midfield"
            )
            PlayerItem(
                playerImage = painterResource(id = R.drawable.joao_mario),
                "João Mário",
                "Attacking Midfield"
            )
            PlayerItem(
                playerImage = painterResource(id = R.drawable.ruben_neves),
                "Ricardo Horta",
                "Left Winger"
            )
            PlayerItem(
                playerImage = painterResource(id = R.drawable.diogo_costa),
                "Diogo Costa",
                "Goalkeeper"
            )
//            PlayerItem(
//                playerImage = painterResource(id = R.drawable.bruno_fernandes),
//                "Bruno Fernandes",
//                "Attacking Midfield"
//            )
//            PlayerItem(
//                playerImage = painterResource(id = R.drawable.nuno_mendes),
//                "Nuno Mendes",
//                "Left-Back"
//            )
//            PlayerItem(
//                playerImage = painterResource(id = R.drawable.pepe),
//                "Pepe",
//                "Centre-Back"
//            )
//            PlayerItem(
//                playerImage = painterResource(id = R.drawable.ruben_neves),
//                "Rúben Neves",
//                "Defensive Midfield"
//            )
//            PlayerItem(
//                playerImage = painterResource(id = R.drawable.joao_mario),
//                "João Cancelo",
//                "Left-Back"
//            )
//            PlayerItem(
//                playerImage = painterResource(id = R.drawable.diogo_costa),
//                "Diogo Costa",
//                "Goalkeeper"
//            )
        }
    }
}