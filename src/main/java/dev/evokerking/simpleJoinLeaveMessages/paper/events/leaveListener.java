package dev.evokerking.simpleJoinLeaveMessages.paper.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class leaveListener implements Listener {
    @EventHandler
    public void onLeave(PlayerQuitEvent event) {
        event.setQuitMessage("§c" + event.getPlayer().getName() + " §7has left the server!");
    }
}
