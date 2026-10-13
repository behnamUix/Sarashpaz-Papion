package com.behnamuix.sarashpaz.features.home.domain.model.recipe


data class Ingredient(
    val id: String,
    val name: String,
    val quantity: Double? = null,
    val unit: String? = null,
    val note: String? = null
)


