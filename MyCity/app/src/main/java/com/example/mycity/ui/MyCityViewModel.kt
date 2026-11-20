package com.example.mycity.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mycity.data.LocalMyCityRepository
import com.example.mycity.data.MyCityRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

//cохраняет состояние экрана и обрабатывает каждое событие пользователя
//UI никогда не изменяет состояние напрямую. он вызывает функции on ниже и отслеживает [uiState] как единый поток (паттерн UDF)

class MyCityViewModel(
    private val repository: MyCityRepository = LocalMyCityRepository()
) : ViewModel() {

    private val _uiState = MutableStateFlow(MyCityUiState())
    val uiState: StateFlow<MyCityUiState> = _uiState.asStateFlow()

    init {
        loadCategories()
    }

    private fun loadCategories() {
        viewModelScope.launch {
            val categories = repository.getCategories()
            _uiState.update { state ->
                state.copy(categories = categories)
            }
        }
    }

    fun onCategorySelected(categoryId: String) {
        _uiState.update { state ->
            state.copy(
                selectedCategoryId = categoryId,
                selectedPlaceId = null
            )
        }
    }

    fun onCategoryClosed() {
        _uiState.update { state ->
            state.copy(selectedCategoryId = null, selectedPlaceId = null)
        }
    }

    fun onPlaceSelected(placeId: String) {
        _uiState.update { state -> state.copy(selectedPlaceId = placeId) }
    }

    fun onPlaceClosed() {
        _uiState.update { state -> state.copy(selectedPlaceId = null) }
    }
}
