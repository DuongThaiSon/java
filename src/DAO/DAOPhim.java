/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Phim;
import com.sun.org.apache.xerces.internal.impl.dtd.models.CMBinOp;
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
public class DAOPhim {

    DBConnection dbCon;
    Connection conn;

    public DAOPhim() {
        dbCon = new DBConnection();
        conn = dbCon.getConnection();
    }

    public ArrayList<Phim> getPhim() {
        ArrayList<Phim> listPh = new ArrayList<>();
        String sql = " select * from Phim";
        try {
            Statement state = conn.createStatement();
            ResultSet rs = state.executeQuery(sql);
            while (rs.next()) {
                Phim ph = new Phim();
                ph.setIDCumRap(rs.getString("IDCumRap"));
                ph.setIDPhim(rs.getString("IDPhim"));
                ph.setTenPhim(rs.getString("TenPhim"));
                ph.setTheLoai(rs.getString("TheLoai"));
                ph.setDienVien(rs.getString("DienVien"));
                ph.setDaoDien(rs.getString("DaoDien"));
                ph.setThoiLuong(rs.getString("ThoiLuong"));
                ph.setHangPhim(rs.getString("HangPhim"));
                ph.setThoiGianChieu(rs.getString("ThoiGianChieu"));
                listPh.add(ph);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPhim.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listPh;
    }

    public boolean Them(Phim x) {
        int n = 0;
        String sql = "insert into Phim values(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);

            pre.setString(1, x.getIDCumRap());
            pre.setString(2, x.getIDPhim());
            pre.setString(3, x.getTenPhim());
            pre.setString(4, x.getTheLoai());
            pre.setString(5, x.getDienVien());
            pre.setString(6, x.getDaoDien());
            pre.setString(7, x.getThoiLuong());
            pre.setString(8, x.getHangPhim());
            pre.setString(9, x.getThoiGianChieu());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOPhim.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n > 0;
    }

    public boolean Sua(Phim x) {
        int n = 0;
        String sql = "Update Phim set IDCumRap = ?, TenPhim = ?, TheLoai = ?, DienVien = ?, DaoDien = ?, ThoiLuong = ?, HangPhim = ?, ThoiGianChieu = ? where IDPhim = ?";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, x.getIDCumRap());
            pre.setString(2, x.getTenPhim());
            pre.setString(3, x.getTheLoai());
            pre.setString(4, x.getDienVien());
            pre.setString(5, x.getDaoDien());
            pre.setString(6, x.getThoiLuong());
            pre.setString(7, x.getHangPhim());
            pre.setString(8, x.getThoiGianChieu());
            pre.setString(9, x.getIDPhim());
            n = pre.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DAOPhim.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n > 0;
    }

    public boolean Xoa(String idPhim) {
        int n = 0;
        String sql = "delete from Phim where IDPhim = ?";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, idPhim);
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return n > 0;
    }
    
  
}
