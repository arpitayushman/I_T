package com.arpit;
import java.sql.*;

import oracle.jdbc.OracleDriver;
import oracle.jdbc.OracleDriver;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDemo {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        try {

//            OracleDriver driver = new OracleDriver();
//            DriverManager.registerDriver(driver);
//            Connection conn = DriverManager.getConnection(url,"arpit","oracle");
//            System.out.println("Connection Successful");
            Connection conn = JdbcFactory.getConnection();
            System.out.println("Connection Successful");
            DatabaseMetaData meta = conn.getMetaData();
            System.out.println("DB name: " +meta.getDatabaseProductName());
            System.out.println("DB version : " +meta.getDatabaseProductVersion());
            System.out.println("Driver Name : " +meta.getDriverName());
            System.out.println("Driver Version : " +meta.getDriverVersion());;

        }catch (SQLException e){
            System.out.println("Connection Failled");
            e.printStackTrace();
        }
    }
}
