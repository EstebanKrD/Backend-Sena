import java.util.Scanner;
public class RangoEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Es adulto.");
        } else {
            System.out.println("Es menor de edad.");
        }
        scanner.close();
    }
}