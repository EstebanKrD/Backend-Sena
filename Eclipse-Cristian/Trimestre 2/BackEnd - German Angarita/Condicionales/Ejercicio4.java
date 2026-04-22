import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero: ");
        int numero = scanner.nextInt();

        if(numero > 0 ) {
            System.out.println("El numero es positivo");
        } else if ( numero < 0) {
            System.out.println("El numer es negativo");
        } else {
            System.out.println("El numero es cero");
        }
        scanner.close();
    }
}
