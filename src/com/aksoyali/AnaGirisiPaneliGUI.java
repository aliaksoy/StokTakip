package com.aksoyali;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Ali
 */
public class AnaGirisiPaneliGUI extends javax.swing.JFrame {

    /**
     * Creates new form AnaGirisiPaneliGUI
     */
    public AnaGirisiPaneliGUI() {
        initComponents();
         this.setLocationRelativeTo(getRootPane());//Frame ekranın ortasında açılır
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        pnlKullaniciGiris1 = new javax.swing.JPanel();
        txtKullaniciAdi = new javax.swing.JTextField();
        lblKullaniciAdi = new javax.swing.JLabel();
        btnKullaniciGiris = new javax.swing.JButton();
        lblKullaniciParola = new javax.swing.JLabel();
        txtKullaniciParola = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        lblKullaniciGirisPaneli = new javax.swing.JLabel();
        pnlKullaniciGiris = new javax.swing.JPanel();
        txtYoneticiKullaniciAdi = new javax.swing.JTextField();
        lblYoneticiKullaniciAdi = new javax.swing.JLabel();
        btnYoneticiGiris = new javax.swing.JButton();
        lblYoneticiParola = new javax.swing.JLabel();
        txtYoneticiParola = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        lblYoneticiGirisPaneli = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GİRİŞ PANELİ");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlKullaniciGiris1.setBackground(new java.awt.Color(204, 204, 255));

        txtKullaniciAdi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKullaniciAdiKeyPressed(evt);
            }
        });

        lblKullaniciAdi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblKullaniciAdi.setText("Kullanıcı Adı");

        btnKullaniciGiris.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnKullaniciGiris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enter.png"))); // NOI18N
        btnKullaniciGiris.setText("KULLANICI GİRİŞ");
        btnKullaniciGiris.setPreferredSize(new java.awt.Dimension(155, 33));
        btnKullaniciGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullaniciGirisActionPerformed(evt);
            }
        });

        lblKullaniciParola.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblKullaniciParola.setText("Parola");

        txtKullaniciParola.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKullaniciParolaKeyPressed(evt);
            }
        });

        lblKullaniciGirisPaneli.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblKullaniciGirisPaneli.setForeground(new java.awt.Color(153, 0, 0));
        lblKullaniciGirisPaneli.setText("KULLANICI GİRİŞ PANELİ");

        javax.swing.GroupLayout pnlKullaniciGiris1Layout = new javax.swing.GroupLayout(pnlKullaniciGiris1);
        pnlKullaniciGiris1.setLayout(pnlKullaniciGiris1Layout);
        pnlKullaniciGiris1Layout.setHorizontalGroup(
            pnlKullaniciGiris1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKullaniciGiris1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKullaniciGiris1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKullaniciGiris1Layout.createSequentialGroup()
                        .addGap(0, 81, Short.MAX_VALUE)
                        .addComponent(lblKullaniciGirisPaneli, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(pnlKullaniciGiris1Layout.createSequentialGroup()
                        .addGroup(pnlKullaniciGiris1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnKullaniciGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlKullaniciGiris1Layout.createSequentialGroup()
                                .addGroup(pnlKullaniciGiris1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKullaniciAdi)
                                    .addComponent(lblKullaniciParola))
                                .addGap(100, 100, 100)
                                .addGroup(pnlKullaniciGiris1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtKullaniciParola, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addContainerGap())
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        pnlKullaniciGiris1Layout.setVerticalGroup(
            pnlKullaniciGiris1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKullaniciGiris1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblKullaniciGirisPaneli)
                .addGap(20, 20, 20)
                .addGroup(pnlKullaniciGiris1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKullaniciAdi)
                    .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlKullaniciGiris1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKullaniciParola)
                    .addComponent(txtKullaniciParola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnKullaniciGiris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlKullaniciGiris1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlKullaniciGiris1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Kullanıcı Girişi", jPanel1);

        pnlKullaniciGiris.setBackground(new java.awt.Color(204, 204, 255));
        pnlKullaniciGiris.setPreferredSize(new java.awt.Dimension(537, 254));

        txtYoneticiKullaniciAdi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtYoneticiKullaniciAdiKeyPressed(evt);
            }
        });

        lblYoneticiKullaniciAdi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblYoneticiKullaniciAdi.setText("Kullanıcı Adı");

        btnYoneticiGiris.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnYoneticiGiris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enter.png"))); // NOI18N
        btnYoneticiGiris.setText("YÖNETİCİ GİRİŞ");
        btnYoneticiGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYoneticiGirisActionPerformed(evt);
            }
        });

        lblYoneticiParola.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblYoneticiParola.setText("Parola");

        txtYoneticiParola.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtYoneticiParolaKeyPressed(evt);
            }
        });

        lblYoneticiGirisPaneli.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblYoneticiGirisPaneli.setForeground(new java.awt.Color(153, 0, 0));
        lblYoneticiGirisPaneli.setText("YÖNETİCİ GİRİŞ PANELİ");

        javax.swing.GroupLayout pnlKullaniciGirisLayout = new javax.swing.GroupLayout(pnlKullaniciGiris);
        pnlKullaniciGiris.setLayout(pnlKullaniciGirisLayout);
        pnlKullaniciGirisLayout.setHorizontalGroup(
            pnlKullaniciGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlKullaniciGirisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKullaniciGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKullaniciGirisLayout.createSequentialGroup()
                        .addGroup(pnlKullaniciGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblYoneticiKullaniciAdi)
                            .addComponent(lblYoneticiParola))
                        .addGap(100, 100, 100)
                        .addGroup(pnlKullaniciGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtYoneticiParola, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(txtYoneticiKullaniciAdi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                        .addContainerGap(66, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKullaniciGirisLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlKullaniciGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKullaniciGirisLayout.createSequentialGroup()
                                .addComponent(btnYoneticiGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKullaniciGirisLayout.createSequentialGroup()
                                .addComponent(lblYoneticiGirisPaneli, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))))))
        );
        pnlKullaniciGirisLayout.setVerticalGroup(
            pnlKullaniciGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKullaniciGirisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblYoneticiGirisPaneli)
                .addGap(18, 18, 18)
                .addGroup(pnlKullaniciGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYoneticiKullaniciAdi)
                    .addComponent(txtYoneticiKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlKullaniciGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYoneticiParola)
                    .addComponent(txtYoneticiParola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnYoneticiGiris)
                .addGap(111, 111, 111))
        );

        jTabbedPane1.addTab("Yönetici Girişi", pnlKullaniciGiris);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Connection baglanti = null;
ResultSet resultSet = null;
PreparedStatement preparedStatement = null;

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//        try {
//             baglanti=Mysqlbaglantisi.baglan(txtMysqlSifresi.getText());
//        } catch (Exception e) {
//                            JOptionPane.showMessageDialog(null, "Mysql şifrenizi kontrol ediniz", "MESAJ",
//                        JOptionPane.ERROR_MESSAGE);
//        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
          if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (Exception e) {
            }
        }

        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (Exception e) {
            }
        }

        if (baglanti != null) {

            try {
                baglanti.close();
            } catch (Exception e) {
            }

        }
    }//GEN-LAST:event_formWindowClosing

    private void btnYoneticiGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYoneticiGirisActionPerformed
     
        
 baglanti=Mysqlbaglantisi.baglan();
        yoneticiGirisYap();

    }//GEN-LAST:event_btnYoneticiGirisActionPerformed

    private void txtYoneticiParolaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYoneticiParolaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
 
        
 baglanti=Mysqlbaglantisi.baglan();
 yoneticiGirisYap();
        }
    }//GEN-LAST:event_txtYoneticiParolaKeyPressed

    private void txtYoneticiKullaniciAdiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYoneticiKullaniciAdiKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
    
        
 baglanti=Mysqlbaglantisi.baglan();
        yoneticiGirisYap();
        }
    }//GEN-LAST:event_txtYoneticiKullaniciAdiKeyPressed

    private void txtKullaniciAdiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKullaniciAdiKeyPressed
             if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

 baglanti=Mysqlbaglantisi.baglan();
        kullaniciGirisYap();
        }
    }//GEN-LAST:event_txtKullaniciAdiKeyPressed

    private void btnKullaniciGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullaniciGirisActionPerformed

 baglanti=Mysqlbaglantisi.baglan();
        kullaniciGirisYap();

    }//GEN-LAST:event_btnKullaniciGirisActionPerformed

    private void txtKullaniciParolaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKullaniciParolaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

        
 baglanti=Mysqlbaglantisi.baglan();
        kullaniciGirisYap();
        }
    }//GEN-LAST:event_txtKullaniciParolaKeyPressed
   

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
            java.util.logging.Logger.getLogger(AnaGirisiPaneliGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaGirisiPaneliGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaGirisiPaneliGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaGirisiPaneliGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaGirisiPaneliGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKullaniciGiris;
    private javax.swing.JButton btnYoneticiGiris;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblKullaniciAdi;
    private javax.swing.JLabel lblKullaniciGirisPaneli;
    private javax.swing.JLabel lblKullaniciParola;
    private javax.swing.JLabel lblYoneticiGirisPaneli;
    private javax.swing.JLabel lblYoneticiKullaniciAdi;
    private javax.swing.JLabel lblYoneticiParola;
    private javax.swing.JPanel pnlKullaniciGiris;
    private javax.swing.JPanel pnlKullaniciGiris1;
    public static javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JPasswordField txtKullaniciParola;
    public static javax.swing.JTextField txtYoneticiKullaniciAdi;
    private javax.swing.JPasswordField txtYoneticiParola;
    // End of variables declaration//GEN-END:variables

    private void kullaniciGirisYap() {
              String kullaniciGirisiSorgusu = "SELECT * FROM tblkullanicilar WHERE kullaniciAdi = ? AND kullaniciParola = ?";
         try {
            preparedStatement = baglanti.prepareStatement(kullaniciGirisiSorgusu);
            preparedStatement.setString(1, txtKullaniciAdi.getText());
            preparedStatement.setString(2, txtKullaniciParola.getText());

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                JOptionPane.showMessageDialog(null, "Kullanıcı adı ve parolası doğrulandı.", "MESAJ",
                        JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);

                AnaEkranKullaniciGUI anaEkranKullaniciGUI=new AnaEkranKullaniciGUI();
                anaEkranKullaniciGUI.setVisible(true);


            } else {
                JOptionPane.showMessageDialog(null, "Kullanıcı adı ve parolası geçersiz.", "MESAJ",
                        JOptionPane.ERROR_MESSAGE);

            }


        } catch (Exception e) {
        }
    }

    private void yoneticiGirisYap() {
          String yoneticiGirisiSorgusu = "SELECT * FROM tblyonetici WHERE yoneticiKullaniciAdi = ? AND yoneticiParola = ?";
         try {
      
            preparedStatement = baglanti.prepareStatement(yoneticiGirisiSorgusu);
            preparedStatement.setString(1, txtYoneticiKullaniciAdi.getText());

            preparedStatement.setString(2, txtYoneticiParola.getText());


            resultSet = preparedStatement.executeQuery();
   

            if (resultSet.next()) {
                JOptionPane.showMessageDialog(null, "Kullanıcı adı ve parolası doğrulandı.", "MESAJ",
                        JOptionPane.INFORMATION_MESSAGE);
              this.setVisible(false);


AnaEkranYoneticiPaneliGUI anaEkranYoneticiPaneliGUI=new AnaEkranYoneticiPaneliGUI();
anaEkranYoneticiPaneliGUI.setVisible(true);



            } else {
                JOptionPane.showMessageDialog(null, "Kullanıcı adı ve parolası geçersiz.", "MESAJ",
                        JOptionPane.ERROR_MESSAGE);

            }


        } catch (Exception e) {
              JOptionPane.showMessageDialog(null, e+" 111111", "MESAJ",
                        JOptionPane.ERROR_MESSAGE);
        }
    }
}
