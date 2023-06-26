package Datos;


/**
 *
 * @author Usuario
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion{
    public String DB = "Biblioteca";
    public String url = "jdbc:postgresql://localhost:5432/"+DB;
    public String user = "kevin";
    public String pass = "kevin1234";
    public String driver = "org.postgresql.Driver";
    
    public Connection conectar(){
        try{
            Connection link = null;
            Class.forName(driver);
            link = (Connection) DriverManager.getConnection(url, user, pass);
            return link;
        }catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
    }

}

/*
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    private final String HOST = "localhost";
    private final String PUERTO = "5432";
    private final String DB = "Biblioteca";
    private final String USER = "kevin";
    private final String PASSWORD = "kevin1234";
    
    public Connection getConexion(){
        Connection conexion = null;
        
        try{
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://"+HOST+":"+PUERTO+"/"+DB;
            conexion = DriverManager.getConnection(url, USER, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexión Exitosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return conexion;
    }
}
*/