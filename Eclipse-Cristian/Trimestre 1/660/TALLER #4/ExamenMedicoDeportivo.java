import java.util.Scanner;

public class ExamenMedicoDeportivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Certificado: ");
        String certificado = scanner.nextLine();
        System.out.println("¿Fuma? (si/no): ");
        String fuma = scanner.nextLine();
        System.out.println("Permiso: ");
        String permiso = scanner.nextLine();

        scanner.close();

        if (certificado.equals("si") && fuma.equals("no") && permiso.equals("si")) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Rechazado");
        }
    }
}