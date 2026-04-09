package Ciclos;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero para el factorial N: ");
        int n = scanner.nextInt();

        scanner.close();

        String resultado = " ";
        int acumulador = 1;

        for (int i = 1; i <= n; i++) {
            acumulador *= i;

            if (i == 1) {
                resultado = resultado += i;
            } else {
                resultado += "*" + i;
            }
        }

        System.out.println("Acumulador " + acumulador);
        System.out.println("El resultado es: " + resultado);

    }
}
