package com.behnamuix.sarashpaz.features.category.domain.model

import androidx.compose.runtime.Immutable
import kotlinx.serialization.Serializable
import org.jetbrains.compose.resources.DrawableResource

data class CategoryRecipe(
    val id:Int,
    val image: DrawableResource,
    val title:String,
    val recipeCount:Int,
    val recipeList: List<RecipeModel>
)

data class RecipeModel(
    val id: Int,
    val image: DrawableResource,
    val title: String,
    val chefName: String
)