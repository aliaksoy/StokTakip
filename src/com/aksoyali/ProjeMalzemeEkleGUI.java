package com.aksoyali;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Ali
 */
public class ProjeMalzemeEkleGUI extends javax.swing.JFrame {

    /**
     * Creates new form ProjeDetayGUI
     */
    public ProjeMalzemeEkleGUI() {
      
        initComponents();
         this.setLocationRelativeTo(getRootPane());//Frame ekranın ortasında açılır
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlProje = new javax.swing.JPanel();
        lblmalzemeAdi = new javax.swing.JLabel();
        cbmalzemeAdi = new javax.swing.JComboBox();
        lblmalzemeGrubu = new javax.swing.JLabel();
        cbmalzemeGrubu = new javax.swing.JComboBox();
        lblmalzemeAltGrubu = new javax.swing.JLabel();
        cbmalzemeAltGrubu = new javax.swing.JComboBox();
        lblmalzemeMarkasi = new javax.swing.JLabel();
        cbmalzemeMarkasi = new javax.swing.JComboBox();
        lblmalzemeModeli = new javax.swing.JLabel();
        cbmalzemeModeli = new javax.swing.JComboBox();
        lblmalzemeDataSheet = new javax.swing.JLabel();
        cbmalzemeDataSheet = new javax.swing.JComboBox();
        lblmalzemeBirimFiyati = new javax.swing.JLabel();
        cbmalzemeBirimFiyati = new javax.swing.JComboBox();
        btnDataSheetleriAc = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblmalzemeParaBirimi = new javax.swing.JLabel();
        cbmalzemeParaBirimi = new javax.swing.JComboBox();
        lblmalzemeBirimi = new javax.swing.JLabel();
        cbmalzemeBirimi = new javax.swing.JComboBox();
        lblmalzemeMiktari = new javax.swing.JLabel();
        lblSecilenProjeAdi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblmalzemeToplamMaliyet = new javax.swing.JLabel();
        lblmalzemeKarOrani = new javax.swing.JLabel();
        lblmalzemeBirimTeklif = new javax.swing.JLabel();
        lblmalzemeToplamTeklif = new javax.swing.JLabel();
        txtmalzemeKarOrani = new javax.swing.JTextField();
        txtmalzemeMiktari = new javax.swing.JTextField();
        txtmalzemeToplamMaliyet = new javax.swing.JTextField();
        txtmalzemeBirimTeklif = new javax.swing.JTextField();
        txtmalzemeToplamTeklif = new javax.swing.JTextField();
        lblmalzemeDataSheet1 = new javax.swing.JLabel();
        cbmalzemeSartname = new javax.swing.JComboBox();
        btnDataSheetleriAc1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PROJE GİRİŞ");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlProje.setBackground(new java.awt.Color(153, 255, 255));
        pnlProje.setBorder(javax.swing.BorderFactory.createTitledBorder("PROJE MALZEME EKLE"));

        lblmalzemeAdi.setText("Malzeme Adı");

        lblmalzemeGrubu.setText("Malzeme Grubu");

        cbmalzemeGrubu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cbmalzemeGrubu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbmalzemeGrubuİtemStateChanged(evt);
            }
        });

        lblmalzemeAltGrubu.setText("Malzeme Alt Grubu");

        cbmalzemeAltGrubu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cbmalzemeAltGrubu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbmalzemeAltGrubuİtemStateChanged(evt);
            }
        });

        lblmalzemeMarkasi.setText("Malzeme Markası");

        cbmalzemeMarkasi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cbmalzemeMarkasi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbmalzemeMarkasiİtemStateChanged(evt);
            }
        });

        lblmalzemeModeli.setText("Malzeme Modeli");

        cbmalzemeModeli.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cbmalzemeModeli.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbmalzemeModeliİtemStateChanged(evt);
            }
        });

        lblmalzemeDataSheet.setText("Malzeme Data Sheet Adres Yolu");

        lblmalzemeBirimFiyati.setText("Birim Fiyatı");

        cbmalzemeBirimFiyati.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cbmalzemeBirimFiyati.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbmalzemeBirimFiyatiİtemStateChanged(evt);
            }
        });

        btnDataSheetleriAc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/open2.png"))); // NOI18N
        btnDataSheetleriAc.setText("AÇ");
        btnDataSheetleriAc.setRequestFocusEnabled(false);
        btnDataSheetleriAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataSheetleriAcActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("*");
        jLabel4.setToolTipText("ZORUNLU ALAN");

        lblmalzemeParaBirimi.setText("Para Birimi");

        lblmalzemeBirimi.setText("Birimi");

        lblmalzemeMiktari.setText("Miktari");

        lblSecilenProjeAdi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSecilenProjeAdi.setForeground(new java.awt.Color(0, 102, 102));
        lblSecilenProjeAdi.setText("....");

        jLabel1.setText("PROJENİN ADI");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save.png"))); // NOI18N
        jButton1.setText("KAYDET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("*");
        jLabel5.setToolTipText("ZORUNLU ALAN");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("*");
        jLabel6.setToolTipText("ZORUNLU ALAN");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("*");
        jLabel7.setToolTipText("ZORUNLU ALAN");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("*");
        jLabel8.setToolTipText("ZORUNLU ALAN");

        lblmalzemeToplamMaliyet.setText("Toplam Maliyet");

        lblmalzemeKarOrani.setText("Kar Oranı %");

        lblmalzemeBirimTeklif.setText("Birim Teklif");

        lblmalzemeToplamTeklif.setText("Toplam Teklif");

        txtmalzemeKarOrani.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmalzemeKarOraniFocusLost(evt);
            }
        });
        txtmalzemeKarOrani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmalzemeKarOraniKeyReleased(evt);
            }
        });

        txtmalzemeMiktari.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmalzemeMiktariFocusLost(evt);
            }
        });
        txtmalzemeMiktari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmalzemeMiktariKeyReleased(evt);
            }
        });

        txtmalzemeToplamMaliyet.setEditable(false);
        txtmalzemeToplamMaliyet.setBackground(new java.awt.Color(0, 204, 153));

        txtmalzemeBirimTeklif.setEditable(false);
        txtmalzemeBirimTeklif.setBackground(new java.awt.Color(0, 204, 153));

        txtmalzemeToplamTeklif.setEditable(false);
        txtmalzemeToplamTeklif.setBackground(new java.awt.Color(0, 204, 153));

        lblmalzemeDataSheet1.setText("Sartname Adres Yolu");

        btnDataSheetleriAc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/open2.png"))); // NOI18N
        btnDataSheetleriAc1.setText("AÇ");
        btnDataSheetleriAc1.setRequestFocusEnabled(false);
        btnDataSheetleriAc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataSheetleriAc1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlProjeLayout = new javax.swing.GroupLayout(pnlProje);
        pnlProje.setLayout(pnlProjeLayout);
        pnlProjeLayout.setHorizontalGroup(
            pnlProjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProjeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProjeLayout.createSequentialGroup()
                        .addGroup(pnlProjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlProjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlProjeLayout.createSequentialGroup()
                                .addGroup(pnlProjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlProjeLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel1))
                                    .addComponent(lblmalzemeModeli)
                                    .addComponent(lblmalzemeAltGrubu)
                                    .addComponent(lblmalzemeGrubu)
                                    .addComponent(lblmalzemeMarkasi)
                                    .addComponent(lblmalzemeAdi))
                                .addGap(49, 49, 49)
                                .addGroup(pnlProjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblSecilenProjeAdi)
                                    .addComponent(cbmalzemeModeli, 0, 533, Short.MAX_VALUE)
                                    .addComponent(cbmalzemeMarkasi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbmalzemeAltGrubu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbmalzemeGrubu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbmalzemeAdi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pnlProjeLayout.createSequentialGroup()
                                .addComponent(lblmalzemeBirimFiyati)
                                .addGap(87, 87, 87)
                                .addComponent(cbmalzemeBirimFiyati, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblmalzemeParaBirimi, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbmalzemeParaBirimi, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblmalzemeBirimi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbmalzemeBirimi, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblmalzemeMiktari, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtmalzemeMiktari, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProjeLayout.createSequentialGroup()
                                .addGroup(pnlProjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblmalzemeToplamMaliyet)
                                    .addComponent(lblmalzemeToplamTeklif))
                                .addGap(18, 18, 18)
                                .addGroup(pnlProjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtmalzemeToplamTeklif, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlProjeLayout.createSequentialGroup()
                                        .addComponent(txtmalzemeToplamMaliyet, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblmalzemeKarOrani)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtmalzemeKarOrani, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblmalzemeBirimTeklif)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtmalzemeBirimTeklif, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(pnlProjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlProjeLayout.createSequentialGroup()
                            .addComponent(lblmalzemeDataSheet)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbmalzemeDataSheet, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnDataSheetleriAc))
                        .addGroup(pnlProjeLayout.createSequentialGroup()
                            .addComponent(lblmalzemeDataSheet1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbmalzemeSartname, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnDataSheetleriAc1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlProjeLayout.setVerticalGroup(
            pnlProjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProjeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlProjeLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27))
                    .addComponent(lblSecilenProjeAdi, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(pnlProjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbmalzemeGrubu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmalzemeGrubu)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(pnlProjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblmalzemeAltGrubu)
                    .addComponent(cbmalzemeAltGrubu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlProjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblmalzemeMarkasi)
                        .addComponent(jLabel5))
                    .addComponent(cbmalzemeMarkasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlProjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbmalzemeModeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmalzemeModeli)
                    .addComponent(jLabel6))
                .addGap(15, 15, 15)
                .addGroup(pnlProjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbmalzemeAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmalzemeAdi)
                    .addComponent(jLabel7))
                .addGap(20, 20, 20)
                .addGroup(pnlProjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmalzemeBirimFiyati)
                    .addComponent(cbmalzemeBirimFiyati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmalzemeParaBirimi)
                    .addComponent(cbmalzemeParaBirimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmalzemeBirimi)
                    .addComponent(lblmalzemeMiktari)
                    .addComponent(cbmalzemeBirimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtmalzemeMiktari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlProjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblmalzemeToplamMaliyet)
                    .addGroup(pnlProjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblmalzemeKarOrani)
                        .addComponent(lblmalzemeBirimTeklif)
                        .addComponent(txtmalzemeKarOrani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtmalzemeBirimTeklif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtmalzemeToplamMaliyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlProjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmalzemeToplamTeklif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmalzemeToplamTeklif))
                .addGap(21, 21, 21)
                .addGroup(pnlProjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmalzemeDataSheet)
                    .addComponent(cbmalzemeDataSheet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDataSheetleriAc))
                .addGap(21, 21, 21)
                .addGroup(pnlProjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmalzemeDataSheet1)
                    .addComponent(cbmalzemeSartname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDataSheetleriAc1))
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlProje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlProje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Connection baglanti = null;
    ResultSet resultSet = null;
     PreparedStatement preparedStatement = null;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        baglanti=Mysqlbaglantisi.baglan();

        
      malzemeGrublarinicomboBoxaGetir();
   lblSecilenProjeAdi.setText(ProjeAnaGirisGUI.lblGidenProjeAdi.getText());
  
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (baglanti != null) {

            try {
                baglanti.close();
            } catch (Exception e) {
            }

        }

        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (Exception e) {
            }
        }


        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (Exception e) {
            }
        }

  
    }//GEN-LAST:event_formWindowClosing

    private void btnDataSheetleriAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataSheetleriAcActionPerformed
        try {
                   if(cbmalzemeDataSheet.getSelectedItem()==null){
            JOptionPane.showMessageDialog(null, "HATA" , "MESAJ", JOptionPane.ERROR_MESSAGE);
        }
        else{
       dataSheetleriAc();
        }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "DOSYA BULUNAMADI" , "MESAJ", JOptionPane.ERROR_MESSAGE);
        }
        

    }//GEN-LAST:event_btnDataSheetleriAcActionPerformed

 
    private void cbmalzemeGrubuİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbmalzemeGrubuİtemStateChanged
       //MalzemeGrubuna göre AltGrubunu çekmek.
        try {
     
            preparedStatement = baglanti.prepareStatement("SELECT malzemeAltGrubu FROM tblmalzemeler WHERE malzemeGrubu = ?");
           preparedStatement.setString(1,cbmalzemeGrubu.getSelectedItem().toString());
            
            resultSet = preparedStatement.executeQuery();
         cbmalzemeAltGrubu.removeAllItems();//combox'da ki değerleri silip,yeni değeri ondan sonra ekleriz.
          
            HashSet hashSet =new HashSet();
            
            while (resultSet.next()) {
                  hashSet.add(resultSet.getString("malzemeAltGrubu").trim());
            }
            
            cbmalzemeAltGrubu.removeAllItems();
            Iterator it=hashSet.iterator();
            while (it.hasNext()) {
                cbmalzemeAltGrubu.addItem(it.next()); 
            }    
         
//         while (resultSet.next()) {
//                cbmalzemeAltGrubu.addItem(resultSet.getString("malzemeAltGrubu"));
//            }
 


        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null, "HATA : " + e, "MESAJ", JOptionPane.ERROR_MESSAGE);
        }
            
    }//GEN-LAST:event_cbmalzemeGrubuİtemStateChanged

    private void cbmalzemeAltGrubuİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbmalzemeAltGrubuİtemStateChanged
          //MalzemeAltGruba göre Marka yı çekmek.   
        try {
     
            preparedStatement = baglanti.prepareStatement("SELECT malzemeMarkasi FROM tblmalzemeler WHERE malzemeAltGrubu = ?");
           preparedStatement.setString(1,cbmalzemeAltGrubu.getSelectedItem().toString());
            
            resultSet = preparedStatement.executeQuery();
         cbmalzemeMarkasi.removeAllItems();//combox'da ki değerleri silip,yeni değeri ondan sonra ekleriz.
           
         HashSet hashSet =new HashSet();
            
            while (resultSet.next()) {
                  hashSet.add(resultSet.getString("malzemeMarkasi").trim());
            }
            
            
            cbmalzemeMarkasi.removeAllItems();
            Iterator it=hashSet.iterator();
            while (it.hasNext()) {
                cbmalzemeMarkasi.addItem(it.next()); 
            }    
         



        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null, "HATA : " + e, "MESAJ", JOptionPane.ERROR_MESSAGE);
        }
              
    }//GEN-LAST:event_cbmalzemeAltGrubuİtemStateChanged

    private void cbmalzemeMarkasiİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbmalzemeMarkasiİtemStateChanged
      //Markaya göre Modeli çekmek     
        try {
     
            preparedStatement = baglanti.prepareStatement("SELECT malzemeModeli FROM tblmalzemeler WHERE malzemeMarkasi = ?");
           preparedStatement.setString(1,cbmalzemeMarkasi.getSelectedItem().toString());
            
            resultSet = preparedStatement.executeQuery();
         cbmalzemeModeli.removeAllItems();//combox'da ki değerleri silip,yeni değeri ondan sonra ekleriz.
            
            HashSet hashSet = new HashSet();

            while (resultSet.next()) {
                hashSet.add(resultSet.getString("malzemeModeli").trim());
            }

            cbmalzemeModeli.removeAllItems();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                cbmalzemeModeli.addItem(it.next());
            }


        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null, "HATA : " + e, "MESAJ", JOptionPane.ERROR_MESSAGE);
        }
           

            
    }//GEN-LAST:event_cbmalzemeMarkasiİtemStateChanged

    private void cbmalzemeModeliİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbmalzemeModeliİtemStateChanged
        //Modele göre MalzemeAdını,Fiyatı,ParaBirimi,malzemeBirimi ,DataSheet ve Sartname ini çekmek
             try {
     
            preparedStatement = baglanti.prepareStatement("SELECT malzemeAdi,malzemeFiyati,malzemeParaBirimi,malzemeBirimi,malzemeDataSheet,malzemeSartname FROM tblmalzemeler WHERE malzemeModeli = ?");
           preparedStatement.setString(1,cbmalzemeModeli.getSelectedItem().toString());
            
            resultSet = preparedStatement.executeQuery();
             
            cbmalzemeAdi.removeAllItems();
            cbmalzemeBirimFiyati.removeAllItems();//combox'da ki değerleri silip,yeni değeri ondan sonra ekleriz.
            cbmalzemeParaBirimi.removeAllItems();
            cbmalzemeBirimi.removeAllItems();            
            cbmalzemeDataSheet.removeAllItems();
            cbmalzemeSartname.removeAllItems();            
              
            HashSet hashSetmalzemeAdi = new HashSet();
            HashSet hashSetmalzemeFiyati = new HashSet();
            HashSet hashSetmalzemeParaBirimi = new HashSet();
            HashSet hashSetmalzemeBirimi = new HashSet();                    
            HashSet hashSetmalzemeDataSheet = new HashSet();
            HashSet hashSetmalzemeSartname = new HashSet();            

         while (resultSet.next()) {
             hashSetmalzemeAdi.add(resultSet.getString("malzemeAdi").trim());
             hashSetmalzemeFiyati.add(resultSet.getString("malzemeFiyati").trim());
             hashSetmalzemeParaBirimi.add(resultSet.getString("malzemeParaBirimi").trim());
             hashSetmalzemeBirimi.add(resultSet.getString("malzemeBirimi").trim());                     
             hashSetmalzemeDataSheet.add(resultSet.getString("malzemeDataSheet").trim());         
             hashSetmalzemeSartname.add(resultSet.getString("malzemeSartname").trim());              
         }

  
            cbmalzemeAdi.removeAllItems();
                 Iterator it = hashSetmalzemeAdi.iterator();
                 while (it.hasNext()) {
                     cbmalzemeAdi.addItem(it.next());
                 }
                 

            cbmalzemeBirimFiyati.removeAllItems();
                 Iterator it2 = hashSetmalzemeFiyati.iterator();
                 while (it2.hasNext()) {
                     cbmalzemeBirimFiyati.addItem(it2.next());
                 }   
                 
            cbmalzemeParaBirimi.removeAllItems();                 
              Iterator i3 = hashSetmalzemeParaBirimi.iterator();
                 while (i3.hasNext()) {
                     cbmalzemeParaBirimi.addItem(i3.next());
                 }
                 
            cbmalzemeBirimi.removeAllItems();                 
          Iterator it4 = hashSetmalzemeBirimi.iterator();
             while (it4.hasNext()) {
                 cbmalzemeBirimi.addItem(it4.next());
                 }   
                 
              
            cbmalzemeDataSheet.removeAllItems();
                 Iterator it5 = hashSetmalzemeDataSheet.iterator();
                     while (it5.hasNext()) {
                     cbmalzemeDataSheet.addItem(it5.next());
                 }                    
       
                 cbmalzemeSartname.removeAllItems();
                 Iterator it6 = hashSetmalzemeSartname.iterator();
                 while (it6.hasNext()) {
                     cbmalzemeSartname.addItem(it6.next());
                 }  
 
         
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null, "HATA : " + e, "MESAJ", JOptionPane.ERROR_MESSAGE);
        }
             
    }//GEN-LAST:event_cbmalzemeModeliİtemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       projeyeMalzemeKaydet();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbmalzemeBirimFiyatiİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbmalzemeBirimFiyatiİtemStateChanged
        try {
            double fiyat = Double.valueOf(cbmalzemeBirimFiyati.getSelectedItem().toString());
            if (!(txtmalzemeMiktari.getText().trim().equals(""))) {
                double miktar = Double.valueOf(txtmalzemeMiktari.getText());
                txtmalzemeToplamMaliyet.setText(String.valueOf(fiyat * miktar));
            } else {
            }
        } catch (Exception e) {
          //  JOptionPane.showMessageDialog(null, "HATA11 : " + e, "MESAJ", JOptionPane.ERROR_MESSAGE);
        }


        try {

            double fiyat = Double.valueOf(cbmalzemeBirimFiyati.getSelectedItem().toString());
            if (!(txtmalzemeKarOrani.getText().trim().equals(""))) {
                double kar = Double.valueOf(txtmalzemeKarOrani.getText());
                txtmalzemeBirimTeklif.setText(String.valueOf(fiyat + (kar * fiyat) / 100));
            } else {
            }

        } catch (Exception e) {
                        //JOptionPane.showMessageDialog(null, "HATA2222 : " + e, "MESAJ", JOptionPane.ERROR_MESSAGE);

        }

        try {
            double birimTeklif = Double.valueOf(txtmalzemeBirimTeklif.getText());

            if (!(txtmalzemeMiktari.getText().trim().equals(""))) {
                double miktar = Double.valueOf(txtmalzemeMiktari.getText());
                txtmalzemeToplamTeklif.setText(String.valueOf(birimTeklif * miktar));
            } else {
            }

        } catch (Exception e) {
                        //JOptionPane.showMessageDialog(null, "HATA333 : " + e, "MESAJ", JOptionPane.ERROR_MESSAGE);

        }


    }//GEN-LAST:event_cbmalzemeBirimFiyatiİtemStateChanged

    private void txtmalzemeKarOraniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmalzemeKarOraniKeyReleased
       birimTeklifHesapla();
       toplamTeklifHesapla();
    }//GEN-LAST:event_txtmalzemeKarOraniKeyReleased

    private void txtmalzemeMiktariFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmalzemeMiktariFocusLost
//              if(txtmalzemeMiktari.getText().trim().equals("")){
//            txtmalzemeMiktari.setText("1");
//    
//        }
    }//GEN-LAST:event_txtmalzemeMiktariFocusLost

    private void txtmalzemeMiktariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmalzemeMiktariKeyReleased
        toplamMaliyetiHesapla();
        toplamTeklifHesapla();
    }//GEN-LAST:event_txtmalzemeMiktariKeyReleased

    private void txtmalzemeKarOraniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmalzemeKarOraniFocusLost
//      double a=Double.valueOf(txtmalzemeKarOrani.getText());
//      txtmalzemeKarOrani.setText(String.valueOf(a));
    }//GEN-LAST:event_txtmalzemeKarOraniFocusLost

    private void btnDataSheetleriAc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataSheetleriAc1ActionPerformed
      try {
                   if(cbmalzemeSartname.getSelectedItem()==null){
            JOptionPane.showMessageDialog(null, "HATA" , "MESAJ", JOptionPane.ERROR_MESSAGE);
        }
        else{
       sartnameleriAc();
        }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "DOSYA BULUNAMADI" , "MESAJ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDataSheetleriAc1ActionPerformed

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
            java.util.logging.Logger.getLogger(ProjeMalzemeEkleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjeMalzemeEkleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjeMalzemeEkleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjeMalzemeEkleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjeMalzemeEkleGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDataSheetleriAc;
    private javax.swing.JButton btnDataSheetleriAc1;
    private javax.swing.JComboBox cbmalzemeAdi;
    private javax.swing.JComboBox cbmalzemeAltGrubu;
    private javax.swing.JComboBox cbmalzemeBirimFiyati;
    private javax.swing.JComboBox cbmalzemeBirimi;
    private javax.swing.JComboBox cbmalzemeDataSheet;
    private javax.swing.JComboBox cbmalzemeGrubu;
    private javax.swing.JComboBox cbmalzemeMarkasi;
    private javax.swing.JComboBox cbmalzemeModeli;
    private javax.swing.JComboBox cbmalzemeParaBirimi;
    private javax.swing.JComboBox cbmalzemeSartname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblSecilenProjeAdi;
    private javax.swing.JLabel lblmalzemeAdi;
    private javax.swing.JLabel lblmalzemeAltGrubu;
    private javax.swing.JLabel lblmalzemeBirimFiyati;
    private javax.swing.JLabel lblmalzemeBirimTeklif;
    private javax.swing.JLabel lblmalzemeBirimi;
    private javax.swing.JLabel lblmalzemeDataSheet;
    private javax.swing.JLabel lblmalzemeDataSheet1;
    private javax.swing.JLabel lblmalzemeGrubu;
    private javax.swing.JLabel lblmalzemeKarOrani;
    private javax.swing.JLabel lblmalzemeMarkasi;
    private javax.swing.JLabel lblmalzemeMiktari;
    private javax.swing.JLabel lblmalzemeModeli;
    private javax.swing.JLabel lblmalzemeParaBirimi;
    private javax.swing.JLabel lblmalzemeToplamMaliyet;
    private javax.swing.JLabel lblmalzemeToplamTeklif;
    private javax.swing.JPanel pnlProje;
    private javax.swing.JTextField txtmalzemeBirimTeklif;
    private javax.swing.JTextField txtmalzemeKarOrani;
    private javax.swing.JTextField txtmalzemeMiktari;
    private javax.swing.JTextField txtmalzemeToplamMaliyet;
    private javax.swing.JTextField txtmalzemeToplamTeklif;
    // End of variables declaration//GEN-END:variables


    private void formuTemizle() {

cbmalzemeGrubu.removeAllItems();
cbmalzemeAltGrubu.removeAllItems();
cbmalzemeMarkasi.removeAllItems();
 cbmalzemeModeli.removeAllItems();          
 cbmalzemeAdi.removeAllItems();
 cbmalzemeBirimFiyati.removeAllItems();
 cbmalzemeParaBirimi.removeAllItems();
cbmalzemeBirimi.removeAllItems();
txtmalzemeMiktari.setText(null);       
 cbmalzemeDataSheet.removeAllItems();
  
        
    }




//    private void dataSheetleriAc() {
//        int secilenSatir=tableProjeDetay.getSelectedRow();       
//        String secilenSatirinDataSheetAdresYolu =tableProjeDetay.getValueAt(secilenSatir, 8).toString();
//        
//        File file = new File(secilenSatirinDataSheetAdresYolu);
//        if (file.toString().endsWith(".pdf")) {
//            try {
//                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + file);
//            } catch (IOException ex) {
//                Logger.getLogger(MalzemeGirisiGUI.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } else {
//            Desktop desktop = Desktop.getDesktop();
//            try {
//                desktop.open(file);
//            } catch (IOException ex) {
//                Logger.getLogger(MalzemeGirisiGUI.class.getName()).log(Level.SEVERE, null, ex);
//            }
//    }
//
//    }

    

   

    private void malzemeGrublarinicomboBoxaGetir() {
        cbmalzemeAdi.addItem("");
        try {
            preparedStatement = baglanti.prepareStatement("SELECT * FROM tblmalzemeler");
            resultSet = preparedStatement.executeQuery();

            HashSet hashSet =new HashSet();

            while (resultSet.next()) {
                //  cbmalzemeAdi.addItem(resultSet.getString("malzemeAdi"));
                  hashSet.add(resultSet.getString("malzemeGrubu").trim());
            }
            
            cbmalzemeGrubu.removeAllItems();
            Iterator it=hashSet.iterator();
            while (it.hasNext()) {
                cbmalzemeGrubu.addItem(it.next());
                
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HATA : " + e, "MESAJ", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void projeyeMalzemeKaydet() {
    
                      if (!(cbmalzemeAdi.getSelectedItem().equals(""))&&!(cbmalzemeGrubu.getSelectedItem().equals(""))
                &&!(cbmalzemeMarkasi.getSelectedItem().equals("")&&!(cbmalzemeModeli.getSelectedItem().equals("")
                &&!(cbmalzemeBirimFiyati.getSelectedItem().equals(""))))) {
                         
                            try {

                String projeIcerikSorgusu ="INSERT INTO tblprojeicerik (p_ID , Grup, "
            + " AltGrup, Adi, Marka,"
            + " Model, Birim, Miktar ,"
            + " BirimFiyat,ParaBirimi,"
            + " Top_Maliyet , KarOran,"
            + " Br_Teklif, Top_Teklif ,"
            + " DataSheet,Sartname)"
            + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            preparedStatement = baglanti.prepareStatement(projeIcerikSorgusu);
                
                preparedStatement.setString(1,ProjeAnaGirisGUI.lblGidenProjeID.getText());
                preparedStatement.setString(2, cbmalzemeGrubu.getSelectedItem().toString());
                preparedStatement.setString(3, cbmalzemeAltGrubu.getSelectedItem().toString());
                preparedStatement.setString(4, cbmalzemeAdi.getSelectedItem().toString());               
                preparedStatement.setString(5, cbmalzemeMarkasi.getSelectedItem().toString());
                preparedStatement.setString(6, cbmalzemeModeli.getSelectedItem().toString());           

                preparedStatement.setString(7, cbmalzemeBirimi.getSelectedItem().toString());
                preparedStatement.setString(8, txtmalzemeMiktari.getText().toString());                   
                preparedStatement.setString(9, cbmalzemeBirimFiyati.getSelectedItem().toString());
                preparedStatement.setString(10, cbmalzemeParaBirimi.getSelectedItem().toString());
  
               preparedStatement.setString(11, txtmalzemeToplamMaliyet.getText().toString());      
                preparedStatement.setString(12, txtmalzemeKarOrani.getText().toString());   
                preparedStatement.setString(13, txtmalzemeBirimTeklif.getText().toString());   
                preparedStatement.setString(14, txtmalzemeToplamTeklif.getText().toString());      
                preparedStatement.setString(15, cbmalzemeDataSheet.getSelectedItem().toString());
                preparedStatement.setString(16, cbmalzemeSartname.getSelectedItem().toString());                
            
            preparedStatement.execute();

            
   //           formuTemizle();
   
            
            JOptionPane.showMessageDialog(null, "Kayıt başarıyla kaydedildi.", "MESAJ", JOptionPane.INFORMATION_MESSAGE);
            tablodakiProjelerinMalzemeleriniGetir();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HATA :" + e, "MESAJ", JOptionPane.ERROR_MESSAGE);

        }
                      }
                      else{
                          JOptionPane.showMessageDialog(null, "Zorunlu Alanları Doldurunuz.", "MESAJ", JOptionPane.ERROR_MESSAGE); 
                      }
        
      
    }

        private void tablodakiProjelerinMalzemeleriniGetir() {
        try {

            String sql_sorgu="SELECT * FROM tblprojeicerik WHERE p_ID=?";
           
             int satirNumarasi = ProjeAnaGirisGUI.tableProjeGiris.getSelectedRow();
             preparedStatement = baglanti.prepareStatement(sql_sorgu);
            preparedStatement.setString(1, ProjeAnaGirisGUI.tableProjeGiris.getModel().getValueAt(satirNumarasi, 0).toString());
             resultSet = preparedStatement.executeQuery();
             
             ProjeAnaGirisGUI.tableProjeninMalzemeleri.setModel(DbUtils.resultSetToTableModel(resultSet));    
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HATA :" + e, "MESAJ", JOptionPane.ERROR_MESSAGE);
        }
       
    }

    private void dataSheetleriAc() {

        String secilenSatirinDataSheetAdresYolu=cbmalzemeDataSheet.getSelectedItem().toString();
        
        File file = new File(secilenSatirinDataSheetAdresYolu);
        if (file.toString().endsWith(".pdf")) {
            try {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + file);
            } catch (IOException ex) {
                Logger.getLogger(MalzemeGirisiGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.open(file);
            } catch (IOException ex) {
                Logger.getLogger(MalzemeGirisiGUI.class.getName()).log(Level.SEVERE, null, ex);
                
            }
    }
       
    }

    private void toplamMaliyetiHesapla() {
        try {
            double fiyat = Double.valueOf(cbmalzemeBirimFiyati.getSelectedItem().toString());
            if (!(txtmalzemeMiktari.getText().trim().equals(""))) {
                double miktar = Double.valueOf(txtmalzemeMiktari.getText());
                txtmalzemeToplamMaliyet.setText(String.valueOf(fiyat * miktar));
            } else {
               txtmalzemeToplamMaliyet.setText(null);
               txtmalzemeToplamTeklif.setText(null);
            }
        } catch (Exception e) {
                txtmalzemeToplamMaliyet.setText(null);
                txtmalzemeMiktari.setText(null);
                 //JOptionPane.showMessageDialog(null, "HATA111 : " + e, "MESAJ", JOptionPane.ERROR_MESSAGE);


        }

    }

    private void birimTeklifHesapla() {
        try {

            double fiyat = Double.valueOf(cbmalzemeBirimFiyati.getSelectedItem().toString());
            if (!(txtmalzemeKarOrani.getText().trim().equals(""))) {
                double kar = Double.valueOf(txtmalzemeKarOrani.getText());
                txtmalzemeBirimTeklif.setText(String.valueOf(fiyat + (kar * fiyat) / 100));
            } else {
                txtmalzemeBirimTeklif.setText(null);
                     txtmalzemeToplamTeklif.setText(null);

            }

        } catch (Exception e) {
                   txtmalzemeBirimTeklif.setText(null);
                   txtmalzemeKarOrani.setText(null);
                 //   JOptionPane.showMessageDialog(null, "HATA222 : " + e, "MESAJ", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void toplamTeklifHesapla() {
try {

            double birimTeklif = Double.valueOf(txtmalzemeBirimTeklif.getText());
           
            if (!(txtmalzemeMiktari.getText().trim().equals(""))) {
                double miktar = Double.valueOf(txtmalzemeMiktari.getText());
                txtmalzemeToplamTeklif.setText(String.valueOf(birimTeklif * miktar));
            } else {
                txtmalzemeToplamMaliyet.setText(null);
                txtmalzemeToplamTeklif.setText(null);

            }

        } catch (Exception e) {
                   txtmalzemeToplamTeklif.setText(null);
                   txtmalzemeKarOrani.setText(null);
// JOptionPane.showMessageDialog(null, "HATA33 : " + e, "MESAJ", JOptionPane.ERROR_MESSAGE);

        }
    }
//    private void toplamMaliyetiHesapla() {
//        try {
//                if(!(txtmalzemeMiktari.getText().trim().equals(""))){
//            double miktar = Double.valueOf(txtmalzemeMiktari.getText());
//            double fiyat = Double.valueOf(cbmalzemeBirimFiyati.getSelectedItem().toString());
//            txtmalzemeToplamMaliyet.setText(String.valueOf(fiyat * miktar));
//                }
//
//
//
//        } catch (Exception e) {
//        }
//
//    }
//
//    private void birimTeklifHesapla() {
//        try {
//                if(!(txtmalzemeKarOrani.getText().trim().equals(""))){
//              double kar = Double.valueOf(txtmalzemeKarOrani.getText());
//              double fiyat = Double.valueOf(cbmalzemeBirimFiyati.getSelectedItem().toString());
//            txtmalzemeBirimTeklif.setText(String.valueOf( (kar * fiyat) / 100)+fiyat );
//                }
//
//
//
//        } catch (Exception e) {
//        }
//    }
//
//    private void toplamTeklifHesapla() {
//        try {
//           
//      if(!(txtmalzemeMiktari.getText().trim().equals(""))&&!(txtmalzemeBirimTeklif.getText().trim().equals(""))){
//             double miktar = Double.valueOf(txtmalzemeMiktari.getText());
//            double birimTeklif = Double.valueOf(txtmalzemeBirimTeklif.getText());
//            txtmalzemeToplamTeklif.setText(String.valueOf(birimTeklif * miktar));
//                            }
//
//        } catch (Exception e) {
//        }
//    }

    private void sartnameleriAc() {
       
        
        String secilenSatirinSartnameAdresYolu=cbmalzemeSartname.getSelectedItem().toString();
        
        File file = new File(secilenSatirinSartnameAdresYolu);
    
            try {
              
              Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + file);
               
               } catch (Exception ex) {
                Logger.getLogger(MalzemeGirisiGUI.class.getName()).log(Level.SEVERE, null, ex);
                                 
            }
        
    
    }
}
