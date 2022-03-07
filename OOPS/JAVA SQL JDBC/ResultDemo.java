package com.arpit;

import java.sql.*;

public class ResultDemo{
    public static void main(String[] args) {
        try {
            String sql = "select * from citizen";
            Connection conn = JdbcFactory.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData meta = rs.getMetaData();
            for(int i = 1;i<=meta.getColumnCount();i++){
                System.out.print(meta.getColumnName(i)+"\t");
            }
            System.out.println();
            while(rs.next()){
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
