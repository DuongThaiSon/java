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
public class LichChieu {

    private String IDLichChieu;
    private String IDPhim;
    private String GioChieu;
    private String NgayChieu;

    public LichChieu(){}
    
    public LichChieu(String IDLichChieu, String IDPhim, String GioChieu, String NgayChieu) {
        this.IDLichChieu = IDLichChieu;
        this.IDPhim = IDPhim;
        this.GioChieu = GioChieu;
        this.NgayChieu = NgayChieu;
    }

    public String getIDLichChieu() {
        return IDLichChieu;
    }

    public void setIDLichChieu(String IDLichChieu) {
        this.IDLichChieu = IDLichChieu;
    }

    public String getIDPhim() {
        return IDPhim;
    }

    public void setIDPhim(String IDPhim) {
        this.IDPhim = IDPhim;
    }

    public String getGioChieu() {
        return GioChieu;
    }

    public void setGioChieu(String GioChieu) {
        this.GioChieu = GioChieu;
    }

    public String getNgayChieu() {
        return NgayChieu;
    }

    public void setNgayChieu(String NgayChieu) {
        this.NgayChieu = NgayChieu;
    }

    @Override
    public String toString() {
        return IDLichChieu;
    }  
    
}
