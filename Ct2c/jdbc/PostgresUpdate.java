package org.tnsif.acc.c2tc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PostgresUpdate {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "aman";

        String update = "UPDATE student SET age = 23 WHERE name = 'Aman'";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(update);
            System.out.println("Record updated successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
