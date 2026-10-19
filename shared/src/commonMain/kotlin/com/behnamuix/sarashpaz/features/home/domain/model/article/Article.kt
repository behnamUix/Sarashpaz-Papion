package com.behnamuix.sarashpaz.features.home.domain.model.article

import org.jetbrains.compose.resources.DrawableResource


data class Article(
    val id: Int,
    val image: DrawableResource,
    val title: String,
    val subtitle: String
)