package com.behnamuix.sarashpaz.features.category.domain.usecase

import com.behnamuix.sarashpaz.features.category.domain.model.RecipeModel
import com.behnamuix.sarashpaz.features.category.domain.repository.CategoryRepository

class GetCategoryUseCase(val categoryRepo: CategoryRepository) {
    fun getCategory():List<RecipeModel>{
        return categoryRepo.getCategory()
    }
}