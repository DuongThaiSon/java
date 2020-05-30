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
public class Ve {

    private String iDPhim;
    private String iDLichChieu;
    private String iDVe;
    private String viTri;
    private String NgayChieu;
    private String GioChieu;

    public Ve() {
    }

    public Ve(String iDPhim, String iDLichChieu, String iDVe, String viTri, String NgayChieu, String GioChieu) {
        this.iDPhim = iDPhim;
        this.iDLichChieu = iDLichChieu;
        this.iDVe = iDVe;
        this.viTri = viTri;
        this.NgayChieu = NgayChieu;
        this.GioChieu = GioChieu;
    }

    public String getiDPhim() {
        return iDPhim;
    }

    public void setiDPhim(String iDPhim) {
        this.iDPhim = iDPhim;
    }

    public String getiDLichChieu() {
        return iDLichChieu;
    }

    public void setiDLichChieu(String iDLichChieu) {
        this.iDLichChieu = iDLichChieu;
    }

    public String getiDVe() {
        return iDVe;
    }

    public void setiDVe(String iDVe) {
        this.iDVe = iDVe;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getNgayChieu() {
        return NgayChieu;
    }

    public void setNgayChieu(String NgayChieu) {
        this.NgayChieu = NgayChieu;
    }

    public String getGioChieu() {
        return GioChieu;
    }

    public void setGioChieu(String GioChieu) {
        this.GioChieu = GioChieu;
    }

   @Override
    public String toString() {
        return iDVe;
    }  

  
}
