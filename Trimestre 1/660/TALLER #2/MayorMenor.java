import java.util.Scanner;
public class MayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Usted es mayor de edad.");
        } else {
            System.out.println("Usted es menor de edad.");
        }
        scanner.close();
    }
}