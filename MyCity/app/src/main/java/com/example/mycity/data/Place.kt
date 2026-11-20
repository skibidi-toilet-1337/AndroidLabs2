package com.example.mycity.data

import androidx.annotation.DrawableRes

/*доменная модель для рекомендуемого места.
модель намеренно не зависит от классов UI. вся информация,
о месте хранится в слое данных, а UI только отображает её.
*/

data class Place(
    val id: String,
    val categoryId: String,
    val name: String,
    @DrawableRes val imageRes: Int,
    val shortDescription: String,
    val description: String,
    val address: String,
    val workingHours: String,
    val rating: Float,
    val tags: List<String>
)
