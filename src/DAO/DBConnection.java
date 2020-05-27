/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Chang
 */
public class DBConnection {

    Connection con = null;

    public Connection getConnection() {
        return con;
    }

    public DBConnection(String URL, String userName, String password) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try {
                con = DriverManager.getConnection(URL, userName, password);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public DBConnection() {
        this("jdbc:sqlserver://DESKTOP-GRNS6LI\\SQLEXPRESS:1433;databaseName=QLRPhim", "sa", "123456");
    }
}
