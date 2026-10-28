package com.behnamuix.sarashpaz.features.category.data.repository

import com.behnamuix.sarashpaz.features.category.data.datasource.fakeData.FakeCategoryData
import com.behnamuix.sarashpaz.features.category.data.datasource.local.LocalCategoryRepositoryDataImpl
import com.behnamuix.sarashpaz.features.category.domain.model.CategoryRecipe
import com.behnamuix.sarashpaz.features.category.domain.model.RecipeModel
import com.behnamuix.sarashpaz.features.category.domain.repository.CategoryRepository

class CategoryRepositoryImpl(private val datasource: LocalCategoryRepositoryDataImpl) :
    CategoryRepository {
    override fun getCategory(): List<CategoryRecipe> {
        return datasource.geCategory()
    }

    override fun getRecipeWithId(id: Int): CategoryRecipe {
        return FakeCategoryData.categoryRecipe
            .find { it.id == id } ?: throw NoSuchElementException("Recipe not found: $id")
    }

}