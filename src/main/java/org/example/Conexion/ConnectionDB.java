package org.example.Conexion;

import org.sqlite.SQLiteConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static ConnectionDB connectionDB = null;
    private static String URL_DB = "jdbc:sqlite:Database/tallerDB.db";
    private Connection connection;

    private ConnectionDB() {
        try {
            SQLiteConfig config = new SQLiteConfig();
            config.enforceForeignKeys(true);
            connection = DriverManager.getConnection(URL_DB, config.toProperties());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static ConnectionDB getInstance() {
        if (connectionDB == null)
            connectionDB = new ConnectionDB();
        return connectionDB;
    }

    public Connection getConnection() {
        return connection;
    }

    public static void main(String[] args) {
        ConnectionDB connectionDB = new ConnectionDB();
        Connection connection1 = connectionDB.getConnection();

        Connection connection2 = connectionDB.getConnection();

        Connection connection3 = connectionDB.getConnection();
        System.out.println(connection3);
        System.out.println(connection2);
        System.out.println(connection1);
    }
}
