package me.lizard.shittymagicsigns.Events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class TreeDecayEvent implements Listener {


    @EventHandler
    public void treeDecayEvent(LeavesDecayEvent e){
        var world = e.getBlock().getWorld();
        Random rand = new Random();
        Random rand1 = new Random();
        Random rand2 = new Random();
        int n1 = rand1.nextInt(4000);
        int n = rand.nextInt(25);
        int n2 = rand.nextInt(20000);
        n+=1;
        n1+=1;
        n2+=1;


        if (n == 5){
            world.dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.APPLE));
        }
        if (n1 == 5){
            world.dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.GOLDEN_APPLE));
        }if (n2 == 5){
            world.dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.ENCHANTED_GOLDEN_APPLE));
        }


    }


}
