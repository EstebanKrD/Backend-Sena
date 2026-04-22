import java.util.Scanner;

public class practica3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        int numero = scanner.nextInt();
        System.out.println("Ingrese un número ");
        int numero2 = scanner.nextInt();

        if (numero > 0 && numero2 > 0) {
            System.out.println("Son positivos");
        } else if (numero < 0 || numero2 < 0) {
            System.out.println("Alguno es negativo");
        } else {
            System.out.println("Ambos son cero");
        }
        scanner.close();
    }
}
