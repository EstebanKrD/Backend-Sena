import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 10000;  
        char continuar;
        
        do {
            System.out.println("\nSaldo actual: $" + saldo);
            double monto;
            
            do {
                System.out.print("Ingrese el monto a retirar: $");
                monto = scanner.nextDouble();
                
                if (monto > saldo) {
                    System.out.println("Error: Saldo insuficiente. Intente con un monto menor.");
                }
            } while (monto > saldo);
            
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
            
            System.out.print("¿Desea realizar otra operación? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);
            
        } while (continuar == 'S');
        
        System.out.println("Gracias por usar nuestro cajero. ¡Hasta pronto!");
        scanner.close();
    }
}
