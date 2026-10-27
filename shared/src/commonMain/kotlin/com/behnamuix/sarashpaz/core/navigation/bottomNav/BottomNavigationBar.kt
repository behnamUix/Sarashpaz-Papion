package com.behnamuix.sarashpaz.core.navigation.bottomNav

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import org.jetbrains.compose.resources.painterResource

@Composable
fun BottomNavigationBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Transparent)
            .padding(horizontal = 16.dp, vertical = 8.dp),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(68.dp)
                .clip(RoundedCornerShape(24.dp))
                .background(Color.Transparent)
                .padding(horizontal = 12.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            bottomNavItems.forEach { item ->
                val selected = currentDestination?.hasRoute(
                    item.route::class
                ) == true

                BottomNavigationItem(
                    item = item,
                    selected = selected,
                    onClick = {
                        if (!selected) {
                            navController.navigate(item.route) {
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    }
                )
            }
        }
    }
}

@Composable
private fun BottomNavigationItem(
    item: BottomNavItem,
    selected: Boolean,
    onClick: () -> Unit
) {
    val itemColor = if (selected) {
        MaterialTheme.colorScheme.primary
    } else {
        Color(0xFF858B82)
    }

    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .clickable(onClick = onClick)
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            painter = painterResource(item.icon),
            contentDescription = item.label,
            modifier = Modifier.size(24.dp),
            tint = itemColor
        )

        Text(
            text = item.label,
            color = itemColor,
            style = MaterialTheme.typography.labelMedium
        )
    }
}