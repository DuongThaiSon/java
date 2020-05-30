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
public class HoaDonChiTiet {
    private String iDHoaDon;
    private String iDVe;
    private int soLuongMua;
    private double donGia;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(String iDHoaDon, String iDVe, int soLuongMua, double donGia) {
        this.iDHoaDon = iDHoaDon;
        this.iDVe = iDVe;
        this.soLuongMua = soLuongMua;
        this.donGia = donGia;
    }

    public String getiDHoaDon() {
        return iDHoaDon;
    }

    public void setiDHoaDon(String iDHoaDon) {
        this.iDHoaDon = iDHoaDon;
    }

    public String getiDVe() {
        return iDVe;
    }

    public void setiDVe(String iDVe) {
        this.iDVe = iDVe;
    }

    public int getSoLuongMua() {
        return soLuongMua;
    }

    public void setSoLuongMua(int soLuongMua) {
        this.soLuongMua = soLuongMua;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    @Override
    public String toString() {
        return iDHoaDon;
    }
}
