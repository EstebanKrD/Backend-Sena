import java.util.Scanner;

public class PromoionSupermecado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Compra en tienda");
        String compra = scanner.nextLine();
        System.out.println("Dia de compra lunes o viernes?");
        String dia = scanner.nextLine();
        System.out.println("Tarjeta (si/no): ");
        String tarjeta = scanner.nextLine();

        scanner.close();

        if (compra.equals("si") && (dia.equals("lunes") || dia.equals("viernes")) || tarjeta.equals("si")) {
            System.out.println("Tiene descuento");
        } else {
            System.out.println("No tiene descuento");
        }

    }
}