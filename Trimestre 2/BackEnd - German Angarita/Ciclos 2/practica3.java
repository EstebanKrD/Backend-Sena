import java.util.Scanner;

public class practica3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el numero ");
        int contador = 0;
        int numero = scanner.nextInt();
        for ( int i = 1; i < numero; i +=2) {
            if (numero % 2 == 0);
            contador++;
        }
        System.out.println("los numeros pares son: " + contador);
        scanner.close();
    }
}
