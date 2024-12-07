package io.minafluo.toulm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform