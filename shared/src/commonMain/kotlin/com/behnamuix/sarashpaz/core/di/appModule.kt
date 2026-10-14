package com.behnamuix.sarashpaz.core.di

import com.behnamuix.sarashpaz.features.home.data.datasource.local.HomeRepositoryDataImpl
import com.behnamuix.sarashpaz.features.home.data.datasource.local.LocalHomeRepositoryData
import com.behnamuix.sarashpaz.features.home.data.repository.HomeRepositoryImpl
import com.behnamuix.sarashpaz.features.home.domain.repository.HomeRepository
import com.behnamuix.sarashpaz.features.home.domain.usecase.GetHomeUseCase
import com.behnamuix.sarashpaz.features.home.presentation.viewmodel.HomeViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
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


}