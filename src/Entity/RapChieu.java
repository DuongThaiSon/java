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
public class RapChieu {

    private String IDCumRap;
    private String TenRap;
    private String DiaChiRap;
    private int SoPhong;
    private int SoGhe;
    private String Facebook;

    public RapChieu() {
    }

    public RapChieu(String IDCumRap, String TenRap, String DiaChiRap, int SoPhong, int SoGhe, String Facebook) {
        this.IDCumRap = IDCumRap;
        this.TenRap = TenRap;
        this.DiaChiRap = DiaChiRap;
        this.SoPhong = SoPhong;
        this.SoGhe = SoGhe;
        this.Facebook = Facebook;
    }

    public String getIDCumRap() {
        return IDCumRap;
    }

    public void setIDCumRap(String IDCumRap) {
        this.IDCumRap = IDCumRap;
    }

    public String getTenRap() {
        return TenRap;
    }

    public void setTenRap(String TenRap) {
        this.TenRap = TenRap;
    }

    public String getDiaChiRap() {
        return DiaChiRap;
    }

    public void setDiaChiRap(String DiaChiRap) {
        this.DiaChiRap = DiaChiRap;
    }

    public int getSoPhong() {
        return SoPhong;
    }

    public void setSoPhong(int SoPhong) {
        this.SoPhong = SoPhong;
    }

    public int getSoGhe() {
        return SoGhe;
    }

    public void setSoGhe(int SoGhe) {
        this.SoGhe = SoGhe;
    }

    public String getFacebook() {
        return Facebook;
    }

    public void setFacebook(String Facebook) {
        this.Facebook = Facebook;
    }

    @Override
    public String toString() {
//        return "RapChieu{" + "IDCumRap=" + IDCumRap + ", TenRap=" + TenRap + ", "
//                + "DiaChiRap=" + DiaChiRap + ", SoPhong=" + SoPhong + ", SoGhe=" + SoGhe + ", Facebook=" + Facebook + '}';
        return IDCumRap;
    }

}
