package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class removeDB {

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

    void deleteDB (int del){
        String SQLDel = "delete from admins where id = ?";
        try(Connection conn = this.Connect(); PreparedStatement pstmt = conn.prepareStatement(SQLDel)){
            pstmt.setInt(1, del);
            pstmt.executeUpdate();
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }

    }
}
