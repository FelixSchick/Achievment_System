package de.illegalaccess.achievmentsystem.listeners;

import de.illegalaccess.achievmentsystem.utils.AchievBlockGUI;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ClickHandelEvent implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();
        if (event.getView().getTitle().equals("§7» §9Achievments")){
            event.setCancelled(true);
            if (event.getSlot() == 13 && event.getCurrentItem().getType() == Material.GRASS_BLOCK){
                AchievBlockGUI.createMainInventory(player);
                player.openInventory(AchievBlockGUI.inventory);
            }
        }
        if (event.getView().getTitle().equals("§7» §9Achievments §7Block Achievment")){
            event.setCancelled(true);
        }
    }
}
