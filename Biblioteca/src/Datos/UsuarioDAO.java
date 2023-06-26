
package Datos;

import Modelo.Usuario;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO implements IDAO{
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    ArrayList<Usuario> lista = new ArrayList<>();
    Usuario usuarioObj = null;
    

    public ArrayList listar(String condicion) {
        try {
            con = new Conexion().conectar();
            String sql = "SELECT * FROM Usuario" + condicion;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                usuarioObj = new Usuario(
                rs.getInt("identificacion"),
                rs.getString("nombre"),
                rs.getString("direccion"),
                rs.getString("telefono"),
                rs.getString("email"),
                rs.getString("tipoUsuario")
                ) {}; 
                lista.add(usuarioObj);
            }
            
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return lista;
    }

    @Override
    public void insertar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void modificar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
