
package Modelo;

public class Empleado {
    private int identificacion;
    private String nombre;
    private String cargo;

    // Constructor
    public Empleado(int identificacion, String nombre, String cargo) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    // Getters y Setters
    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
