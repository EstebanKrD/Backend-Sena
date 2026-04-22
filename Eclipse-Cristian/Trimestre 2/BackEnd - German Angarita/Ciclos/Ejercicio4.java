package Ciclos;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int primerNumero = scanner.nextInt();

        System.out.println("Ingrese el numero final: ");
        int finalNumero = scanner.nextInt();

        int suma = 0;
        String serie = " ";

        for(int i = primerNumero ; i <= finalNumero; i++){
            if( i == finalNumero) {
                serie += i; 
            } else {
                serie += i + " + ";
            }

            suma += i;
        }

        System.out.println("La serie " + serie);
        System.out.println("El total es: " + suma);
        scanner.close();
    }
}
