import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        do {
            System.out.print("Por favor, ingrese un número positivo: ");
            numero = scanner.nextInt();
            
            if (numero <= 0) {
                System.out.println("Error: El número debe ser positivo. Intente nuevamente.");
            }
        } while (numero <= 0);
        
        System.out.println("¡Gracias! Ha ingresado el número positivo: " + numero);
        
        scanner.close();
    }
}