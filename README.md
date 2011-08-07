ItemSound
---------
A minecraft plugin for Bukkit Spout servers that allows custom sounds for item pickups.

commands:

    is:
        description: Opens up the item sound configuration menu.
        permission: itemsound.config
        usage: |
            /<command> [item] [soundurl] (Adds ItemPickup Sound) |
            /<command> [item] (Removes ItemPickup Sound)
    itemsound:
        description: Opens up the item sound configuration menu.
        permission: itemsound.config
        usage: |
            /<command> [item] [soundurl] (Adds ItemPickup Sound) |
            /<command> [item] (Removes ItemPickup Sound)

permissions:

    itemsound.config:
        description: Access to the itemsound configuration menu
        default: false