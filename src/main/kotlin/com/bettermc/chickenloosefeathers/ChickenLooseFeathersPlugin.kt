package com.bettermc.chickenloosefeathers

import com.bettermc.chickenloosefeathers.infrastructure.command.ReloadCommand
import com.bettermc.chickenloosefeathers.infrastructure.config.PluginConfig
import com.bettermc.chickenloosefeathers.infrastructure.listener.EggLayListener
import org.bukkit.plugin.java.JavaPlugin

class ChickenLooseFeathersPlugin : JavaPlugin() {

    private lateinit var config: PluginConfig

    override fun onEnable() {
        saveDefaultConfig()
        config = PluginConfig(this)

        server.pluginManager.registerEvents(EggLayListener(config), this)
        getCommand("chickenfeather")?.setExecutor(ReloadCommand(this))

        logger.info("BetterMC Chicken Loose Feathers enabled!")
    }

    override fun onDisable() {
        logger.info("BetterMC Chicken Loose Feathers disabled!")
    }
}
