package me.lizard.shittymagicsigns.Events;

import net.kyori.adventure.text.BlockNBTComponent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.event.entity.EntityEnterBlockEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.persistence.PersistentDataContainer;

public class BlockPlace implements Listener {


    /*@EventHandler
    public void onPlayer(PlayerMoveEvent e){
        Player p = e.getPlayer();

        if (!p.getLocation().getBlock().equals(Material.MOSS_CARPET)) return;
        p.sendBlockChange(p.getLocation(), Material.AIR.createBlockData());


    }

    @EventHandler
    public void onPlayerMover(PlayerToggleSneakEvent e){
        Player p = e.getPlayer();

        if (!p.isSneaking()) return;
        if (!p.getLocation().getBlock().equals(Material.MOSS_CARPET)) return;
        p.sendBlockChange(p.getLocation(), Material.AIR.createBlockData());
    }*/


}
