package com.behnamuix.sarashpaz.features.home.domain.usecase

import com.behnamuix.sarashpaz.features.home.domain.model.article.Article
import com.behnamuix.sarashpaz.features.home.domain.model.interviewCustomer.InterviewCustomer
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.Recipe
import com.behnamuix.sarashpaz.features.home.domain.repository.HomeRepository

class GetHomeUseCase(private val getHomeRepository: HomeRepository) {
    fun getSlideShowRecipe(): List<Recipe> {
        return getHomeRepository.getSlideShowRecipe()
    }

     fun getNewRecipe(): List<Recipe> {
        return getHomeRepository.getNewRecipe()
    }

     fun getPopularRecipe(): List<Recipe> {
        return getHomeRepository.getPopularRecipe()
    }

     fun getArticle(): List<Article> {
        return getHomeRepository.getArticle()
    }

     fun getInterviewCustomer(): List<InterviewCustomer> {
        return getHomeRepository.getInterviewCustomer()
    }
}