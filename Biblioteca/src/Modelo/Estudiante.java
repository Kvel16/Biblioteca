
package Modelo;

public class Estudiante extends Usuario {
    private String carrera;
    private String universidad;

    public Estudiante(int identificacion) {
        super(identificacion);
    }
    
    // Constructor
    public Estudiante(int identificacion, String nombre, String direccion, String telefono, String email, String tipo_usuario, String carrera, String universidad) {
        super(identificacion, nombre, direccion, telefono, email, tipo_usuario);
        this.carrera = carrera;
        this.universidad = universidad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }


}
