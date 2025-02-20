package dev.evokerking.simpleJoinLeaveMessages.events;

import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.title.Title;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.time.Duration;

public class joinListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        event.setJoinMessage("§a" + event.getPlayer().getName() + " §7has joined the server!");
        showWelcomeTitle(event.getPlayer());
    }
    public void showWelcomeTitle(final @NonNull Audience target) {
        final Title.Times times = Title.Times.times(Duration.ofMillis(500), Duration.ofMillis(3000), Duration.ofMillis(1000));
        // Using the times object this title will use 500ms to fade in, stay on screen for 3000ms and then fade out for 1000ms
        final Title title = Title.title(Component.text("Hello! Hope You Have fun"), Component.empty(), times);

        // Send the title, you can also use Audience#clearTitle() to remove the title at any time
        target.showTitle(title);
    }
}
