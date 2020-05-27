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
public class TaiKhoan {

    private String IDTK;
    private String MatKhau;
    private String HoTen;

    public TaiKhoan() {
    }

    public TaiKhoan(String IDTK, String MatKhau, String HoTen) {
        this.IDTK = IDTK;
        this.MatKhau = MatKhau;
        this.HoTen = HoTen;
    }

    public String getIDTK() {
        return IDTK;
    }

    public void setIDTK(String IDTK) {
        this.IDTK = IDTK;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    

    @Override
    public String toString() {
        return HoTen;
    }

}
