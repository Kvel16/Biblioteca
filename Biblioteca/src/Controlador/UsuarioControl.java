
package Controlador;

import Datos.IDAO;
import Datos.UsuarioDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class UsuarioControl implements IDAO{

    @Override
    public ArrayList listar(String condicion) {
      return new UsuarioDAO().listar(condicion);
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
