import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correo;
        boolean esValido = false;

        do {
            System.out.println("Ingrese su correo: ");
            correo = scanner.nextLine();
            if (correo.contains("@") && correo.contains(".")) {
                esValido = true;
            } else {
                System.out.println("Por favor ingrese el correo de nuevo");
            }
        } while (!esValido);
        System.out.println("El correo ingresado es correcto: " + correo);
        scanner.close();
    }

}
