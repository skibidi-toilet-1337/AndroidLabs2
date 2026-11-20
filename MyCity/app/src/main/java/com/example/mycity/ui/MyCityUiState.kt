package com.example.mycity.ui

import com.example.mycity.data.Category
import com.example.mycity.data.Place

/*
единый неизменяемый объект состояния, отображаемый всем приложением.
UI отправляет события в [MyCityViewModel], ViewModel создает новое состояние, а Compose просто отображает его.*/
data class MyCityUiState(
    val categories: List<Category> = emptyList(),
    val selectedCategoryId: String? = null,
    val selectedPlaceId: String? = null
) {
    val selectedCategory: Category?
        get() = categories.firstOrNull { it.id == selectedCategoryId }

    val selectedPlace: Place?
        get() = selectedCategory?.places?.firstOrNull { it.id == selectedPlaceId }

    val totalPlaces: Int
        get() = categories.sumOf { it.places.size }

    fun categoryById(id: String): Category? = categories.firstOrNull { it.id == id }

    fun placeById(id: String): Place? =
        categories.asSequence()
            .flatMap { it.places.asSequence() }
            .firstOrNull { it.id == id }
}
