/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Entity.RapChieu;
import DAO.DAORapChieu;
import DAO.DBConnection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chang
 */
public class FormRapChieu extends javax.swing.JFrame {

    private ArrayList<RapChieu> listRC;
    private DAORapChieu rapChieuDAO = new DAORapChieu();
    DefaultTableModel ModelRapChieu;
    FormTrangChu f;
    public FormRapChieu(FormTrangChu f) {
        initComponents();
        this.f = f;
        ModelRapChieu = (DefaultTableModel) tblRapChieu.getModel();
        ModelRapChieu.setColumnIdentifiers(new Object[]{
            "Mã Cụm Rạp", "Tên Rạp", "Địa Chỉ Rạp", "Số Phòng", "Số Ghế", "Facebook"
        });
        display();
    }

    public void display() {
        listRC = rapChieuDAO.getRapChieu();
        
        for (int i = ModelRapChieu.getRowCount() - 1; i > -1; i--) {
            ModelRapChieu.removeRow(i);
        }
        
        for (RapChieu rc : listRC) {
            ModelRapChieu.addRow(new Object[]{
                rc.getIDCumRap(), rc.getTenRap(), rc.getDiaChiRap(), rc.getSoPhong(), rc.getSoGhe(), rc.getFacebook()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_fb = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_soghe = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_marap = new javax.swing.JTextField();
        txt_tenrap = new javax.swing.JTextField();
        txt_diachi = new javax.swing.JTextField();
        txt_sophong = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRapChieu = new javax.swing.JTable();
        btn_sua = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_thoat = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btn_Them = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_Tim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_fb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Tên rạp");

        txt_soghe.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Địa chỉ rạp");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Facebook");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Số phòng");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Số ghế");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Mã cụm rạp");

        txt_marap.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txt_tenrap.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txt_diachi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txt_sophong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        tblRapChieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Cụm Rạp", "Tên Rạp", "Địa Chỉ Rạp", "Số Phòng", "Số Ghế", "Facebook"
            }
        ));
        tblRapChieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRapChieuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRapChieu);

        btn_sua.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_sua.setText("Sửa");
        btn_sua.setName(""); // NOI18N
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Rạp Chiếu");

        btn_thoat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_thoat.setText("Thoát");
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("THÔNG TIN RẠP CHIẾU");

        btn_Them.setText("Thêm");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_Xoa.setText("Xóa");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        btn_Tim.setText("Tìm kiếm");
        btn_Tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_Them))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_tenrap, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_marap, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(26, 26, 26)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_fb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_soghe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(txt_sophong, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(btn_sua)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_Tim)
                                        .addGap(79, 79, 79)
                                        .addComponent(btn_thoat)))
                                .addGap(53, 53, 53)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Xoa)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(247, 247, 247))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_marap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_sophong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_tenrap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_soghe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_fb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_thoat)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_Them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Tim)
                            .addComponent(btn_Xoa))
                        .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(41, 41, 41)
                .addComponent(jLabel8)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        String maRap = txt_marap.getText().trim();
        String tenRap = txt_tenrap.getText().trim();
        String diaChi = txt_diachi.getText().trim();
        String facebook = txt_fb.getText().trim();
        int soPhong = 0;
        int soGhe = 0;
        try {
            soPhong = Integer.parseInt(txt_sophong.getText().trim());
            soGhe = Integer.parseInt(txt_soghe.getText().trim());
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Số ghế hoặc số phòng phải là số!");
            return;
        }
        RapChieu x = new RapChieu(maRap, tenRap, diaChi, soPhong, soGhe, facebook);
        boolean ketQua = rapChieuDAO.Sua(x);
        if(ketQua)
        {
            JOptionPane.showMessageDialog(null, "Sửa thành công!");
            display();
        }
        else
            JOptionPane.showMessageDialog(null, "Không tồn tại rạp có mã cần sửa!");
    }//GEN-LAST:event_btn_suaActionPerformed

    private void tblRapChieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRapChieuMouseClicked
        int dongChon = tblRapChieu.getSelectedRow();
        if(dongChon > -1 && dongChon < tblRapChieu.getRowCount())
        {
            txt_marap.setText(tblRapChieu.getValueAt(dongChon, 0).toString());
            txt_tenrap.setText(tblRapChieu.getValueAt(dongChon, 1).toString());
            txt_diachi.setText(tblRapChieu.getValueAt(dongChon, 2).toString());
            txt_fb.setText(tblRapChieu.getValueAt(dongChon, 5).toString());
            txt_soghe.setText(tblRapChieu.getValueAt(dongChon, 3).toString());
            txt_sophong.setText(tblRapChieu.getValueAt(dongChon, 4).toString());
        }
    }//GEN-LAST:event_tblRapChieuMouseClicked

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        dispose();
        f.setVisible(true);
    }//GEN-LAST:event_btn_thoatActionPerformed

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        String IDCRap = txt_marap.getText().trim();
        String tenRap = txt_tenrap.getText().trim();
        String diaChi = txt_diachi.getText().trim();
        String soPhong = txt_sophong.getText().trim();
        String soGhe = txt_soghe.getText().trim();
        String fb = txt_fb.getText().trim();
        if(IDCRap.equals("") || tenRap.equals("") || diaChi.equals("") || soPhong.equals("") || soGhe.equals("") || fb.equals("")){
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập đủ thông tin");
        }
        for(RapChieu item : listRC){
            if(item.getIDCumRap().equals(IDCRap)){
                JOptionPane.showMessageDialog(null, "Mã cụm rạp đã tồn tại!");
                return;
            } else {
                RapChieu x = new RapChieu(IDCRap, tenRap, diaChi, Integer.parseInt(soPhong), Integer.parseInt(soGhe), fb);
                boolean ketQua = rapChieuDAO.Them(x);
                if (ketQua) {
                    JOptionPane.showMessageDialog(null, "Thêm thành công!");
                    display();
                }
            }
        }
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        String IDCRap = txt_marap.getText().trim();
        if(IDCRap.equals("")){
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập mã rạp cần xóa");
            return;
        }
        boolean ketQua = rapChieuDAO.Xoa(IDCRap);
        if(ketQua){
            JOptionPane.showMessageDialog(null, "Xóa thành công");
            display();
        } else {
            JOptionPane.showMessageDialog(null, "Không tồn tại mã cần xóa");
        }
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_TimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimActionPerformed
        String IDCRap = txt_marap.getText().trim();
        if(IDCRap.equals("")){
            display();
        } else {
            listRC = new DAORapChieu().getRapChieu();
            for(int i=ModelRapChieu.getRowCount()-1;i>-1;i--){
                ModelRapChieu.removeRow(i);
            }
            for(RapChieu rc : listRC){
                if(rc.getIDCumRap().equals(IDCRap)){
                    ModelRapChieu.addRow(new Object[]{
                        rc.getIDCumRap(), rc.getTenRap(), rc.getDiaChiRap(), rc.getSoPhong(), rc.getSoGhe(), rc.getFacebook()
                    });
                }
            }
        }
    }//GEN-LAST:event_btn_TimActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Tim;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRapChieu;
    private javax.swing.JTextField txt_diachi;
    private javax.swing.JTextField txt_fb;
    private javax.swing.JTextField txt_marap;
    private javax.swing.JTextField txt_soghe;
    private javax.swing.JTextField txt_sophong;
    private javax.swing.JTextField txt_tenrap;
    // End of variables declaration//GEN-END:variables
}
