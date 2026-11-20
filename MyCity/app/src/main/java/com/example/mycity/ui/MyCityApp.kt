package com.example.mycity.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.mycity.ui.screens.CategoryScreen
import com.example.mycity.ui.screens.HomeScreen
import com.example.mycity.ui.screens.PlaceDetailScreen

//навигация в приложении

private object Destinations {
    const val HOME = "home"
    const val CATEGORY = "category/{categoryId}"
    const val PLACE = "place/{placeId}"

    fun category(categoryId: String) = "category/$categoryId"
    fun place(placeId: String) = "place/$placeId"
}

@Composable
fun MyCityApp(
    windowWidthSizeClass: WindowWidthSizeClass,
    viewModel: MyCityViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    val navController = rememberNavController()
    val isTwoPane = windowWidthSizeClass == WindowWidthSizeClass.Expanded

    NavHost(
        navController = navController,
        startDestination = Destinations.HOME,
        modifier = Modifier.fillMaxSize()
    ) {
        composable(Destinations.HOME) {
            if (uiState.categories.isEmpty()) {
                Loading()
            } else {
                HomeScreen(
                    categories = uiState.categories,
                    totalPlaces = uiState.totalPlaces,
                    onCategoryClick = { category ->
                        viewModel.onCategorySelected(category.id)
                        navController.navigate(Destinations.category(category.id))
                    }
                )
            }
        }

        composable(
            route = Destinations.CATEGORY,
            arguments = listOf(navArgument("categoryId") { type = NavType.StringType })
        ) { backStackEntry ->
            val categoryId = backStackEntry.arguments?.getString("categoryId").orEmpty()
            val category = uiState.categoryById(categoryId)
            val selectedPlace = if (uiState.selectedCategoryId == categoryId) {
                uiState.selectedPlace
            } else {
                null
            }

            CategoryScreen(
                category = category,
                selectedPlace = selectedPlace,
                isTwoPane = isTwoPane,
                onBack = {
                    viewModel.onCategoryClosed()
                    navController.popBackStack()
                },
                onPlaceClick = { place ->
                    if (isTwoPane) {
                        viewModel.onPlaceSelected(place.id)
                    } else {
                        navController.navigate(Destinations.place(place.id))
                    }
                },
                onPlaceClosed = viewModel::onPlaceClosed
            )
        }

        composable(
            route = Destinations.PLACE,
            arguments = listOf(navArgument("placeId") { type = NavType.StringType })
        ) { backStackEntry ->
            val placeId = backStackEntry.arguments?.getString("placeId").orEmpty()
            val place = uiState.placeById(placeId)
            val categoryTitle = place
                ?.let { uiState.categoryById(it.categoryId)?.title }
                .orEmpty()

            PlaceDetailScreen(
                place = place,
                categoryTitle = categoryTitle,
                onBack = { navController.popBackStack() }
            )
        }
    }
}

@Composable
private fun Loading() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(color = MaterialTheme.colorScheme.primary)
    }
}
