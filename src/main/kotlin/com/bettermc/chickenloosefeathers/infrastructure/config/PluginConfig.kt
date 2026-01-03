package com.bettermc.chickenloosefeathers.infrastructure.config

import org.bukkit.plugin.java.JavaPlugin

class PluginConfig(private val plugin: JavaPlugin) {

    val maxFeatherAmount: Int
        get() = plugin.config.getInt("maxFeatherAmount", 3).coerceAtLeast(1)
}
