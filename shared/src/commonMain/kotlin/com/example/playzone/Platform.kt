package com.example.playzone

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform