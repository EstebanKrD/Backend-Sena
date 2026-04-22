import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double acmulador = 0;
        int numero;
        int contador = 0;
        

        do {
            System.out.println("Por favor ingrese la nota");
            numero = scanner.nextInt();
            if (numero != -1) {
                contador = contador + 1;
                acmulador = acmulador + numero;
            }
        } while (numero != -1);
        double promedio = acmulador / contador;
        System.out.println("Grcias por usar el programa");
        System.out.println("Promedio: " + promedio);
        scanner.close();
    }
}
