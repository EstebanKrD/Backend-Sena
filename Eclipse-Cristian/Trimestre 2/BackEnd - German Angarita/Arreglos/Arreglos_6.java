// Dado el arreglo [1,2,3,4,5,6]
// Calcular el promedio de todos los elementos del arreglo

import java.util.Arrays;

public class Arreglos_6 {
    public static void main(String[] args) {

        int[] numeros = { 1, 2, 3, 4, 5, 6 };

        int longitudArreglo = numeros.length;
        int suma = 0;

        for (int i = 0; i < longitudArreglo; i++) {
            suma += numeros[i];
        }

        double promedio = (double) suma / (double) longitudArreglo;

        System.out.println("Arreglo original: " + Arrays.toString(numeros));
        System.out.println("El total del a suma es: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
