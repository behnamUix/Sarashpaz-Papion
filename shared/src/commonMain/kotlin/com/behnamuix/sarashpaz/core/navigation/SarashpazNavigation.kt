package com.behnamuix.sarashpaz.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.behnamuix.sarashpaz.features.category.presentation.screen.CategoryScreen
import com.behnamuix.sarashpaz.features.category.presentation.screen.RecipeScreen
import com.behnamuix.sarashpaz.features.home.presentation.screen.HomeSc

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
            CategoryScreen(){id->
                navController.navigate(RecipeRoute(id = id))
            }
        }
        composable<RecipeRoute> { backStackEntry->
            val route=backStackEntry.toRoute<RecipeRoute>()
           RecipeScreen(recipeId = route.id)
        }
    }


}