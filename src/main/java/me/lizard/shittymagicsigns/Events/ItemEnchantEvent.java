package me.lizard.shittymagicsigns.Events;

import me.lizard.shittymagicsigns.ShittyMagicSigns;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class ItemEnchantEvent implements Listener {

    @SuppressWarnings({"ConstantConditions"})


    @EventHandler
    public void anvilUpdate(PrepareAnvilEvent e){
        //ItemStack
        ItemStack e_mending = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta emM = (EnchantmentStorageMeta) e_mending.getItemMeta();
        emM.addStoredEnchant(Enchantment.MENDING, 5,true);
        emM.addStoredEnchant(Enchantment.DAMAGE_ALL, 10,true);
        emM.addStoredEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 50,true);
        e_mending.setItemMeta(emM);
        //ItemStack

        if (e.getInventory().getItem(1).equals(e_mending)){

            e.getInventory().setRepairCost(1);

        }
    }


}
