
package com.behnamuix.sarashpaz.homeTest

import com.behnamuix.sarashpaz.core.di.appModule
import com.behnamuix.sarashpaz.features.home.presentation.contract.HomeAction
import com.behnamuix.sarashpaz.features.home.presentation.viewmodel.HomeViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
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

@OptIn(ExperimentalCoroutinesApi::class)
class ViewModelUnitTest {

    private val testDispatcher = StandardTestDispatcher()

    private lateinit var viewModel: HomeViewModel

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
    fun slideShowTest() = runTest(testDispatcher) {
        viewModel.onHomeAction(HomeAction.SlideShow)
        advanceUntilIdle()

        val result = viewModel.homeState.value.slideShowList
        assertTrue(result.isNotEmpty(), "Slide show list should not be empty")
    }

    @Test
    fun newRecipeTest() = runTest(testDispatcher) {
        viewModel.onHomeAction(HomeAction.NewRecipe)
        advanceUntilIdle()

        val result = viewModel.homeState.value.newRecipeList
        assertTrue(result.isNotEmpty(), "New recipe list should not be empty")
    }

    @Test
    fun popularRecipeTest() = runTest(testDispatcher) {
        viewModel.onHomeAction(HomeAction.PopularRecipe)
        advanceUntilIdle()

        val result = viewModel.homeState.value.popularRecipeList
        assertTrue(result.isNotEmpty(), "Popular recipe list should not be empty")
    }

    @Test
    fun articleRecipeTest() = runTest(testDispatcher) {
        viewModel.onHomeAction(HomeAction.ArticleRecipe)
        advanceUntilIdle()

        val result = viewModel.homeState.value.articleList
        assertTrue(result.isNotEmpty(), "Article list should not be empty")
    }

    @Test
    fun interviewCustomerTest() = runTest(testDispatcher) {
        viewModel.onHomeAction(HomeAction.InterviewRecipe)
        advanceUntilIdle()

        val result = viewModel.homeState.value.chefCustomerList
        assertTrue(
            result.isNotEmpty(),
            "Interview customer list should not be empty"
        )
    }
}
