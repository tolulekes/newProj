package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertDB {

    public Connection Connect(){
        Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:info.db");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    void insertDB(String user_nem, String passw){
        String SQLAdd = "insert into admins(user_name, password) values (?, ?)";

        try(Connection conn = this.Connect(); PreparedStatement pstmt = conn.prepareStatement(SQLAdd)){
            pstmt.setString(1, user_nem);
            pstmt.setString(2, passw);
            pstmt.executeUpdate();
        }
        catch (Exception ex){
            System.out.println("Cannot Connect" + ex.getMessage());
            System.exit(0);
        }

    }
}
