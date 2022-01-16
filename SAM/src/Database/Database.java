
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    private Connection con;
    String url="jdbc:mysql://localhost:3306/schoolm";
    String user="root";
    String pass="170420846Sa!";
    
            
    public Connection BaglantiKontrol() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //System.out.println("Baglanti basarili");
            try {
                con=DriverManager.getConnection(url,user,pass);
            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Baglantida sorun var");
        }
        return con;
    }
    
}
