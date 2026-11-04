package com.behnamuix.sarashpaz.features.category.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.behnamuix.sarashpaz.features.category.domain.model.RecipeModel
import com.behnamuix.sarashpaz.features.category.presentation.contract.CategoryAction
import com.behnamuix.sarashpaz.features.category.presentation.viewmodel.CategoryViewModel
import org.koin.compose.koinInject

@Composable
fun RecipeDetail(
    categoryViewModel: CategoryViewModel = koinInject(),
    id: Int,
    title: String
) {
    val categoryState by categoryViewModel.categoryState.collectAsState()
    LaunchedEffect(Unit) {
        categoryViewModel.onCategoryAction(CategoryAction.RecipeDetail(id, title))

    }
    Box(Modifier.fillMaxSize()) {
        Column(
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            categoryState.recipeDetail?.let {
                Text(it.title)
            }

        }
    }


}