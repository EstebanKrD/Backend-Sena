// Dado el arreglo [1,2,3,4,5,6]
// Iterar por todos los elementos dentro del arreglo utilizando el ciclo “foreach” y mostrarlos en pantalla.

import java.util.Scanner;

public class Arreglos_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = { 1, 2, 3, 4, 5, 6 };

        for ( int n : numeros){
            System.out.println(n);
        }

        scanner.close();
    }
}
