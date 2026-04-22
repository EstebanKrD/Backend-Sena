import java.util.Scanner;
public class Maultiplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();

        if (numero % 5 == 0) {
            System.out.println("El numero " + numero + " es multiplo de 5");
        } else {
            System.out.println("El numero " + numero + " no es multiplo de 5");
        }
        scanner.close();
    }
}