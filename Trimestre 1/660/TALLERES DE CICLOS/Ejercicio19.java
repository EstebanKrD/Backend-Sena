import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número N: ");
        int n = scanner.nextInt();
        scanner.close();

        String numerosTexto = "";
        double total = 0;
        int numerador = 0;

        for (int i = 2; i <= 2 * n + 1; i++) {
            if (i % 2 == 0) {
                numerador = i;
            } else {
                int denominador = i;

                if (numerador != 0 && denominador <= 2 * n + 1) {
                    numerosTexto += numerador + "/" + denominador;
                    if (denominador < 2 * n + 1) {
                        numerosTexto += " + ";
                    }

                    total += (double) numerador / denominador;
                }
            }
        }

        System.out.println("Secuencia: " + numerosTexto);
        System.out.println("Total de la secuencia: " + total);
    }
}