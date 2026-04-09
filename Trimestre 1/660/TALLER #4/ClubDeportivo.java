import java.util.Scanner;

public class ClubDeportivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Socio activo (si/no): ");
        String socio = scanner.nextLine();
        System.out.println("¿Es invitado? (si/no): ");
        String invitado = scanner.nextLine();
        System.out.println("¿Tiene carta de invitación? (si/no): ");
        String carta = scanner.nextLine();
        System.out.println("Ingrese monto de cuota");
        int cuota = scanner.nextInt();
        
        scanner.close();

        if (socio.equals("si") && cuota > 500 || invitado.equals("si") && carta.equals("si")) {
            System.out.println("Puede ingresar");
        } else {
            System.out.println("No puede ingresar");
        }

    }
}

