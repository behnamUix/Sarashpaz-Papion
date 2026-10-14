package com.behnamuix.sarashpaz.features.home.presentation.screen

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.behnamuix.sarashpaz.features.home.presentation.contract.HomeAction
import com.behnamuix.sarashpaz.features.home.presentation.viewmodel.HomeViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun HomeSc(viewModel: HomeViewModel = koinViewModel()) {
    val homeState = viewModel.homeState.collectAsStateWithLifecycle()
    LaunchedEffect(Unit) {
        viewModel.onHomeAction(HomeAction.SlideShow)
    }
    homeState.value.slideShowList.forEach {

        Text(it.title, color = Color.Black, style = MaterialTheme.typography.headlineMedium)

    }

}