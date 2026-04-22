import java.util.Scanner;

public class DescuentoTienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto de compra: ");
        double monto = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("¿Es cliente frecuente? (si/no): ");
        String frecuente = scanner.nextLine();

        if ((monto > 100 && frecuente.equalsIgnoreCase("si")) || monto > 200) {
            System.out.println("El cliente obtiene el 20% de descuento");
        } else {
            System.out.println("El cliente no obtiene descuento");
        }

        scanner.close();
    }
}

