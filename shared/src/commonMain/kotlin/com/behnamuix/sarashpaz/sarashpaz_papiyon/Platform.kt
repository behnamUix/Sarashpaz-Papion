package com.behnamuix.sarashpaz

import androidx.compose.runtime.Composable

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
@Composable
expect fun isAndroid(): Boolean