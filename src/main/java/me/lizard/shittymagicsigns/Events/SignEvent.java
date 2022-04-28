package me.lizard.shittymagicsigns.Events;

import org.bukkit.Material;
import org.bukkit.TreeType;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.block.Chest;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
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
        swordM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        sword.setItemMeta(swordM);
        //Item God Sword
        //Item Enchanted Mending Book
        ItemStack e_mending = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta emM = (EnchantmentStorageMeta) e_mending.getItemMeta();
        emM.addStoredEnchant(Enchantment.MENDING, 5,true);
        emM.addStoredEnchant(Enchantment.DAMAGE_ALL, 10,true);
        emM.addStoredEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 50,true);
        e_mending.setItemMeta(emM);
        //Item Enchanted Mending Book



        Player p = e.getPlayer();

        var mss = e.getLine(1).equalsIgnoreCase("Magic Sign");//mss = magic sign string
        var gl = e.getLine(2);// gl == get line
        var gw = e.getBlock().getWorld();//gw == get world
        var bn = e.getBlock().breakNaturally();//bn == break naturally, to use, use bn = true
        var gb = e.getBlock();//gb == gets block



        if (p.isOp() || p.hasPermission("sms.sms") || p.getName().equals("Nasmi_")) {

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

            } else if (mss && gl.equalsIgnoreCase("Chest")){

                /* else if (mss && gl.equalsIgnoreCase("chest testing")) {
                gb.setType(Material.CHEST);
                Chest c = (Chest) gb.getState();
                var inv = c.getBlockInventory();
                inv.setItem(0, sword);
                }*/

                gb.setType(Material.CHEST);
                Chest c = (Chest) gb.getState();
                Inventory inv = c.getBlockInventory();
                inv.setItem(0, new ItemStack(Material.TOTEM_OF_UNDYING));
                inv.setItem(1, new ItemStack(Material.TOTEM_OF_UNDYING));
                inv.setItem(2, new ItemStack(Material.TOTEM_OF_UNDYING));
                inv.setItem(3, new ItemStack(Material.TOTEM_OF_UNDYING));
                inv.setItem(4, new ItemStack(Material.TOTEM_OF_UNDYING));
                inv.setItem(5, new ItemStack(Material.TOTEM_OF_UNDYING));
                inv.setItem(6, new ItemStack(Material.TOTEM_OF_UNDYING));
                inv.setItem(7, new ItemStack(Material.TOTEM_OF_UNDYING));
                inv.setItem(8, new ItemStack(Material.TOTEM_OF_UNDYING));
                inv.setItem(18, e_mending);
                inv.setItem(19, e_mending);
                inv.setItem(20, e_mending);
                inv.setItem(21, e_mending);
                inv.setItem(22, e_mending);
                inv.setItem(23, e_mending);
                inv.setItem(24, e_mending);
                inv.setItem(25, e_mending);
                inv.setItem(26, e_mending);

            }else if (mss && gl.equalsIgnoreCase("Tree")){

                bn = true;
                gw.generateTree(gb.getLocation(), TreeType.TREE);

            }


        }

    }
}
