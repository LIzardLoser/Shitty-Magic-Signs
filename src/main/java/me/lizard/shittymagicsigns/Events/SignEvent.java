package me.lizard.shittymagicsigns.Events;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SignEvent implements Listener {

    @SuppressWarnings({"deprecation","ConstantConditions"})


    @EventHandler
    public void onSignChangeEvent(SignChangeEvent e){

        //Item God Sword
        ItemStack sword = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta swordM = sword.getItemMeta();
        swordM.addEnchant(Enchantment.DAMAGE_ALL, 5000, true);
        swordM.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier("attack speed", 0.2, AttributeModifier.Operation.ADD_NUMBER));
        swordM.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("attack damage", 1500.0, AttributeModifier.Operation.ADD_NUMBER));
        sword.setItemMeta(swordM);
        //Item God Sword



        Player p = e.getPlayer();

        var mss = e.getLine(1).equalsIgnoreCase("Magic Sign");//mss = magic sign string
        var gl = e.getLine(2);// gl == get line
        var gw = e.getBlock().getWorld();//gw == get world
        var bn = e.getBlock().breakNaturally();//bn == break naturally to use, use bn = true
        var gb = e.getBlock();//loc == block location



        if (p.isOp() || p.hasPermission("shittymagicsigns.sms")) {

            if (mss && gl.equalsIgnoreCase("Diamond Block")) {// diamond block

                bn = true;
                gb.setType(Material.DIAMOND_BLOCK);

            } else if (mss && gl.equalsIgnoreCase("Gold Block")) {//gold block

                bn = true;
                gb.setType(Material.GOLD_BLOCK);

            } else if (mss && gl.equalsIgnoreCase("Gold")) {//gold ingot

                gw.dropItemNaturally(gb.getLocation(), new ItemStack(Material.GOLD_INGOT));
                bn = true;

            } else if (mss && gl.equalsIgnoreCase("Diamond")) {//diamond

                gw.dropItemNaturally(gb.getLocation(), new ItemStack(Material.DIAMOND));
                bn = true;

            } else if (mss && gl.equalsIgnoreCase("Zombie")) {

                gw.spawnEntity(gb.getLocation(), EntityType.ZOMBIE);
                bn = true;

            } else if (mss && gl.equalsIgnoreCase("Creeper")) {

                gw.spawnEntity(gb.getLocation(), EntityType.CREEPER);
                bn = true;

            } else if (mss && gl.equalsIgnoreCase("Charged creeper") || mss & e.getLine(2).equalsIgnoreCase("CC")) {

                Creeper cc = (Creeper) gw.spawnEntity(gb.getLocation(), EntityType.CREEPER);
                cc.setPowered(true);
                bn = true;

            } else if (mss && gl.equalsIgnoreCase("Skeleton")) {

                gw.spawnEntity(gb.getLocation(), EntityType.SKELETON);
                bn = true;

            } else if (mss && gl.equalsIgnoreCase("God Sword")) {

                gw.dropItemNaturally(gb.getLocation(), sword);
                bn = true;

            } else if (mss && gl.equalsIgnoreCase("spider")) {

                gw.spawnEntity(gb.getLocation(), EntityType.SPIDER);
                bn = true;

            } else if (mss && gl.equalsIgnoreCase("")){

            }


        }

    }
}
