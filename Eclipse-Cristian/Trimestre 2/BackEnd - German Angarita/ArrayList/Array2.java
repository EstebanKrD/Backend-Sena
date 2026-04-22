import java.util.ArrayList;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Pepe");
        nombres.add("Pedro");
        nombres.add("Jacinto");
        nombres.add("ADSO");
        System.out.println("Ingrese el nombre ");
        String nombre = scanner.nextLine();
        scanner.close();
        
        if ( nombres.contains(nombre)){
            System.out.println("El nombre esta en la lista ");
        } else {
            System.out.println("El nombre no existe.");
        }
    }
}
