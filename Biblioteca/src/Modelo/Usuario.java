
package Modelo;


public abstract class Usuario {
    private int identificacion;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private String tipo_usuario;

    public Usuario(int identificacion) {
        this.identificacion = identificacion;
    }

    // Constructor
    public Usuario(int identificacion, String nombre, String direccion, String telefono, String email, String tipo_usuario) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.tipo_usuario = tipo_usuario;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoUsuario() {
        return tipo_usuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipo_usuario = tipoUsuario;
    }
}
