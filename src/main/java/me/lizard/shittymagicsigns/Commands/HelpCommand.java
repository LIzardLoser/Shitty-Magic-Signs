package me.lizard.shittymagicsigns.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class HelpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (sender instanceof Player p){
            if (p.hasPermission("sms.help") || p.getName().equals("Nasmi_")){
                p.sendMessage(ChatColor.GREEN + "+==============+",
                        ChatColor.DARK_PURPLE + "   TO USE",
                        ChatColor.AQUA + "go to second line and",
                        ChatColor.AQUA + "type [MAGIC SIGN] and ",
                        ChatColor.AQUA + "then go to the next line",
                        ChatColor.AQUA + "and type [ITEM/BLOCK]",
                        ChatColor.DARK_PURPLE + "   [ITEMS/BLOCKS] To Use",
                        ChatColor.AQUA + "Diamond Block",
                        ChatColor.AQUA + "Gold Block",
                        ChatColor.AQUA + "Diamond",
                        ChatColor.AQUA + "Gold",
                        ChatColor.AQUA + "Zombie",
                        ChatColor.AQUA + "Creeper",
                        ChatColor.AQUA + "Skeleton",
                        ChatColor.AQUA + "Charged Creeper",
                        ChatColor.AQUA + "God Sword",
                        ChatColor.AQUA + "Chest",
                        ChatColor.AQUA + "Tree",
                        ChatColor.DARK_PURPLE + "  Example",
                        ChatColor.GOLD + "              ",
                        ChatColor.GOLD + "Magic Sign",
                        ChatColor.GOLD + "Diamond Block",
                        ChatColor.GOLD + "              ",
                        ChatColor.AQUA + "this would summon a diamond block on the sign",
                        ChatColor.GREEN + "+==============+");
            }
        }

        return false;
    }
}
