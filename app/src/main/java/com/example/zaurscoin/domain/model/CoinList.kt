package com.example.zaurscoin.domain.model

data class CoinList(
    val id: String,
    val name: String,
    val symbol: String,
    val current_price: Double,
    val image: String,
    val price_change_percentage_24h: Double,
)
