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
public class HoaDon {

    private String iDTK;
    private String iDHoaDon;
    private double tongTien;
    
    public HoaDon(){};

    public HoaDon(String iDTK, String iDHoaDon, double tongTien) {
        this.iDTK = iDTK;
        this.iDHoaDon = iDHoaDon;
        this.tongTien = tongTien;
    }

    public String getiDTK() {
        return iDTK;
    }

    public void setiDTK(String iDTK) {
        this.iDTK = iDTK;
    }

    public String getiDHoaDon() {
        return iDHoaDon;
    }

    public void setiDHoaDon(String iDHoaDon) {
        this.iDHoaDon = iDHoaDon;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return iDHoaDon;
    }

    
   
}
