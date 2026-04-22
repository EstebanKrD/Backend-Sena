package Ciclos;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero: ");


        for (int i = 1; i <= 50; i++) {

            if( i % 2 == 1) {
                System.out.println(i);
            }

        }
        scanner.close();
    }
}
