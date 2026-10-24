package com.behnamuix.sarashpaz

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.behnamuix.sarashpaz.core.di.initKoin
import com.behnamuix.sarashpaz.sarashpaz_papiyon.App

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    initKoin()
    ComposeViewport {
        App()
    }
}
