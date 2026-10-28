package com.behnamuix.sarashpaz.features.category.domain.repository

import com.behnamuix.sarashpaz.features.category.domain.model.CategoryRecipe
import com.behnamuix.sarashpaz.features.category.domain.model.RecipeModel

interface CategoryRepository {
    fun getCategory():List<CategoryRecipe>

    fun getRecipeWithId(id:Int): CategoryRecipe
}