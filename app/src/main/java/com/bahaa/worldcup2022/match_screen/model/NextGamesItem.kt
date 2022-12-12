package com.bahaa.worldcup2022.match_screen.model

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter

data class NextGamesItem(
    val firstTeamPainter: Painter,
    val secondTeamPainter: Painter,
    val firstTeamName: String,
    val secondTeamName: String,
    val firstTeamBackgroundColor: Color,
    val secondTeamBackgroundColor: Color,
    val firstTeamPossession: Int,
    val secondTeamPossession: Int,
    val date: String,
    val time: String,
    val ticketValue: String
)