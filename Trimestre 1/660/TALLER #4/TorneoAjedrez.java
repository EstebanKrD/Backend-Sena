import java.util.Scanner;

public class TorneoAjedrez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();
        System.out.println("Ingrese su rating");
        int rating = scanner.nextInt();

        scanner.close();

        if ((rating > 1800 && edad > 15) || (rating > 2000 ) ) {
            System.out.println("Puede participar en el torneo");
        } else {
            System.out.println("No puede participar en el torneo");
        }
    }
}