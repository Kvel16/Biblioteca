
package Modelo;

public class LibroEditorial {
    private Libro libro;
    private Editorial editorial;

    // Constructor
    public LibroEditorial(Libro libro, Editorial editorial) {
        this.libro = libro;
        this.editorial = editorial;
    }

    // Getters y Setters
    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
}
