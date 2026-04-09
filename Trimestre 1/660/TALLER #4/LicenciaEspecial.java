import java.util.Scanner;
public class LicenciaEspecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad: ");
        int edad = scanner.nextInt();

        System.out.println("Ingrese la experiencia: ");
        int experiencia = scanner.nextInt();

        if ( (edad > 25 && experiencia >= 5) || (edad > 30) ) {
            System.out.println("Puede obtener la licencia especial");
        } else {
            System.out.println("No puede obtener la licencia especial");
        }

        scanner.close();
    }
}