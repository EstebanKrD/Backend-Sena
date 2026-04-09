
// Dado el arreglo [1,2,3,4,5,6]
//Crear una copia del arreglo usando el ciclo “for” pero con todos los elementos incrementados en 1.


import java.util.Arrays;

public class Arreglos_5 {
    public static void main(String[] args) {
        
        int[] numeros = { 1, 2, 3, 4, 5, 6 };

        int[] copiaNumeros = new int[numeros.length];

        for (int i = 0; i < copiaNumeros.length; i++) {
            copiaNumeros[i] = numeros[i] + 1;

        }

        System.out.println("Original " + Arrays.toString(numeros) );
        System.out.println("Copia " + Arrays.toString(copiaNumeros));
    }
}
