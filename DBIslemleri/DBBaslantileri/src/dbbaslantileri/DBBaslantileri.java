/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbbaslantileri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author vektorel
 */
public class DBBaslantileri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        PostgreSQLCRUD DB = new PostgreSQLCRUD();
        
        ResultSet sonuc = DB.Listele("select * from tbluye");
         System.out.println("Üye Tablosunun Verileri");   
        while(sonuc.next()){

            System.out.print(" ID -->"+sonuc.getInt("id"));

            System.out.print(" Üye Adı-->"+sonuc.getString("uyelikadi"));

            System.out.print(" Ad Soyad-->"+sonuc.getString("adsoyad"));

            System.out.print(" Üyelik Tarihi-->"+sonuc.getDate("uyeliktarihi"));
            
            System.out.println("");
            System.out.println("-----------------------------------------------------------");
        }

           System.out.println("*************************************************************"); 
           System.out.println("");
           System.out.println("Müşteri Tablosunun Verileri");  
  
           
           
    }
    
    
}
