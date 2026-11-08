package com.behnamuix.sarashpaz.features.category.presentation.screen.android

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.behnamuix.sarashpaz.features.category.presentation.contract.CategoryAction
import com.behnamuix.sarashpaz.features.category.presentation.viewmodel.CategoryViewModel
import org.jetbrains.compose.resources.painterResource
import org.koin.compose.koinInject

@Composable
fun AndroidDetailSc(categoryViewModel: CategoryViewModel = koinInject(),id:Int ,title: String) {
    val categoryState by categoryViewModel.categoryState.collectAsState()
    LaunchedEffect(Unit) {
        categoryViewModel.onCategoryAction(CategoryAction.RecipeDetail(id, title))

    }

}