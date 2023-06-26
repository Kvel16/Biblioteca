
package Modelo;
import java.util.Date;

public class Solicitud {
    private int numero;
    private Date fecha;
    private String descripcion;
    private Usuario usuario;
    private String Titulo;
    private Ejemplar ISBN;

    // Constructor
    public Solicitud(int numero, Date fecha, String descripcion, Usuario usuario, String Titulo, EjDigital libroDigital) {
        this.numero = numero;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.usuario = usuario;
        this.Titulo = Titulo;
        this.ISBN = ISBN;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public Ejemplar getISBN() {
        return ISBN;
    }

    public void setISBN(Ejemplar ISBN) {
        this.ISBN = ISBN;
    }


}
