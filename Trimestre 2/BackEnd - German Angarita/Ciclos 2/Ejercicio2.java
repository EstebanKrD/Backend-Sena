import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero: ");
        int tablaMultiplicar = scanner.nextInt();
        int numero = 1;

        while (numero <= 10) {
            System.out.println(tablaMultiplicar + " X " + numero + " = " + (numero * tablaMultiplicar));

            numero++;

        }
        scanner.close();
    }
}
