package com.gmail.nossr50.events.skills.fishing;

import java.util.Map;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;


public class McMMOPlayerMagicHunterEvent extends McMMOPlayerFishingTreasureEvent {

    private Map<Enchantment, Integer> enchants;

    public McMMOPlayerMagicHunterEvent(Player player, ItemStack treasure, int xp, Map<Enchantment, Integer> enchants) {
        super(player, treasure, xp);
        this.enchants = enchants;
    }
    
    public Map<Enchantment, Integer> getEnchantments() {
        return enchants;
    }
}
