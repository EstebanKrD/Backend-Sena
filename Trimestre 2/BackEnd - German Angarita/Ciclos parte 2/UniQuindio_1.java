import java.util.Scanner;

public class UniQuindio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número entero positivo: ");
            numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.println("Número inválido. Intente nuevamente.\n");
            }
        } while (numero <= 0);

        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i * i <= numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println("Sí es primo");
        } else {
            System.out.println("No es primo");
        }
        scanner.close();
    }

}
