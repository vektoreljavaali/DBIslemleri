/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbbaslantileri;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author vektorel
 */
public class PostgreSQLCRUD {
    
    DBConnection DB = new DBConnection();
    Connection baglanti;
    public PostgreSQLCRUD() throws ClassNotFoundException, SQLException{
    baglanti =DB.PostgreSQLBaglan("jdbc:postgresql://localhost:5432/", "DBOrnek", "postgres", "root");
}
 
    public ResultSet Listele(String SQLsorgusu) throws SQLException{
      PreparedStatement ifade=baglanti.prepareCall(SQLsorgusu);
        // "select * from tbluye");
        ResultSet sonuc=ifade.executeQuery();
        return sonuc;
    }
    
}
