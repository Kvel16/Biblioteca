
package Datos;

import java.util.ArrayList;

public interface IDAO {
    
  public ArrayList listar(String condicion);
  public void insertar(Object obj);
  public void modificar(Object obj);
  public void eliminar(Object obj);
  
}
