/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbbaslantileri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author vektorel
 */
public class DBConnection {
    
    public Connection PostgreSQLBaglan(String url,String veritabani,String kullanici, String sifre) throws ClassNotFoundException, SQLException
    {
        Class.forName("org.postgresql.Driver");
        Connection baglanti=DriverManager.getConnection(
                url+veritabani,kullanici, sifre);
        return baglanti;
    }
    
    public Connection OracleBaglan(){
        
    return null;
    }   
    
    
    public Connection MSSqlBaglan(){
        
    return null;
    }   
    
    
    
    public Connection mySqlBaglan(){
        
    return null;
    }   
    
    
    
    public Connection AccessBaglan(){
        
    return null;
    }   
    
}
