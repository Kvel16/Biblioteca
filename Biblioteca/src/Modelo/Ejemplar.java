
package Modelo;

public class Ejemplar {
    private int numero;
    private Libro ISBN;
    private String sala;
    private int pasillo;
    private int estante;
    private int cajon;

    // Constructor
    public Ejemplar(int numero, Libro ISBN, String sala, int pasillo, int estante, int cajon) {
        this.numero = numero;
        this.ISBN = ISBN;
        this.sala = sala;
        this.pasillo = pasillo;
        this.estante = estante;
        this.cajon = cajon;
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Libro getLibro() {
        return ISBN;
    }

    public void setLibro(Libro ISBN) {
        this.ISBN = ISBN;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public int getPasillo() {
        return pasillo;
    }

    public void setPasillo(int pasillo) {
        this.pasillo = pasillo;
    }

    public int getEstante() {
        return estante;
    }

    public void setEstante(int estante) {
        this.estante = estante;
    }

    public int getCajon() {
        return cajon;
    }

    public void setCajon(int cajon) {
        this.cajon = cajon;
    }
}
