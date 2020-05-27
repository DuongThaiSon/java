/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

/**
 *
 * @author Mr Baby
 */
public class FormTrangChu extends javax.swing.JFrame {

    DangNhap f;
    public FormTrangChu(DangNhap f) {
        initComponents();
        this.f = f;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_rapchieu = new javax.swing.JButton();
        btn_phim = new javax.swing.JButton();
        btn_lichchieu = new javax.swing.JButton();
        btn_ve = new javax.swing.JButton();
        btn_hoadon = new javax.swing.JButton();
        btn_thoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("TRANG CHỦ");

        btn_rapchieu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_rapchieu.setText("Rạp Chiếu");
        btn_rapchieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rapchieuActionPerformed(evt);
            }
        });

        btn_phim.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_phim.setText("Phim");
        btn_phim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_phimActionPerformed(evt);
            }
        });

        btn_lichchieu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_lichchieu.setText("Lịch Chiếu");
        btn_lichchieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lichchieuActionPerformed(evt);
            }
        });

        btn_ve.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_ve.setText("Vé");
        btn_ve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_veActionPerformed(evt);
            }
        });

        btn_hoadon.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_hoadon.setText("Hóa Đơn");
        btn_hoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hoadonActionPerformed(evt);
            }
        });

        btn_thoat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_thoat.setText("Thoát");
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btn_rapchieu)
                .addGap(58, 58, 58)
                .addComponent(btn_phim)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_lichchieu)
                        .addGap(73, 73, 73)
                        .addComponent(btn_ve)
                        .addGap(70, 70, 70)
                        .addComponent(btn_hoadon))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btn_thoat)))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(327, 327, 327))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_lichchieu)
                    .addComponent(btn_phim)
                    .addComponent(btn_rapchieu)
                    .addComponent(btn_ve)
                    .addComponent(btn_hoadon))
                .addGap(82, 82, 82)
                .addComponent(btn_thoat)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_rapchieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rapchieuActionPerformed
        FormRapChieu rc = new FormRapChieu(this);
        rc.setVisible(true);
        rc.setLocationRelativeTo(null);
        setVisible(false);
    }//GEN-LAST:event_btn_rapchieuActionPerformed

    private void btn_phimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_phimActionPerformed
        FormPhim p = new  FormPhim(this);
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        setVisible(false);
    }//GEN-LAST:event_btn_phimActionPerformed

    private void btn_lichchieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lichchieuActionPerformed
        FormLichChieu lc = new FormLichChieu(this);
        lc.setVisible(true);
        lc.setLocationRelativeTo(null);
        setVisible(false);     
    }//GEN-LAST:event_btn_lichchieuActionPerformed

    private void btn_veActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_veActionPerformed
        FormVe v = new FormVe(this);
        v.setVisible(true);
        v.setLocationRelativeTo(null);
        setVisible(false);         
    }//GEN-LAST:event_btn_veActionPerformed

    private void btn_hoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hoadonActionPerformed
        FormHoaDon hd = new FormHoaDon(this);
        hd.setVisible(true);
        hd.setLocationRelativeTo(null);
        setVisible(false);       
    }//GEN-LAST:event_btn_hoadonActionPerformed

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        dispose();
        f.setVisible(true);
    }//GEN-LAST:event_btn_thoatActionPerformed
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hoadon;
    private javax.swing.JButton btn_lichchieu;
    private javax.swing.JButton btn_phim;
    private javax.swing.JButton btn_rapchieu;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JButton btn_ve;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
