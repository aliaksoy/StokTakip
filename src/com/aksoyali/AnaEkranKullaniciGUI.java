package com.aksoyali;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Ali
 */
public class AnaEkranKullaniciGUI extends javax.swing.JFrame {

    /**
     * Creates new form AnaEkranYoneticiGUI
     */
    
    public AnaEkranKullaniciGUI() {
        initComponents();
        this.setLocationRelativeTo(getRootPane());//Frame ekranın ortasında açılır
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAnaEkran = new javax.swing.JPanel();
        btnProjeTeklifi = new javax.swing.JButton();
        btnMalzemeGirisi = new javax.swing.JButton();
        btnHakkimida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KULLANICI ANA EKRAN");
        setResizable(false);

        pnlAnaEkran.setBackground(new java.awt.Color(204, 204, 255));

        btnProjeTeklifi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnProjeTeklifi.setForeground(new java.awt.Color(0, 51, 51));
        btnProjeTeklifi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/proje.png"))); // NOI18N
        btnProjeTeklifi.setText("PROJE GİRİŞİ");
        btnProjeTeklifi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProjeTeklifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProjeTeklifiActionPerformed(evt);
            }
        });

        btnMalzemeGirisi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMalzemeGirisi.setForeground(new java.awt.Color(0, 51, 51));
        btnMalzemeGirisi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/malzeme.png"))); // NOI18N
        btnMalzemeGirisi.setText("MALZEME GİRİŞİ");
        btnMalzemeGirisi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMalzemeGirisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMalzemeGirisiActionPerformed(evt);
            }
        });

        btnHakkimida.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHakkimida.setForeground(new java.awt.Color(0, 51, 51));
        btnHakkimida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hakkimizda.png"))); // NOI18N
        btnHakkimida.setText("HAKKIMIZDA");
        btnHakkimida.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHakkimida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHakkimidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAnaEkranLayout = new javax.swing.GroupLayout(pnlAnaEkran);
        pnlAnaEkran.setLayout(pnlAnaEkranLayout);
        pnlAnaEkranLayout.setHorizontalGroup(
            pnlAnaEkranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAnaEkranLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(pnlAnaEkranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMalzemeGirisi, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProjeTeklifi, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHakkimida, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
        );
        pnlAnaEkranLayout.setVerticalGroup(
            pnlAnaEkranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAnaEkranLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnMalzemeGirisi, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProjeTeklifi)
                .addGap(13, 13, 13)
                .addComponent(btnHakkimida)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pnlAnaEkranLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnHakkimida, btnMalzemeGirisi, btnProjeTeklifi});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(pnlAnaEkran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pnlAnaEkran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMalzemeGirisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMalzemeGirisiActionPerformed
        MalzemeGirisiGUI malzemeGirisiGUI = new MalzemeGirisiGUI();

                   malzemeGirisiGUI.setVisible(true);
 

       
        
        
    }//GEN-LAST:event_btnMalzemeGirisiActionPerformed
    
    private void btnProjeTeklifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProjeTeklifiActionPerformed
        ProjeAnaGirisGUI projeAnaGirisGUI=new ProjeAnaGirisGUI();
        projeAnaGirisGUI.setVisible(true);
    }//GEN-LAST:event_btnProjeTeklifiActionPerformed

    private void btnHakkimidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHakkimidaActionPerformed
        Hakkimizda hakkimizda=new Hakkimizda();
        hakkimizda.setVisible(true);
    }//GEN-LAST:event_btnHakkimidaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnaEkranKullaniciGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaEkranKullaniciGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaEkranKullaniciGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaEkranKullaniciGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaEkranKullaniciGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHakkimida;
    private javax.swing.JButton btnMalzemeGirisi;
    private javax.swing.JButton btnProjeTeklifi;
    private javax.swing.JPanel pnlAnaEkran;
    // End of variables declaration//GEN-END:variables


}
