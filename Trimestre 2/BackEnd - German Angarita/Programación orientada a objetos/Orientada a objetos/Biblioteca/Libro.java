
package Biblioteca;

public class Libro {

    private String titulo;
    private String autor;

    // Se inicia la variable constructor para el libro y autor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // esto se agrega para poder sobreescribir o reemplazando un metodo y adicional esto puede mostrar el libro en texto
    @Override
    public String toString() {
        return titulo + " — " + autor;
    }
}
