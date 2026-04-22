import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        
        int n = scanner.nextInt();

        scanner.close();

        int suma = 0;
        for( int i = 1; i <= n; i++) {
            int par = i * 2;
            System.out.println(par);
            suma += par;
        }
        System.out.println("Suma de los primeros: " + n + " Numeros pares: " + suma);
    }
}