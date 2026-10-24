package com.behnamuix.sarashpaz.features.category.domain.model

import org.jetbrains.compose.resources.DrawableResource

data class RecipeModel(
    val id:Int,
    val image: DrawableResource,
    val title:String,
    val recipeCount:Int
)