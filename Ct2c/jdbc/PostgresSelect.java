package org.tnsif.acc.c2tc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgresSelect {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "aman";

        String select = "SELECT * FROM student";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(select)) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " "
                                + rs.getString("name") + " "
                                + rs.getInt("age"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
