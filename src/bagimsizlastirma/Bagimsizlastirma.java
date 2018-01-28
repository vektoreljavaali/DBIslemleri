/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagimsizlastirma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author vektorel
 */
public class Bagimsizlastirma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection baglanti=DriverManager.getConnection("jdbc:postgresql://localhost:5432/DBOrnek", "postgres", "root");
        PreparedStatement ifade=baglanti.prepareCall("select * from tbluye");
        ResultSet sonuc=ifade.executeQuery();
           System.out.println("Üye Tablosunun Verileri");
           System.out.println("-----------------------------------------------------------");
        while(sonuc.next()){
            System.out.println(" ID -->"+sonuc.getInt("id"));
            System.out.println(" Üye Adı-->"+sonuc.getString("uyelikadi"));
            System.out.println(" Ad Soyad-->"+sonuc.getString("adsoyad"));
            System.out.println(" Üyelik Tarihi-->"+sonuc.getDate("uyeliktarihi"));
            System.out.println("---");
           
        }
           System.out.println("*************************************************************"); 
           System.out.println("");
           System.out.println("Hoca Tablosunun Verileri");  
  
       // Class.forName("org.postgresql.Driver");
        //Connection baglanti1=DriverManager.getConnection("jdbc:postgresql://localhost:5432/DBOrnek", "postgres", "root");
        ifade =baglanti.prepareCall("select * from tblhoca");
        sonuc=ifade.executeQuery();
        System.out.println("-----------------------------------------------------------");
        while(sonuc.next()){
            System.out.println(" ID -->"+sonuc.getInt("id"));
            System.out.println(" Hoca Adı-->"+sonuc.getString("adi"));
            
            System.out.println("---");
           
        }
           
           
    }
    
}
