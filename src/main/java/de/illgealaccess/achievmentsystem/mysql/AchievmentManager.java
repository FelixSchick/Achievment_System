package de.illgealaccess.achievmentsystem.mysql;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.UUID;

public class AchievmentManager {
    public static boolean userPlayedBefore(UUID uuid) {
        ResultSet set = MySQL.getInstance().executeQuery("SELECT * FROM `achievment` WHERE `uuid` = ?", new HashMap<Integer, String>(){
            {
                put(1, String.valueOf(uuid));
            }
        });
        try {
            if(set.next()) {
                return true;
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public static void createUser(UUID uuid) {
        if(!userPlayedBefore(uuid)) {
            ResultSet set = MySQL.getInstance().executeQuery("INSERT INTO `achievment` (`uuid`, `block`, `blockbreake`) VALUES (?,?,?)", new HashMap<Integer, String>(){
                {
                    put(1, String.valueOf(uuid));
                    put(2, String.valueOf(0));
                    put(3, String.valueOf(0));
                }
            });
        }
    }

    public static int getBlockAchiev(UUID uuid){
        ResultSet set = MySQL.getInstance().executeQuery("SELECT * FROM `achievment` WHERE uuid=?", new HashMap<Integer, String>(){
            {
                put(1, uuid.toString());
            }
        });
        try {
            while (set.next()){
                return set.getInt("block");
            }
            return 0;
        } catch (SQLException e){
            e.getErrorCode();
            return 0;
        }
    }

    public static int getBlockBreake(UUID uuid){
        ResultSet set = MySQL.getInstance().executeQuery("SELECT * FROM `achievment` WHERE uuid=?", new HashMap<Integer, String>(){
            {
                put(1, uuid.toString());
            }
        });
        try {
            while (set.next()){
                return set.getInt("blockbreake");
            }
            return 0;
        } catch (SQLException e){
            e.getErrorCode();
            return 0;
        }
    }

    public static void setBlockAchiev(Player player, UUID uuid, int amount){
        if (amount >= 0){
            ResultSet set = MySQL.getInstance().executeQuery("UPDATE `achievment` SET `block`=? WHERE uuid=?", new HashMap<Integer, String>(){
                {
                    if (amount <= 3){
                        put(1, String.valueOf(amount));
                        put(2, uuid.toString());
                    }

                }
            });
            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent("§bDu hast das Achievment §2Block Breaking §blevel §2" + (amount)+ " §bFreigeschaltet."));
        }
    }
    public static void setBlockBreake(UUID uuid, int amount){
        if (amount >= 0){
            ResultSet set = MySQL.getInstance().executeQuery("UPDATE `achievment` SET `blockbreake`=? WHERE uuid=?", new HashMap<Integer, String>(){
                {
                    put(1, String.valueOf(amount));
                    put(2, uuid.toString());
                }
            });
        }
    }

    public static void addBlockAchiev(Player player, UUID uuid, int amount){
        int have = getBlockAchiev(uuid);
        if (have + amount <= 3){
            ResultSet set = MySQL.getInstance().executeQuery("UPDATE `achievment` SET `block`=? WHERE uuid=?", new HashMap<Integer, String>(){
                {
                    put(1, String.valueOf(have + amount));
                    put(2, uuid.toString());
                }
            });
            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent("§bDu hast das Achievment §2Block Breaking §blevel §2" + (have + amount)+ " §bFreigeschaltet."));
        }
    }

    public static void addBlockBreak(UUID uuid, int amount){
        int have = getBlockBreake(uuid);
        Player player = Bukkit.getPlayer(uuid);
            ResultSet set = MySQL.getInstance().executeQuery("UPDATE `achievment` SET `blockbreake`=? WHERE uuid=?", new HashMap<Integer, String>(){
                {
                    put(1, String.valueOf(have + amount));
                    put(2, uuid.toString());
                }});
        if (getBlockBreake(uuid) >= 500 && getBlockAchiev(uuid) == 0)  {
            setBlockAchiev(player, uuid, 1);
        }
        if (getBlockBreake(uuid) >= 5000 && getBlockAchiev(uuid) == 1)  {
            setBlockAchiev(player, uuid, 2);
        }
        if (getBlockBreake(uuid) >= 35000 && getBlockAchiev(uuid) == 2)  {
            setBlockAchiev(player, uuid, 3);
        }

    }
}
