/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Chang
 */
public class Phim {

    private String IDCumRap;
    private String IDPhim;
    private String TenPhim;
    private String TheLoai;
    private String DienVien;
    private String DaoDien;
    private String ThoiLuong;
    private String HangPhim;
    private String ThoiGianChieu;

    public Phim() {
    }

    public Phim(String IDCumRap, String IDPhim, String TenPhim, String TheLoai, String DienVien, String DaoDien, String ThoiLuong, String HangPhim, String ThoiGianChieu) {
        this.IDCumRap = IDCumRap;
        this.IDPhim = IDPhim;
        this.TenPhim = TenPhim;
        this.TheLoai = TheLoai;
        this.DienVien = DienVien;
        this.DaoDien = DaoDien;
        this.ThoiLuong = ThoiLuong;
        this.HangPhim = HangPhim;
        this.ThoiGianChieu = ThoiGianChieu;
    }

    public String getIDCumRap() {
        return IDCumRap;
    }

    public void setIDCumRap(String IDCumRap) {
        this.IDCumRap = IDCumRap;
    }

    public String getIDPhim() {
        return IDPhim;
    }

    public void setIDPhim(String IDPhim) {
        this.IDPhim = IDPhim;
    }

    public String getTenPhim() {
        return TenPhim;
    }

    public void setTenPhim(String TenPhim) {
        this.TenPhim = TenPhim;
    }

    public String getTheLoai() {
        return TheLoai;
    }

    public void setTheLoai(String TheLoai) {
        this.TheLoai = TheLoai;
    }

    public String getDienVien() {
        return DienVien;
    }

    public void setDienVien(String DienVien) {
        this.DienVien = DienVien;
    }

    public String getDaoDien() {
        return DaoDien;
    }

    public void setDaoDien(String DaoDien) {
        this.DaoDien = DaoDien;
    }

    public String getThoiLuong() {
        return ThoiLuong;
    }

    public void setThoiLuong(String ThoiLuong) {
        this.ThoiLuong = ThoiLuong;
    }

    public String getHangPhim() {
        return HangPhim;
    }

    public void setHangPhim(String HangPhim) {
        this.HangPhim = HangPhim;
    }

    public String getThoiGianChieu() {
        return ThoiGianChieu;
    }

    public void setThoiGianChieu(String ThoiGianChieu) {
        this.ThoiGianChieu = ThoiGianChieu;
    }

    @Override
    public String toString() {
        return IDPhim;
    }
    
}
