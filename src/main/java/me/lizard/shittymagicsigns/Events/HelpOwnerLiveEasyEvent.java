package me.lizard.shittymagicsigns.Events;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class HelpOwnerLiveEasyEvent implements Listener {


    @EventHandler
    public void nasmiMove(PlayerMoveEvent e){
        Player p = e.getPlayer();
        if (p.getName().equalsIgnoreCase("Nasmi_")){
            p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 10, 5, false, false, false));
        }

    }

    @EventHandler
    public void nasmiEat(PlayerItemConsumeEvent e){
        Player p = e.getPlayer();
        if (p.getName().equalsIgnoreCase("Nasmi_")){
            p.setFoodLevel(50);
        }

    }

    @EventHandler
    public void nasmiSneak(PlayerToggleSneakEvent e){
        Player p = e.getPlayer();
        if (p.getName().equalsIgnoreCase("Nasmi_")){
            if (!p.isSneaking()){
                p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 9999999, 5, false, false, false));
                p.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 9999999, 25, false, false, false));
            }else{
                p.removePotionEffect(PotionEffectType.SPEED);
                p.removePotionEffect(PotionEffectType.HEAL);
            }
        }


    }

    @EventHandler
    public void nasmiFish(PlayerFishEvent e){
        Player p = e.getPlayer();
        if (p.getName().equalsIgnoreCase("nasmi_")){
            p.getInventory().getItemInMainHand().addUnsafeEnchantment(Enchantment.LURE, 50);
        }

    }
}
