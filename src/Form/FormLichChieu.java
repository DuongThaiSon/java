/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Entity.LichChieu;
import Entity.Phim;
import DAO.DAOLichChieu;
import DAO.DAOPhim;
import DAO.DBConnection;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chang
 */
public class FormLichChieu extends javax.swing.JFrame {

    private ArrayList<LichChieu> listLC;
    DBConnection db = new DBConnection();
    DefaultTableModel ModelLichChieu;
    FormTrangChu f;
    DAOLichChieu lichChieuDAO = new DAOLichChieu();
    DAOPhim phimDAO = new DAOPhim();

    public FormLichChieu(FormTrangChu f) {
        initComponents();
        this.f = f;
        ModelLichChieu = (DefaultTableModel) tblLichChieu.getModel();
        ModelLichChieu.setColumnIdentifiers(new Object[]{
            "Mã Lịch Chiếu", "Mã Phim", "Giờ Chiếu", "Ngày Chiếu"
        });
        loadCmb();
        display();
    }

    public void display() {
        listLC = lichChieuDAO.getLichChieu();

        for (int i = ModelLichChieu.getRowCount() - 1; i > -1; i--) {
            ModelLichChieu.removeRow(i);
        }

        for (LichChieu lc : listLC) {
            ModelLichChieu.addRow(new Object[]{
                lc.getIDLichChieu(), lc.getIDPhim(), lc.getGioChieu(), lc.getNgayChieu()
            });
        }
    }

    public void loadCmb(){
        ArrayList<Phim> dsPh = phimDAO.getPhim();
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (Phim item : dsPh) {
            model.addElement(item);
        }
        cmb_MaPhim.setModel(model);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNgayChieu = new javax.swing.JTextField();
        txtGioChieu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLichChieu = new javax.swing.JTable();
        btnThoat = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmb_MaPhim = new javax.swing.JComboBox<>();
        txtMaLichChieu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã lịch chiếu");

        jLabel2.setText("Mã phim");

        jLabel5.setText("Ngày chiếu");

        jLabel6.setText("Giờ chiếu");

        tblLichChieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblLichChieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLichChieuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLichChieu);

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

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

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("LỊCH CHIẾU");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("DANH SÁCH LỊCH CHIẾU");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmb_MaPhim, 0, 141, Short.MAX_VALUE)
                                    .addComponent(txtMaLichChieu))
                                .addGap(106, 106, 106)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNgayChieu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGioChieu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(175, 175, 175)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnThem)
                                        .addGap(63, 63, 63)
                                        .addComponent(btnSua)
                                        .addGap(65, 65, 65)
                                        .addComponent(btnXoa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                        .addComponent(btnTimKiem)
                                        .addGap(57, 57, 57)))
                                .addComponent(btnThoat))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel3)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaLichChieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtGioChieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtNgayChieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cmb_MaPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThoat)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnTimKiem))
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        dispose();
        f.setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String IdLichChieu = txtMaLichChieu.getText().trim();
        String maPhim = cmb_MaPhim.getSelectedItem().toString();
        String gioChieu = txtGioChieu.getText().trim();
        String ngay = txtNgayChieu.getText().trim();
        
        if (IdLichChieu.equals("") || gioChieu.equals("") || ngay.equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập đủ thông tin!");
            return;
        }
        boolean kt = false;
        for( LichChieu item : listLC ){
            if( item.getIDLichChieu().equals(IdLichChieu))
            {
                JOptionPane.showMessageDialog(null, "Mã lịch chiếu đã tồn tại!");
                return;
            }
            if(item.getIDPhim().equals(maPhim))
                kt = true;
        }
        LichChieu x = new LichChieu(IdLichChieu, maPhim, gioChieu, ngay );
        boolean ketQua = lichChieuDAO.Them(x);
        if (ketQua) {
            JOptionPane.showMessageDialog(null, "Thêm thành công!");
            display();
        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        String IdLichChieu = txtMaLichChieu.getText().trim();
        String maPhim = cmb_MaPhim.getSelectedItem().toString();
        String gioChieu = txtGioChieu.getText().trim();
        String ngay = txtNgayChieu.getText().trim();
        
        if (IdLichChieu.equals("") || gioChieu.equals("") || ngay.equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập đủ thông tin!");
            return;
        }
        LichChieu x = new LichChieu(IdLichChieu, maPhim, gioChieu, ngay );
        boolean ketQua = lichChieuDAO.Sua(x);
        if (ketQua) {
            JOptionPane.showMessageDialog(null, "Sửa thành công!");
            display();
        } else {
            JOptionPane.showMessageDialog(null, "Không có lịch chiếu có mã cần sửa");
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        String IdLichChieu = txtMaLichChieu.getText().trim();
        if (IdLichChieu.equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập mã lịch chiếu cần xóa!");
            return;
        }
        boolean ketQua = lichChieuDAO.Xoa(IdLichChieu);
        if (ketQua) {
            JOptionPane.showMessageDialog(null, "Xóa thành công!");
            display();
        } else {
            JOptionPane.showMessageDialog(null, "Không có lịch chiếu có mã cần xóa");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String IdLichChieu = txtMaLichChieu.getText().trim();
        if (IdLichChieu.equals("")) {
            display();
        } else {
            listLC = lichChieuDAO.getLichChieu();
            for (int i = ModelLichChieu.getRowCount() - 1; i > -1; i--) {
                ModelLichChieu.removeRow(i);
            }
            for (LichChieu lc : listLC) {
                if (lc.getIDLichChieu().equals(IdLichChieu)) {
                    ModelLichChieu.addRow(new Object[]{
                        lc.getIDLichChieu(), lc.getIDPhim(), lc.getGioChieu(), lc.getNgayChieu()
                    });
                }
            }
            System.out.println(ModelLichChieu.getRowCount());
        }

    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void tblLichChieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLichChieuMouseClicked
        int dongChon = tblLichChieu.getSelectedRow();
        if (dongChon > -1 && dongChon < tblLichChieu.getRowCount()) {
            txtMaLichChieu.setText(tblLichChieu.getValueAt(dongChon, 0).toString());
            txtGioChieu.setText(tblLichChieu.getValueAt(dongChon, 2).toString());
            txtNgayChieu.setText(tblLichChieu.getValueAt(dongChon, 3).toString());
        }
    }//GEN-LAST:event_tblLichChieuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cmb_MaPhim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLichChieu;
    private javax.swing.JTextField txtGioChieu;
    private javax.swing.JTextField txtMaLichChieu;
    private javax.swing.JTextField txtNgayChieu;
    // End of variables declaration//GEN-END:variables
}
