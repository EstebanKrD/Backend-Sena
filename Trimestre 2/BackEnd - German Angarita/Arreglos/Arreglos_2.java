// Dado el arreglo [1,2,3,4,5,6]
// Iterar por todos los elementos dentro del arreglo utilizando el ciclo “for” y mostrarlos en pantalla.

import java.util.Scanner;

public class Arreglos_2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[] numero = {1, 2, 3, 4, 5, 6};
        
        for (int i = 0; i < numero.length; i++ ){
            System.out.println(numero[i]);

        }

        scanner.close();
    }
}
