package de.illgealaccess.achievmentsystem.listeners;

import de.illgealaccess.achievmentsystem.mysql.AchievmentManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerJoinEvent implements Listener {
    @EventHandler
    public void onJoin(org.bukkit.event.player.PlayerJoinEvent event){
        Player player = event.getPlayer();
        AchievmentManager.createUser(player.getUniqueId());
    }
}
