package com.behnamuix.sarashpaz.features.home.domain.model.article

data class Article(
    val id:Int,
    val name:String,
    val image:String,
    val writer:String,
    val description: String? = null


)
