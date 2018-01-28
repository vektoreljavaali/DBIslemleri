/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagimsizlastirma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author vektorel
 */
public class dbkaydet {
    
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        Class.forName("org.postgresql.Driver");
        Connection baglanti=DriverManager.getConnection("jdbc:postgresql://localhost:5432/DBOrnek", "postgres", "root");
        int id;
        String adi;
        id=10;
        adi="Yeni bir Hoca1";
//        PreparedStatement ifade=baglanti.prepareCall("insert into tblhoca(id,adi) values(?,?)");
//        ifade.setInt(1, id);
//        ifade.setString(2, adi);
//        ifade.executeUpdate();
//        System.out.println("Veri Kaydedildi");
        
//        PreparedStatement  ifade=baglanti.prepareCall("update tblhoca set adi='Hoca6' where id=6");
//        ifade.executeUpdate();
//        System.out.println("Veri Güncellendi");
        
        
        PreparedStatement  ifade=baglanti.prepareCall("delete from tbldene where id=?");
        ifade.setInt(1, 2);
        ifade.executeUpdate();
        System.out.println("Veri Silindi");
        
        
//update tblhoca set adi='Hoca5' where id=5
    }
}
