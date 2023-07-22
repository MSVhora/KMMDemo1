package com.demo1.kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform