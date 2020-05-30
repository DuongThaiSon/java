/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Entity.Ve;
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
public class DAOVe {
    DBConnection dbCon;
    Connection con;
    public DAOVe()
    {
        this.dbCon= new DBConnection();
        con = dbCon.getConnection();
    }
    public ArrayList<Ve> getVe()
    {
        ArrayList<Ve> listVe = new ArrayList<>();
        String sql = " select * from Ve";
        try {
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery(sql);
            while(rs.next())
            {
                Ve ve = new Ve(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                listVe.add(ve);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOVe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listVe;
  
    }
    
    public ArrayList<Ve> getIDVe()
    {
        ArrayList<Ve> listVe = new ArrayList<>();
        String sql = " select IDVe from Ve";
        try {
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery(sql);
            while(rs.next())
            {
                Ve v = new Ve();
                v.setiDVe(rs.getString("iDVe"));
                listVe.add(v);
            }
            System.out.println(listVe);
        } catch (SQLException ex) {
            Logger.getLogger(DAOLichChieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listVe;
    }
    
    public boolean Them(Ve x)
    {
        int n = 0;
        String sql = "insert into Ve values(?,?,?,?,?,?)";
        try {
            PreparedStatement pre = con.prepareStatement(sql);

            pre.setString(1, x.getiDPhim());
            pre.setString(2, x.getiDLichChieu());
            pre.setString(3, x.getiDVe());
            pre.setString(4, x.getViTri());
            pre.setString(5, x.getNgayChieu());
            pre.setString(6, x.getGioChieu());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOVe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n > 0;
    }
    
    public boolean Sua(Ve x)
    {
        int n = 0;
        String sql = "update Ve set IDPhim = ?, IDLichChieu = ?, ViTri = ?, NgayChieu = ?, GioChieu = ? where IDVe = ?";
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, x.getiDPhim());
            pre.setString(2, x.getiDLichChieu());
            pre.setString(3, x.getViTri());
            pre.setString(4, x.getNgayChieu());
            pre.setString(5, x.getGioChieu());
            pre.setString(6, x.getiDVe());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOVe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n > 0;
    }
    
    public boolean Xoa(String idVe)
    {
        int n = 0;
        String sql = "Delete from Ve where IDVe = ?";
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, idVe);
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOVe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n > 0;
    }
}
