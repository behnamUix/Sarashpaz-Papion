package com.behnamuix.sarashpaz.features.home.data.datasource.local

import com.behnamuix.sarashpaz.features.home.data.datasource.fakeData.FakeRecipeData
import com.behnamuix.sarashpaz.features.home.domain.model.article.Article
import com.behnamuix.sarashpaz.features.home.domain.model.interviewCustomer.InterviewCustomer
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.Recipe

class HomeRepositoryDataImpl: LocalHomeRepositoryData {
    override fun getSlideShowRecipe(): List<Recipe> {
        return FakeRecipeData.slideShowRecipes
    }

    override fun getNewRecipe(): List<Recipe> {
        return FakeRecipeData.newestRecipes
    }

    override fun getPopularRecipe(): List<Recipe> {
        return FakeRecipeData.popularRecipes
    }

    override fun getArticle(): List<Article> {
        return FakeRecipeData.articles
    }

    override fun getInterviewCustomer(): List<InterviewCustomer> {
        TODO("InterviewCustomer")
    }
}