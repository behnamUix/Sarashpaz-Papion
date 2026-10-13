package com.behnamuix.sarashpaz.features.home.domain.usecase

import com.behnamuix.sarashpaz.features.home.domain.model.article.Article
import com.behnamuix.sarashpaz.features.home.domain.model.interviewCustomer.InterviewCustomer
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.Recipe
import com.behnamuix.sarashpaz.features.home.domain.repository.HomeRepository

class GetHomeUseCase(private val getHomeRepository: HomeRepository) {
    suspend fun getSlideShowRecipe(): List<Recipe> {
        return getHomeRepository.getSlideShowRecipe()
    }

    suspend fun getNewRecipe(): List<Recipe> {
        return getHomeRepository.getNewRecipe()
    }

    suspend fun getPopularRecipe(): List<Recipe> {
        return getHomeRepository.getPopularRecipe()
    }

    suspend fun getArticle(): List<Article> {
        return getHomeRepository.getArticle()
    }

    suspend fun getInterviewCustomer(): List<InterviewCustomer> {
        return getHomeRepository.getInterviewCustomer()
    }
}