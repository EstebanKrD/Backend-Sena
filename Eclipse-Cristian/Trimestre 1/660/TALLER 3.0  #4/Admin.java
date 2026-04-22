import java.util.Scanner;

public class Admin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        scanner.close();

        if (usuario.toLowerCase().equals("admin")) {
            if (contrasena.toLowerCase().equals("1234")) {
                System.out.println("Bienvenido admin");
            } else {
                System.out.println("contraseña incorrecta");
            }
        } else {
            System.out.println("acceso denegado");
        }
    }
}