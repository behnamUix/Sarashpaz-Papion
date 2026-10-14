package com.behnamuix.sarashpaz.features.home.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.behnamuix.sarashpaz.features.home.domain.usecase.GetHomeUseCase
import com.behnamuix.sarashpaz.features.home.presentation.contract.HomeAction
import com.behnamuix.sarashpaz.features.home.presentation.contract.HomeState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch


class HomeViewModel(private val useCase: GetHomeUseCase) : ViewModel() {

    private val _homeState = MutableStateFlow(HomeState())
    val homeState: StateFlow<HomeState> = _homeState.asStateFlow()

    fun onHomeAction(action: HomeAction) {
        when (action) {
            is HomeAction.SlideShow -> slideShow()
            is HomeAction.NewRecipe -> newRecipe()
            is HomeAction.PopularRecipe -> popularRecipe()
            is HomeAction.ArticleRecipe -> articleRecipe()
            is HomeAction.InterviewRecipe -> interViewCustomer()
        }
    }

    private fun interViewCustomer() {
        viewModelScope.launch {
            _homeState.update {
                it.copy(
                    interviewCustomerList = useCase.getInterviewCustomer()
                )
            }
        }
    }

    private fun articleRecipe() {
        viewModelScope.launch {
            _homeState.update {
                it.copy(
                    articleList = useCase.getArticle()
                )
            }
        }
    }

    private fun popularRecipe() {
        viewModelScope.launch {
            _homeState.update {
                it.copy(
                    popularRecipeList = useCase.getPopularRecipe()
                )
            }
        }
    }

    private fun newRecipe() {
        viewModelScope.launch {
            _homeState.update {
                it.copy(
                    newRecipeList = useCase.getNewRecipe()
                )
            }
        }
    }

    private fun slideShow() {
        viewModelScope.launch {
            _homeState.update {
                it.copy(
                    slideShowList = useCase.getSlideShowRecipe()
                )
            }
        }
    }
}