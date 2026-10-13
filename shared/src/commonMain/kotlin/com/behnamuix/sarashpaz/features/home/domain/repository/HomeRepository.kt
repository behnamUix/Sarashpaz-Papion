package com.behnamuix.sarashpaz.features.home.domain.repository

import com.behnamuix.sarashpaz.features.home.domain.model.article.Article
import com.behnamuix.sarashpaz.features.home.domain.model.interviewCustomer.InterviewCustomer
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.Recipe

interface HomeRepository {
    fun getSlideShowRecipe():List<Recipe>
    fun getNewRecipe():List<Recipe>
    fun getPopularRecipe():List<Recipe>
    fun getArticle():List<Article>
    fun getInterviewCustomer():List<InterviewCustomer>
}