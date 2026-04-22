package Arreglos;
public class Ejercicio3 {
    public static void main(String[] args) {

        double[] notas = {3.5, 4.0, 2.8, 4.2};
        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }

        System.out.println("La suma total de las notas es: " + suma);
    }
}

