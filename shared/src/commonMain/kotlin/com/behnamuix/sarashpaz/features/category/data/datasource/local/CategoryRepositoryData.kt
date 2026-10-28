package com.behnamuix.sarashpaz.features.category.data.datasource.local

import com.behnamuix.sarashpaz.features.category.data.datasource.fakeData.FakeCategoryData
import com.behnamuix.sarashpaz.features.category.domain.model.CategoryRecipe
import com.behnamuix.sarashpaz.features.category.domain.model.RecipeModel

interface LocalCategoryRepositoryData {
    fun geCategory():List<CategoryRecipe>


}