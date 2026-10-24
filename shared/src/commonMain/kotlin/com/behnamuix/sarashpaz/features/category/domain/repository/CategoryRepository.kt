package com.behnamuix.sarashpaz.features.category.domain.repository

import com.behnamuix.sarashpaz.features.category.domain.model.RecipeModel

interface CategoryRepository {
    fun getCategory():List<RecipeModel>
}