/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Entity.LichChieu;
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
public class DAOLichChieu {
    DBConnection dbCon;
    Connection conn;
    public DAOLichChieu()
    {
        this.dbCon=new DBConnection();
        conn = dbCon.getConnection();
    }
    public ArrayList<LichChieu> getLichChieu()
    {
        ArrayList<LichChieu> listLC = new ArrayList<>();
        String sql = " select * from LichChieu";
        try {
            Statement state = conn.createStatement();
            ResultSet rs = state.executeQuery(sql);
            while(rs.next())
            {
                LichChieu lc = new LichChieu();
                lc.setIDLichChieu(rs.getString("IDLichChieu"));
                lc.setIDPhim(rs.getString("IDPhim"));
                lc.setGioChieu(rs.getString("GioChieu"));
                lc.setNgayChieu(rs.getString("NgayChieu"));
                listLC.add(lc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOLichChieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listLC;
    }
    
    public ArrayList<LichChieu> getIDLichChieu()
    {
        ArrayList<LichChieu> listLC = new ArrayList<>();
        String sql = " select IDLichChieu from LichChieu";
        try {
            Statement state = conn.createStatement();
            ResultSet rs = state.executeQuery(sql);
            while(rs.next())
            {
                LichChieu lc = new LichChieu();
                lc.setIDLichChieu(rs.getString("IDLichChieu"));
                listLC.add(lc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOLichChieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listLC;
    }
    
    public boolean Them(LichChieu x) {
        int n = 0;
        String sql = "insert into LichChieu values(?,?,?,?)";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, x.getIDLichChieu());
            pre.setString(2, x.getIDPhim());
            pre.setString(3, x.getGioChieu());
            pre.setString(4, x.getNgayChieu());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOLichChieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n > 0;
    }

    public boolean Sua(LichChieu x) {
        int n = 0;
        String sql = "Update LichChieu set IDPhim = ?, GioChieu = ?, NgayChieu = ? where IDLichChieu = ?";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, x.getIDPhim());
            pre.setString(2, x.getGioChieu());
            pre.setString(3, x.getNgayChieu());
            pre.setString(4, x.getIDLichChieu());
            n = pre.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DAOLichChieu.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n > 0;
    }

    public boolean Xoa(String idLichChieu) {
        int n = 0;
        String sql = "delete from LichChieu where IDLichChieu = ?";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, idLichChieu);
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return n > 0;
    }
}
