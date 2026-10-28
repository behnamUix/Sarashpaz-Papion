package com.behnamuix.sarashpaz.features.category.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import com.behnamuix.sarashpaz.features.category.presentation.contract.CategoryAction
import com.behnamuix.sarashpaz.features.category.presentation.screen.comp.FoodRecipeCard
import com.behnamuix.sarashpaz.features.category.presentation.viewmodel.CategoryViewModel
import org.koin.compose.koinInject

@Composable
fun RecipeScreen(categoryViewModel: CategoryViewModel = koinInject(), recipeId: Int) {
    val categoryState = categoryViewModel.categoryState.collectAsState()
    LaunchedEffect(Unit) {
        categoryViewModel.onCategoryAction(CategoryAction.RecipeList(recipeId))
    }
    Box(modifier = Modifier.fillMaxSize()) {
        LazyVerticalGrid(columns = GridCells.Fixed(3)) {
            items(categoryState.value.categoryRecipe?.recipeList ?: emptyList()) {
                FoodRecipeCard(recipe = it) {

                }

            }
        }
    }

}

