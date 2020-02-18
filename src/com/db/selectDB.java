package com.db;

import java.sql.*;

public class selectDB {

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

    void readDataDB(){
        String SQLRead = "select id, user_name, password FROM admins";
        try (Connection con = this.Connect(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(SQLRead)){
            System.out.println("Id\tUser\tPassword");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t"
                        + rs.getString("user_name") + "\t" + rs.getString("password"));
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
