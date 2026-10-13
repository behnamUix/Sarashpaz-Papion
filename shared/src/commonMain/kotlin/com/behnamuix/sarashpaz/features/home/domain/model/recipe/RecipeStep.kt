package com.behnamuix.sarashpaz.features.home.domain.model.recipe

data class RecipeStep(
    val order: Int,
    val instruction: String,
    val imageUrl: String? = null,
    val durationMinutes: Int? = null
)
