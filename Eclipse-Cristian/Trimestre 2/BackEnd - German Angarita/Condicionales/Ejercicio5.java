
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean repetirMenu = true;
        while (repetirMenu) {
            System.out.println("----- BIENVENIDO!! ------");
            System.out.println("1. Saludar");
            System.out.println("2. Adios");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Hola");

                    break;

                case 2:
                    System.out.println("Chao");

                    break;

                case 3:
                    repetirMenu = false;

                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }

        scanner.close();
    }
}
