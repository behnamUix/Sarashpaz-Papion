package com.behnamuix.sarashpaz.sarashpaz_papiyon

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.behnamuix.papiyon.core.design.AppTheme
import com.behnamuix.sarashpaz.features.home.presentation.screen.HomeSc

@Composable

fun App() {
    AppTheme {
        Scaffold {
            Box(Modifier.padding(it)){
                HomeSc()
            }

        }

    }
}