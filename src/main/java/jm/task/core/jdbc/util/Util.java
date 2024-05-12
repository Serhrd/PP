package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Util {
    public static Statement getConnect(){
        final String URL = "jdbc:mysql://localhost:3306/my_db";
        final String USERNAME = "root";
        final String PASSWORD = "root";


        Connection connection ;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            return connection.createStatement();
        } catch (Exception e) {
            System.out.println("there is no connection... Exception!");

        }
        return null;
    }
}
