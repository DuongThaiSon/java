/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.TaiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chang
 */
public class DAOTaiKhoan {
    DBConnection dbCon;
    Connection con;
    public DAOTaiKhoan(DBConnection dbcon)
    {
        this.dbCon=dbcon;
        con = dbcon.getConnection();
    }
    
    DBConnection dBConnection=new DBConnection(); 
    private final String SQL_GET_TaiKhoan = "SELECT * FROM TaiKhoan WHERE IDTK=? AND MatKhau=?";
    public TaiKhoan getAccount(String user,String pass) {
        TaiKhoan acc = new TaiKhoan();
        try (PreparedStatement sql = dBConnection.con.prepareStatement(SQL_GET_TaiKhoan)) {
            sql.setString(1, user);
            sql.setString(2, pass);
            try (ResultSet rs = sql.executeQuery()) {
                while (rs.next()) {
                    acc.setIDTK(rs.getString(1));
                    acc.setMatKhau(rs.getString(2));   
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return acc;
    }
    
    public ArrayList<TaiKhoan> getTaiKhoan()
    {
        ArrayList<TaiKhoan> listTK = new ArrayList<>();
        String sql = " select * from TaiKhoan";
        try {
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery(sql);
            while(rs.next())
            {
                TaiKhoan tk = new TaiKhoan();
                tk.setIDTK(rs.getString("IDTK"));
                tk.setMatKhau(rs.getString("MatKhau"));
                tk.setHoTen(rs.getString("HoTen"));
                listTK.add(tk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOTaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listTK;
    }
}
