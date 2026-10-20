package com.behnamuix.sarashpaz.features.home.data.datasource.local

import com.behnamuix.sarashpaz.features.home.domain.model.article.Article
import com.behnamuix.sarashpaz.features.home.domain.model.interviewCustomer.ChefCustomer
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.Recipe

interface LocalHomeRepositoryData {
    fun getSlideShowRecipe(): List<Recipe>
    fun getNewRecipe(): List<Recipe>
    fun getPopularRecipe(): List<Recipe>
    fun getArticle(): List<Article>

    fun getChefCustomer(): List<ChefCustomer>

}