package de.illgealaccess.achievmentsystem.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class AchievGUI {
    public static Inventory inventory;

    public static void createMainInventory(Player player) {
        inventory = Bukkit.createInventory(player, 6 * 9, "§7» §9Achievments");
        inventory.setItem(13, new itemBuilder(Material.GRASS_BLOCK).displayname("§7» §9Block Achievment").build());


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

        inventory.setItem(29, blue);
        inventory.setItem(30, blue);
        inventory.setItem(31, blue);
        inventory.setItem(32, blue);
        inventory.setItem(33, blue);

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