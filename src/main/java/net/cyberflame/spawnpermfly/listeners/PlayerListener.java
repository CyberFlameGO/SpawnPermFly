package net.cyberflame.spawnpermfly.listeners;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerListener implements Listener
{
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event)
    {
        Player p = event.getPlayer();
        World w = event.getPlayer().getWorld();
        if (w.getName() == "world" && !p.isFlying())
        {
            p.setFlying(true);
            p.setAllowFlight(true);
        }
        else if (w.getName() != "world" && p.isFlying())
        {
            p.setFlying(false);
            p.setAllowFlight(false)
        }
    }
}
