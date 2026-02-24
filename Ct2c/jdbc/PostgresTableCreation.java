package org.tnsif.acc.c2tc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PostgresTableCreation {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "aman";

        String createTable = "CREATE TABLE IF NOT EXISTS student ("
                + "id SERIAL PRIMARY KEY, "
                + "name VARCHAR(100), "
                + "age INT)";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(createTable);
            System.out.println("Table created successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
