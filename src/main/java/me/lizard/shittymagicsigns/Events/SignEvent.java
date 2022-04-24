package me.lizard.shittymagicsigns.Events;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SignEvent implements Listener {

    @SuppressWarnings({"deprecation","ConstantConditions"})


    @EventHandler
    public void onSignChangeEvent(SignChangeEvent e){

        var mss = e.getLine(1).equalsIgnoreCase("Magic Sign");//mss = magic sign string
        var gl = e.getLine(2);// gl == get line



        if (mss && gl.equalsIgnoreCase("Diamond Block")){// diamond block

            e.getBlock().breakNaturally();
            e.getBlock().setType(Material.DIAMOND_BLOCK);

        }else if (mss && gl.equalsIgnoreCase("Gold Block")){//gold block

            e.getBlock().breakNaturally();
            e.getBlock().setType(Material.GOLD_BLOCK);

        }else if(mss && gl.equalsIgnoreCase("Gold")){//gold ingot

            e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.GOLD_INGOT));
            e.getBlock().breakNaturally();

        }else if(mss && gl.equalsIgnoreCase("Diamond")){//diamond

            e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.DIAMOND));
            e.getBlock().breakNaturally();

        }else if(mss && gl.equalsIgnoreCase("Zombie")){

            e.getBlock().getWorld().spawnEntity(e.getBlock().getLocation(), EntityType.ZOMBIE);
            e.getBlock().breakNaturally();

        }else if(mss && gl.equalsIgnoreCase("Creeper")){

            e.getBlock().getWorld().spawnEntity(e.getBlock().getLocation(), EntityType.CREEPER);
            e.getBlock().breakNaturally();

        }else if(mss && gl.equalsIgnoreCase("Charged creeper") || mss & e.getLine(2).equalsIgnoreCase("CC")){

            Creeper cc = (Creeper)e.getBlock().getWorld().spawnEntity(e.getBlock().getLocation(), EntityType.CREEPER);
            cc.setPowered(true);
            e.getBlock().breakNaturally();

        }else if(mss && gl.equalsIgnoreCase("Skeleton")){

            e.getBlock().getWorld().spawnEntity(e.getBlock().getLocation(), EntityType.SKELETON);
            e.getBlock().breakNaturally();

        }else if (mss && gl.equalsIgnoreCase("God Sword")){

            ItemStack sword = new ItemStack(Material.NETHERITE_SWORD);
            ItemMeta swordM = sword.getItemMeta();
            swordM.addEnchant(Enchantment.DAMAGE_ALL, 5000, true);
            swordM.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier("attack speed", 0.2, AttributeModifier.Operation.ADD_NUMBER));
            swordM.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("attack damage", 1500.0, AttributeModifier.Operation.ADD_NUMBER));
            sword.setItemMeta(swordM);
            e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), sword);
            e.getBlock().breakNaturally();

        }else if (mss && gl.equalsIgnoreCase("spider")){

            e.getBlock().getWorld().spawnEntity(e.getBlock().getLocation(), EntityType.SPIDER);
            e.getBlock().breakNaturally();

        }
    }
}
