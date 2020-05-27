/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Entity.Phim;
import Entity.RapChieu;
import DAO.DAOPhim;
import DAO.DAORapChieu;
import DAO.DBConnection;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chang
 */
public class FormPhim extends javax.swing.JFrame {

    DBConnection db = new DBConnection();
    DBConnection dbCon;
    Connection conn;
    private DAORapChieu rapChieuDAO = new DAORapChieu();
    private ArrayList<Phim> listPh;
    DefaultTableModel ModelPhim;
    FormTrangChu f;
    DAOPhim phimDAO = new DAOPhim();

    public FormPhim(FormTrangChu f) {
        initComponents();
        this.f = f;
        ModelPhim = (DefaultTableModel) tblPhim.getModel();
        ModelPhim.setColumnIdentifiers(new Object[]{
            "Mã Cụm Rạp", "Mã Phim", "Tên Phim", "Thể Loại", "Diễn Viên",
            "Đạo Diễn", "Thời Lượng", "Hãng phim", "Thời Gian Chiêu"
        });
        LoadCmb();
        display();
    }

    private void LoadCmb() {
        ArrayList<RapChieu> dsRC = rapChieuDAO.getIDRapChieu();
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (RapChieu item : dsRC) {
            model.addElement(item);
        }
        cmb_MaCumRap.setModel(model);
    }
    
    public void display() {
        listPh = new DAOPhim().getPhim();

        for (int i = ModelPhim.getRowCount() - 1; i > -1; i--) {
            ModelPhim.removeRow(i);
        }

        for (Phim ph : listPh) {
            ModelPhim.addRow(new Object[]{
                ph.getIDCumRap(), ph.getIDPhim(), ph.getTenPhim(), ph.getTheLoai(), ph.getDienVien(),
                ph.getDaoDien(), ph.getThoiLuong(), ph.getHangPhim(), ph.getThoiGianChieu()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_IDPhim = new javax.swing.JTextField();
        txt_tenPhim = new javax.swing.JTextField();
        txt_theLoai = new javax.swing.JTextField();
        txt_dvien = new javax.swing.JTextField();
        txt_daoDien = new javax.swing.JTextField();
        txt_thLuong = new javax.swing.JTextField();
        txt_hangPhim = new javax.swing.JTextField();
        txt_timeChieu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhim = new javax.swing.JTable();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_thoat = new javax.swing.JButton();
        btn_timKiem = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmb_MaCumRap = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã cụm rạp");

        jLabel2.setText("Mã phim");

        jLabel3.setText("Tên phim");

        jLabel4.setText("Thể loại");

        jLabel5.setText("Diễn viên");

        jLabel6.setText("Đạo diễn");

        jLabel7.setText("Thời lượng");

        jLabel8.setText("Hãng phim");

        jLabel9.setText("Thời gian chiếu");

        tblPhim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Cụm Rạp", "Mã Phim", "Tên Phim", "Thể Loại", "Diễn Viên", "Đạo Diễn", "Thời Lượng", "Hãng Phim", "Thời Gian Chiếu"
            }
        ));
        tblPhim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhimMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPhim);

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_thoat.setText("Thoát");
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });

        btn_timKiem.setText("Tìm kiếm");
        btn_timKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timKiemActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("DANH SÁCH PHIM");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("PHIM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(323, 323, 323))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_timKiem)
                        .addGap(81, 81, 81)
                        .addComponent(btn_thoat)
                        .addGap(46, 46, 46))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_IDPhim)
                                    .addComponent(txt_tenPhim)
                                    .addComponent(txt_theLoai)
                                    .addComponent(txt_dvien, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(cmb_MaCumRap, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_daoDien, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(txt_thLuong)
                                    .addComponent(txt_hangPhim)
                                    .addComponent(txt_timeChieu))
                                .addGap(36, 36, 36))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btn_them)
                                .addGap(57, 57, 57)
                                .addComponent(btn_sua)
                                .addGap(64, 64, 64)
                                .addComponent(btn_xoa)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(257, 257, 257))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_daoDien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_MaCumRap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(txt_IDPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_thLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(txt_tenPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_hangPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(txt_theLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_timeChieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_dvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them)
                    .addComponent(btn_sua)
                    .addComponent(btn_xoa)
                    .addComponent(btn_timKiem)
                    .addComponent(btn_thoat))
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        String IDCRap = cmb_MaCumRap.getSelectedItem().toString();
        String IDPhim = txt_IDPhim.getText().trim();
        String tenPhim = txt_tenPhim.getText().trim();
        String theLoai = txt_theLoai.getText().trim();
        String dienVien = txt_dvien.getText().trim();
        String daoDien = txt_daoDien.getText().trim();
        String thoiLuong = txt_thLuong.getText().trim();
        String hangPhim = txt_hangPhim.getText().trim();
        String thoiGianChieu = txt_timeChieu.getText().trim();
        if (IDPhim.equals("") || tenPhim.equals("") || theLoai.equals("") || dienVien.equals("") || daoDien.equals(")") || thoiLuong.equals("") || hangPhim.equals("") || thoiGianChieu.equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập đủ thông tin!");
            return;
        }
        for(Phim item : listPh ){
            while(item.getIDPhim().equals(IDPhim))
            {
                JOptionPane.showMessageDialog(null, "Mã phim đã tồn tại!");
                return;
            }
        }
        Phim x = new Phim(IDCRap, IDPhim, tenPhim, theLoai, dienVien, daoDien, thoiLuong, hangPhim, thoiGianChieu);
        boolean ketQua = phimDAO.Them(x);
        if (ketQua) {
            JOptionPane.showMessageDialog(null, "Thêm thành công!");
            display();
        }
    }//GEN-LAST:event_btn_themActionPerformed
 
    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        String IDCRap = cmb_MaCumRap.getSelectedItem().toString();
        String IDPhim = txt_IDPhim.getText().trim();
        String tenPhim = txt_tenPhim.getText().trim();
        String theLoai = txt_theLoai.getText().trim();
        String dienVien = txt_dvien.getText().trim();
        String daoDien = txt_daoDien.getText().trim();
        String thoiLuong = txt_thLuong.getText().trim();
        String hangPhim = txt_hangPhim.getText().trim();
        String thoiGianChieu = txt_timeChieu.getText().trim();
        if (IDPhim.equals("") || tenPhim.equals("") || theLoai.equals("") || dienVien.equals("") || daoDien.equals(")") || thoiLuong.equals("") || hangPhim.equals("") || thoiGianChieu.equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập đủ thông tin!");
            return;
        }
        Phim x = new Phim(IDCRap, IDPhim, tenPhim, theLoai, dienVien, daoDien, thoiLuong, hangPhim, thoiGianChieu);
        boolean ketQua = phimDAO.Sua(x);
        if (ketQua) {
            JOptionPane.showMessageDialog(null, "Sửa thành công!");
            display();
        } else {
            JOptionPane.showMessageDialog(null, "Không tồn tại phim có mã cần sửa!");
        }
        
        if(IDPhim.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập mã phim!");
            return;
        }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        String IDPhim = txt_IDPhim.getText().trim();
        if (IDPhim.equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập mã phim cần xóa!");
            return;
        }
        boolean ketQua = phimDAO.Xoa(IDPhim);
        if (ketQua) {
            JOptionPane.showMessageDialog(null, "Xóa thành công!");
            display();
        } else {
            JOptionPane.showMessageDialog(null, "Không tồn tại phim có mã cần xóa!");
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_timKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timKiemActionPerformed
        String IDPhim = txt_IDPhim.getText().trim();
        if (IDPhim.equals("")) {
            display();
        } else {
            listPh = new DAOPhim().getPhim();

            for (int i = ModelPhim.getRowCount() - 1; i > -1; i--) {
                ModelPhim.removeRow(i);
            }

            for (Phim ph : listPh) {
                if (ph.getIDPhim().equals(IDPhim)) {
                    ModelPhim.addRow(new Object[]{
                        ph.getIDCumRap(), ph.getIDPhim(), ph.getTenPhim(), ph.getTheLoai(), ph.getDienVien(),
                        ph.getDaoDien(), ph.getThoiLuong(), ph.getHangPhim(), ph.getThoiGianChieu()
                    });
                }
            }
        }
    }//GEN-LAST:event_btn_timKiemActionPerformed

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        dispose();
        f.setVisible(true);
    }//GEN-LAST:event_btn_thoatActionPerformed

    private void tblPhimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhimMouseClicked
        int dongChon = tblPhim.getSelectedRow();
        if (dongChon > -1 && dongChon < tblPhim.getRowCount()) {
            txt_IDPhim.setText(tblPhim.getValueAt(dongChon, 1).toString());
            txt_tenPhim.setText(tblPhim.getValueAt(dongChon, 2).toString());
            txt_theLoai.setText(tblPhim.getValueAt(dongChon, 3).toString());
            txt_dvien.setText(tblPhim.getValueAt(dongChon, 4).toString());
            txt_daoDien.setText(tblPhim.getValueAt(dongChon, 5).toString());
            txt_thLuong.setText(tblPhim.getValueAt(dongChon, 6).toString());
            txt_hangPhim.setText(tblPhim.getValueAt(dongChon, 7).toString());
            txt_timeChieu.setText(tblPhim.getValueAt(dongChon, 8).toString());
        }
    }//GEN-LAST:event_tblPhimMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JButton btn_timKiem;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cmb_MaCumRap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPhim;
    private javax.swing.JTextField txt_IDPhim;
    private javax.swing.JTextField txt_daoDien;
    private javax.swing.JTextField txt_dvien;
    private javax.swing.JTextField txt_hangPhim;
    private javax.swing.JTextField txt_tenPhim;
    private javax.swing.JTextField txt_thLuong;
    private javax.swing.JTextField txt_theLoai;
    private javax.swing.JTextField txt_timeChieu;
    // End of variables declaration//GEN-END:variables
}
