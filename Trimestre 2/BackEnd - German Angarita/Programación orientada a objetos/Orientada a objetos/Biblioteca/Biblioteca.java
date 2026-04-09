package Biblioteca;
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        Miembro miembro = new Miembro(nombre);

        // podemos agregar y crear los libros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry");
        Libro libro3 = new Libro("Juego de tronos", "George R. R. Martin" );
        Libro libro4 = new Libro("Fuego y sangre", "George R. R. Martin");

        // aqui es donde se prestan los libros
        miembro.prestarLibro(libro1);
        miembro.prestarLibro(libro2);
        miembro.prestarLibro(libro3);
        miembro.prestarLibro(libro4);

        // se evidencia los libros prestados
        miembro.mostrarLibros();

        scanner.close();
    }
}
