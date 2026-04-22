import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero N a sumar: ");

        int n = scanner.nextInt();

        System.out.println("Ingrese el numero M a sumar: ");

        int m = scanner.nextInt();

        int suma = 0;
        System.out.print("La serie es: ");

        for(int i = 1; i <= n; i++ ) {
            System.out.print((m * i) + " "); // muestra la serie paso a paso 
            suma = suma + ( m * 1);
        }
        System.out.println();
        System.out.println("la suma es: " + suma);

        scanner.close();



    }
}