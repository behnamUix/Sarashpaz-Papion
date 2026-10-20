package com.behnamuix.sarashpaz.sarashpaz_papiyon

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.unit.sp
import com.behnamuix.sarashpaz.core.design.AppTheme
import com.behnamuix.sarashpaz.core.design.LogoFont
import com.behnamuix.sarashpaz.features.home.presentation.screen.HomeSc
import org.jetbrains.compose.resources.painterResource
import sarashpaz.shared.generated.resources.Res
import sarashpaz.shared.generated.resources.notif_icon
import sarashpaz.shared.generated.resources.search_icon
import sarashpaz.shared.generated.resources.chef
import sarashpaz.shared.generated.resources.logo

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
                                modifier = Modifier.padding(end = 24.dp),
                                contentPadding = PaddingValues(horizontal = 36.dp),
                                onClick = {

                                },
                                shape = RoundedCornerShape(12.dp),
                                colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.secondary)
                            ) {
                                Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                                    Text("چی بپزم؟", style = MaterialTheme.typography.labelSmall)
                                    Icon(
                                        modifier = Modifier.size(22.dp),
                                        painter = painterResource(Res.drawable.chef),
                                        contentDescription = ""
                                    )
                                }
                            }


                        }
                    },
                    actions = {
                        Row(verticalAlignment = Alignment.CenterVertically) {

                            Text("سرآشپز پاپیون", fontFamily = LogoFont(), fontSize = 16.sp)
                            Image (
                                modifier = Modifier.size(52.dp),
                                painter = painterResource(Res.drawable.logo),
                                contentDescription = ""
                            )
                        }

                    },

                    navigationIcon = {
                        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                            Icon(
                                painter = painterResource(Res.drawable.notif_icon),
                                contentDescription = ""
                            )
                            Icon(
                                painter = painterResource(Res.drawable.search_icon),
                                contentDescription = ""
                            )
                        }

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