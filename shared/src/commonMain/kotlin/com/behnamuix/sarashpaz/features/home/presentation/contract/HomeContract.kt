package com.behnamuix.sarashpaz.features.home.presentation.contract

import com.behnamuix.sarashpaz.features.home.domain.model.article.Article
import com.behnamuix.sarashpaz.features.home.domain.model.interviewCustomer.InterviewCustomer
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.Recipe

data class HomeState(
    val slideShowList: List<Recipe> = emptyList(),
    val newRecipeList: List<Recipe> = emptyList(),
    val popularRecipeList: List<Recipe> = emptyList(),
    val articleList: List<Article> = emptyList(),
    val interviewCustomerList: List<InterviewCustomer> = emptyList()
)

sealed interface HomeAction {
    data object SlideShow : HomeAction
    data object NewRecipe : HomeAction
    data object PopularRecipe : HomeAction
    data object ArticleRecipe : HomeAction
    data object InterviewRecipe : HomeAction
}