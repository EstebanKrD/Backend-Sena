import java.util.Scanner;

public class practica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int contador = 0;
        double acumulador = 0;

        do {
            System.out.print("Ingrese un número (1 para terminar): ");
            numero = scanner.nextInt();

            if (numero != 1) {
                contador++;
                acumulador += numero;
            }

        } while (numero != 1);

        if (contador > 0) {
            double promedio = acumulador / contador;
            System.out.println("Promedio: " + promedio);
        } else {
            System.out.println("No se ingresaron números válidos.");
        }

        scanner.close();
    }
}
