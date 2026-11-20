package com.example.mycity.data

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

//проверка корректности локального источника данных

class LocalMyCityRepositoryTest {

    private val repository = LocalMyCityRepository()

    @Test
    fun `repository contains five categories with recommendations`() {
        val categories = repository.getCategories()

        assertEquals(5, categories.size)
        assertTrue(categories.all { it.places.size >= 5 })
    }

    @Test
    fun `place identifiers are unique`() {
        val places = repository.getCategories().flatMap { it.places }
        val ids = places.map { it.id }

        assertEquals(ids.size, ids.distinct().size)
    }

    @Test
    fun `every place belongs to its category`() {
        val categories = repository.getCategories()

        categories.forEach { category ->
            assertTrue(category.places.all { it.categoryId == category.id })
        }
    }
}
