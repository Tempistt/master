package com.revature.clothing_store.Connections;


import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnections {

    private static Connection connection = null;

    private static final Properties prop = new Properties();

    static {
        try {
            Class.forName("org.postgresql.Driver");
            prop.load(new FileReader("src/main/resources/db.properties"));
            connection = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"), prop.getProperty("password"));
        } catch (ClassNotFoundException | SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }


    }

