package de.karottenboy33.achievmentsystem;

import de.karottenboy33.achievmentsystem.commands.Achievment;
import de.karottenboy33.achievmentsystem.commands.AdminAchievmentCommand;
import de.karottenboy33.achievmentsystem.listeners.ClickHandelEvent;
import de.karottenboy33.achievmentsystem.listeners.PlayerJoinEvent;
import de.karottenboy33.achievmentsystem.mysql.MySQL;
import de.karottenboy33.achievmentsystem.mysql.MySQLCreate;
import org.bukkit.Bukkit;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public final class AchievmentSystem extends JavaPlugin {

    public static File mysqlf;
    public static FileConfiguration mysql;
    public static Plugin plugin;


    @Override
    public void onEnable() {
        plugin = this;
        createFiles();
        MySQLCreate.connect();
        MySQLCreate.createsTable();
        getCommand("AdminAchievment").setExecutor(new AdminAchievmentCommand());
        getCommand("Achievment").setExecutor(new Achievment());
        Bukkit.getPluginManager().registerEvents(new ClickHandelEvent(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerJoinEvent(), this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    private void createFiles() {
        mysqlf = new File(getDataFolder(), "mysql.yml");
        if (!mysqlf.exists()) {
            mysqlf.getParentFile().mkdirs();
            saveResource("mysql.yml", false);
        }
        mysql = new YamlConfiguration();
        try {
            mysql.load(mysqlf);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }
}
