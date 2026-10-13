package com.behnamuix.sarashpaz

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform