package com.behnamuix.sarashpaz.features.category.data.datasource.local

import com.behnamuix.sarashpaz.features.category.data.datasource.fakeData.FakeCategoryData
import com.behnamuix.sarashpaz.features.category.domain.model.CategoryRecipe

interface LocalCategoryRepositoryData {
    fun geCategory():List<CategoryRecipe>
}