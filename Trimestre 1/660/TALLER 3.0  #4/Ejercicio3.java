import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Tiene dinero?");
        String tieneDinero = scanner.nextLine();
        System.out.println("¿Que genero de juego deseas comprar?");
        String genero = scanner.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = scanner.nextInt();

        scanner.close();

        if (tieneDinero.toLowerCase().equals("si")) {
            if (edad < 18) {
                if (genero.equals("terror")) {
                    System.out.println("No puedes comprar este juego");
                } else {
                    System.out.println("Compra realizada");
                }
            } else {
                System.out.println("Compra realizada");
            }
        } else {
            System.out.println("No tienes saldo suficiente");

        }

    }
}