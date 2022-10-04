package com.example.livescore.data.remote.dto.standings

data class Away(
    val draw: Int,
    val games_played: Int,
    val goals_against: Int,
    val goals_diff: Int,
    val goals_scored: Int,
    val lost: Int,
    val won: Int
)
