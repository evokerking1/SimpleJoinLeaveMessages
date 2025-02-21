package dev.evokerking.simpleJoinLeaveMessages.velocity;

import com.google.inject.Inject;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import org.slf4j.Logger;

@Plugin(id = "simplejoinleavemessages", name = "Simple Join Leave Messages", version = "1.0.0", authors = {"Evokerking"})
public class SimpleJoinLeaveMessages {
    private final ProxyServer server;
    private final Logger logger;

    @Inject
    public SimpleJoinLeaveMessages(ProxyServer server, Logger logger) {
        this.server = server;
        this.logger = logger;

    }
}
