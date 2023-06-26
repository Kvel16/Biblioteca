
package Modelo;
import java.util.Date;
import java.sql.Time;

public class Descarga {
    private int id;
    private Usuario usuario;
    private EjDigital ISBN;
    private Date fecha;
    private Time hora;
    private String ip;

    // Constructor
    public Descarga(int id, Usuario usuario, EjDigital ISBN, Date fecha, Time hora, String ip) {
        this.id = id;
        this.usuario = usuario;
        this.ISBN = ISBN;
        this.fecha = fecha;
        this.hora = hora;
        this.ip = ip;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public EjDigital getISBN() {
        return ISBN;
    }

    public void setISBN(EjDigital ISBN) {
        this.ISBN = ISBN;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
