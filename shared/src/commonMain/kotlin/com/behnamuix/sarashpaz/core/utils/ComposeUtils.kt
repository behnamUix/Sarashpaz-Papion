package com.behnamuix.sarashpaz.core.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun CheckUiVersion(max: Dp,
                   webContent: @Composable () -> Unit,
                   androidContent : @Composable () -> Unit){
    if (max > 600.dp) {
        webContent()
    }else{
        androidContent()
    }

}