package de.illgealaccess.achievmentsystem.commands;

import de.illgealaccess.achievmentsystem.mysql.AchievmentManager;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdminAchievmentCommand implements CommandExecutor, TabCompleter {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("achiev.admin")) {
                if (args.length == 4){
                    Player target = Bukkit.getPlayer(args[1]);
                    if (args[0].equals("set")){
                        if (args[2].equals("Block")){
                            int numberInPut = Integer.parseInt(args[3]);
                            AchievmentManager.setBlockAchiev(target, target.getUniqueId(), numberInPut);
                        }
                        if (args[2].equals("BlockBreake")){
                            int numberInPut = Integer.parseInt(args[3]);
                            AchievmentManager.setBlockBreake(target.getUniqueId(), numberInPut);
                        }
                    }
                    if (args[0].equals("add")){
                        if (args[2].equals("Block")){
                            int numberInPut = Integer.parseInt(args[3]);
                            AchievmentManager.addBlockAchiev(target, target.getUniqueId(), numberInPut);
                        }
                        if (args[2].equals("BlockBreake")){
                            int numberInPut = Integer.parseInt(args[3]);
                            AchievmentManager.addBlockBreak(target.getUniqueId(), numberInPut);
                        }
                    }

                } else {
                    if (args.length == 2 && args[0].equals("reset")){
                        Player target = Bukkit.getPlayer(args[1]);
                        AchievmentManager.setBlockAchiev(target, target.getUniqueId(), 0);
                        AchievmentManager.setBlockBreake(target.getUniqueId(), 0);
                    }
                }
            } else {
                player.sendMessage("§4Dazu hast du keine rechte!");
            }
        }
        return false;
    }

    @Override
    public List< String > onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        Player player = (Player) sender;
        if (player.hasPermission("achiev.admin")) {
                if (args.length == 1) {
                    List< String > complete = new ArrayList<>();
                    complete.add("set");
                    complete.add("add");
                    complete.add("reset");
                    return complete;
                }else if (args.length == 2) {
                    return null;
                }  else if (args.length == 3) {
                    List< String > complete = new ArrayList<>();
                    if (args[0].equals("reset")) return new ArrayList<>();
                    complete.add("Block");
                    complete.add("BlockBreake");
                    return complete;
                } else if (args.length == 4) {
                    if (args[0].equals("reset")) return new ArrayList<>();
                    return Collections.singletonList("<Value>");
                }
        }
        return new ArrayList<>();
    }

}