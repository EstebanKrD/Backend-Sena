import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El numero es positivo.");
            } else if (numero < 0) {
                System.out.println("El numero es negativo.");
            } else {
                System.out.println("El numero es cero.");
        }
        
        scanner.close();

    }
}