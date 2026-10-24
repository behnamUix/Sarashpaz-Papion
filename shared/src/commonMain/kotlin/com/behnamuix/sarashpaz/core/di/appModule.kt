package com.behnamuix.sarashpaz.core.di

import com.behnamuix.sarashpaz.features.category.data.datasource.local.LocalCategoryRepositoryData
import com.behnamuix.sarashpaz.features.category.data.datasource.local.LocalCategoryRepositoryDataImpl
import com.behnamuix.sarashpaz.features.category.data.repository.CategoryRepositoryImpl
import com.behnamuix.sarashpaz.features.category.domain.repository.CategoryRepository
import com.behnamuix.sarashpaz.features.category.domain.usecase.GetCategoryUseCase
import com.behnamuix.sarashpaz.features.category.presentation.viewmodel.CategoryViewModel
import com.behnamuix.sarashpaz.features.home.data.datasource.local.HomeRepositoryDataImpl
import com.behnamuix.sarashpaz.features.home.data.datasource.local.LocalHomeRepositoryData
import com.behnamuix.sarashpaz.features.home.data.repository.HomeRepositoryImpl
import com.behnamuix.sarashpaz.features.home.domain.repository.HomeRepository
import com.behnamuix.sarashpaz.features.home.domain.usecase.GetHomeUseCase
import com.behnamuix.sarashpaz.features.home.presentation.viewmodel.HomeViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    //Home

    single {
        HomeRepositoryDataImpl()
    }

    single<LocalHomeRepositoryData> {
        get<HomeRepositoryDataImpl>()
    }
    single<HomeRepository> {
        HomeRepositoryImpl(get())
    }

    factory {
        GetHomeUseCase(get())
    }
    viewModel {
        HomeViewModel(get())
    }



    // Category


    single<LocalCategoryRepositoryDataImpl> {
        LocalCategoryRepositoryDataImpl()
    }


    single<CategoryRepository> {
        CategoryRepositoryImpl(get<LocalCategoryRepositoryDataImpl>())
    }


    factory {
        GetCategoryUseCase(get<CategoryRepository>())
    }
    viewModel {
        CategoryViewModel(get())
    }


}