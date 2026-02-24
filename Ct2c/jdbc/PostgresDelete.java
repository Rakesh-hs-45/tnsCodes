package org.tnsif.acc.c2tc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PostgresDelete {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "aman";

        String delete = "DELETE FROM student WHERE name = 'Aman'";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(delete);
            System.out.println("Record deleted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
