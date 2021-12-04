package de.illgealaccess.achievmentsystem.commands;

import de.illgealaccess.achievmentsystem.utils.AchievGUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;

public class Achievment implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player){
            //open inv
            Player player = (Player) sender;
            AchievGUI.createMainInventory(player);
            player.openInventory(AchievGUI.inventory);
        }
        return false;
    }
}