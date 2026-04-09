import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tipo de flor : (rosas/claveles) ");
        String tipoFlor = scanner.nextLine().toLowerCase();

        System.out.print("Ingrese la cantidad de flores: ");
        int cantidadFlores = scanner.nextInt();

        System.out.print("Ingrese el color de las flores: (rojo/blanco/otro) ");
        String colorFlor = scanner.next().toLowerCase();
        int precioPorFlor = 0;

        if (tipoFlor.equals("rosas") && cantidadFlores <= 12 && colorFlor.equals("rojo")) {
            precioPorFlor = 1250;
        }
        else if (tipoFlor.equals("rosas") && cantidadFlores > 12 && colorFlor.equals("rojo")) {
            precioPorFlor = 1100;
        }
        else if (tipoFlor.equals("rosas") && !colorFlor.equals("rojo")) {
            precioPorFlor = 1205;
        }
        else if (tipoFlor.equals("claveles") && cantidadFlores <= 12 && colorFlor.equals("blanco")) {
            precioPorFlor = 1050;
        }
        else if (tipoFlor.equals("claveles") && cantidadFlores > 12 && colorFlor.equals("blanco")) {
            precioPorFlor = 1000;
        }
        else if (tipoFlor.equals("claveles") && !colorFlor.equals("blanco")) {
            precioPorFlor = 1200;
        } else {
            System.out.println("⚠️ Tipo o color de flor no válido.");
        }

        int valorTotal = precioPorFlor * cantidadFlores;

        System.out.println("El precio por flor es: $" + precioPorFlor);
        System.out.println("El valor total del ramo es: $" + valorTotal);

        scanner.close();
    }
}