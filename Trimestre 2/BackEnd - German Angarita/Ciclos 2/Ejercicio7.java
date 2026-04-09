import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        long factorial = 1;
        
        System.out.print("Ingrese un número para calcular su factorial: ");
        numero = scanner.nextInt();
        
        if (numero < 0) {
            System.out.println("Error: No se puede calcular el factorial de un número negativo.");
        } else {
            int contador = numero;
            while (contador > 0) {
                factorial *= contador;
                contador--;
            }
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
        
        scanner.close();
    }
}
