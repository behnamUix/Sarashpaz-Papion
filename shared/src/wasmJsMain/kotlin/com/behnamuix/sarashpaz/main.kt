package com.behnamuix.sarashpaz

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import androidx.navigation.ExperimentalBrowserHistoryApi
import androidx.navigation.bindToBrowserNavigation
import com.behnamuix.sarashpaz.sarashpaz_papiyon.App
import kotlinx.browser.document

@OptIn(
    ExperimentalComposeUiApi::class,
    ExperimentalBrowserHistoryApi::class
)
fun main() {
    val body = document.body ?: return

    ComposeViewport(body) {
        App(
            onNavHostReady = { navController ->
                navController.bindToBrowserNavigation()
            }
        )
    }
}