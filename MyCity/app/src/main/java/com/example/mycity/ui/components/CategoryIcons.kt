package com.example.mycity.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.LocalCafe
import androidx.compose.material.icons.outlined.Park
import androidx.compose.material.icons.outlined.Place
import androidx.compose.material.icons.outlined.Restaurant
import androidx.compose.material.icons.outlined.ShoppingBag
import androidx.compose.material.icons.outlined.Theaters
import androidx.compose.ui.graphics.vector.ImageVector

//cопоставляет id категории с иконкой
fun categoryIcon(categoryId: String): ImageVector = when (categoryId) {
    "restaurants" -> Icons.Outlined.Restaurant
    "parks" -> Icons.Outlined.Park
    "coffee" -> Icons.Outlined.LocalCafe
    "cinema" -> Icons.Outlined.Theaters
    "malls" -> Icons.Outlined.ShoppingBag
    else -> Icons.Outlined.Place
}
