package com.wra.bukkit.ItemSound;

import org.bukkit.entity.Item;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.player.SpoutPlayer;

import javax.security.auth.login.Configuration;

/**
 * Created by IntelliJ IDEA.
 * User: raptors
 * Date: 8/6/11
 * Time: 3:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class ItemSoundPlayerListener extends PlayerListener {
    ItemSound plugin;

    public ItemSoundPlayerListener(ItemSound plugin) {
        super();
        this.plugin = plugin;
    }

    public void onPlayerPickupItem(PlayerPickupItemEvent event) {
        SpoutPlayer sPlayer = SpoutManager.getPlayer(event.getPlayer());
        Item item = event.getItem();
        String music = plugin.config.getString("effect."+item.getItemStack().getType().name(), "");
        if(music == "") {
            music = plugin.config.getString("effect.DEFAULT", "");
        }
        if(music != "") {
            SpoutManager.getSoundManager().playCustomSoundEffect(plugin, sPlayer, music, true);
        }
    }
}