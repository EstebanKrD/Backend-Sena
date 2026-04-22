import java.util.Scanner;

public class practica1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String contrasena;
        boolean esValido = false;

        do {
            System.out.println("Ingrese la contraseña: ");
            contrasena = scanner.nextLine();
            if (contrasena.length() >= 8) {
                esValido = true;
            } else {
                System.out.println("Contraseña invalida, debe de tener al menos 8 caracteres");
            }
        } while (!esValido);

        System.out.println("La contraseña es valida");
        scanner.close();
    }
}
