import java.util.Scanner;

public class ParqueDiversiones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Debe de ingresar con un adulto");
        String acompanado = scanner.nextLine();

        System.out.println("Ingrese la edad: ");
        int edad = scanner.nextInt();

        System.out.println("Ingrese la estatura: ");
        double estatura = scanner.nextDouble();



        scanner.close();

        if ((edad > 12 && estatura >= 1.50) || acompanado.equalsIgnoreCase("si")) {
            System.out.println("Puede ingresar al parque");
        } else {
            System.out.println("No puede ingresar al parque");
        }
    }
}
