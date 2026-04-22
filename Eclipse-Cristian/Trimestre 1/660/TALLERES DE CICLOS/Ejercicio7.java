import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de N: ");
        int n = scanner.nextInt();

        String numerosTexto = " ";

        for (int i = 1; i <= n; i++) {
            
            numerosTexto = numerosTexto + " " + i;

        }

        System.out.println(numerosTexto);

        scanner.close();
    }
}