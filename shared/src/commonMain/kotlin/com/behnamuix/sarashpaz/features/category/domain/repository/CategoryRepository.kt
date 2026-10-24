package com.behnamuix.sarashpaz.features.category.domain.repository

import com.behnamuix.sarashpaz.features.category.domain.model.CategoryRecipe

interface CategoryRepository {
    fun getCategory():List<CategoryRecipe>
}