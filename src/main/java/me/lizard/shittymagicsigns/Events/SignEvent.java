package me.lizard.shittymagicsigns.Events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.inventory.ItemStack;

public class SignEvent implements Listener {

    @SuppressWarnings("deprecation")

    @EventHandler
    public void SignEvent(SignChangeEvent e){

        var mss = e.getLine(1).equalsIgnoreCase("Magic Sign");//mss = magic sign string



        if (mss && e.getLine(2).equalsIgnoreCase("Diamond Block")){// diamond block
            e.getBlock().setType(Material.DIAMOND_BLOCK);
        }else if (mss && e.getLine(2).equalsIgnoreCase("Gold Block")){//gold block
            e.getBlock().setType(Material.GOLD_BLOCK);
        }else if(mss && e.getLine(2).equalsIgnoreCase("Gold")){//gold ingot
            e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.GOLD_INGOT));
            e.getBlock().breakNaturally();
        }else if(mss && e.getLine(2).equalsIgnoreCase("Diamond")){//diamond
            e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.DIAMOND));
            e.getBlock().breakNaturally();
        }else if(mss && e.getLine(2).equalsIgnoreCase("Zombie")){
            e.getBlock().getWorld().spawnEntity(e.getBlock().getLocation(), EntityType.ZOMBIE);
            e.getBlock().breakNaturally();
        }else if(mss && e.getLine(2).equalsIgnoreCase("Creeper")){
            e.getBlock().getWorld().spawnEntity(e.getBlock().getLocation(), EntityType.CREEPER);
            e.getBlock().breakNaturally();
        }else if(mss && e.getLine(2).equalsIgnoreCase("Charged creeper")){
            Creeper cc =(Creeper)e.getBlock().getWorld().spawnEntity(e.getBlock().getLocation(), EntityType.CREEPER);
            cc.setPowered(true);
            e.getBlock().breakNaturally();
        }else if(mss && e.getLine(2).equalsIgnoreCase("Skeleton")){
            e.getBlock().getWorld().spawnEntity(e.getBlock().getLocation(), EntityType.SKELETON);
            e.getBlock().breakNaturally();
        }
    }
}
