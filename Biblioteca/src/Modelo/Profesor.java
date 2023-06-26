
package Modelo;

public class Profesor extends Usuario {
    private String dependencia;
    private String titulo;
    private String areasInteres;

    // Constructor
    public Profesor(int identificacion, String nombre, String direccion, String telefono, String email, String tipoUsuario, String dependencia, String titulo, String areasInteres) {
        super(identificacion, nombre, direccion, telefono, email, tipoUsuario);
        this.dependencia = dependencia;
        this.titulo = titulo;
        this.areasInteres = areasInteres;
    }

    // Getters y setters específicos de Profesor
    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAreasInteres() {
        return areasInteres;
    }

    public void setAreasInteres(String areasInteres) {
        this.areasInteres = areasInteres;
    }
}
