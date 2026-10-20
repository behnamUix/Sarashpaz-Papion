package com.behnamuix.sarashpaz.features.home.domain.usecase

import com.behnamuix.sarashpaz.features.home.domain.model.article.Article
import com.behnamuix.sarashpaz.features.home.domain.model.interviewCustomer.ChefCustomer
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.Recipe
import com.behnamuix.sarashpaz.features.home.domain.repository.HomeRepository

class GetHomeUseCase(private val getHomeRepository: HomeRepository) {
    fun getSlideShowRecipe(): List<Recipe> {
        return getHomeRepository.getSlideShowRecipe()
//        return emptyList()
    }

    fun getNewRecipe(): List<Recipe> {
        return getHomeRepository.getNewRecipe()
//         return emptyList()
    }

    fun getPopularRecipe(): List<Recipe> {
        return getHomeRepository.getPopularRecipe()
//         return emptyList()
    }

    fun getArticle(): List<Article> {
        return getHomeRepository.getArticle()

    }

    fun getChefCustomer(): List<ChefCustomer> {
        return getHomeRepository.getChefCustomer()

    }
}