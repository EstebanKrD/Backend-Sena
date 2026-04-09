package Palindromos;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra ");
        String palabra = scanner.nextLine();
        boolean resultado = Palindromo.esPolindromo(palabra);

        if(resultado){
            System.out.println("La palabra es palíndromo ");
        } else {
            System.out.println("La palabra no es palíndromo ");
        }

        scanner.close();
    }
}
