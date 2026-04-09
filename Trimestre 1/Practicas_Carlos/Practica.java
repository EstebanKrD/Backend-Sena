import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero");

        int s = scanner.nextInt();
        scanner.close();

        String serie = "";
        int total = 0;

        for (int i = 1; i <= s; i++) {
            int valor = i * 5;
            if (i % 3 == 0) {
                serie += " - " + valor;
                total -= valor;
            } else {
                if (i == 1) {
                    serie += valor;
                } else {
                    serie += " + " + valor;
                }
                total += valor;
            }
        }

        System.out.println("Serie de: " + serie);
        System.out.println("Resultado: " + total);
    }
}