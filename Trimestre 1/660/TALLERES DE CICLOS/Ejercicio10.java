import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        
        int n = scanner.nextInt();

        scanner.close();

        int suma = 0;
        for( int i = 1; i <= n; i++) {
            int impar = ( i * 2) - 1;
            System.out.print(impar + " ");

            suma += impar;
        }

        System.out.println("Suma de los primeros: " + n + " Numero impares: " + suma);
}

}