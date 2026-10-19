package com.behnamuix.sarashpaz.homeTest

import com.behnamuix.sarashpaz.core.di.appModule
import com.behnamuix.sarashpaz.features.home.domain.usecase.GetHomeUseCase
import org.koin.core.context.startKoin
import kotlin.test.Test
import org.koin.core.context.stopKoin
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.assertTrue

class GetHomeUseCaseUnitTest {

    private lateinit var homeUseCase: GetHomeUseCase

    @BeforeTest
    fun setup() {
        val koin = startKoin {
            modules(appModule)
        }.koin

        homeUseCase = koin.get()
    }

    @AfterTest
    fun tearDown() {
        stopKoin()
    }

    @Test
    fun getSlideShowRecipeTest() {
        val result = homeUseCase.getSlideShowRecipe()

        assertTrue(result.isNotEmpty())
    }

    @Test
    fun getNewRecipeTest() {
        val result = homeUseCase.getNewRecipe()

        assertTrue(result.isNotEmpty())
    }

    @Test
    fun getPopularRecipeTest() {
        val result = homeUseCase.getPopularRecipe()

        assertTrue(result.isNotEmpty())
    }
    @Test
    fun getArticleTest() {
        val result = homeUseCase.getArticle()

        assertTrue(result.isNotEmpty())
    }
}
