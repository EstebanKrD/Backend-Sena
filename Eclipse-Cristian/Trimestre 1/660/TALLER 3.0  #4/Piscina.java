import java.util.Scanner;

public class Piscina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) { 
            System.out.print("¿Sabe nadar? (si/no): ");
            String respuesta = scanner.next().toLowerCase();

            if (respuesta.equals("si")) {
                System.out.println("Puedes ingresar a la piscina");
            } else {
                System.out.println("Debes usar flotador");
            }
        } else {
            System.out.println("Debes ir acompañado de un adulto");
        }

        scanner.close();
    }
}