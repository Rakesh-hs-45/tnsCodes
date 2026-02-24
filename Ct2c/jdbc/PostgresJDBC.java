package org.tnsif.acc.c2tc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class PostgresJDBC {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "aman";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {

            if (conn != null) {
                System.out.println("Connected to PostgreSQL successfully!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
