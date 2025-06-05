package jm.task.core.jdbc.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/kata1";
    private static final String USER = "root"; //
    private static final String PASSWORD = "root";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("ошибка");
            e.printStackTrace();
            return null;
        }

    }

}