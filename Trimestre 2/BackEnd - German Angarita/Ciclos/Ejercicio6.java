package Ciclos;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Indique la base:");
        int operando1 = scanner.nextInt();

        System.out.println("Indique el exponente:");
        int operando2 = scanner.nextInt();
        scanner.nextLine();

        String serie = "";
        int resultado = 1;

        if (operando1 != 0) {
            for (int i = 1; i <= operando2; i++) {
                if (i == operando2) {
                    serie += operando1;
                } else {
                    serie += operando1 + " x ";
                }
                resultado = operando1 * resultado;
            }

            System.out.println("Serie: " + serie);
            System.out.println("Total: " + resultado);

        } else {
            System.out.println("La base debe ser diferente de cero (0)");
        }
        scanner.close();
    }
}