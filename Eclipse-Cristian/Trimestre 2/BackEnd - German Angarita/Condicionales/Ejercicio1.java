import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Usted es mayor de edad");
        } else {
            System.err.println("Usted es menor de edad");
        }

        scanner.close();

    }
}