package com.behnamuix.sarashpaz.features.category.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.behnamuix.sarashpaz.features.category.domain.usecase.GetCategoryUseCase
import com.behnamuix.sarashpaz.features.category.presentation.contract.CategoryAction
import com.behnamuix.sarashpaz.features.category.presentation.contract.CategoryState
import com.behnamuix.sarashpaz.features.home.presentation.contract.HomeState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class CategoryViewModel(private val categoryUseCase: GetCategoryUseCase) : ViewModel() {
    private val _categoryState = MutableStateFlow(CategoryState())
    val categoryState: StateFlow<CategoryState> = _categoryState.asStateFlow()

    fun onCategoryAction(action: CategoryAction) {
        when (action) {
            is CategoryAction.Category -> getCategory()
            is CategoryAction.RecipeList->getRecipeList(action.id)
        }
    }

    private fun getRecipeList(id:Int) {
        viewModelScope.launch {
            _categoryState.update {
                it.copy(
                    categoryRecipe = categoryUseCase.getCategoryWithId(id)
                )

            }
        }
    }

    private fun getCategory() {
        viewModelScope.launch {
            _categoryState.update {
                it.copy(
                    categoryList = categoryUseCase.getCategory()
                )

            }
        }
    }
}