package com.db;

import java.sql.*;

public class updateDB {

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

void updateDB (String passw, String user) {
    String SQLUpdate = "update admins set password = ? where user_name = ?";
          try (Connection con = this.Connect(); PreparedStatement pstmt = con.prepareStatement(SQLUpdate)) {
              pstmt.setString(2, user);
              pstmt.setString(1, passw);
              pstmt.executeUpdate();
              System.out.println("Updated");
          }
          catch (SQLException ex) {
              System.out.println(ex.getMessage());
          }
}
}
