package winlyps.noDeathMessages

import org.bukkit.plugin.java.JavaPlugin

class NoDeathMessages : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("showDeathMessages", "false")
        }
        logger.info("NoDeathMessages plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("NoDeathMessages plugin has been disabled.")
    }
}