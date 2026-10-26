package com.behnamuix.sarashpaz.core.navigation.bottomNav

import com.behnamuix.sarashpaz.core.navigation.CategoryScreenRoute
import com.behnamuix.sarashpaz.core.navigation.HomeScreenRoute
import org.jetbrains.compose.resources.DrawableResource
import sarashpaz.shared.generated.resources.Res
import sarashpaz.shared.generated.resources.icon_category
import sarashpaz.shared.generated.resources.icon_home

data class BottomNavItem(
    val route:Any,
    val label:String,
    val icon: DrawableResource
)
val bottomNavItems = listOf(
    BottomNavItem(
        route = HomeScreenRoute,
        icon = Res.drawable.icon_home,
        label = "خانه"
    ),
    BottomNavItem(
        route = CategoryScreenRoute,
        icon = Res.drawable.icon_category,
        label = "دسته بندی"
    ),
)