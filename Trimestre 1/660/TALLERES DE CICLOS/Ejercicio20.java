import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite n: ");
        int n = scanner.nextInt();

        scanner.close();

        int antecesor = 0;
        int siguiente = 1;
        int suma = 0;
        String serie = "";

        for (int i = 1; i <= n; i++) {
            suma = antecesor + siguiente;
            serie += antecesor + ", ";
            antecesor = siguiente;
            siguiente = suma;
        }

        System.out.println("Serie: " + serie);
    }
}