package com.wra.bukkit.ItemSound;

import org.getspout.spoutapi.gui.*;

/**
 * Created by IntelliJ IDEA.
 * User: raptors
 * Date: 8/6/11
 * Time: 5:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class ItemSoundManager extends GenericPopup {
    ItemSound plugin;

    public ItemSoundManager(ItemSound plugin, InGameHUD hud) {
        super();
        this.plugin = plugin;
        GenericTextField textField = new GenericTextField();
        int w = hud.getWidth();
        int h = hud.getHeight();
        textField.setWidth(w-40);
        textField.setHeight(h-100);
        textField.setText(plugin.config.toString());
        textField.setY(20);
        textField.setX(20);

        GenericButton updateButton = new GenericButton();
        updateButton.setText("Update");
        updateButton.setY(h-80);
        updateButton.setCentered(true);
        this.attachWidget(textField);
        this.attachWidget(updateButton);
    }


}
