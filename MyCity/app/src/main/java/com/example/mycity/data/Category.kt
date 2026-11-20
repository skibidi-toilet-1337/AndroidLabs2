package com.example.mycity.data

import androidx.annotation.DrawableRes

//категория рекомендаций на главном экране
data class Category(
    val id: String,
    val title: String,
    val subtitle: String,
    val description: String,
    @DrawableRes val imageRes: Int,
    val places: List<Place>
)
