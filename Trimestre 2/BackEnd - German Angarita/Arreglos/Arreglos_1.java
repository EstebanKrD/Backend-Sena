// Dado el arreglo [1,2,3,4,5,6]
// Iterar por todos los elementos dentro del arreglo utilizando while y mostrarlos en pantalla.

import java.util.Scanner;

public class Arreglos_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = { 1, 2, 3, 4, 5, 6 };
        int i = 0;
        while (i < numeros.length) {
            System.out.println(numeros[i]);
            i++;
        }

        scanner.close();
    }
}