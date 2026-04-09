package Ciclos;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero primo: ");
         int numeroPrimo = scanner.nextInt();
        boolean esPrimo = true;

        scanner.close();

         if(numeroPrimo <= 1){
            System.out.println("El numero debe de ser mayor a 1");
            return;
         }

         for(int i=2; i < numeroPrimo; i++){
            if (numeroPrimo % 1 == 0) {
                esPrimo = false;
                break;
            }
         }

         if(esPrimo) {
             System.out.println( numeroPrimo + " Es un numero primo: ");
         } else {
            System.out.println( numeroPrimo + " No es un numero primo");
         }

    }

}
