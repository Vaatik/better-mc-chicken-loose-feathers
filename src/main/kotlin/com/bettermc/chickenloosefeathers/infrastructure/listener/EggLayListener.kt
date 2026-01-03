package com.bettermc.chickenloosefeathers.infrastructure.listener

import com.bettermc.chickenloosefeathers.infrastructure.config.PluginConfig
import org.bukkit.Material
import org.bukkit.entity.Chicken
import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDropItemEvent
import org.bukkit.inventory.ItemStack
import kotlin.random.Random

class EggLayListener(private val config: PluginConfig) : Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    fun onChickenDropItem(event: EntityDropItemEvent) {
        val entity = event.entity
        if (entity !is Chicken) return

        val droppedItem = event.itemDrop.itemStack
        if (droppedItem.type != Material.EGG) return

        val featherCount = Random.nextInt(1, config.maxFeatherAmount + 1)
        val feathers = ItemStack(Material.FEATHER, featherCount)

        entity.world.dropItem(entity.location, feathers)
    }
}
