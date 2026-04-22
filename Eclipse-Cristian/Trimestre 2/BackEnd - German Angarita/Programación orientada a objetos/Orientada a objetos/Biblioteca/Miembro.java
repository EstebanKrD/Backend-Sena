package Biblioteca;
import java.util.ArrayList;

public class Miembro {

    private String nombre;
    private ArrayList<Libro> librosPrestados;

    // el constructor inicia el nombre y crea la lista vacía
    public Miembro(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
    }

    // agregar un libro a la lista
    public void prestarLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    // eliminar un libro de la lista
    public void devolverLibro(Libro libro) {
        librosPrestados.remove(libro);
    }

    // mostrar todos los libros prestados
    public void mostrarLibros() {
        System.out.println("Libros prestados por " + nombre + ":");
        for (Libro libro : librosPrestados) {
            System.out.println("- " + libro);
        }
    }
}
