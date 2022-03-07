package com.arpit;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {
    public static void main(String[] args) {
        try {
            String sql = "insert into citizen values (105, 'Jack', 24, 'Delhi')";
            Connection conn = JdbcFactory.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Record Inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
