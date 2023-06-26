
package Datos;

import Modelo.Estudiante;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EstudianteDAO implements IDAO{
    Connection con = null;
    ArrayList<Estudiante> lista = new ArrayList<>();
    Estudiante estudianteObj = null;
    PreparedStatement ps;
    
    public EstudianteDAO() throws SQLException{
        con = new Conexion().conectar();
    }
    
    @Override
    public ArrayList listar(String condicion) {
        try{
            String sql = "SELECT DISTINCT u.identificacion, u.nombre, u.direccion, u.telefono, u.email, u.tipo_usuario, e.carrera, e.universidad"
                    + " FROM Estudiante AS e, Usuario AS u " + "WHERE e.identificacion = u.identificacion " +condicion;
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                estudianteObj = new Estudiante(
                        rs.getInt("identificacion"),
                        rs.getString("nombre"),
                        rs.getString("direccion"),
                        rs.getString("telefono"),
                        rs.getString("email"),
                        rs.getString("tipo_usuario"),
                        rs.getString("carrera"),
                        rs.getString("universidad")
                );
                lista.add(estudianteObj);
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());  
        }
        return lista;
    }

    @Override
    public void insertar(Object obj) {
        try {
            estudianteObj = (Estudiante) obj;
            String sql = "INSERT INTO Usuario (identificacion, nombre, direccion, telefono, email, tipo_usuario) "
                    + " VALUES (?, ?, ?, ?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, (int) estudianteObj.getIdentificacion());
            ps.setString(2, estudianteObj.getNombre());
            ps.setString(3, estudianteObj.getDireccion());
            ps.setString(4, estudianteObj.getTelefono());
            ps.setString(5, estudianteObj.getEmail());
            ps.setString(6, estudianteObj.getTipoUsuario());
            ps.executeUpdate();

            String sql2 = "INSERT INTO Estudiante (identificacion, carrera, universidad) "
                    + "VALUES (?, ?, ?)";
            ps = con.prepareStatement(sql2);
            ps.setInt(1, (int) estudianteObj.getIdentificacion());
            ps.setString(2, estudianteObj.getCarrera());
            ps.setString(3, estudianteObj.getUniversidad());
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void modificar(Object obj) {
        try {
            estudianteObj = (Estudiante) obj;
            
            String sql = "UPDATE Usuario SET nombre = ?,  direccion = ?, telefono = ?, email = ?"
                    + " WHERE identificacion = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, estudianteObj.getNombre());
            ps.setString(2, estudianteObj.getDireccion());
            ps.setString(3, estudianteObj.getTelefono());
            ps.setString(4, estudianteObj.getEmail());
            long identificacionLong = estudianteObj.getIdentificacion();
            int identificacionInt = (int) identificacionLong;
            ps.setInt(5, identificacionInt);
            ps.executeUpdate();
            
            String sql2 = "UPDATE Estudiante SET carrera = ?,  universidad = ?"
                    + " WHERE identificacion = ?";
            ps = con.prepareStatement(sql2);
            ps.setString(1, estudianteObj.getCarrera());
            ps.setString(2, estudianteObj.getUniversidad());
            ps.setInt(3, identificacionInt);
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void eliminar(Object obj) {
        try {
            estudianteObj = (Estudiante) obj;

            String sql = "DELETE FROM Estudiante WHERE identificacion = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, (int) estudianteObj.getIdentificacion());
            ps.executeUpdate();
            
            String sql2 = "DELETE FROM Usuario WHERE identificacion = ?";
            ps = con.prepareStatement(sql2);
            ps.setInt(1, (int) estudianteObj.getIdentificacion());
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
}
