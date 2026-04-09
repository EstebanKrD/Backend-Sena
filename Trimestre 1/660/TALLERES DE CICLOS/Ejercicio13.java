import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String numerosTexto = "";
        boolean esPositivo = true;

        scanner.close();

        for (int i = 1; i <= n; i = i + 1) {

            if (esPositivo) {
                numerosTexto = numerosTexto + " + " + i;
                esPositivo = false;
            } else {
                numerosTexto = numerosTexto + " - " + i;
                esPositivo = true;
            }

        }

        System.out.println(numerosTexto);

    }
}