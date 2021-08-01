package net.cyberflame.spawnpermfly.listeners;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerListener implements Listener
{
    public void onMove(PlayerMoveEvent event)
    {
        Player p = event.getPlayer();
        World w = event.getPlayer().getWorld();
        if (w.getName() == "world") p.setFlying(true);
    }
}
