import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número ");
        int numero = scanner.nextInt();

        if (numero > 1) {
            System.out.println("El numero es mayor");
        } else if (numero < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }
        scanner.close();
    }
}
