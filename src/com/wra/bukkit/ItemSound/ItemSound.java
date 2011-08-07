package com.wra.bukkit.ItemSound;

import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.config.Configuration;

import java.util.HashMap;
import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: raptors
 * Date: 8/6/11
 * Time: 3:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class ItemSound extends JavaPlugin {
    public final Logger log = Logger.getLogger("Minecraft");
    public final ItemSoundPlayerListener plisten = new ItemSoundPlayerListener(this);
    public Configuration config;
    public void onDisable() {
         log.info("[ItemSound] Stopped");
    }

    public void onEnable() {
        log.info("[ItemSound] Started");
        config = getConfiguration();
        config.save();
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvent(Event.Type.PLAYER_PICKUP_ITEM, plisten, Event.Priority.Normal, this);
        getCommand("itemsound").setExecutor(new ItemSoundCommand(this));
        getCommand("is").setExecutor(new ItemSoundCommand(this));
    }
}
