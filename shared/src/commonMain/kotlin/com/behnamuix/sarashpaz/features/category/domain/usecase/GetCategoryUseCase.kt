package com.behnamuix.sarashpaz.features.category.domain.usecase

import com.behnamuix.sarashpaz.features.category.domain.model.CategoryRecipe
import com.behnamuix.sarashpaz.features.category.domain.model.RecipeModel
import com.behnamuix.sarashpaz.features.category.domain.repository.CategoryRepository

class GetCategoryUseCase(val categoryRepo: CategoryRepository) {
    fun getCategory():List<CategoryRecipe>{
        return categoryRepo.getCategory()
    }
    fun getCategoryWithId(id:Int):CategoryRecipe{
        return categoryRepo.getRecipeWithId(id)
    }
}