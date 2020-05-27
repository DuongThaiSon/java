/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Entity.HoaDon;
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
public class DAOHoaDon {
    DBConnection dbCon;
    Connection con;
    public DAOHoaDon(DBConnection dbcon)
    {
        this.dbCon=dbcon;
        con = dbcon.getConnection();
    }
    public ArrayList<HoaDon> getHoaDon()
    {
        ArrayList<HoaDon> listHD = new ArrayList<>();
        String sql = " select * from HoaDon";
        try {
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery(sql);
            while(rs.next())
            {
                HoaDon hd = new HoaDon(rs.getString(1), rs.getString(2), rs.getDouble(3));
                listHD.add(hd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listHD;
    }
    
    public boolean Them(HoaDon x)
    {
        int n = 0;
        String sql = "Insert into HoaDon values(?,?,?)";
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, x.getiDTK());
            pre.setString(2, x.getiDHoaDon());
            pre.setDouble(3, x.getTongTien());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n > 0;
    }
}
