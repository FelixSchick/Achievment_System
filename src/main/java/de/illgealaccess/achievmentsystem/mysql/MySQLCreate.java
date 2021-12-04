package de.illgealaccess.achievmentsystem.mysql;

import de.illgealaccess.achievmentsystem.AchievmentSystem;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;

import java.sql.*;

public class MySQLCreate {
    private static FileConfiguration mysql = AchievmentSystem.mysql;

    private static String HOST = mysql.getString("host");
    private static String DATABASE = mysql.getString("database");
    private static String USER = mysql.getString("user");
    private static String PASSWORD = mysql.getString("password");

    private static Connection con;

    @SuppressWarnings("static-access")
    public MySQLCreate(String host, String database, String user, String password) {
        this.HOST = host;
        this.DATABASE = database;
        this.USER = user;
        this.PASSWORD = password;

        connect();
    }

    public static void connect() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + HOST + ":3306/" + DATABASE + "?autoReconnect=true", USER, PASSWORD);
            Bukkit.getConsoleSender().sendMessage("§7ZinseSys: §aMySQL wurde verbunden...");
        } catch (SQLException e) {
            System.out.println("[MySQL] Die Verbindung zur MySQL ist fehlgeschlagen! Fehler: " + e.getMessage());
        }
    }

    public static void close() {
        try {
            if(con != null) {
                con.close();
                System.out.println("[MySQL] Die Verbindung zur MySQL wurde Erfolgreich beendet!");
            }
        } catch (SQLException e) {
            System.out.println("[MySQL] Fehler beim beenden der Verbindung zur MySQL! Fehler: " + e.getMessage());
        }
    }

    public static void update(String qry) {
        try {
            Statement st = con.createStatement();
            st.executeUpdate(qry);
            st.close();
        } catch (SQLException e) {
            connect();
            System.err.println(e);
        }
    }

    public static ResultSet query(String qry) {
        ResultSet rs = null;

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(qry);
        } catch (SQLException e) {
            connect();
            System.err.println(e.getErrorCode());
        }
        return rs;
    }

    public static void createsTable() {
        try {
            Statement statement = con.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS achievment (uuid TEXT, block INT, blockbreake INT)");
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


}
