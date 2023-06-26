
package Modelo;

public class EjDigital {
    private String isbn;
    private String url;
    private String formatoArchivo;
    private int tamanoBytes;
    private Libro libro;

    // Constructor
    public EjDigital(String isbn, String url, String formatoArchivo, int tamanoBytes, Libro libro) {
        this.isbn = isbn;
        this.url = url;
        this.formatoArchivo = formatoArchivo;
        this.tamanoBytes = tamanoBytes;
        this.libro = libro;
    }

    // Getters y Setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFormatoArchivo() {
        return formatoArchivo;
    }

    public void setFormatoArchivo(String formatoArchivo) {
        this.formatoArchivo = formatoArchivo;
    }

    public int getTamanoBytes() {
        return tamanoBytes;
    }

    public void setTamanoBytes(int tamanoBytes) {
        this.tamanoBytes = tamanoBytes;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}
