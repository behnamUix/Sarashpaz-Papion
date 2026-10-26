package com.behnamuix.sarashpaz.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.behnamuix.sarashpaz.features.category.presentation.screen.CategoryScreen
import com.behnamuix.sarashpaz.features.home.presentation.screen.HomeSc
import com.behnamuix.sarashpaz.isAndroid

@Composable
fun SarashpazNavigation(navController: NavHostController) {


    NavHost(
        navController = navController,
        startDestination = HomeScreenRoute
    ) {
        composable<HomeScreenRoute> {
           HomeSc()
        }
        composable<CategoryScreenRoute> {
            CategoryScreen()
        }
    }


}