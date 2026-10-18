package com.behnamuix.sarashpaz.core.design

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import com.behnamuix.papiyon.core.design.Black
import com.behnamuix.papiyon.core.design.Primary
import com.behnamuix.papiyon.core.design.Secondary
import com.behnamuix.papiyon.core.design.White

private val LightColors = lightColorScheme(
    primary = Primary,
    onPrimary = White,
    secondary = Secondary,
    onSecondary = Black,
    background = White,
    onBackground = Black,
    surface = White,
    onSurface = Black
)

@Composable
fun AppTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColors,
        typography = AppTypography(),
        content = content
    )
}
