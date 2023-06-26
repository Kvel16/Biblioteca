
package Modelo;

public class Libro {
    private String ISBN;
    private String titulo;
    private int anioPublicacion;
    private String idioma;
    private AreaConocimiento areaConocimiento; // Representa la clave externa
    private int numPaginas;

    // Constructor
    public Libro(String ISBN, String titulo, int anioPublicacion, String idioma, AreaConocimiento areaConocimiento, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.idioma = idioma;
        this.areaConocimiento = areaConocimiento;
        this.numPaginas = numPaginas;
    }

    // Getters y Setters
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public AreaConocimiento getAreaConocimiento() {
        return areaConocimiento;
    }

    public void setAreaConocimiento(AreaConocimiento areaConocimiento) {
        this.areaConocimiento = areaConocimiento;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
}
