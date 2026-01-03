package com.bettermc.chickenloosefeathers.infrastructure.command

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.plugin.java.JavaPlugin

class ReloadCommand(private val plugin: JavaPlugin) : CommandExecutor {

    override fun onCommand(
        sender: CommandSender,
        command: Command,
        label: String,
        args: Array<out String>
    ): Boolean {
        if (args.isEmpty()) {
            sender.sendMessage("Usage: /$label reload")
            return true
        }

        when (args[0].lowercase()) {
            "reload" -> {
                plugin.reloadConfig()
                sender.sendMessage("Configuration reloaded!")
            }
            else -> sender.sendMessage("Unknown subcommand: ${args[0]}")
        }
        return true
    }
}
