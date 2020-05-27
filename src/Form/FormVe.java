/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Entity.Phim;
import Entity.Ve;
import Entity.LichChieu;
import DAO.DAOLichChieu;
import DAO.DAOPhim;
import DAO.DAOVe;
import DAO.DBConnection;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chang
 */
public class FormVe extends javax.swing.JFrame {

    private ArrayList<Ve> listVe;
    DBConnection db = new DBConnection();
    DefaultTableModel ModelVe;
    FormTrangChu f;
    DAOVe veDAO = new DAOVe();
    DAOLichChieu lichChieuDAO = new DAOLichChieu();
    DAOPhim phimDAO = new DAOPhim();

    public FormVe(FormTrangChu f) {
        initComponents();
        this.f = f;
        ModelVe = (DefaultTableModel) tblVe.getModel();
        ModelVe.setColumnIdentifiers(new Object[]{
            "Mã Phim", "Mã Lịch Chiếu", "Mã Vé",
            "Vị trí", "Ngày Chiếu", "Giờ Chiếu"
        });
        loadCmb();
        display();
    }

    public void display() {
        listVe = veDAO.getVe();

        for (int i = ModelVe.getRowCount() - 1; i > -1; i--) {
            ModelVe.removeRow(i);
        }

        for (Ve ve : listVe) {
            ModelVe.addRow(new Object[]{
                ve.getiDPhim(), ve.getiDLichChieu(), ve.getiDVe(),
                ve.getViTri(), ve.getNgayChieu(), ve.getGioChieu()
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
        
        ArrayList<LichChieu> dsLC = lichChieuDAO.getIDLichChieu();
        DefaultComboBoxModel model_2 = new DefaultComboBoxModel();
        for (LichChieu item : dsLC) {
            model_2.addElement(item);
        }
        cmb_MaLichChieu.setModel(model_2);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtGioChieu = new javax.swing.JTextField();
        txtNgayChieu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaVe = new javax.swing.JTextField();
        txtViTri = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVe = new javax.swing.JTable();
        btnThoat = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmb_MaPhim = new javax.swing.JComboBox<>();
        cmb_MaLichChieu = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Mã phim");

        jLabel3.setText("Mã lịch chiếu");

        jLabel4.setText("Mã vé");

        jLabel5.setText("Vị trí");

        jLabel8.setText("Giờ chiếu");

        jLabel9.setText("Ngày chiếu");

        tblVe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblVe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVe);

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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Vé");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("DANH SÁCH VÉ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaVe, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(cmb_MaPhim, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb_MaLichChieu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtGioChieu, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(txtNgayChieu)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(43, 43, 43)
                                .addComponent(txtViTri, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(47, 47, 47)
                        .addComponent(btnSua)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnXoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                                .addComponent(btnTimKiem)
                                .addGap(55, 55, 55)
                                .addComponent(btnThoat))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(188, 188, 188)))))
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(332, 332, 332))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtViTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_MaPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(txtGioChieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_MaLichChieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(txtMaVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayChieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnTimKiem)
                    .addComponent(btnThoat))
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        dispose();
        f.setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String idVe = txtMaVe.getText().trim();
        String maLC = cmb_MaLichChieu.getSelectedItem().toString();
        String maPhim = cmb_MaPhim.getSelectedItem().toString();
        String viTri = txtViTri.getText().trim();
        String gioChieu = txtGioChieu.getText().trim();
        String ngay = txtNgayChieu.getText().trim();
        boolean kt = false;
        for ( Ve item : listVe)
        {
            if(item.getViTri().equals(viTri))
            {
                JOptionPane.showMessageDialog(null, "Vị trí đã chọn");
            }
            if( item.getiDVe().equals(idVe))
            {
                JOptionPane.showMessageDialog(null, "Mã vé đã tồn tại!");
                return;
            }
        }
        Ve x = new Ve(maPhim, maLC, idVe, viTri, ngay, gioChieu);
        boolean ketQua = veDAO.Them(x);
        if (ketQua) {
            JOptionPane.showMessageDialog(null, "Thêm thành công!");
            display();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        String idVe = txtMaVe.getText().trim();
        String maLC = cmb_MaLichChieu.getSelectedItem().toString();
        String maPhim = cmb_MaPhim.getSelectedItem().toString();
        String viTri = txtViTri.getText().trim();
        String gioChieu = txtGioChieu.getText().trim();
        String ngay = txtNgayChieu.getText().trim();
        
        Ve x = new Ve(maPhim, maLC, idVe, viTri, ngay, gioChieu);
        boolean ketQua = veDAO.Sua(x);
        if (ketQua) {
            JOptionPane.showMessageDialog(null, "Sửa thành công!");
            display();
        } else {
            JOptionPane.showMessageDialog(null, "Không có vẽ có mã cần sửa!");
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        String idVe = txtMaVe.getText().trim();
        if (idVe.equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập mã vé cần xóa!");
            return;
        }
        boolean ketQua = veDAO.Xoa(idVe);
        if (ketQua) {
            JOptionPane.showMessageDialog(null, "Xóa thành công!");
            display();
        } else {
            JOptionPane.showMessageDialog(null, "Không có vẽ có mã cần xóa!");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String idVe = txtMaVe.getText().trim();
        if (idVe.equals("")) {
            display();
        } else {
            listVe = veDAO.getVe();

            for (int i = ModelVe.getRowCount() - 1; i > -1; i--) {
                ModelVe.removeRow(i);
            }

            for (Ve ve : listVe) {
                if (ve.getiDVe().equals(idVe)) {
                    ModelVe.addRow(new Object[]{
                        ve.getiDPhim(), ve.getiDLichChieu(), ve.getiDVe(),
                        ve.getViTri(), ve.getNgayChieu(), ve.getGioChieu()
                    });
                }
            }
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void tblVeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVeMouseClicked
        int dongChon = tblVe.getSelectedRow();
        if (dongChon > -1 && dongChon < tblVe.getRowCount()) {
            txtMaVe.setText(tblVe.getValueAt(dongChon, 2).toString());
            txtNgayChieu.setText(tblVe.getValueAt(dongChon, 4).toString());
            txtGioChieu.setText(tblVe.getValueAt(dongChon, 5).toString());
            txtViTri.setText(tblVe.getValueAt(dongChon, 3).toString());
        }
    }//GEN-LAST:event_tblVeMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cmb_MaLichChieu;
    private javax.swing.JComboBox<String> cmb_MaPhim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVe;
    private javax.swing.JTextField txtGioChieu;
    private javax.swing.JTextField txtMaVe;
    private javax.swing.JTextField txtNgayChieu;
    private javax.swing.JTextField txtViTri;
    // End of variables declaration//GEN-END:variables
}
