import java.util.Scanner;

public class practica5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número ");
        int numero = scanner.nextInt();
        System.out.println("Ingrese el número 2 ");
        int numero2 = scanner.nextInt();

        if (numero > numero2) {
            System.out.println("El primer numero es mayor ");
        } else if (numero2 > numero) {
            System.out.println("El segundo numero es mayor ");
        } else {
            System.out.println("Ambos son iguales");
        }
        scanner.close();
    }
}
