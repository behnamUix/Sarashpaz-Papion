package com.behnamuix.sarashpaz.features.home.data.repository

import com.behnamuix.sarashpaz.features.home.data.datasource.local.HomeRepositoryDataImpl
import com.behnamuix.sarashpaz.features.home.domain.model.article.Article
import com.behnamuix.sarashpaz.features.home.domain.model.interviewCustomer.InterviewCustomer
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.Recipe
import com.behnamuix.sarashpaz.features.home.domain.repository.HomeRepository

class HomeRepositoryImpl(private val datasource: HomeRepositoryDataImpl) : HomeRepository {
    override suspend fun getSlideShowRecipe(): List<Recipe> {
        return datasource.getSlideShowRecipe()
    }

    override suspend fun getNewRecipe(): List<Recipe> {
        return datasource.getNewRecipe()
    }

    override suspend fun getPopularRecipe(): List<Recipe> {
        return datasource.getPopularRecipe()
    }

    override suspend fun getArticle(): List<Article> {
        TODO("Not yet implemented")
    }

    override suspend fun getInterviewCustomer(): List<InterviewCustomer> {
        TODO("Not yet implemented")
    }
}