package com.behnamuix.sarashpaz.features.category.data.repository

import com.behnamuix.sarashpaz.features.category.data.datasource.local.LocalCategoryRepositoryDataImpl
import com.behnamuix.sarashpaz.features.category.domain.model.CategoryRecipe
import com.behnamuix.sarashpaz.features.category.domain.repository.CategoryRepository

class CategoryRepositoryImpl(private val datasource: LocalCategoryRepositoryDataImpl) :
    CategoryRepository {
    override fun getCategory(): List<CategoryRecipe> {
        return datasource.geCategory()
    }

}