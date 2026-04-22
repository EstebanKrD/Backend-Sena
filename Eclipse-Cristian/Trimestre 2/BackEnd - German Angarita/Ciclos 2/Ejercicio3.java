import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero decendentes ");

        int numero = scanner.nextInt();
        int contador = numero;

        while (contador >=1 ) {
            System.out.println(" " + contador);
            contador--;
        }
        scanner.close();
    }
}
