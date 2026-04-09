package Arreglos;
public class Ejercicio1 {
    public static void main(String[] args) {

        int[] numeros;
        numeros = new int[]{2, 4, 6};

        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }

        System.out.println("Suma total: " + suma);
    }
}
