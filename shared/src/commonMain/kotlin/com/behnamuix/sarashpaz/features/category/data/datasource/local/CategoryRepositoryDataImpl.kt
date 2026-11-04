package com.behnamuix.sarashpaz.features.category.data.datasource.local

import com.behnamuix.sarashpaz.features.category.data.datasource.fakeData.FakeCategoryData
import com.behnamuix.sarashpaz.features.category.domain.model.CategoryRecipe
import com.behnamuix.sarashpaz.features.category.domain.model.RecipeModel
import com.behnamuix.sarashpaz.features.category.domain.repository.CategoryRepository

class LocalCategoryRepositoryDataImpl: LocalCategoryRepositoryData {

    override fun geCategory(): List<CategoryRecipe> {
        return FakeCategoryData.categoryRecipe
    }

    override fun getRecipeDetail(
        id: Int,
        title: String
    ): RecipeModel? {
        return FakeCategoryData.allRecipe
            .find { it.id == id }
    }


}