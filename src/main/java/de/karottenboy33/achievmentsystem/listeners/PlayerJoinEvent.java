package de.karottenboy33.achievmentsystem.listeners;

import de.karottenboy33.achievmentsystem.AchievmentSystem;
import de.karottenboy33.achievmentsystem.mysql.AchievmentManager;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
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
