
package Controlador;
import Datos.EstudianteDAO;
import Datos.IDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EstudianteControl implements IDAO{

    @Override
    public ArrayList listar(String condicion) {
        try {
            return new EstudianteDAO().listar(condicion);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
    }

    @Override
    public void insertar(Object obj) {
        try {
            new EstudianteDAO().insertar(obj);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void modificar(Object obj) {
        try {
            new EstudianteDAO().modificar(obj);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void eliminar(Object obj) {
        try {
            new EstudianteDAO().eliminar(obj);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());  
        }
    }
    
}
