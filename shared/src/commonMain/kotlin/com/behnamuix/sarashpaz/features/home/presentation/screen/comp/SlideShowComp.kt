package com.behnamuix.sarashpaz.features.home.presentation.screen.comp

import androidx.compose.animation.core.tween
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.milliseconds

@Composable
fun <T> SlideShowRecipe(items: List<T>, modifer: Modifier, content: @Composable (T) -> Unit) {
    if (items.isEmpty()) return
    val pagerState = rememberPagerState(
        pageCount = { items.size }
    )
    LaunchedEffect(pagerState, items.size) {
        while (true) {
            delay(4000.milliseconds)
            val nextPage = (pagerState.currentPage + 1) % items.size
            pagerState.animateScrollToPage(nextPage, animationSpec = tween(1000))

        }

    }
    HorizontalPager(
       modifier = modifer,
        state=pagerState,

    ){
        content(items[it])
    }

}