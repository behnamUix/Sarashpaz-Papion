package com.behnamuix.sarashpaz.categoryTest

import com.behnamuix.sarashpaz.core.di.appModule
import com.behnamuix.sarashpaz.features.category.domain.usecase.GetCategoryUseCase
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertTrue

class GetCategoryUseCaseUnitTest {
    private lateinit var categoryUseCase: GetCategoryUseCase
    @BeforeTest
    fun setup() {
        val koin = startKoin {
            modules(appModule)
        }.koin

        categoryUseCase = koin.get()
    }

    @AfterTest
    fun tearDown() {
        stopKoin()
    }
    @Test
    fun getCategoryTest(){
        val result = categoryUseCase.getCategory()

        assertTrue(result.isNotEmpty())
    }


}