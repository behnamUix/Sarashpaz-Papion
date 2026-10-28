package com.behnamuix.sarashpaz.core.navigation

import com.behnamuix.sarashpaz.features.category.domain.model.RecipeModel
import kotlinx.serialization.Serializable

@Serializable
object HomeScreenRoute

@Serializable
object CategoryScreenRoute

@Serializable
object SearchScreenRoute

@Serializable
object GalleryScreenRoute

@Serializable
object ProfileScreenRoute

@Serializable
data class RecipeRoute(
    val id: Int
)