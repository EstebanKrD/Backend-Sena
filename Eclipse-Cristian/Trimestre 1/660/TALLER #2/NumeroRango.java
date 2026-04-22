import java.util.Scanner;
public class NumeroRango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingres un número:");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 100) {
            System.out.println("El número " + numero + " está en el rango de 1 a 100.");
        } else {
            System.out.println("El número " + numero + " no está en el rango de 1 a 100.");
        }
        scanner.close();
    }
}