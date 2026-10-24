package com.behnamuix.sarashpaz.categoryTest

import com.behnamuix.sarashpaz.core.di.appModule
import com.behnamuix.sarashpaz.features.category.presentation.contract.CategoryAction
import com.behnamuix.sarashpaz.features.category.presentation.viewmodel.CategoryViewModel
import com.behnamuix.sarashpaz.features.home.presentation.contract.HomeAction
import com.behnamuix.sarashpaz.features.home.presentation.viewmodel.HomeViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertTrue

class CategoryViewModelUnitTest {
    private val testDispatcher = StandardTestDispatcher()

    private lateinit var viewModel: CategoryViewModel

    @BeforeTest
    fun setup() {
        stopKoin()
        Dispatchers.setMain(testDispatcher)

        val koin = startKoin {
            modules(appModule)
        }.koin

        viewModel = koin.get()
    }

    @AfterTest
    fun tearDown() {
        stopKoin()
        Dispatchers.resetMain()
    }

    @Test
    fun categoryListTest() = runTest(testDispatcher) {
        viewModel.onCategoryAction(CategoryAction.Category)
        advanceUntilIdle()

        val result = viewModel.categoryState.value.categoryList
        assertTrue(result.isNotEmpty(), "Slide show list should not be empty")
    }



}