package de.illgealaccess.achievmentsystem.utils;

import de.illgealaccess.achievmentsystem.mysql.AchievmentManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class AchievBlockGUI {
    public static Inventory inventory;

    public static void createMainInventory(Player player) {
        inventory = Bukkit.createInventory(player, 6 * 9, "§7» §9Achievments §7Block Achievment");

        inventory.setItem(13, new itemBuilder(Material.GRASS_BLOCK).displayname("§7» §9Block Achievment").build());
        if (AchievmentManager.getBlockAchiev(player.getUniqueId()) == 0){
            if (AchievmentManager.getBlockBreake(player.getUniqueId()) >= 10){
                inventory.setItem(29, new itemBuilder(Material.LIME_STAINED_GLASS_PANE).displayname("§7» §9Du hast 10 Abgebaute Blöcke ereicht").build());
            } else {
                inventory.setItem(29, new itemBuilder(Material.BLACK_STAINED_GLASS_PANE).displayname("§7» §9Du Brauchst 10 Abgebaute Blöcke").build());
            }
            if (AchievmentManager.getBlockBreake(player.getUniqueId()) >= 50){
                inventory.setItem(30, new itemBuilder(Material.LIME_STAINED_GLASS_PANE).displayname("§7» §9Du hast 50 Abgebaute Blöcke ereicht").build());
            } else {
                inventory.setItem(30, new itemBuilder(Material.BLACK_STAINED_GLASS_PANE).displayname("§7» §9Du Brauchst 50 Abgebaute Blöcke").build());
            }
            if (AchievmentManager.getBlockBreake(player.getUniqueId()) >= 100){
                inventory.setItem(31, new itemBuilder(Material.LIME_STAINED_GLASS_PANE).displayname("§7» §9Du hast 100 Abgebaute Blöcke ereicht").build());
            } else {
                inventory.setItem(31, new itemBuilder(Material.BLACK_STAINED_GLASS_PANE).displayname("§7» §9Du Brauchst 100 Abgebaute Blöcke").build());
            }
            if (AchievmentManager.getBlockBreake(player.getUniqueId()) >= 250){
                inventory.setItem(32, new itemBuilder(Material.LIME_STAINED_GLASS_PANE).displayname("§7» §9Du hast 250 Abgebaute Blöcke ereicht").build());
            } else {
                inventory.setItem(32, new itemBuilder(Material.BLACK_STAINED_GLASS_PANE).displayname("§7» §9Du Brauchst 250 Abgebaute Blöcke").build());
            }
            if (AchievmentManager.getBlockBreake(player.getUniqueId()) >= 500){
                inventory.setItem(33, new itemBuilder(Material.LIME_STAINED_GLASS_PANE).displayname("§7» §9Du hast 500 Abgebaute Blöcke ereicht").build());
            } else {
                inventory.setItem(33, new itemBuilder(Material.BLACK_STAINED_GLASS_PANE).displayname("§7» §9Du Brauchst 500 Abgebaute Blöcke").build());
            }
        }
        if (AchievmentManager.getBlockAchiev(player.getUniqueId()) == 1){
            if (AchievmentManager.getBlockBreake(player.getUniqueId()) >= 1000){
                inventory.setItem(29, new itemBuilder(Material.LIME_STAINED_GLASS_PANE).displayname("§7» §9Du hast 1000 Abgebaute Blöcke ereicht").build());
            } else {
                inventory.setItem(29, new itemBuilder(Material.BLACK_STAINED_GLASS_PANE).displayname("§7» §9Du Brauchst 1000 Abgebaute Blöcke").build());
            }
            if (AchievmentManager.getBlockBreake(player.getUniqueId()) >= 2000){
                inventory.setItem(30, new itemBuilder(Material.LIME_STAINED_GLASS_PANE).displayname("§7» §9Du hast 2000 Abgebaute Blöcke ereicht").build());
            } else {
                inventory.setItem(30, new itemBuilder(Material.BLACK_STAINED_GLASS_PANE).displayname("§7» §9Du Brauchst 2000 Abgebaute Blöcke").build());
            }
            if (AchievmentManager.getBlockBreake(player.getUniqueId()) >= 3000){
                inventory.setItem(31, new itemBuilder(Material.LIME_STAINED_GLASS_PANE).displayname("§7» §9Du hast 3000 Abgebaute Blöcke ereicht").build());
            } else {
                inventory.setItem(31, new itemBuilder(Material.BLACK_STAINED_GLASS_PANE).displayname("§7» §9Du Brauchst 3000 Abgebaute Blöcke").build());
            }
            if (AchievmentManager.getBlockBreake(player.getUniqueId()) >= 4000){
                inventory.setItem(32, new itemBuilder(Material.LIME_STAINED_GLASS_PANE).displayname("§7» §9Du hast 4000 Abgebaute Blöcke ereicht").build());
            } else {
                inventory.setItem(32, new itemBuilder(Material.BLACK_STAINED_GLASS_PANE).displayname("§7» §9Du Brauchst 4000 Abgebaute Blöcke").build());
            }
            if (AchievmentManager.getBlockBreake(player.getUniqueId()) >= 5000){
                inventory.setItem(33, new itemBuilder(Material.LIME_STAINED_GLASS_PANE).displayname("§7» §9Du hast 5000 Abgebaute Blöcke ereicht").build());
            } else {
                inventory.setItem(33, new itemBuilder(Material.BLACK_STAINED_GLASS_PANE).displayname("§7» §9Du Brauchst 5000 Abgebaute Blöcke").build());
            }
        }
        if (AchievmentManager.getBlockAchiev(player.getUniqueId()) == 2){
            if (AchievmentManager.getBlockBreake(player.getUniqueId()) >= 15000){
                inventory.setItem(29, new itemBuilder(Material.LIME_STAINED_GLASS_PANE).displayname("§7» §9Du hast 15000 Abgebaute Blöcke ereicht").build());
            } else {
                inventory.setItem(29, new itemBuilder(Material.BLACK_STAINED_GLASS_PANE).displayname("§7» §9Du Brauchst 15000 Abgebaute Blöcke").build());
            }
            if (AchievmentManager.getBlockBreake(player.getUniqueId()) >= 20000){
                inventory.setItem(30, new itemBuilder(Material.LIME_STAINED_GLASS_PANE).displayname("§7» §9Du hast 20000 Abgebaute Blöcke ereicht").build());
            } else {
                inventory.setItem(30, new itemBuilder(Material.BLACK_STAINED_GLASS_PANE).displayname("§7» §9Du Brauchst 20000 Abgebaute Blöcke").build());
            }
            if (AchievmentManager.getBlockBreake(player.getUniqueId()) >= 25000){
                inventory.setItem(31, new itemBuilder(Material.LIME_STAINED_GLASS_PANE).displayname("§7» §9Du hast 25000 Abgebaute Blöcke ereicht").build());
            } else {
                inventory.setItem(31, new itemBuilder(Material.BLACK_STAINED_GLASS_PANE).displayname("§7» §9Du Brauchst 25000 Abgebaute Blöcke").build());
            }
            if (AchievmentManager.getBlockBreake(player.getUniqueId()) >= 30000){
                inventory.setItem(32, new itemBuilder(Material.LIME_STAINED_GLASS_PANE).displayname("§7» §9Du hast 30000 Abgebaute Blöcke ereicht").build());
            } else {
                inventory.setItem(32, new itemBuilder(Material.BLACK_STAINED_GLASS_PANE).displayname("§7» §9Du Brauchst 30000 Abgebaute Blöcke").build());
            }
            if (AchievmentManager.getBlockBreake(player.getUniqueId()) >= 35000){
                inventory.setItem(33, new itemBuilder(Material.LIME_STAINED_GLASS_PANE).displayname("§7» §9Du hast 35000 Abgebaute Blöcke ereicht").build());
            } else {
                inventory.setItem(33, new itemBuilder(Material.BLACK_STAINED_GLASS_PANE).displayname("§7» §9Du Brauchst 35000 Abgebaute Blöcke").build());
            }
        }
        if (AchievmentManager.getBlockAchiev(player.getUniqueId()) == 3){
            inventory.setItem(29, new itemBuilder(Material.BARRIER).displayname("§7» §9Du hast level 3 bereits ereicht.").build());
            inventory.setItem(30, new itemBuilder(Material.BARRIER).displayname("§7» §9Du hast level 3 bereits ereicht.").build());
            inventory.setItem(31, new itemBuilder(Material.BARRIER).displayname("§7» §9Du hast level 3 bereits ereicht.").build());
            inventory.setItem(32, new itemBuilder(Material.BARRIER).displayname("§7» §9Du hast level 3 bereits ereicht.").build());
            inventory.setItem(33, new itemBuilder(Material.BARRIER).displayname("§7» §9Du hast level 3 bereits ereicht.").build());
        }


        ItemStack grey = new itemBuilder(Material.BLACK_STAINED_GLASS_PANE, "§8").build();
        ItemStack cyan = new itemBuilder(Material.CYAN_STAINED_GLASS_PANE, "§8").build();
        ItemStack blue = new itemBuilder(Material.LIGHT_BLUE_STAINED_GLASS_PANE, "§8").build();
        inventory.setItem(10, blue );
        inventory.setItem(11, blue);
        inventory.setItem(19, blue);
        inventory.setItem(20, blue);
        inventory.setItem(12, blue);
        inventory.setItem(14, blue);
        inventory.setItem(21, blue);
        inventory.setItem(22, blue);
        inventory.setItem(23, blue);

        inventory.setItem(39, blue);
        inventory.setItem(40, blue);
        inventory.setItem(41, blue);

        inventory.setItem(15, blue);
        inventory.setItem(16, blue);
        inventory.setItem(24, blue);
        inventory.setItem(25, blue);

        inventory.setItem(28, blue);
        //inventory.setItem(29, blue);
        inventory.setItem(37, blue);
        inventory.setItem(38, blue);


        //inventory.setItem(33, blue);
        inventory.setItem(34, blue);
        inventory.setItem(42, blue);
        inventory.setItem(43, blue);


        inventory.setItem(0, cyan);
        inventory.setItem(1, cyan);
        inventory.setItem(2, grey);
        inventory.setItem(3, grey);
        inventory.setItem(4, cyan);
        inventory.setItem(5, grey);
        inventory.setItem(6, grey);
        inventory.setItem(7, cyan);
        inventory.setItem(8, cyan);
        inventory.setItem(9, cyan);
        inventory.setItem(17, cyan);
        inventory.setItem(18, grey);
        inventory.setItem(26, grey);
        inventory.setItem(27, grey);
        inventory.setItem(35, grey);
        inventory.setItem(36, cyan);
        inventory.setItem(44, cyan);
        inventory.setItem(45, cyan);
        inventory.setItem(46, cyan);
        inventory.setItem(47, grey);
        inventory.setItem(48, grey);
        inventory.setItem(49, cyan);
        inventory.setItem(52, cyan);
        inventory.setItem(53, cyan);
        inventory.setItem(51, grey);
        inventory.setItem(50, grey);
    }


} 