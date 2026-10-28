package com.behnamuix.sarashpaz.features.category.presentation.contract

import com.behnamuix.sarashpaz.features.category.domain.model.CategoryRecipe
import com.behnamuix.sarashpaz.features.category.domain.model.RecipeModel

data class CategoryState(
    val categoryList: List<CategoryRecipe> = emptyList(),
    val categoryRecipe: CategoryRecipe? =null
)
sealed interface CategoryAction{
    data object Category: CategoryAction
    data class RecipeList(val id:Int):CategoryAction
}