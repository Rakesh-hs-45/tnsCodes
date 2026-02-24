package org.tnsif.acc.c2tc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PostgresInsert {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "aman";

        String insert = "INSERT INTO student(name, age) VALUES('Aman', 22)";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(insert);
            System.out.println("Record inserted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
