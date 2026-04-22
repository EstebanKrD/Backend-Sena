import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor a sumer de N: ");
        
        int numero = scanner.nextInt();

        scanner.close();

        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
            suma += i;
        }
            System.out.println("Resultado: " + suma);
    }
}