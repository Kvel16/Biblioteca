
package Modelo;
import java.util.Date;


public class Prestamo {
    private int numero;
    private Date fecha;
    private Date fechaDevolucion;
    private Usuario usuario;
    private Empleado empleado;
    private Ejemplar ejemplar;

    // Constructor
    public Prestamo(int numero, Date fecha, Date fechaDevolucion, Usuario usuario, Empleado empleado, Ejemplar ejemplar) {
        this.numero = numero;
        this.fecha = fecha;
        this.fechaDevolucion = fechaDevolucion;
        this.usuario = usuario;
        this.empleado = empleado;
        this.ejemplar = ejemplar;
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }
}
