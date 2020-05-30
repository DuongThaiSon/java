/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Entity.HoaDon;
import Entity.HoaDonChiTiet;
import Entity.TaiKhoan;
import Entity.Ve;
import DAO.DAOHoaDon;
import DAO.DAOHoaDonChiTiet;
import DAO.DAOTaiKhoan;
import DAO.DAOVe;
import DAO.DBConnection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormHoaDon extends javax.swing.JFrame {

    DBConnection db = new DBConnection();
    ArrayList<Ve> dsVe;
    DAOVe veDAO = new DAOVe();
    DAOTaiKhoan taiKhoanDAO = new DAOTaiKhoan(db);
    DefaultTableModel ModelHoaDon;
    FormTrangChu f;
    Vector tenCot = new Vector();
    Vector duLieuBang = new Vector();
    DAOHoaDon hoaDonDAO = new DAOHoaDon(db);
    DAOHoaDonChiTiet hoaDonChiTietDAO = new DAOHoaDonChiTiet();

    public FormHoaDon(FormTrangChu f) {
        initComponents();
        this.f = f;
        loadCmb();
        HienThiTen();
        LoadTenCot();
        display();
        dsVe = veDAO.getVe();
    }

    private void LoadTenCot() {
        tenCot.add("Mã vé");
        tenCot.add("Số lượng");
        tenCot.add("Đơn giá");
        tenCot.add("Thành tiền");
    }

    private void HienThiTen() {
        ArrayList<TaiKhoan> dsTK = taiKhoanDAO.getTaiKhoan();
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (TaiKhoan item : dsTK) {
            model.addElement(item);
        }
        cmbHoTen.setModel(model);
    }

    public void loadCmb() {
        ArrayList<Ve> dsVe = veDAO.getIDVe();
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (Ve item : dsVe) {
            model.addElement(item);
        }
        cmb_MaVe.setModel(model);
    }

    private void display() {
        tblHoaDon.setModel(new DefaultTableModel(duLieuBang, tenCot));
    }

    private void xoa() {
        duLieuBang.clear();
        display();
        txtMaHD.setText("");
        xoaTextBox();
    }

    private void xoaTextBox() {
        txtDonGia.setText("");
        txtSoLuong.setText("");
    }

    private void TongTien() {
        double tong = 0;
        for (int i = 0; i < tblHoaDon.getRowCount(); i++) {
            tong += (double) tblHoaDon.getValueAt(i, 3);
        }
        txtTongTien.setText(tong + "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        cmbHoTen = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnLapHD = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmb_MaVe = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHoaDon);

        jLabel1.setText("Họ tên");

        jLabel2.setText("Tổng tiền");

        txtTongTien.setText("0");
        txtTongTien.setEnabled(false);

        jLabel3.setText("Mã hóa đơn");

        txtMaHD.setName(""); // NOI18N
        txtMaHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaHDActionPerformed(evt);
            }
        });

        jLabel4.setText("Mã vé");

        jLabel5.setText("Số lượng");

        jLabel6.setText("Đơn giá");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnLapHD.setText("Lập hóa đơn");
        btnLapHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLapHDActionPerformed(evt);
            }
        });

        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("HÓA ĐƠN");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("THÔNG TIN HÓA ĐƠN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSoLuong)
                                    .addComponent(cmbHoTen, 0, 138, Short.MAX_VALUE)
                                    .addComponent(txtMaHD)
                                    .addComponent(cmb_MaVe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(110, 110, 110)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(54, 54, 54)
                                        .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(65, 65, 65)
                                        .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLapHD)
                                        .addGap(61, 61, 61)
                                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(btnThem)
                                .addGap(56, 56, 56)
                                .addComponent(btnSua)
                                .addGap(56, 56, 56)
                                .addComponent(btnXoa)
                                .addGap(70, 70, 70)
                                .addComponent(btnThoat))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(307, 307, 307)
                                .addComponent(jLabel7)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jLabel8)
                .addGap(79, 249, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLapHD)
                    .addComponent(btnHuy))
                .addGap(34, 34, 34)
                .addComponent(jLabel9)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_MaVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnThem)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnXoa)
                        .addComponent(btnSua)
                        .addComponent(btnThoat)))
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        dispose();
        f.setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String maHD = txtMaHD.getText().trim();
        String maVe = cmb_MaVe.getSelectedItem().toString();
        for (int i = 0; i < tblHoaDon.getRowCount(); i++) {
            if (tblHoaDon.getValueAt(i, 0).toString().equals(maVe)) {
                JOptionPane.showMessageDialog(null, "Mã vé đã tồn tại! Mòi bạn bấm sửa");
                return;
            }
        }
        int soLuong = 0;
        double gia = 0;
        try {
            soLuong = Integer.parseInt(txtSoLuong.getText().trim());
            gia = Double.parseDouble(txtDonGia.getText().trim());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Số lượng hoặc đơn giá là số!");
            return;
        }
        if (soLuong <= 0 || gia <= 0) {
            JOptionPane.showMessageDialog(null, "Số lượng hoặc đơn giá > 0!");
            return;
        }
        boolean kt = false;
        for (Ve item : dsVe) {
            if (item.getiDVe().equals(maVe)) {
                kt = true;
                break;
            }
        }

        if (kt) {
            Vector dong = new Vector();
            dong.add(maVe);
            dong.add(soLuong);
            dong.add(gia);
            dong.add(soLuong * gia);
            duLieuBang.add(dong);
            display();
            TongTien();
            xoaTextBox();
        } else {
            JOptionPane.showMessageDialog(null, "Mã vé không tồn tại!");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        String maVe = cmb_MaVe.getSelectedItem().toString();
        int soLuong = 0;
        double gia = 0;
        try {
            soLuong = Integer.parseInt(txtSoLuong.getText().trim());
            gia = Double.parseDouble(txtDonGia.getText().trim());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Số lượng hoặc đơn giá là số!");
            return;
        }
        if (soLuong <= 0 || gia <= 0) {
            JOptionPane.showMessageDialog(null, "Số lượng hoặc đơn giá > 0!");
            return;
        }

        for (int i = 0; i < tblHoaDon.getRowCount(); i++) {
            if (tblHoaDon.getValueAt(i, 0).toString().equals(maVe)) {
                tblHoaDon.setValueAt(soLuong, i, 1);
                tblHoaDon.setValueAt(gia, i, 2);
                tblHoaDon.setValueAt(soLuong * gia, i, 3);
                TongTien();
                xoaTextBox();
                return;
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        String maVe = cmb_MaVe.getSelectedItem().toString();
        for (int i = 0; i < tblHoaDon.getRowCount(); i++) {
            if (tblHoaDon.getValueAt(i, 0).toString().equals(maVe)) {
                duLieuBang.remove(i);
                display();
                TongTien();
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Không có mã vé cần xóa!");
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLapHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLapHDActionPerformed
        String maHD = txtMaHD.getText().trim();
        TaiKhoan x = (TaiKhoan) cmbHoTen.getSelectedItem();
        String idTK = x.getIDTK();
        double tongTien = Double.parseDouble(txtTongTien.getText());
        if (maHD.equals("") || idTK.equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập đủ thông tin!");
            return;
        }
        ArrayList<HoaDon> listHD = hoaDonDAO.getHoaDon();
        for (HoaDon item : listHD) {
            if (item.toString().equals(maHD)) {
                JOptionPane.showMessageDialog(null, "Mã hóa đơn đã tồn tại");
                return;
            }
        }

        HoaDon hd = new HoaDon(idTK, maHD, tongTien);
        boolean ketQua = hoaDonDAO.Them(hd);
        for (int i = 0; i < tblHoaDon.getRowCount(); i++) {
            HoaDonChiTiet hdCT = new HoaDonChiTiet(maHD, tblHoaDon.getValueAt(i, 0).toString(), (int) tblHoaDon.getValueAt(i, 1), (double) tblHoaDon.getValueAt(i, 2));
            hoaDonChiTietDAO.Them(hdCT);
        }
        if (ketQua) {
            JOptionPane.showMessageDialog(null, "Lập hóa đơn thành công");
        }

        xoa();
    }//GEN-LAST:event_btnLapHDActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        xoa();
        txtTongTien.setText("0");
    }//GEN-LAST:event_btnHuyActionPerformed

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
        int dongChon = tblHoaDon.getSelectedRow();
        if (dongChon > -1 && dongChon < tblHoaDon.getRowCount()) {
            txtMaHD.setText(tblHoaDon.getValueAt(dongChon, 0).toString());
            txtDonGia.setText(tblHoaDon.getValueAt(dongChon, 3).toString());
            txtSoLuong.setText(tblHoaDon.getValueAt(dongChon, 2).toString());
        }
    }//GEN-LAST:event_tblHoaDonMouseClicked

    private void txtMaHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaHDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLapHD;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cmbHoTen;
    private javax.swing.JComboBox<String> cmb_MaVe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
