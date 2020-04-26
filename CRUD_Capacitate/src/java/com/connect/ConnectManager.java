package com.connect;
import java.sql.*;
public class ConnectManager {
    public Connection connect(String schema) throws Exception{
        Connection con;
        Class.forName("com.mysql.jdbc.Driver");
        String URLDB = "jdbc:mysql://localhost:3306/"+schema;
        con = DriverManager.getConnection(URLDB,"root","root");
        return con;
    }
}
