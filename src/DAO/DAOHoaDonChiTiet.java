package DAO;

import Entity.HoaDonChiTiet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOHoaDonChiTiet {

    private DBConnection dbCon;
    private Connection con;

    public DAOHoaDonChiTiet() {
        dbCon = new DBConnection();
        con = dbCon.getConnection();
    }

    public boolean Them(HoaDonChiTiet x) {
        int n = 0;
        String sql = "Insert into HoaDonChiTiet values(?,?,?,?)";
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, x.getiDHoaDon());
            pre.setString(2, x.getiDVe());
            pre.setInt(3, x.getSoLuongMua());
            pre.setDouble(4, x.getDonGia());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOHoaDonChiTiet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n > 0;
    }
}
