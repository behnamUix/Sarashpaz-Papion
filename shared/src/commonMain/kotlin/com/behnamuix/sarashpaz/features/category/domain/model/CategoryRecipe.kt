package com.behnamuix.sarashpaz.features.category.domain.model

import androidx.compose.runtime.Immutable
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.Ingredients
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.Spices
import kotlinx.serialization.Serializable
import org.jetbrains.compose.resources.DrawableResource

data class CategoryRecipe(
    val id: Int,
    val image: DrawableResource,
    val title: String,
    val recipeCount: Int,
    val recipeList: List<RecipeModel>
)

data class RecipeModel(
    val id: Int,

    val image: DrawableResource,
    val title: String,
    val cookingSteps: List<String>,
    val chefName: String,
    val ingredients: List<Ingredients>,
    val spices: List<Spices>
)