
package Modelo;


public class AreaConocimiento {
    private int codigo;
    private String nombre;
    private String descripcion;
    private AreaConocimiento areaPadre; 

    // Constructor
    public AreaConocimiento(int codigo, String nombre, String descripcion, AreaConocimiento areaPadre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.areaPadre = areaPadre;
    }

    // Getters y Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public AreaConocimiento getAreaPadre() {
        return areaPadre;
    }

    public void setAreaPadre(AreaConocimiento areaPadre) {
        this.areaPadre = areaPadre;
    }
}
