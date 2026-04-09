import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingree un numero: ");
        int numero = scanner.nextInt();

        System.out.println("El numero ingresado es: " + numero);

        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par");
        } else {
            System.out.println("El numero " + numero + " es impar");
        }

        scanner.close();
    }
}
