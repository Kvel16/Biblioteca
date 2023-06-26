
package Modelo;
import java.util.Date;


public class Multa {
    private int numero;
    private Usuario usuario;
    private Date fecha;
    private double valor;
    private String descripcion;

    // Constructor
    public Multa(int numero, Usuario usuario, Date fecha, double valor, String descripcion) {
        this.numero = numero;
        this.usuario = usuario;
        this.fecha = fecha;
        this.valor = valor;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
