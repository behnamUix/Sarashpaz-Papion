package com.behnamuix.sarashpaz.sarashpaz_papiyon

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.behnamuix.sarashpaz.core.design.AppTheme
import com.behnamuix.sarashpaz.features.home.presentation.screen.HomeSc
import org.jetbrains.compose.resources.painterResource
import sarashpaz.shared.generated.resources.Res
import sarashpaz.shared.generated.resources.notif_icon
import sarashpaz.shared.generated.resources.search_icon

@Composable

fun App() {
    AppTheme {
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(
                    modifier = Modifier.padding(8.dp),
                    title = {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Button(
                                contentPadding = PaddingValues(horizontal = 36.dp),
                                onClick = {

                                },
                                shape = RoundedCornerShape(12.dp),
                                colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.secondary)
                            ) {
                                Text("چی بپزم", style = MaterialTheme.typography.labelSmall)
                            }
                            Text("سرآشپز پاپیون", style = MaterialTheme.typography.titleLarge)
                        }
                    },
                    actions = {
                        Icon(
                            painter = painterResource(Res.drawable.search_icon),
                            contentDescription = ""
                        )

                    },
                    navigationIcon = {
                        Icon(
                            painter = painterResource(Res.drawable.notif_icon),
                            contentDescription = ""
                        )
                    }
                )
            }
        ) {
            Box(
                Modifier.padding(it).fillMaxSize()
                    .background(MaterialTheme.colorScheme.background).verticalScroll(
                        rememberScrollState()
                    )
            ) {
                CompositionLocalProvider(
                    LocalLayoutDirection provides LayoutDirection.Rtl
                ) {
                    HomeSc()
                }
            }

        }

    }
}