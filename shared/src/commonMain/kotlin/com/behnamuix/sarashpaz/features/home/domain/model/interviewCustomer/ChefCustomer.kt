package com.behnamuix.sarashpaz.features.home.domain.model.interviewCustomer

import org.jetbrains.compose.resources.DrawableResource

data class ChefCustomer(
    val id: Int,
    val name: String,
    val imageUrl: DrawableResource,
    val registeredAt: String,
    val q_a: List<QAChefCustomer>,

    )

data class QAChefCustomer(
    val question: String,
    val answer: String
)