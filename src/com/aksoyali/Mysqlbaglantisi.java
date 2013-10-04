package com.aksoyali;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Mysqlbaglantisi {

   //Server Bağlantısı için
 public static Connection baglan() {
        try {
            String url="jdbc:mysql://10.2.7.50:3306/";
            String surucu="com.mysql.jdbc.Driver";
            String veritabaniAdi="isbak_malzeme_proje";
            String kullaniciAdi="root";
            String parola="12345";
            
            Class.forName(surucu);
            Connection baglanti =
                    DriverManager.getConnection(url+veritabaniAdi, kullaniciAdi, parola);
//            JOptionPane.showMessageDialog(null, "BAŞARILI BAĞLANTI KURULDU", "MESAJ",
//                    JOptionPane.INFORMATION_MESSAGE);
            return baglanti;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HATA :" + e, "MESAJ", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    
    //Localhost bağlantısı için
//     public static Connection baglan() {
//         
//                         try {
//            String url="jdbc:mysql://localhost:3306/";
//            String surucu="com.mysql.jdbc.Driver";
//            String veritabaniAdi="isbak_malzeme_proje";
//            String kullaniciAdi="root";
//            String parola="aslan1905";
//            
//            Class.forName(surucu);
//            Connection baglanti =
//                    DriverManager.getConnection(url+veritabaniAdi, kullaniciAdi, parola);
////            JOptionPane.showMessageDialog(null, "BAŞARILI BAĞLANTI KURULDU", "MESAJ",
////                    JOptionPane.INFORMATION_MESSAGE);
//            return baglanti;
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "HATA :" + e, "MESAJ", JOptionPane.ERROR_MESSAGE);
//            return null;
//        }
//
//    }
}
