package dev.evokerking.simpleJoinLeaveMessages;

import org.bukkit.plugin.java.JavaPlugin;
import dev.evokerking.simpleJoinLeaveMessages.events.joinListener;
import dev.evokerking.simpleJoinLeaveMessages.events.leaveListener;


public final class SimpleJoinLeaveMessages extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        if (isFolia() == true) {
            System.out.println("Loading Simple Join/Leave Messages for Folia");
        } else {
            System.out.println("Loading Simple Join/Leave Messages for Paper");
        }
        System.out.println("Loading Events.");
        System.out.println("Loading Events..");
        System.out.println("Loading Events...");
        System.out.println("Registering Join Listener.");
        getServer().getPluginManager().registerEvents(new joinListener(), this);
        System.out.println("Registered Join Listener.");
        System.out.println("Registering Leave Listener.");
        getServer().getPluginManager().registerEvents(new leaveListener(), this);
        System.out.println("Registered Leave Listener.");
        System.out.println("Simple Join/Leave Messages has been loaded.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        if (isFolia() == true) {
            System.out.println("Shutting down Simple Join/Leave Messages for Folia");
        } else {
            System.out.println("Shutting Simple Join/Leave Messages for Paper");
        }

        System.out.println("Simple Join/Leave Messages has been unloaded.");
        System.out.println("Thank you for using Simple Join/Leave Messages.");
    }

    private static boolean isFolia() {
        try {
            Class.forName("io.papermc.paper.threadedregions.RegionizedServer");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
