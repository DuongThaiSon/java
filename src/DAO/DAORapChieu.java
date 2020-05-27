/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.RapChieu;
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
public class DAORapChieu {
    DBConnection dbCon;
    Connection con;
    public DAORapChieu()
    {
        this.dbCon= new DBConnection();
        con = dbCon.getConnection();
    }
    public ArrayList<RapChieu> getRapChieu()
    {
        ArrayList<RapChieu> listRC = new ArrayList<>();
        String sql = " select * from RapChieu";
        try {
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery(sql);
            while(rs.next())
            {
                RapChieu rc = new RapChieu();
                rc.setIDCumRap(rs.getString("IDCumRap"));
                rc.setTenRap(rs.getString("TenRap"));
                rc.setDiaChiRap(rs.getString("DiaChiRap"));
                rc.setSoPhong(rs.getInt("SoPhong"));
                rc.setSoGhe(rs.getInt("SoGhe"));
                rc.setFacebook(rs.getString("Facebook"));
                listRC.add(rc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAORapChieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listRC;
    }
    
    public ArrayList<RapChieu> getIDRapChieu()
    {
        ArrayList<RapChieu> listRC = new ArrayList<>();
        String sql = " select * from RapChieu";
        try {
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery(sql);
            while(rs.next())
            {
                RapChieu rc = new RapChieu();
                rc.setIDCumRap(rs.getString("IDCumRap"));
                listRC.add(rc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAORapChieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listRC;
    }
    
    public boolean Sua(RapChieu x)
    {
        int n = 0;
        String sql = "Update RapChieu set TenRap = ?, DiaChiRap = ?, SoPhong = ?, SoGhe = ?, Facebook = ? Where IDCumRap = ?";
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, x.getTenRap());
            pre.setString(2, x.getDiaChiRap());
            pre.setInt(3, x.getSoPhong());
            pre.setInt(4, x.getSoGhe());
            pre.setString(5, x.getFacebook());
            pre.setString(6, x.getIDCumRap());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAORapChieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n > 0;
    }
    
    public boolean Them(RapChieu x)
    {
        int n = 0;
        String sql = "insert into RapChieu values (?,?,?,?,?,?)";
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, x.getIDCumRap());
            pre.setString(2, x.getTenRap());
            pre.setString(3, x.getDiaChiRap());
            pre.setInt(4, x.getSoPhong());
            pre.setInt(5, x.getSoGhe());
            pre.setString(6, x.getFacebook());
            n = pre.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(DAORapChieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n>0;
    }
    
    public boolean Xoa(String IDCRap)
    {
        int n = 0;
        String sql = "delete from RapChieu where IDCumRap = ?";
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, IDCRap);
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAORapChieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n>0;
    }
}
