
package Modelo;

public class LibroAutor {
    private Libro ISBN;
    private Autor autorCodigo;

    // Constructor
    public LibroAutor(Libro isbn, Autor autorCodigo) {
        this.ISBN = isbn;
        this.autorCodigo = autorCodigo;
    }

    // Getters y Setters
    public Libro getIsbn() {
        return ISBN;
    }

    public void setIsbn(Libro isbn) {
        this.ISBN = isbn;
    }

    public Autor getAutorCodigo() {
        return autorCodigo;
    }

    public void setAutorCodigo(Autor autorCodigo) {
        this.autorCodigo = autorCodigo;
    }
}
