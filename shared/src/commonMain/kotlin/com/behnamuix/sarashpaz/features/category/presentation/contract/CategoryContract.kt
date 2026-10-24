package com.behnamuix.sarashpaz.features.category.presentation.contract

import com.behnamuix.sarashpaz.features.category.domain.model.CategoryRecipe

data class CategoryState(
    val categoryList: List<CategoryRecipe> = emptyList()
)
sealed interface CategoryAction{
    data object Category: CategoryAction
}